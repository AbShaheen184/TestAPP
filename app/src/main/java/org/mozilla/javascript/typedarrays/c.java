package org.mozilla.javascript.typedarrays;

import java.util.NoSuchElementException;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements NativeTypedArrayView.TypedArrayConstructable, NativeTypedArrayView.RealThis {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void b(String str) throws org.schabi.newpipe.extractor.exceptions.f {
        throw new org.schabi.newpipe.extractor.exceptions.f(str);
    }

    public static /* synthetic */ void c(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void d(String str, Throwable th) throws org.schabi.newpipe.extractor.exceptions.f {
        throw new org.schabi.newpipe.extractor.exceptions.f(str, th);
    }

    public static /* synthetic */ void e(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.TypedArrayConstructable
    public NativeTypedArrayView construct(NativeArrayBuffer nativeArrayBuffer, int i, int i2) {
        switch (this.a) {
            case 0:
                return new NativeFloat32Array(nativeArrayBuffer, i, i2);
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            default:
                return new NativeUint8ClampedArray(nativeArrayBuffer, i, i2);
            case 2:
                return new NativeFloat64Array(nativeArrayBuffer, i, i2);
            case 4:
                return new NativeInt16Array(nativeArrayBuffer, i, i2);
            case 6:
                return new NativeInt32Array(nativeArrayBuffer, i, i2);
            case 9:
                return new NativeInt8Array(nativeArrayBuffer, i, i2);
            case 11:
                return new NativeUint16Array(nativeArrayBuffer, i, i2);
            case 13:
                return new NativeUint32Array(nativeArrayBuffer, i, i2);
            case 14:
                return new NativeUint8Array(nativeArrayBuffer, i, i2);
        }
    }

    @Override // org.mozilla.javascript.typedarrays.NativeTypedArrayView.RealThis
    public NativeTypedArrayView realThis(Scriptable scriptable) {
        switch (this.a) {
            case 1:
                return NativeFloat32Array.realThis(scriptable);
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
            case 13:
            case 14:
            default:
                return NativeUint8ClampedArray.realThis(scriptable);
            case 3:
                return NativeFloat64Array.realThis(scriptable);
            case 5:
                return NativeInt16Array.realThis(scriptable);
            case 7:
                return NativeInt32Array.realThis(scriptable);
            case 8:
                return NativeInt8Array.realThis(scriptable);
            case 10:
                return NativeUint16Array.realThis(scriptable);
            case 12:
                return NativeUint32Array.realThis(scriptable);
            case 15:
                return NativeUint8Array.realThis(scriptable);
        }
    }
}
