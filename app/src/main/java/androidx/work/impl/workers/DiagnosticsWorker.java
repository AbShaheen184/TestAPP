package androidx.work.impl.workers;

import android.content.Context;
import androidx.room.r;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.i;
import androidx.work.impl.model.l;
import androidx.work.impl.model.v;
import androidx.work.impl.t;
import androidx.work.w;
import androidx.work.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final w doWork() {
        t tVarB = t.b(getApplicationContext());
        WorkDatabase workDatabase = tVarB.c;
        workDatabase.getClass();
        androidx.work.impl.model.t tVarW = workDatabase.w();
        l lVarU = workDatabase.u();
        v vVarX = workDatabase.x();
        i iVarT = workDatabase.t();
        tVarB.b.d.getClass();
        List list = (List) okhttp3.internal.platform.android.g.t(tVarW.a, true, false, new androidx.compose.foundation.text.c(System.currentTimeMillis() - 86400000, 3));
        r rVar = tVarW.a;
        List list2 = (List) okhttp3.internal.platform.android.g.t(rVar, true, false, new androidx.navigation.compose.r(14));
        List list3 = (List) okhttp3.internal.platform.android.g.t(rVar, true, false, new androidx.navigation.compose.r(18));
        if (!list.isEmpty()) {
            y yVarE = y.e();
            String str = h.a;
            yVarE.f(str, "Recently completed work:\n\n");
            y.e().f(str, h.a(lVarU, vVarX, iVarT, list));
        }
        if (!list2.isEmpty()) {
            y yVarE2 = y.e();
            String str2 = h.a;
            yVarE2.f(str2, "Running work:\n\n");
            y.e().f(str2, h.a(lVarU, vVarX, iVarT, list2));
        }
        if (!list3.isEmpty()) {
            y yVarE3 = y.e();
            String str3 = h.a;
            yVarE3.f(str3, "Enqueued work:\n\n");
            y.e().f(str3, h.a(lVarU, vVarX, iVarT, list3));
        }
        return new androidx.work.v();
    }
}
