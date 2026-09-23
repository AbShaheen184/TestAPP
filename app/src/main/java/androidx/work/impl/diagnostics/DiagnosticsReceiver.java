package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.b0;
import androidx.work.c0;
import androidx.work.impl.o;
import androidx.work.impl.t;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.m;
import androidx.work.y;
import java.util.List;
import kotlin.collections.q;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = y.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        y yVarE = y.e();
        String str = a;
        yVarE.a(str, "Requesting diagnostics");
        try {
            context.getClass();
            t tVarB = t.b(context);
            List listJ = q.j((c0) new b0(DiagnosticsWorker.class).b());
            if (listJ.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new o(tVarB, null, m.y, listJ, 0).a();
        } catch (IllegalStateException e) {
            y.e().d(str, "WorkManager is not initialized", e);
        }
    }
}
