package com.google.firebase.crashlytics;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import com.google.android.datatransport.runtime.j;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.tasks.q;
import com.google.android.material.behavior.d;
import com.google.android.material.internal.k;
import com.google.firebase.crashlytics.internal.common.p;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements com.google.firebase.crashlytics.internal.breadcrumbs.a, com.google.firebase.crashlytics.internal.analytics.a, com.google.firebase.inject.a {
    public final /* synthetic */ f e;

    public /* synthetic */ a(f fVar) {
        this.e = fVar;
    }

    @Override // com.google.firebase.inject.a
    public void c(com.google.firebase.inject.b bVar) {
        f fVar = this.e;
        com.google.firebase.crashlytics.internal.b bVar2 = com.google.firebase.crashlytics.internal.b.a;
        bVar2.b("AnalyticsConnector now available.");
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        d dVar = new d(aVar);
        k kVar = new k(5, false);
        com.google.firebase.analytics.connector.b bVar3 = (com.google.firebase.analytics.connector.b) aVar;
        b0 b0VarB = bVar3.b("clx", kVar);
        if (b0VarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            b0VarB = bVar3.b("crash", kVar);
            if (b0VarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (b0VarB == null) {
            bVar2.d(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        bVar2.b("Registered Firebase Analytics listener.");
        q qVar = new q();
        j jVar = new j(dVar);
        synchronized (fVar) {
            try {
                Iterator it = ((ArrayList) fVar.a).iterator();
                while (it.hasNext()) {
                    qVar.d((p) it.next());
                }
                kVar.z = qVar;
                kVar.y = jVar;
                fVar.c = qVar;
                fVar.b = jVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.a
    public void d(p pVar) {
        f fVar = this.e;
        synchronized (fVar) {
            try {
                if (((com.google.firebase.crashlytics.internal.breadcrumbs.a) fVar.c) instanceof com.google.firebase.crashlytics.internal.breadcrumbs.b) {
                    ((ArrayList) fVar.a).add(pVar);
                }
                ((com.google.firebase.crashlytics.internal.breadcrumbs.a) fVar.c).d(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void k(Bundle bundle) {
        ((com.google.firebase.crashlytics.internal.analytics.a) this.e.b).k(bundle);
    }
}
