package androidx.work.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final String a = androidx.work.y.g("Schedulers");

    public static void a(androidx.work.impl.model.t tVar, androidx.work.a0 a0Var, List list) {
        if (list.size() > 0) {
            a0Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tVar.e(((androidx.work.impl.model.p) it.next()).a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.t tVarW = workDatabase.w();
        workDatabase.b();
        try {
            androidx.room.r rVar = tVarW.a;
            androidx.room.r rVar2 = tVarW.a;
            List list2 = (List) okhttp3.internal.platform.android.g.t(rVar, true, false, new androidx.navigation.compose.r(15));
            a(tVarW, bVar.d, list2);
            List list3 = (List) okhttp3.internal.platform.android.g.t(rVar2, true, false, new androidx.compose.foundation.lazy.v(bVar.k));
            a(tVarW, bVar.d, list3);
            list3.addAll(list2);
            List list4 = (List) okhttp3.internal.platform.android.g.t(rVar2, true, false, new androidx.navigation.compose.r(18));
            workDatabase.p();
            workDatabase.f();
            if (list3.size() > 0) {
                androidx.work.impl.model.p[] pVarArr = (androidx.work.impl.model.p[]) list3.toArray(new androidx.work.impl.model.p[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.c()) {
                        fVar.a(pVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                androidx.work.impl.model.p[] pVarArr2 = (androidx.work.impl.model.p[]) list4.toArray(new androidx.work.impl.model.p[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    if (!fVar2.c()) {
                        fVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
