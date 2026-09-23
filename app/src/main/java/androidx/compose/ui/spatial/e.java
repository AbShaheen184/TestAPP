package androidx.compose.ui.spatial;

import androidx.collection.o;
import androidx.collection.z;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final z a;
    public d b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public e() {
        z zVar = o.a;
        this.a = new z();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(d dVar, long j, long j2, float[] fArr, long j3) {
        long j4 = dVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            dVar.g = j3;
            dVar.a(dVar.e, dVar.f, j, j2, fArr);
        }
    }
}
