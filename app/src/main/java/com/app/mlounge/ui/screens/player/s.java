package com.app.mlounge.ui.screens.player;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.app.mlounge.ui.viewmodel.i1;
import com.app.mlounge.ui.viewmodel.p1;
import com.appsalt.Appsalt;
import com.appsalt.internal.a2;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.future.FutureKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = 3;
        kotlin.coroutines.d dVar = null;
        switch (this.e) {
            case 0:
                List list = (List) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
                jVar.getClass();
                jVar.q(list.size(), null, new com.app.mlounge.ui.components.u0(12, list), new androidx.compose.runtime.internal.f(true, 2039820996, new com.app.mlounge.ui.screens.adult.g(list, lVar, i)));
                return kotlin.y.a;
            case 1:
                p1 p1Var = (p1) this.y;
                Context context = (Context) this.z;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.m0.g(p1Var), null, null, new i1(p1Var, zBooleanValue, dVar, 10), 3, null);
                if (zBooleanValue) {
                    com.app.mlounge.util.c.a();
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    com.app.mlounge.util.c.c((Application) applicationContext).setConsent(true);
                    com.app.mlounge.util.c.a = true;
                } else {
                    boolean z = com.app.mlounge.util.c.a;
                    Appsalt.Companion companion = Appsalt.Companion;
                    companion.optIn();
                    if (!companion.isRunning()) {
                        companion.start("68c59f5facf177e06a7a2bc313c04574");
                    }
                    Context applicationContext2 = context.getApplicationContext();
                    applicationContext2.getClass();
                    com.app.mlounge.util.c.c((Application) applicationContext2).setConsent(false);
                    com.app.mlounge.util.c.a = false;
                }
                return kotlin.y.a;
            case 2:
                Context context2 = (Context) this.y;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.z;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        context2.getContentResolver().takePersistableUriPermission(uri, 3);
                        String string = uri.toString();
                        string.getClass();
                        lVar2.invoke(string);
                    } catch (Exception e) {
                        Context context3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("E", "Settings", "Failed to take persistable permission: " + e.getMessage());
                        String string2 = uri.toString();
                        string2.getClass();
                        lVar2.invoke(string2);
                    }
                    break;
                }
                return kotlin.y.a;
            case 3:
                a2 a2Var = (a2) this.y;
                com.appsalt.internal.k0 k0Var = (com.appsalt.internal.k0) this.z;
                Throwable th = (Throwable) obj;
                a2Var.stop();
                k0Var.g = th;
                ((kotlin.jvm.functions.l) k0Var.f).invoke(th);
                return kotlin.y.a;
            case 4:
                com.google.firebase.heartbeatinfo.h hVar = (com.google.firebase.heartbeatinfo.h) this.y;
                String str = (String) this.z;
                androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) obj;
                aVar.e(com.google.firebase.heartbeatinfo.h.d, str);
                hVar.d(aVar, str);
                return null;
            case 5:
                return HandlerContext.scheduleResumeAfterDelay$lambda$2((HandlerContext) this.y, (androidx.media3.ui.c0) this.z, (Throwable) obj);
            case 6:
                return FutureKt.asCompletableFuture$lambda$1((CompletableFuture) this.y, (Deferred) this.z, (Throwable) obj);
            default:
                okhttp3.internal.cache.h hVar2 = (okhttp3.internal.cache.h) this.y;
                androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) this.z;
                ((IOException) obj).getClass();
                synchronized (hVar2) {
                    b1Var.f();
                }
                return kotlin.y.a;
        }
    }
}
