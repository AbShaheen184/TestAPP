package androidx.media3.exoplayer.source;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements u, t {
    public final com.google.android.material.shape.f A;
    public final ArrayList B = new ArrayList();
    public final HashMap C = new HashMap();
    public t D;
    public j1 E;
    public u[] F;
    public j G;
    public final u[] e;
    public final boolean[] y;
    public final IdentityHashMap z;

    public e0(com.google.android.material.shape.f fVar, long[] jArr, u... uVarArr) {
        this.A = fVar;
        this.e = uVarArr;
        fVar.getClass();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        this.G = new j(a1Var, a1Var);
        this.z = new IdentityHashMap();
        this.F = new u[0];
        this.y = new boolean[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.y[i] = true;
                this.e[i] = new h1(uVarArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            return this.G.d(n0Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((u) arrayList.get(i)).d(n0Var);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long g() {
        return this.G.g();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void i() {
        for (u uVar : this.e) {
            uVar.i();
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j, androidx.media3.exoplayer.k1 k1Var) {
        u[] uVarArr = this.F;
        return (uVarArr.length > 0 ? uVarArr[0] : this.e[0]).j(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long k(long j) {
        long jK = this.F[0].k(j);
        int i = 1;
        while (true) {
            u[] uVarArr = this.F;
            if (i >= uVarArr.length) {
                return jK;
            }
            if (uVarArr[i].k(jK) != jK) {
                kotlinx.coroutines.future.a.u("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void l(long j) {
        for (u uVar : this.F) {
            uVar.l(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long m(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, x0[] x0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.z;
            if (i2 >= length) {
                break;
            }
            x0 x0Var = x0VarArr[i2];
            Integer num = x0Var == null ? null : (Integer) identityHashMap.get(x0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i2];
            if (qVar != null) {
                String str = qVar.c().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        x0[] x0VarArr2 = new x0[length2];
        x0[] x0VarArr3 = new x0[qVarArr.length];
        androidx.media3.exoplayer.trackselection.q[] qVarArr2 = new androidx.media3.exoplayer.trackselection.q[qVarArr.length];
        u[] uVarArr = this.e;
        ArrayList arrayList = new ArrayList(uVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < uVarArr.length) {
            int i4 = i;
            while (i4 < qVarArr.length) {
                x0VarArr3[i4] = iArr[i4] == i3 ? x0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    androidx.media3.exoplayer.trackselection.q qVar2 = qVarArr[i4];
                    qVar2.getClass();
                    androidx.media3.common.w0 w0Var = (androidx.media3.common.w0) this.C.get(qVar2.c());
                    w0Var.getClass();
                    qVarArr2[i4] = new d0(qVar2, w0Var);
                } else {
                    qVarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            u[] uVarArr2 = uVarArr;
            int i5 = i3;
            long jM = uVarArr2[i3].m(qVarArr2, zArr, x0VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jM;
            } else if (jM != j2) {
                kotlinx.coroutines.future.a.u("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < qVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    x0 x0Var2 = x0VarArr3[i6];
                    x0Var2.getClass();
                    x0VarArr2[i6] = x0VarArr3[i6];
                    identityHashMap.put(x0Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    _COROUTINE.a.A(x0VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(uVarArr2[i5]);
            }
            i3 = i5 + 1;
            uVarArr = uVarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(x0VarArr2, i7, x0VarArr, i7, length2);
        this.F = (u[]) arrayList.toArray(new u[i7]);
        AbstractList abstractListW = com.google.common.collect.q.w(arrayList, new androidx.media3.common.p(6));
        this.A.getClass();
        this.G = new j(arrayList, abstractListW);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final boolean o() {
        return this.G.o();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        long j = -9223372036854775807L;
        for (u uVar : this.F) {
            long jP = uVar.p();
            if (jP == -9223372036854775807L) {
                if (j != -9223372036854775807L && uVar.k(j) != j) {
                    kotlinx.coroutines.future.a.u("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j == -9223372036854775807L) {
                for (u uVar2 : this.F) {
                    if (uVar2 == uVar) {
                        break;
                    }
                    if (uVar2.k(jP) != jP) {
                        kotlinx.coroutines.future.a.u("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j = jP;
            } else if (jP != j) {
                kotlinx.coroutines.future.a.u("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.D = tVar;
        ArrayList arrayList = this.B;
        u[] uVarArr = this.e;
        Collections.addAll(arrayList, uVarArr);
        for (u uVar : uVarArr) {
            uVar.q(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void s(u uVar) {
        ArrayList arrayList = this.B;
        arrayList.remove(uVar);
        if (arrayList.isEmpty()) {
            u[] uVarArr = this.e;
            int i = 0;
            for (u uVar2 : uVarArr) {
                i += uVar2.t().a;
            }
            androidx.media3.common.w0[] w0VarArr = new androidx.media3.common.w0[i];
            int i2 = 0;
            for (int i3 = 0; i3 < uVarArr.length; i3++) {
                j1 j1VarT = uVarArr[i3].t();
                int i4 = j1VarT.a;
                int i5 = 0;
                while (i5 < i4) {
                    androidx.media3.common.w0 w0VarA = j1VarT.a(i5);
                    int i6 = w0VarA.a;
                    androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        androidx.media3.common.r rVar = w0VarA.d[i7];
                        androidx.media3.common.q qVarA = rVar.a();
                        String str = rVar.m;
                        u[] uVarArr2 = uVarArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = rVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        qVarA.a = sb.toString();
                        if (str != null) {
                            qVarA.l = i3 + ":" + str;
                        }
                        rVarArr[i7] = new androidx.media3.common.r(qVarA);
                        i7++;
                        uVarArr = uVarArr2;
                    }
                    u[] uVarArr3 = uVarArr;
                    androidx.media3.common.w0 w0Var = new androidx.media3.common.w0(i3 + ":" + w0VarA.b, rVarArr);
                    this.C.put(w0Var, w0VarA);
                    w0VarArr[i2] = w0Var;
                    i5++;
                    i2++;
                    uVarArr = uVarArr3;
                }
            }
            this.E = new j1(w0VarArr);
            t tVar = this.D;
            tVar.getClass();
            tVar.s(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final j1 t() {
        j1 j1Var = this.E;
        j1Var.getClass();
        return j1Var;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void u(z0 z0Var) {
        t tVar = this.D;
        tVar.getClass();
        tVar.u(this);
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final long v() {
        return this.G.v();
    }

    @Override // androidx.media3.exoplayer.source.z0
    public final void w(long j) {
        this.G.w(j);
    }
}
