package androidx.media3.extractor.ogg;

import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.source.r0;
import androidx.media3.extractor.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public t n;
    public r0 o;

    @Override // androidx.media3.extractor.ogg.i
    public final long b(v vVar) {
        byte[] bArr = vVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            vVar.N(4);
            vVar.H();
        }
        int iS = androidx.media3.extractor.b.s(i, vVar);
        vVar.M(0);
        return iS;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final boolean c(v vVar, long j, androidx.localbroadcastmanager.content.b bVar) {
        byte[] bArr = vVar.a;
        t tVar = this.n;
        if (tVar == null) {
            t tVar2 = new t(bArr, 17);
            this.n = tVar2;
            q qVarA = tVar2.c(Arrays.copyOfRange(bArr, 9, vVar.c), null).a();
            qVarA.m = i0.p("audio/ogg");
            bVar.y = new r(qVarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            r0 r0Var = this.o;
            if (r0Var != null) {
                r0Var.e = j;
                bVar.z = r0Var;
            }
            ((r) bVar.y).getClass();
            return false;
        }
        androidx.localbroadcastmanager.content.b bVarT = androidx.media3.extractor.b.t(vVar);
        t tVar3 = new t(tVar.a, tVar.b, tVar.c, tVar.d, tVar.e, tVar.g, tVar.h, tVar.j, bVarT, tVar.l);
        this.n = tVar3;
        r0 r0Var2 = new r0();
        r0Var2.z = tVar3;
        r0Var2.A = bVarT;
        r0Var2.e = -1L;
        r0Var2.y = -1L;
        this.o = r0Var2;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
