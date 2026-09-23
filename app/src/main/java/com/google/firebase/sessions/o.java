package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final com.google.firebase.g a;
    public final com.google.firebase.sessions.settings.j b;

    public o(com.google.firebase.g gVar, com.google.firebase.sessions.settings.j jVar, kotlin.coroutines.j jVar2, y0 y0Var) {
        gVar.getClass();
        jVar.getClass();
        jVar2.getClass();
        y0Var.getClass();
        this.a = gVar;
        this.b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.5.");
        gVar.a();
        Context applicationContext = gVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(y0Var);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(jVar2), null, null, new com.app.mlounge.ui.viewmodel.g0(this, y0Var, (kotlin.coroutines.d) null, 14), 3, null);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
