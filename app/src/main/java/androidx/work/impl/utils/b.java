package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.compose.material3.internal.r0;
import androidx.compose.material3.r;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.p;
import androidx.work.impl.model.v;
import androidx.work.impl.t;
import androidx.work.k0;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String a = y.g("EnqueueRunnable");

    public static void a(androidx.work.impl.o oVar) {
        boolean z;
        t tVar = oVar.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(oVar.e);
        HashSet hashSetB = androidx.work.impl.o.b(oVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(oVar.e);
                z = false;
                break;
            } else if (hashSetB.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            throw new IllegalStateException("WorkContinuation has cycles (" + oVar + ")");
        }
        WorkDatabase workDatabase = tVar.c;
        androidx.work.b bVar = tVar.b;
        workDatabase.b();
        try {
            g.b(workDatabase, bVar, oVar);
            boolean zB = b(oVar);
            workDatabase.p();
            workDatabase.f();
            if (zB) {
                androidx.work.impl.i.b(bVar, tVar.c, tVar.e);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    public static boolean b(androidx.work.impl.o oVar) {
        boolean z;
        boolean z2;
        boolean z3;
        t tVar;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        androidx.work.impl.o oVar2 = oVar;
        HashSet hashSetB = androidx.work.impl.o.b(oVar2);
        t tVar2 = oVar2.a;
        List list = oVar2.d;
        int i = 0;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = oVar2.b;
        androidx.work.m mVar = oVar2.c;
        tVar2.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = tVar2.c;
        boolean z8 = strArr != null && strArr.length > 0;
        i0 i0Var = i0.z;
        i0 i0Var2 = i0.C;
        i0 i0Var3 = i0.A;
        if (z8) {
            int length = strArr.length;
            z = false;
            z2 = false;
            z3 = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    List list2 = list;
                    p pVarC = workDatabase2.w().c(str2);
                    if (pVarC == null) {
                        y.e().c(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        i0 i0Var4 = pVarC.b;
                        z3 &= i0Var4 == i0Var;
                        if (i0Var4 == i0Var3) {
                            z2 = true;
                        } else if (i0Var4 == i0Var2) {
                            z = true;
                        }
                        i++;
                        list = list2;
                    }
                }
                z6 = true;
                z7 = false;
                oVar2.g = z6;
                return z7;
            }
        }
        z = false;
        z2 = false;
        z3 = true;
        List list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        i0 i0Var5 = i0.e;
        if (zIsEmpty || z8) {
            tVar = tVar2;
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
        } else {
            List listD = workDatabase2.w().d(str);
            if (listD.isEmpty()) {
                tVar = tVar2;
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
            } else {
                androidx.work.m mVar2 = androidx.work.m.z;
                z4 = zIsEmpty;
                androidx.work.m mVar3 = androidx.work.m.A;
                if (mVar == mVar2 || mVar == mVar3) {
                    androidx.work.impl.model.c cVarR = workDatabase2.r();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        WorkDatabase workDatabase3 = workDatabase2;
                        androidx.work.impl.model.o oVar3 = (androidx.work.impl.model.o) it.next();
                        Iterator it2 = it;
                        String str3 = oVar3.a;
                        cVarR.getClass();
                        str3.getClass();
                        androidx.work.impl.model.c cVar = cVarR;
                        t tVar3 = tVar2;
                        if (!((Boolean) okhttp3.internal.platform.android.g.t(cVarR.a, true, false, new r(str3, 5))).booleanValue()) {
                            i0 i0Var6 = oVar3.b;
                            boolean z9 = z3 & (i0Var6 == i0Var);
                            if (i0Var6 == i0Var3) {
                                z2 = true;
                            } else if (i0Var6 == i0Var2) {
                                z = true;
                            }
                            arrayList.add(oVar3.a);
                            z3 = z9;
                        }
                        it = it2;
                        workDatabase2 = workDatabase3;
                        cVarR = cVar;
                        tVar2 = tVar3;
                    }
                    tVar = tVar2;
                    workDatabase = workDatabase2;
                    List list4 = arrayList;
                    list4 = arrayList;
                    if (mVar == mVar3 && (z || z2)) {
                        androidx.work.impl.model.t tVarW = workDatabase.w();
                        Iterator it3 = tVarW.d(str).iterator();
                        while (it3.hasNext()) {
                            tVarW.a(((androidx.work.impl.model.o) it3.next()).a);
                        }
                        z = false;
                        z2 = false;
                        list4 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list4.toArray(strArr);
                    z8 = strArr.length > 0;
                } else {
                    if (mVar == androidx.work.m.y) {
                        Iterator it4 = listD.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                i0 i0Var7 = ((androidx.work.impl.model.o) it4.next()).b;
                                if (i0Var7 == i0Var5 || i0Var7 == i0.y) {
                                    z6 = true;
                                    z7 = false;
                                    oVar2.g = z6;
                                    return z7;
                                }
                            }
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.o(new androidx.navigation.internal.h(new androidx.compose.foundation.text.contextmenu.internal.g(7, workDatabase2, str, tVar2), 3));
                    androidx.work.impl.model.t tVarW2 = workDatabase2.w();
                    Iterator it5 = listD.iterator();
                    while (it5.hasNext()) {
                        tVarW2.a(((androidx.work.impl.model.o) it5.next()).a);
                    }
                    tVar = tVar2;
                    workDatabase = workDatabase2;
                    z5 = true;
                }
            }
            z5 = false;
        }
        Iterator it6 = list3.iterator();
        boolean z10 = z5;
        while (it6.hasNext()) {
            k0 k0Var = (k0) it6.next();
            p pVar = k0Var.b;
            UUID uuid = k0Var.a;
            if (!z8 || z3) {
                pVar.n = jCurrentTimeMillis;
            } else if (z2) {
                pVar.b = i0Var3;
            } else if (z) {
                pVar.b = i0Var2;
            } else {
                pVar.b = i0.B;
            }
            if (pVar.b == i0Var5) {
                z10 = true;
            }
            androidx.work.impl.model.t tVarW3 = workDatabase.w();
            t tVar4 = tVar;
            p pVarC2 = g.c(tVar4.e, pVar);
            tVarW3.getClass();
            Iterator it7 = it6;
            i0 i0Var8 = i0Var5;
            okhttp3.internal.platform.android.g.t(tVarW3.a, false, true, new androidx.work.impl.model.r(tVarW3, pVarC2, 0));
            if (z8) {
                int i2 = 0;
                for (int length2 = strArr.length; i2 < length2; length2 = length2) {
                    String str4 = strArr[i2];
                    String string = uuid.toString();
                    string.getClass();
                    androidx.work.impl.model.a aVar = new androidx.work.impl.model.a(string, str4);
                    androidx.work.impl.model.c cVarR2 = workDatabase.r();
                    cVarR2.getClass();
                    okhttp3.internal.platform.android.g.t(cVarR2.a, false, true, new r0(10, cVarR2, aVar));
                    i2++;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            v vVarX = workDatabase.x();
            String string2 = uuid.toString();
            string2.getClass();
            vVarX.a(string2, k0Var.c);
            if (!z4) {
                androidx.work.impl.model.l lVarU = workDatabase.u();
                String string3 = uuid.toString();
                string3.getClass();
                androidx.work.impl.model.k kVar = new androidx.work.impl.model.k(str, string3);
                lVarU.getClass();
                okhttp3.internal.platform.android.g.t(lVarU.a, false, true, new r0(13, lVarU, kVar));
            }
            tVar = tVar4;
            it6 = it7;
            i0Var5 = i0Var8;
            strArr = strArr2;
        }
        z6 = true;
        oVar2 = oVar;
        z7 = z10;
        oVar2.g = z6;
        return z7;
    }
}
