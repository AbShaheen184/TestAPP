package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Binder {
    public final com.google.android.gms.tasks.q d;

    public v(com.google.android.gms.tasks.q qVar) {
        this.d = qVar;
    }

    public final void a(w wVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = wVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.d.e;
        com.google.android.gms.tasks.j jVar = new com.google.android.gms.tasks.j();
        firebaseMessagingService.e.execute(new androidx.compose.foundation.text.contextmenu.internal.g(9, firebaseMessagingService, intent, jVar));
        jVar.a.a(new androidx.arch.core.executor.a(2), new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(wVar, 9));
    }
}
