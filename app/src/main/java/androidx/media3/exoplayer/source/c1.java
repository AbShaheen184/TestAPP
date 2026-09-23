package androidx.media3.exoplayer.source;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements x0 {
    public int e;
    public boolean y;
    public final /* synthetic */ e1 z;

    public c1(e1 e1Var) {
        this.z = e1Var;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final boolean a() {
        return this.z.I;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void b() throws IOException {
        e1 e1Var = this.z;
        if (e1Var.H) {
            return;
        }
        e1Var.F.b();
    }

    public final void c() {
        if (this.y) {
            return;
        }
        e1 e1Var = this.z;
        e1Var.B.b(androidx.media3.common.i0.i(e1Var.G.o), e1Var.G, 0, null, 0L);
        this.y = true;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int e(androidx.localbroadcastmanager.content.b bVar, androidx.media3.decoder.e eVar, int i) {
        c();
        e1 e1Var = this.z;
        boolean z = e1Var.I;
        if (z && e1Var.J == null) {
            this.e = 2;
        }
        int i2 = this.e;
        if (i2 == 2) {
            eVar.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            bVar.z = e1Var.G;
            this.e = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        e1Var.J.getClass();
        eVar.a(1);
        eVar.D = 0L;
        if ((i & 4) == 0) {
            eVar.q(e1Var.K);
            eVar.B.put(e1Var.J, 0, e1Var.K);
        }
        if ((i & 1) == 0) {
            this.e = 2;
        }
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final int h(long j) {
        c();
        if (j <= 0 || this.e == 2) {
            return 0;
        }
        this.e = 2;
        return 1;
    }
}
