package androidx.media3.extractor.avif;

import androidx.media3.common.util.v;
import androidx.media3.extractor.c0;
import androidx.media3.extractor.k;
import androidx.media3.extractor.n;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import androidx.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n {
    public final /* synthetic */ int a;
    public final v b;
    public final c0 c;

    public a(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new v(4);
                this.c = new c0(-1, -1, "image/webp");
                break;
            default:
                this.b = new v(4);
                this.c = new c0(-1, -1, "image/avif");
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(o oVar) {
        switch (this.a) {
            case 0:
                k kVar = (k) oVar;
                kVar.a(4, false);
                v vVar = this.b;
                vVar.J(4);
                kVar.e(vVar.a, 0, 4, false);
                if (vVar.B() != 1718909296) {
                    return false;
                }
                vVar.J(4);
                kVar.e(vVar.a, 0, 4, false);
                return vVar.B() == ((long) 1635150182);
            default:
                v vVar2 = this.b;
                vVar2.J(4);
                k kVar2 = (k) oVar;
                kVar2.e(vVar2.a, 0, 4, false);
                if (vVar2.B() != 1380533830) {
                    return false;
                }
                kVar2.a(4, false);
                vVar2.J(4);
                kVar2.e(vVar2.a, 0, 4, false);
                return vVar2.B() == 1464156752;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.b(j, j2);
                break;
            default:
                this.c.b(j, j2);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final int c(o oVar, r rVar) {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c.c(oVar, rVar);
    }

    @Override // androidx.media3.extractor.n
    public final void d(p pVar) {
        switch (this.a) {
            case 0:
                this.c.d(pVar);
                break;
            default:
                this.c.d(pVar);
                break;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
        int i = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }
}
