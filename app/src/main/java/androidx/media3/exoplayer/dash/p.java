package androidx.media3.exoplayer.dash;

import android.os.Handler;
import androidx.appcompat.widget.c2;
import androidx.media3.common.j0;
import androidx.media3.common.r;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.source.s0;
import androidx.media3.exoplayer.source.w0;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h0 {
    public final w0 a;
    public final androidx.localbroadcastmanager.content.b b = new androidx.localbroadcastmanager.content.b(9, false);
    public final androidx.media3.extractor.metadata.a c = new androidx.media3.extractor.metadata.a(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ q e;

    public p(q qVar, c2 c2Var) {
        this.e = qVar;
        this.a = new w0(c2Var, null, null);
    }

    @Override // androidx.media3.extractor.h0
    public final void b(v vVar, int i, int i2) {
        this.a.b(vVar, i, 0);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) {
        return this.a.c(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void e(r rVar) {
        this.a.e(rVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        long jI;
        long jT;
        this.a.g(j, i, i2, i3, g0Var);
        while (this.a.z(false)) {
            androidx.media3.extractor.metadata.a aVar = this.c;
            aVar.o();
            if (this.a.E(this.b, aVar, 0, false) == -4) {
                aVar.r();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j2 = aVar.D;
                androidx.media3.common.h0 h0VarE = this.e.z.E(aVar);
                if (h0VarE != null) {
                    androidx.media3.extractor.metadata.emsg.a aVar2 = (androidx.media3.extractor.metadata.emsg.a) h0VarE.a[0];
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jT = i0.T(i0.r(aVar2.e));
                        } catch (j0 unused) {
                            jT = -9223372036854775807L;
                        }
                        if (jT != -9223372036854775807L) {
                            o oVar = new o(j2, jT);
                            Handler handler = this.e.A;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        w0 w0Var = this.a;
        s0 s0Var = w0Var.a;
        synchronized (w0Var) {
            int i4 = w0Var.s;
            jI = i4 == 0 ? -1L : w0Var.i(i4);
        }
        s0Var.a(jI);
    }
}
