package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.j;
import com.google.firebase.components.r;
import com.google.firebase.g;
import com.google.firebase.sessions.api.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final r a = new r(com.google.firebase.annotations.concurrent.a.class, ExecutorService.class);
    public final r b = new r(com.google.firebase.annotations.concurrent.b.class, ExecutorService.class);
    public final r c = new r(com.google.firebase.annotations.concurrent.c.class, ExecutorService.class);

    static {
        Map map = com.google.firebase.sessions.api.c.b;
        d dVar = d.e;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new com.google.firebase.sessions.api.a(MutexKt.Mutex(true)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        com.google.firebase.components.a aVarB = com.google.firebase.components.b.b(b.class);
        aVarB.a = "fire-cls";
        aVarB.a(j.b(g.class));
        aVarB.a(j.b(com.google.firebase.installations.d.class));
        aVarB.a(new j(this.a, 1, 0));
        aVarB.a(new j(this.b, 1, 0));
        aVarB.a(new j(this.c, 1, 0));
        aVarB.a(new j(0, 2, com.google.firebase.crashlytics.internal.a.class));
        aVarB.a(new j(0, 2, com.google.firebase.analytics.connector.a.class));
        aVarB.a(new j(0, 2, com.google.firebase.remoteconfig.interop.a.class));
        aVarB.f = new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(this, 3);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), coil3.network.g.j("fire-cls", "20.0.5"));
    }
}
