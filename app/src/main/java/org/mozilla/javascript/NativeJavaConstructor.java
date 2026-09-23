package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class NativeJavaConstructor extends BaseFunction {
    private static final long serialVersionUID = -8149253217482668463L;
    MemberBox ctor;

    public NativeJavaConstructor(MemberBox memberBox) {
        this.ctor = memberBox;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return NativeJavaClass.constructSpecific(context, scriptable, objArr, this.ctor);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        return "<init>".concat(JavaMembers.liveConnectSignature(this.ctor.argTypes));
    }

    public String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r("[JavaConstructor ", this.ctor.getName(), "]");
    }
}
