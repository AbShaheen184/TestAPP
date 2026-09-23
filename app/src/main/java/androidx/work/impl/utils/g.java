package androidx.work.impl.utils;

import android.os.Build;
import androidx.compose.material3.r;
import androidx.work.i0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.h0;
import androidx.work.impl.t;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.k0;
import androidx.work.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final int[] a = {13, 15, 14};

    public static final void a(t tVar, String str) {
        h0 h0VarB;
        WorkDatabase workDatabase = tVar.c;
        workDatabase.getClass();
        androidx.work.impl.model.t tVarW = workDatabase.w();
        androidx.work.impl.model.c cVarR = workDatabase.r();
        ArrayList arrayListL = q.l(str);
        while (!arrayListL.isEmpty()) {
            String str2 = (String) p.S(arrayListL);
            i0 i0VarB = tVarW.b(str2);
            if (i0VarB != i0.z && i0VarB != i0.A) {
                ((Number) okhttp3.internal.platform.android.g.t(tVarW.a, false, true, new r(str2, 15))).intValue();
            }
            arrayListL.addAll(cVarR.a(str2));
        }
        androidx.work.impl.d dVar = tVar.f;
        dVar.getClass();
        synchronized (dVar.k) {
            y.e().a(androidx.work.impl.d.l, "Processor cancelling " + str);
            dVar.i.add(str);
            h0VarB = dVar.b(str);
        }
        androidx.work.impl.d.d(str, h0VarB, 1);
        Iterator it = tVar.e.iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.f) it.next()).e(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, androidx.work.b bVar, androidx.work.impl.o oVar) {
        int i;
        workDatabase.getClass();
        bVar.getClass();
        ArrayList arrayListL = q.l(oVar);
        int i2 = 0;
        while (!arrayListL.isEmpty()) {
            List list = ((androidx.work.impl.o) p.S(arrayListL)).d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((k0) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) okhttp3.internal.platform.android.g.t(workDatabase.w().a, true, false, new androidx.navigation.compose.r(16))).intValue();
        int i3 = bVar.j;
        if (iIntValue + i2 <= i3) {
            return;
        }
        kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.o(i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", androidx.privacysandbox.ads.adservices.java.internal.a.w("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", i3, ";\ncurrent enqueue operation count: ", iIntValue)));
    }

    public static final androidx.work.impl.model.p c(List list, androidx.work.impl.model.p pVar) {
        androidx.work.impl.model.p pVarB;
        list.getClass();
        pVar.getClass();
        boolean zB = pVar.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = pVar.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = pVar.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zB && zB2 && zB3) {
            String str = pVar.c;
            androidx.work.h hVar = new androidx.work.h(0);
            androidx.work.i iVar = pVar.e;
            iVar.getClass();
            hVar.a(iVar.a);
            LinkedHashMap linkedHashMap = hVar.a;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
            androidx.work.i iVar2 = new androidx.work.i(linkedHashMap);
            android.support.v4.media.session.b.G(iVar2);
            pVarB = androidx.work.impl.model.p.b(pVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", iVar2, 0, 0L, 0, 0, 0L, 0, 33554411);
        } else {
            pVarB = pVar;
        }
        if (Build.VERSION.SDK_INT > 25) {
            return pVarB;
        }
        androidx.work.e eVar = pVarB.j;
        String str2 = pVarB.c;
        if (kotlin.jvm.internal.l.a(str2, ConstraintTrackingWorker.class.getName())) {
            return pVarB;
        }
        if (!eVar.e && !eVar.f) {
            return pVarB;
        }
        androidx.work.h hVar2 = new androidx.work.h(0);
        androidx.work.i iVar3 = pVarB.e;
        iVar3.getClass();
        hVar2.a(iVar3.a);
        LinkedHashMap linkedHashMap2 = hVar2.a;
        linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str2);
        androidx.work.i iVar4 = new androidx.work.i(linkedHashMap2);
        android.support.v4.media.session.b.G(iVar4);
        return androidx.work.impl.model.p.b(pVarB, null, null, ConstraintTrackingWorker.class.getName(), iVar4, 0, 0L, 0, 0, 0L, 0, 33554411);
    }
}
