package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appsalt.internal.k0;
import com.google.android.datatransport.runtime.s;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        com.google.android.datatransport.runtime.j jVarA = com.google.android.datatransport.runtime.k.a();
        jVarA.v(queryParameter);
        jVarA.A = com.google.android.datatransport.runtime.util.a.b(iIntValue);
        if (queryParameter2 != null) {
            jVarA.z = Base64.decode(queryParameter2, 0);
        }
        k0 k0Var = s.a().d;
        ((Executor) k0Var.e).execute(new d(k0Var, jVarA.n(), i, new androidx.compose.ui.platform.j(2)));
    }
}
