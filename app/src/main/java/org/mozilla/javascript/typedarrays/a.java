package org.mozilla.javascript.typedarrays;

import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Constructable {
    public final /* synthetic */ int e;

    public /* synthetic */ a(int i) {
        this.e = i;
    }

    @Override // org.mozilla.javascript.Constructable
    public final Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        switch (this.e) {
            case 0:
                return NativeArrayBuffer.js_constructor(context, scriptable, objArr);
            case 1:
                return NativeDataView.js_constructor(context, scriptable, objArr);
            case 2:
                return NativeFloat32Array.lambda$init$0(context, scriptable, objArr);
            case 3:
                return NativeFloat64Array.lambda$init$0(context, scriptable, objArr);
            case 4:
                return NativeInt16Array.lambda$init$0(context, scriptable, objArr);
            case 5:
                return NativeInt32Array.lambda$init$0(context, scriptable, objArr);
            case 6:
                return NativeInt8Array.lambda$init$0(context, scriptable, objArr);
            case 7:
                return NativeUint16Array.lambda$init$0(context, scriptable, objArr);
            case 8:
                return NativeUint32Array.lambda$init$0(context, scriptable, objArr);
            case 9:
                return NativeUint8Array.lambda$init$0(context, scriptable, objArr);
            default:
                return NativeUint8ClampedArray.lambda$init$0(context, scriptable, objArr);
        }
    }
}
