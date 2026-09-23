package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    public long A = f1.a;
    public long B = 0;
    public int e;
    public int y;
    public long z;

    public d1() {
        long j = 0;
        this.z = (j & 4294967295L) | (j << 32);
    }

    public Object L() {
        return null;
    }

    public abstract int b0(a aVar);

    public int d0() {
        return (int) (this.z & 4294967295L);
    }

    public int g0() {
        return (int) (this.z >> 32);
    }

    public final void j0() {
        this.e = kotlin.collections.i0.d((int) (this.z >> 32), androidx.compose.ui.unit.a.j(this.A), androidx.compose.ui.unit.a.h(this.A));
        int iD = kotlin.collections.i0.d((int) (this.z & 4294967295L), androidx.compose.ui.unit.a.i(this.A), androidx.compose.ui.unit.a.g(this.A));
        this.y = iD;
        int i = this.e;
        long j = this.z;
        this.B = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iD - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void l0(long j, float f, kotlin.jvm.functions.l lVar);

    public final void n0(long j) {
        if (androidx.compose.ui.unit.l.a(this.z, j)) {
            return;
        }
        this.z = j;
        j0();
    }

    public final void o0(long j) {
        if (androidx.compose.ui.unit.a.b(this.A, j)) {
            return;
        }
        this.A = j;
        j0();
    }
}
