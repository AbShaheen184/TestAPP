package androidx.media3.extractor.heif;

import androidx.compose.foundation.gestures.d3;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.util.v;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.mp4.m;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;
import androidx.media3.extractor.s;
import androidx.media3.extractor.text.j;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.c;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public p b;
    public o c;
    public d3 d;
    public m e;
    public int g;
    public long h;
    public int i;
    public final v a = new v(16);
    public long j = -1;
    public int f = 0;

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        return org.jsoup.helper.n.N((k) oVar, true);
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                m mVar = this.e;
                mVar.getClass();
                mVar.b(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) throws j0 {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                v vVar = this.a;
                if (i2 == 0) {
                    if (!oVar.b(vVar.a, 0, 8, true)) {
                        p pVar = this.b;
                        pVar.getClass();
                        pVar.r();
                        this.b.h(new s(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    vVar.M(0);
                    this.h = vVar.B();
                    this.g = vVar.m();
                }
                if (this.h == 1) {
                    oVar.readFully(vVar.a, 8, 8);
                    this.i += 8;
                    this.h = vVar.F();
                }
                if (this.g == 1836086884) {
                    long position = oVar.getPosition();
                    this.j = position;
                    long j = this.i;
                    androidx.media3.extractor.metadata.b bVar = new androidx.media3.extractor.metadata.b(0L, position - j, -9223372036854775807L, position, this.h - j);
                    p pVar2 = this.b;
                    pVar2.getClass();
                    h0 h0VarU = pVar2.u(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
                    q qVar = new q();
                    qVar.m = i0.p("image/heic");
                    qVar.k = new androidx.media3.common.h0(bVar);
                    h0VarU.e(new androidx.media3.common.r(qVar));
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                oVar.o((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        c.a();
                        return 0;
                    }
                    if (this.d == null || oVar != this.c) {
                        this.c = oVar;
                        this.d = new d3(oVar, this.j);
                    }
                    m mVar = this.e;
                    mVar.getClass();
                    int iC = mVar.c(this.d, rVar);
                    if (iC == 1) {
                        rVar.a += this.j;
                    }
                    return iC;
                }
                if (this.e == null) {
                    this.e = new m(j.g, 8);
                }
                d3 d3Var = new d3(oVar, this.j);
                this.d = d3Var;
                if (this.e.a(d3Var)) {
                    m mVar2 = this.e;
                    long j2 = this.j;
                    p pVar3 = this.b;
                    pVar3.getClass();
                    mVar2.d(new d3(j2, pVar3, 3));
                    this.f = 3;
                } else {
                    p pVar4 = this.b;
                    pVar4.getClass();
                    pVar4.r();
                    this.b.h(new s(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        this.b = pVar;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        m mVar = this.e;
        if (mVar != null) {
            mVar.getClass();
            this.e = null;
        }
    }
}
