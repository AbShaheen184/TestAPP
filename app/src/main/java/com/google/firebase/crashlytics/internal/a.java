package com.google.firebase.crashlytics.internal;

import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.j;
import com.google.firebase.components.p;
import com.google.firebase.crashlytics.internal.model.k1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final b c = new b();
    public final p a;
    public final AtomicReference b = new AtomicReference(null);

    public a(p pVar) {
        this.a = pVar;
        pVar.a(new j(this, 4));
    }

    public final b a() {
        a aVar = (a) this.b.get();
        return aVar == null ? c : aVar.a();
    }

    public final boolean b() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c() {
        a aVar = (a) this.b.get();
        return aVar != null && aVar.c();
    }

    public final void d(String str, long j, k1 k1Var) {
        String strI = androidx.compose.runtime.j.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strI, null);
        }
        this.a.a(new h(str, j, k1Var));
    }
}
