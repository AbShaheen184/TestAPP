package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.z5;
import androidx.compose.runtime.r1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;

    public /* synthetic */ k(int i, List list) {
        this.e = 1;
        this.y = list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009e A[LOOP:0: B:25:0x006e->B:36:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[LOOP:2: B:42:0x00a9->B:53:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        char c;
        boolean z;
        Object next;
        String str;
        kotlin.k kVar;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.e) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z2 = false;
                int i = 1;
                char c2 = 2;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar2 = o.b;
                    r rVarQ = androidx.compose.foundation.layout.b.q(oVar2, 12);
                    w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    androidx.compose.runtime.internal.j jVarL = sVar.l();
                    r rVarC = androidx.compose.ui.a.c(sVar, rVarQ);
                    androidx.compose.ui.node.h.b.getClass();
                    kotlin.jvm.functions.a aVar = androidx.compose.ui.node.g.b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(aVar);
                    } else {
                        sVar.o0();
                    }
                    t.x(sVar, wVarA, androidx.compose.ui.node.g.f);
                    t.x(sVar, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar, androidx.compose.ui.node.g.h);
                    t.x(sVar, rVarC, androidx.compose.ui.node.g.d);
                    sVar.b0(-897325232);
                    List list = this.y;
                    int i2 = 0;
                    s sVar2 = sVar;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q.o();
                            throw null;
                        }
                        kotlin.k kVar2 = (kotlin.k) obj3;
                        String str5 = (String) kVar2.e;
                        String str6 = (String) kVar2.y;
                        r rVarS = androidx.compose.foundation.layout.b.s(i1.e(oVar2, 1.0f), 0.0f, 4, i);
                        f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.e, androidx.compose.ui.c.G, sVar2, 6);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                        r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarS);
                        androidx.compose.ui.node.h.b.getClass();
                        kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.g.b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(aVar2);
                        } else {
                            sVar2.o0();
                        }
                        t.x(sVar2, f1VarA, androidx.compose.ui.node.g.f);
                        t.x(sVar2, jVarL2, androidx.compose.ui.node.g.e);
                        t.p(sVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.g.g);
                        t.t(sVar2, androidx.compose.ui.node.g.h);
                        t.x(sVar2, rVarC2, androidx.compose.ui.node.g.d);
                        r1 r1Var = n6.a;
                        boolean z3 = i;
                        s sVar3 = sVar2;
                        int i4 = i2;
                        o oVar3 = oVar2;
                        List list2 = list;
                        z5.b(str5, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar2.j(r1Var)).l, sVar3, 384, 0, 131066);
                        z5.b(str6, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.k.A, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar3.j(r1Var)).l, sVar3, 1573248, 0, 131002);
                        s sVar4 = sVar3;
                        sVar4.p(z3);
                        if (i4 < list2.size() - (z3 ? 1 : 0)) {
                            sVar4.b0(-2016776270);
                            c = 2;
                            oVar = oVar3;
                            androidx.compose.material3.q.d(androidx.compose.foundation.layout.b.s(oVar, 0.0f, 2, z3 ? 1 : 0), 0.0f, androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.e), sVar4, 390, 2);
                            z = false;
                            sVar4.p(false);
                        } else {
                            oVar = oVar3;
                            c = 2;
                            z = false;
                            sVar4.b0(-2016656548);
                            sVar4.p(false);
                        }
                        i = z3 ? 1 : 0;
                        oVar2 = oVar;
                        c2 = c;
                        z2 = z;
                        i2 = i3;
                        list = list2;
                        sVar2 = sVar4;
                    }
                    sVar2.p(z2);
                    sVar2.p(i);
                } else {
                    sVar.W();
                }
                return y.a;
            case 1:
                ((Integer) obj2).getClass();
                n.a(this.y, (s) obj, t.A(1));
                return y.a;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                List list3 = this.y;
                if (list3.size() == 1) {
                    int size = list3.size();
                    if (size == 0) {
                        androidx.transition.k.m("List is empty.");
                    } else if (size == 1) {
                        String str7 = (String) list3.get(0);
                        int iH = kotlin.text.k.H(charSequence, str7, iIntValue2, false, 4);
                        if (iH < 0) {
                            kVar = null;
                        } else {
                            kVar = new kotlin.k(Integer.valueOf(iH), str7);
                        }
                    } else {
                        kotlinx.coroutines.future.a.q("List has more than one element.");
                    }
                    return null;
                }
                if (iIntValue2 < 0) {
                    iIntValue2 = 0;
                }
                kotlin.ranges.d dVar = new kotlin.ranges.d(iIntValue2, charSequence.length(), 1);
                boolean z4 = charSequence instanceof String;
                int i5 = dVar.z;
                int i6 = dVar.y;
                if (z4) {
                    if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                        kVar = null;
                    } else {
                        while (true) {
                            Iterator it = list3.iterator();
                            do {
                                if (it.hasNext()) {
                                    next2 = it.next();
                                    str4 = (String) next2;
                                } else {
                                    next2 = null;
                                }
                                str3 = (String) next2;
                                if (str3 != null) {
                                    kVar = new kotlin.k(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i6) {
                                    iIntValue2 += i5;
                                } else {
                                    kVar = null;
                                }
                            } while (!str4.regionMatches(0, (String) charSequence, iIntValue2, str4.length()));
                            str3 = (String) next2;
                            if (str3 != null) {
                                kVar = new kotlin.k(Integer.valueOf(iIntValue2), str3);
                            } else if (iIntValue2 != i6) {
                                iIntValue2 += i5;
                            } else {
                                kVar = null;
                            }
                        }
                    }
                } else if ((i5 <= 0 || iIntValue2 > i6) && (i5 >= 0 || i6 > iIntValue2)) {
                    kVar = null;
                } else {
                    int i7 = iIntValue2;
                    while (true) {
                        Iterator it2 = list3.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = it2.next();
                                str2 = (String) next;
                            } else {
                                next = null;
                            }
                            str = (String) next;
                            if (str != null) {
                                kVar = new kotlin.k(Integer.valueOf(i7), str);
                            } else if (i7 != i6) {
                                i7 += i5;
                            } else {
                                kVar = null;
                            }
                        } while (!kotlin.text.k.O(str2, 0, charSequence, i7, str2.length(), false));
                        str = (String) next;
                        if (str != null) {
                            kVar = new kotlin.k(Integer.valueOf(i7), str);
                        } else if (i7 != i6) {
                            i7 += i5;
                        } else {
                            kVar = null;
                        }
                    }
                }
                if (kVar != null) {
                    return new kotlin.k(kVar.e, Integer.valueOf(((String) kVar.y).length()));
                }
                return null;
        }
    }

    public /* synthetic */ k(List list, int i, byte b) {
        this.e = i;
        this.y = list;
    }
}
