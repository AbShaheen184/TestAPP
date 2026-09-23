package org.mozilla.javascript;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
class FieldAndMethods extends NativeJavaMethod {
    private static final long serialVersionUID = -9222428244284796755L;
    Field field;
    Object javaObject;

    public FieldAndMethods(Scriptable scriptable, MemberBox[] memberBoxArr, Field field) {
        super(memberBoxArr);
        this.field = field;
        setParentScope(scriptable);
        setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == ScriptRuntime.FunctionClass) {
            return this;
        }
        try {
            Object obj = this.field.get(this.javaObject);
            Class<?> type = this.field.getType();
            Context context = Context.getContext();
            Object objWrap = context.getWrapFactory().wrap(context, this, obj, type);
            return objWrap instanceof Scriptable ? ((Scriptable) objWrap).getDefaultValue(cls) : objWrap;
        } catch (IllegalAccessException unused) {
            throw Context.reportRuntimeErrorById("msg.java.internal.private", this.field.getName());
        }
    }
}
