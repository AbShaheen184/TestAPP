package androidx.media3.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.j0;
import androidx.media3.common.util.g0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements androidx.media3.extractor.n {
    public final int a;
    public final int b;
    public final List c;
    public final androidx.media3.common.util.v d;
    public final SparseIntArray e;
    public final androidx.compose.foundation.lazy.grid.t f;
    public final androidx.media3.extractor.text.j g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final w k;
    public androidx.media3.extractor.flac.b l;
    public androidx.media3.extractor.p m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public f0 r;
    public int s;
    public int t;

    public c0(int i, int i2, androidx.media3.extractor.text.j jVar, g0 g0Var, androidx.compose.foundation.lazy.grid.t tVar) {
        this.f = tVar;
        this.a = i;
        this.b = i2;
        this.g = jVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(g0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(g0Var);
        }
        this.d = new androidx.media3.common.util.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new w(1);
        this.m = androidx.media3.extractor.p.f;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (f0) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new a0(new androidx.localbroadcastmanager.content.b(this)));
        this.r = null;
    }

    @Override // androidx.media3.extractor.n
    public final boolean a(androidx.media3.extractor.o oVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.d.a;
        androidx.media3.extractor.k kVar = (androidx.media3.extractor.k) oVar;
        kVar.e(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    kVar.d(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.n
    public final void b(long j, long j2) {
        androidx.media3.extractor.flac.b bVar;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        _COROUTINE.a.A(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g0 g0Var = (g0) list.get(i);
            synchronized (g0Var) {
                j3 = g0Var.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = g0Var.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                g0Var.f(j2);
            }
        }
        if (j2 != 0 && (bVar = this.l) != null) {
            bVar.d(j2);
        }
        this.d.J(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((f0) sparseArray.valueAt(i2)).a();
        }
        this.s = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.media3.extractor.ts.f0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.media3.extractor.n
    public final int c(androidx.media3.extractor.o oVar, androidx.media3.extractor.r rVar) throws j0 {
        androidx.media3.extractor.o oVar2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        f0 f0Var;
        boolean z;
        long length = oVar.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            w wVar = this.k;
            if (length != -1 && !z2 && !wVar.d) {
                int i6 = this.t;
                g0 g0Var = wVar.b;
                androidx.media3.common.util.v vVar = wVar.c;
                if (i6 <= 0) {
                    wVar.a(oVar);
                    return 0;
                }
                if (wVar.f) {
                    if (wVar.h == -9223372036854775807L) {
                        wVar.a(oVar);
                        return 0;
                    }
                    if (wVar.e) {
                        long j2 = wVar.g;
                        if (j2 == -9223372036854775807L) {
                            wVar.a(oVar);
                            return 0;
                        }
                        wVar.i = g0Var.c(wVar.h) - g0Var.b(j2);
                        wVar.a(oVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, oVar.getLength());
                    long j3 = 0;
                    if (oVar.getPosition() != j3) {
                        rVar.a = j3;
                        return 1;
                    }
                    vVar.J(iMin);
                    oVar.n();
                    oVar.w(vVar.a, 0, iMin);
                    int i7 = vVar.c;
                    for (int i8 = vVar.b; i8 < i7; i8++) {
                        if (vVar.a[i8] == 71) {
                            long jL = androidx.work.impl.v.L(vVar, i8, i6);
                            if (jL != -9223372036854775807L) {
                                j = jL;
                                break;
                            }
                        }
                    }
                    wVar.g = j;
                    wVar.e = true;
                    return 0;
                }
                long length2 = oVar.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j4 = length2 - ((long) iMin2);
                if (oVar.getPosition() != j4) {
                    rVar.a = j4;
                    return 1;
                }
                vVar.J(iMin2);
                oVar.n();
                oVar.w(vVar.a, 0, iMin2);
                int i9 = vVar.b;
                int i10 = vVar.c;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = vVar.a;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jL2 = androidx.work.impl.v.L(vVar, i11, i6);
                                if (jL2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jL2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                wVar.h = j;
                wVar.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j5 = wVar.i;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    androidx.media3.extractor.flac.b bVar = new androidx.media3.extractor.flac.b(new com.google.firebase.heartbeatinfo.e(12), new androidx.appcompat.widget.x(this.t, wVar.b), j5, 1 + j5, 0L, length, 188L, 940);
                    this.l = bVar;
                    this.m.h(bVar.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.h(new androidx.media3.extractor.s(j5));
                }
            }
            if (this.q) {
                this.q = z;
                b(0L, 0L);
                if (oVar.getPosition() != 0) {
                    rVar.a = 0L;
                    return i;
                }
            }
            androidx.media3.extractor.flac.b bVar2 = this.l;
            if (bVar2 != null && bVar2.c != null) {
                return bVar2.b(oVar, rVar);
            }
            oVar2 = oVar;
            r1 = z;
        } else {
            oVar2 = oVar;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        androidx.media3.common.util.v vVar2 = this.d;
        byte[] bArr2 = vVar2.a;
        if (9400 - vVar2.b < 188) {
            int iA = vVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, vVar2.b, bArr2, r1, iA);
            }
            vVar2.K(bArr2, iA);
        }
        while (true) {
            int iA2 = vVar2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i15 = vVar2.b;
                int i16 = vVar2.c;
                byte[] bArr3 = vVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                vVar2.M(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw j0.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = vVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iM = vVar2.m();
                if ((8388608 & iM) != 0) {
                    vVar2.M(i18);
                    return r1;
                }
                ?? r9 = (4194304 & iM) != 0 ? 1 : r1;
                int i21 = (2096896 & iM) >> 8;
                ?? r11 = (iM & 32) != 0 ? 1 : r1;
                if ((iM & 16) != 0) {
                    f0Var = (f0) r7.get(i21);
                }
                if (r8 == 0) {
                    r8 = f0Var;
                    vVar2.M(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        vVar2.M(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.a();
                    }
                }
                if (r11 != 0) {
                    int iZ = vVar2.z();
                    r9 = (r9 == true ? 1 : 0) | ((vVar2.z() & 64) != 0 ? i4 : r1);
                    vVar2.N(iZ - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    vVar2.L(i18);
                    r8.b(r9, vVar2);
                    vVar2.L(i20);
                }
                if (i3 != i4 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                vVar2.M(i18);
                return r1;
            }
            int i24 = vVar2.c;
            int i25 = oVar2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    f0 f0Var2 = (f0) r7.valueAt(r4);
                    if (f0Var2 instanceof v) {
                        v vVar3 = (v) f0Var2;
                        ?? r3 = (!z2 || vVar3.e()) ? i : r1;
                        if (vVar3.c == 3 && vVar3.j == -1 && ((!z2 || !(vVar3.a instanceof j)) && r3 != 0)) {
                            vVar3.b(i, new androidx.media3.common.util.v());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            vVar2.L(i24 + i25);
            i = 1;
        }
    }

    @Override // androidx.media3.extractor.n
    public final void d(androidx.media3.extractor.p pVar) {
        if ((this.b & 1) == 0) {
            pVar = new b1(pVar, this.g);
        }
        this.m = pVar;
    }

    @Override // androidx.media3.extractor.n
    public final void release() {
    }
}
