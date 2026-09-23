package androidx.compose.ui.text;

import androidx.compose.material3.t3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static final androidx.compose.foundation.text.input.internal.o a;
    public static final androidx.compose.foundation.text.input.internal.o b;
    public static final androidx.compose.foundation.text.input.internal.o c;
    public static final androidx.compose.foundation.text.input.internal.o d;
    public static final androidx.compose.foundation.text.input.internal.o e;

    static {
        int i = 14;
        a = new androidx.compose.foundation.text.input.internal.o(i, new x(16), new y(13));
        b = new androidx.compose.foundation.text.input.internal.o(i, new x(17), new y(14));
        c = new androidx.compose.foundation.text.input.internal.o(i, new x(18), new y(15));
        d = new androidx.compose.foundation.text.input.internal.o(i, new x(19), new y(16));
        e = new androidx.compose.foundation.text.input.internal.o(i, new x(20), new y(17));
    }

    public static a a(String str, m0 m0Var, long j, androidx.compose.ui.unit.c cVar, androidx.compose.ui.text.font.d dVar, int i, int i2) {
        kotlin.collections.w wVar = kotlin.collections.w.e;
        return new a(new androidx.compose.ui.text.platform.d(str, m0Var, wVar, wVar, dVar, cVar), i, 1, j);
    }

    public static final long b(int i, int i2) {
        if (i < 0 || i2 < 0) {
            androidx.compose.ui.text.internal.a.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = l0.c;
        return j;
    }

    public static final long c(int i, long j) {
        int i2 = l0.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : b(i4, i);
    }

    public static final int d(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((p) kotlin.collections.p.J(list)).c;
        if (i > ((p) kotlin.collections.p.J(list)).c) {
            androidx.compose.ui.text.internal.a.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            p pVar = (p) list.get(i2);
            if (pVar.b > i) {
                b2 = 1;
            } else {
                b2 = pVar.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Found paragraph index ", i2, " should be in range [0, ");
        sbV.append(list.size());
        sbV.append(").\nDebug info: index=");
        sbV.append(i);
        sbV.append(", paragraphs=[");
        sbV.append(androidx.compose.ui.util.a.a(list, null, new t3(11), 31));
        sbV.append(']');
        androidx.compose.ui.text.internal.a.a(sbV.toString());
        return i2;
    }

    public static final int e(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            p pVar = (p) list.get(i3);
            if (pVar.d > i) {
                b2 = 1;
            } else {
                b2 = pVar.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int f(ArrayList arrayList, float f) {
        byte b2;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((p) kotlin.collections.p.J(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            p pVar = (p) arrayList.get(i2);
            if (pVar.f > f) {
                b2 = 1;
            } else {
                b2 = pVar.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void g(ArrayList arrayList, long j, kotlin.jvm.functions.l lVar) {
        int size = arrayList.size();
        for (int iD = d(l0.f(j), arrayList); iD < size; iD++) {
            p pVar = (p) arrayList.get(iD);
            if (pVar.b >= l0.e(j)) {
                return;
            }
            if (pVar.b != pVar.c) {
                lVar.invoke(pVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final m0 h(m0 m0Var, androidx.compose.ui.unit.m mVar) {
        long j;
        androidx.compose.ui.text.style.q qVar;
        int i;
        int i2;
        androidx.compose.ui.text.style.s sVar;
        e0 e0Var = m0Var.a;
        androidx.compose.ui.text.style.o oVar = f0.d;
        androidx.compose.ui.text.style.o oVar2 = e0Var.a;
        if (oVar2.equals(androidx.compose.ui.text.style.n.a)) {
            oVar2 = f0.d;
        }
        androidx.compose.ui.text.style.o oVar3 = oVar2;
        long j2 = e0Var.b;
        androidx.compose.ui.unit.p[] pVarArr = androidx.compose.ui.unit.o.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = f0.a;
        }
        long j3 = j2;
        androidx.compose.ui.text.font.k kVar = e0Var.c;
        if (kVar == null) {
            kVar = androidx.compose.ui.text.font.k.z;
        }
        androidx.compose.ui.text.font.k kVar2 = kVar;
        androidx.compose.ui.text.font.i iVar = e0Var.d;
        androidx.compose.ui.text.font.i iVar2 = new androidx.compose.ui.text.font.i(iVar != null ? iVar.a : 0);
        androidx.compose.ui.text.font.j jVar = e0Var.e;
        androidx.compose.ui.text.font.j jVar2 = new androidx.compose.ui.text.font.j(jVar != null ? jVar.a : 65535);
        androidx.compose.ui.text.font.r rVar = e0Var.f;
        if (rVar == null) {
            rVar = androidx.compose.ui.text.font.r.a;
        }
        androidx.compose.ui.text.font.r rVar2 = rVar;
        String str = e0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = e0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = f0.b;
        }
        long j5 = j4;
        androidx.compose.ui.text.style.a aVar = e0Var.i;
        float f = aVar != null ? aVar.a : 0.0f;
        androidx.compose.ui.text.style.a aVar2 = new androidx.compose.ui.text.style.a(Float.isNaN(f) ? 0.0f : f);
        androidx.compose.ui.text.style.p pVar = e0Var.j;
        if (pVar == null) {
            pVar = androidx.compose.ui.text.style.p.c;
        }
        androidx.compose.ui.text.style.p pVar2 = pVar;
        androidx.compose.ui.text.intl.b bVarZ = e0Var.k;
        if (bVarZ == null) {
            androidx.compose.ui.text.intl.b bVar = androidx.compose.ui.text.intl.b.z;
            bVarZ = androidx.compose.ui.text.intl.c.a.z();
        }
        androidx.compose.ui.text.intl.b bVar2 = bVarZ;
        long j6 = e0Var.l;
        if (j6 == 16) {
            j6 = f0.c;
        }
        long j7 = j6;
        androidx.compose.ui.text.style.l lVar = e0Var.m;
        if (lVar == null) {
            lVar = androidx.compose.ui.text.style.l.b;
        }
        androidx.compose.ui.text.style.l lVar2 = lVar;
        androidx.compose.ui.graphics.m0 m0Var2 = e0Var.n;
        if (m0Var2 == null) {
            m0Var2 = androidx.compose.ui.graphics.m0.d;
        }
        androidx.compose.ui.graphics.m0 m0Var3 = m0Var2;
        v vVar = e0Var.o;
        androidx.compose.ui.graphics.drawscope.e eVar = e0Var.p;
        if (eVar == null) {
            eVar = androidx.compose.ui.graphics.drawscope.g.a;
        }
        e0 e0Var2 = new e0(oVar3, j3, kVar2, iVar2, jVar2, rVar2, str2, j5, aVar2, pVar2, bVar2, j7, lVar2, m0Var3, vVar, eVar);
        s sVar2 = m0Var.b;
        int i3 = t.b;
        int i4 = sVar2.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = sVar2.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = mVar.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        coil3.g.a();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = sVar2.c;
            if ((j & 1095216660480L) == 0) {
                j = t.a;
            }
            qVar = sVar2.d;
            if (qVar == null) {
                qVar = androidx.compose.ui.text.style.q.c;
            }
            u uVar = sVar2.e;
            androidx.compose.ui.text.style.i iVar3 = sVar2.f;
            i = sVar2.g;
            if (i == 0) {
                i = androidx.compose.ui.text.style.e.b;
            }
            i2 = sVar2.h;
            if (i2 == 0) {
                i2 = 1;
            }
            sVar = sVar2.i;
            if (sVar == null) {
                sVar = androidx.compose.ui.text.style.s.c;
            }
            return new m0(e0Var2, new s(i4, i6, j, qVar, uVar, iVar3, i, i2, sVar), m0Var.c);
        }
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            coil3.g.a();
            return null;
        }
        i6 = i5;
        j = sVar2.c;
        if ((j & 1095216660480L) == 0) {
            j = t.a;
        }
        qVar = sVar2.d;
        if (qVar == null) {
            qVar = androidx.compose.ui.text.style.q.c;
        }
        u uVar2 = sVar2.e;
        androidx.compose.ui.text.style.i iVar4 = sVar2.f;
        i = sVar2.g;
        if (i == 0) {
            i = androidx.compose.ui.text.style.e.b;
        }
        i2 = sVar2.h;
        if (i2 == 0) {
            i2 = 1;
        }
        sVar = sVar2.i;
        if (sVar == null) {
            sVar = androidx.compose.ui.text.style.s.c;
        }
        return new m0(e0Var2, new s(i4, i6, j, qVar, uVar2, iVar4, i, i2, sVar), m0Var.c);
    }
}
