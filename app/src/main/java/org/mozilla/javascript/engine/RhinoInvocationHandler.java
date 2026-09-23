package org.mozilla.javascript.engine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class RhinoInvocationHandler implements InvocationHandler {
    private final RhinoScriptEngine engine;
    private final Object thiz;

    public RhinoInvocationHandler(RhinoScriptEngine rhinoScriptEngine, Object obj) {
        this.engine = rhinoScriptEngine;
        this.thiz = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.engine.invokeMethodRaw(this.thiz, method.getName(), method.getReturnType(), objArr);
    }
}
