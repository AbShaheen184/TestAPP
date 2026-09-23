package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final long[] e = new long[0];
    public final kotlinx.serialization.descriptors.e a;
    public final androidx.compose.foundation.t0 b;
    public long c;
    public final long[] d;

    public s(kotlinx.serialization.descriptors.e eVar, androidx.compose.foundation.t0 t0Var) {
        eVar.getClass();
        this.a = eVar;
        this.b = t0Var;
        int iF = eVar.f();
        if (iF <= 64) {
            this.c = iF != 64 ? (-1) << iF : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }
}
