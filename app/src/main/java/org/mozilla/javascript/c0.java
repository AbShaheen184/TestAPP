package org.mozilla.javascript;

import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ c0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return ((NativePromise.Capability) this.y).lambda$new$0(context, scriptable, scriptable2, objArr);
            case 1:
                return LambdaAccessorSlot.lambda$setGetter$0((java.util.function.Function) this.y, context, scriptable, scriptable2, objArr);
            default:
                return LambdaAccessorSlot.lambda$setSetter$1((BiConsumer) this.y, context, scriptable, scriptable2, objArr);
        }
    }
}
