package kotlinx.serialization.json.internal;

import androidx.media3.common.util.l0;
import androidx.media3.exoplayer.source.t0;
import com.google.android.gms.measurement.internal.z;
import kotlin.collections.i0;
import kotlinx.serialization.internal.q0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final androidx.core.text.f a;
    public final kotlinx.serialization.json.b b;
    public final q c;
    public final n[] d;
    public final z e;
    public final l0 f;
    public boolean g;
    public String h;
    public String i;

    public n(androidx.core.text.f fVar, kotlinx.serialization.json.b bVar, q qVar, n[] nVarArr) {
        fVar.getClass();
        this.a = fVar;
        this.b = bVar;
        this.c = qVar;
        this.d = nVarArr;
        this.e = bVar.b;
        this.f = bVar.a;
        int iOrdinal = qVar.ordinal();
        if (nVarArr != null) {
            n nVar = nVarArr[iOrdinal];
            if (nVar == null && nVar == this) {
                return;
            }
            nVarArr[iOrdinal] = this;
        }
    }

    public final n a(kotlinx.serialization.descriptors.e eVar) {
        n nVar;
        eVar.getClass();
        kotlinx.serialization.json.b bVar = this.b;
        q qVarI = i.i(eVar, bVar);
        char c = qVarI.e;
        androidx.core.text.f fVar = this.a;
        fVar.h(c);
        fVar.a = true;
        String str = this.h;
        if (str != null) {
            String strA = this.i;
            if (strA == null) {
                strA = eVar.a();
            }
            fVar.f();
            fVar.l(str);
            fVar.h(':');
            r(strA);
            this.h = null;
            this.i = null;
        }
        if (this.c == qVarI) {
            return this;
        }
        n[] nVarArr = this.d;
        return (nVarArr == null || (nVar = nVarArr[qVarI.ordinal()]) == null) ? new n(fVar, bVar, qVarI, nVarArr) : nVar;
    }

    public final void b(boolean z) {
        if (this.g) {
            r(String.valueOf(z));
        } else {
            ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) this.a.b).p(String.valueOf(z));
        }
    }

    public final void c(byte b) {
        if (this.g) {
            r(String.valueOf((int) b));
        } else {
            this.a.g(b);
        }
    }

    public final void d(char c) {
        r(String.valueOf(c));
    }

    public final void e(double d) {
        boolean z = this.g;
        androidx.core.text.f fVar = this.a;
        if (z) {
            r(String.valueOf(d));
        } else {
            ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) fVar.b).p(String.valueOf(d));
        }
        this.f.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw i.a(Double.valueOf(d), ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) fVar.b).toString());
        }
    }

    public final void f(kotlinx.serialization.descriptors.e eVar, int i) {
        eVar.getClass();
        int iOrdinal = this.c.ordinal();
        androidx.core.text.f fVar = this.a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!fVar.a) {
                fVar.h(',');
            }
            fVar.f();
            return;
        }
        if (iOrdinal == 2) {
            if (fVar.a) {
                this.g = true;
                fVar.f();
                return;
            }
            if (i % 2 == 0) {
                fVar.h(',');
                fVar.f();
            } else {
                fVar.h(':');
                fVar.m();
                z = false;
            }
            this.g = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!fVar.a) {
                fVar.h(',');
            }
            fVar.f();
            i.h(eVar, this.b);
            r(eVar.g(i));
            fVar.h(':');
            fVar.m();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            fVar.h(',');
            fVar.m();
            this.g = false;
        }
    }

    public final void g(float f) {
        boolean z = this.g;
        androidx.core.text.f fVar = this.a;
        if (z) {
            r(String.valueOf(f));
        } else {
            ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) fVar.b).p(String.valueOf(f));
        }
        this.f.getClass();
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw i.a(Float.valueOf(f), ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) fVar.b).toString());
        }
    }

    public final n h(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        boolean zA = o.a(eVar);
        q qVar = this.c;
        kotlinx.serialization.json.b bVar = this.b;
        androidx.core.text.f dVar = this.a;
        if (zA) {
            if (!(dVar instanceof e)) {
                dVar = new e((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) dVar.b, this.g);
            }
            return new n(dVar, bVar, qVar, null);
        }
        if (eVar.isInline() && eVar.equals(kotlinx.serialization.json.j.a)) {
            if (!(dVar instanceof d)) {
                dVar = new d((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) dVar.b, this.g);
            }
            return new n(dVar, bVar, qVar, null);
        }
        if (this.h != null) {
            this.i = eVar.a();
        }
        return this;
    }

    public final n i(q0 q0Var, int i) {
        q0Var.getClass();
        f(q0Var, i);
        return h(q0Var.i(i));
    }

    public final void j(int i) {
        if (this.g) {
            r(String.valueOf(i));
        } else {
            this.a.i(i);
        }
    }

    public final void k(long j) {
        if (this.g) {
            r(String.valueOf(j));
        } else {
            this.a.j(j);
        }
    }

    public final void l(kotlinx.serialization.descriptors.e eVar, int i, long j) {
        eVar.getClass();
        f(eVar, i);
        k(j);
    }

    public final void m() {
        androidx.core.text.f fVar = this.a;
        fVar.getClass();
        ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) fVar.b).p("null");
    }

    public final void n(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        if (obj != null || this.f.b) {
            eVar.getClass();
            aVar.getClass();
            f(eVar, i);
            if (aVar.d().c()) {
                p(aVar, obj);
            } else if (obj == null) {
                m();
            } else {
                p(aVar, obj);
            }
        }
    }

    public final void o(kotlinx.serialization.descriptors.e eVar, int i, kotlinx.serialization.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        f(eVar, i);
        p(aVar, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public final void p(kotlinx.serialization.a aVar, Object obj) {
        String strE;
        aVar.getClass();
        kotlinx.serialization.json.b bVar = this.b;
        l0 l0Var = bVar.a;
        l0Var.getClass();
        boolean z = aVar instanceof kotlinx.serialization.c;
        kotlinx.serialization.json.a aVar2 = (kotlinx.serialization.json.a) l0Var.f;
        if (!z) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    i0 i0VarE = aVar.d().e();
                    strE = (kotlin.jvm.internal.l.a(i0VarE, kotlinx.serialization.descriptors.i.b) || kotlin.jvm.internal.l.a(i0VarE, kotlinx.serialization.descriptors.i.e)) ? i.e(aVar.d(), bVar) : null;
                } else if (iOrdinal != 2) {
                    coil3.g.a();
                    return;
                }
            }
        } else if (aVar2 != kotlinx.serialization.json.a.e) {
        }
        if (!z) {
            if (strE != null) {
                String strA = aVar.d().a();
                this.h = strE;
                this.i = strA;
            }
            aVar.b(this, obj);
            return;
        }
        kotlinx.serialization.c cVar = (kotlinx.serialization.c) aVar;
        if (obj == null) {
            t0.g(cVar.d(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
            return;
        }
        cVar.getClass();
        obj.getClass();
        this.e.getClass();
        throw null;
    }

    public final void q(short s) {
        if (this.g) {
            r(String.valueOf((int) s));
        } else {
            this.a.k(s);
        }
    }

    public final void r(String str) {
        str.getClass();
        this.a.l(str);
    }

    public final void s(kotlinx.serialization.descriptors.e eVar) {
        eVar.getClass();
        androidx.core.text.f fVar = this.a;
        fVar.getClass();
        fVar.a = false;
        fVar.h(this.c.y);
    }

    public final boolean t(kotlinx.serialization.descriptors.e eVar) {
        this.f.getClass();
        return false;
    }
}
