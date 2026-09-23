package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ LambdaConstructor y;

    public /* synthetic */ y(LambdaConstructor lambdaConstructor, int i) {
        this.e = i;
        this.y = lambdaConstructor;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativePromise.lambda$init$0(this.y, context, scriptable, scriptable2, objArr);
            case 1:
                return NativePromise.lambda$init$1(this.y, context, scriptable, scriptable2, objArr);
            default:
                return NativeSymbol.lambda$init$0(this.y, context, scriptable, scriptable2, objArr);
        }
    }
}
