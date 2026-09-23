package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Callable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Scriptable y;
    public final /* synthetic */ Callable z;

    public /* synthetic */ a0(Scriptable scriptable, Callable callable, Object obj, int i) {
        this.e = i;
        this.y = scriptable;
        this.z = callable;
        this.A = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativePromise.lambda$makeThenFinally$5(this.y, this.z, this.A, context, scriptable, scriptable2, objArr);
            default:
                return NativePromise.lambda$makeCatchFinally$7(this.y, this.z, this.A, context, scriptable, scriptable2, objArr);
        }
    }
}
