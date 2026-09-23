package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h6 implements androidx.compose.ui.window.c0 {
    public final int e;

    public h6(int i) {
        this.e = i;
    }

    @Override // androidx.compose.ui.window.c0
    public final long a(androidx.compose.ui.unit.k kVar, long j, androidx.compose.ui.unit.m mVar, long j2) {
        int i = (int) (j2 >> 32);
        int iC = ((kVar.c() - i) / 2) + kVar.a;
        if (iC < 0) {
            iC = kVar.a;
        } else if (iC + i > ((int) (j >> 32))) {
            iC = kVar.c - i;
        }
        int i2 = kVar.b - ((int) (j2 & 4294967295L));
        int i3 = this.e;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = kVar.d + i3;
        }
        return (((long) i4) & 4294967295L) | (((long) iC) << 32);
    }
}
