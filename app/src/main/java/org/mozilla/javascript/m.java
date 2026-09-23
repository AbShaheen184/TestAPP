package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return ((Interpreter.CallFrame) this.y).lambda$equals$0(this.z, context, scriptable, scriptable2, objArr);
            default:
                return ((NativePromise.PromiseAnyRejector) this.y).lambda$reject$0((NativePromise.PromiseElementResolver) this.z, context, scriptable, scriptable2, objArr);
        }
    }
}
