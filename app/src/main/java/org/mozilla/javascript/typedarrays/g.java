package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaConstructor;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeTypedArrayView.lambda$init$16((NativeTypedArrayView.RealThis) this.y, context, scriptable, scriptable2, objArr);
            case 1:
                return NativeTypedArrayView.lambda$init$17((NativeTypedArrayView.RealThis) this.y, context, scriptable, scriptable2, objArr);
            default:
                return NativeArrayBuffer.lambda$init$0((LambdaConstructor) this.y, context, scriptable, scriptable2, objArr);
        }
    }
}
