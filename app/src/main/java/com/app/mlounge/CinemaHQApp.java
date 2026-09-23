package com.app.mlounge;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.widget.q2;
import coil3.v;
import com.app.mlounge.data.iptv.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.x;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class CinemaHQApp extends Application implements coil3.r, dagger.hilt.internal.b {
    public static final /* synthetic */ int D = 0;
    public y A;
    public y B;
    public c0 z;
    public boolean e = false;
    public final dagger.hilt.android.internal.managers.g y = new dagger.hilt.android.internal.managers.g(new androidx.media3.exoplayer.hls.c(this, 16));
    public final CoroutineScope C = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    @Override // dagger.hilt.internal.b
    public final Object a() {
        return this.y.a();
    }

    @Override // coil3.r
    public final coil3.p b(Context context) {
        boolean zIsLowRamDevice;
        context.getClass();
        int i = 0;
        try {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            zIsLowRamDevice = ((ActivityManager) systemService).isLowRamDevice();
        } catch (Exception unused) {
            zIsLowRamDevice = false;
        }
        q2 q2Var = new q2(context, 1);
        androidx.media3.exoplayer.hls.c cVar = new androidx.media3.exoplayer.hls.c(15);
        cVar.y = coil3.util.h.y;
        q2Var.f = cVar;
        q2Var.c = new kotlin.o(new androidx.compose.foundation.text.r(zIsLowRamDevice, 2, context));
        q2Var.d = new kotlin.o(new androidx.navigation.compose.o(context, 1));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new coil3.c(new coil3.svg.e(), i));
        arrayList4.add(new androidx.activity.compose.f(27, new coil3.network.j(new androidx.navigation.internal.h(new androidx.navigation.internal.h(this, 16), 14)), a0.a(v.class)));
        q2Var.e = new coil3.d(android.support.v4.media.session.b.I(arrayList), android.support.v4.media.session.b.I(arrayList2), android.support.v4.media.session.b.I(arrayList3), android.support.v4.media.session.b.I(arrayList4), android.support.v4.media.session.b.I(arrayList5));
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar = coil3.request.h.a;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar2 = coil3.request.i.a;
        ((coil3.h) q2Var.g).a.put(coil3.request.i.a, new coil3.transition.b(org.mozilla.javascript.Context.VERSION_ES6));
        return q2Var.a();
    }

    public final void c() {
        if (!this.e) {
            this.e = true;
            h hVar = (h) ((c) this.y.a());
            this.z = (c0) hVar.m.get();
            this.A = (y) hVar.c.get();
            this.B = (y) hVar.n.get();
        }
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onCreate() {
        c();
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a = getApplicationContext();
        String str = "?";
        Context context2 = com.app.mlounge.util.a.a;
        int i = 0;
        if (context2 != null) {
            try {
                SharedPreferences sharedPreferences = context2.getSharedPreferences("diag_state", 0);
                boolean z = sharedPreferences.getBoolean("session_open", false);
                String string = sharedPreferences.getString("last_state", "?");
                if (string != null) {
                    str = string;
                }
                long j = sharedPreferences.getLong("last_state_ts", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z2 = jCurrentTimeMillis - j < 600000;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("session_open", true);
                editorEdit.putString("last_state", "app-start");
                editorEdit.putLong("last_state_ts", jCurrentTimeMillis);
                editorEdit.apply();
                if (z && z2) {
                    com.app.mlounge.util.a.h("last_state", str);
                    com.app.mlounge.util.a.g("AppLog", "dirty-start");
                    com.google.firebase.crashlytics.b bVarE = com.app.mlounge.util.a.e();
                    RuntimeException runtimeException = new RuntimeException("Previous session terminated unexpectedly");
                    com.google.firebase.crashlytics.internal.common.q qVar = bVarE.a;
                    Map map = Collections.EMPTY_MAP;
                    qVar.o.a.a(new androidx.media3.ui.c0(qVar, runtimeException));
                }
            } catch (Exception unused) {
            }
        }
        kotlin.coroutines.d dVar = null;
        try {
            SharedPreferences sharedPreferences2 = getSharedPreferences("image_cache_prefs", 0);
            if (!sharedPreferences2.getBoolean("avif_purged_v2", false)) {
                try {
                    y yVar = this.B;
                    if (yVar == null) {
                        kotlin.jvm.internal.l.f("imageHttpClient");
                        throw null;
                    }
                    okhttp3.f fVar = yVar.k;
                    if (fVar != null) {
                        fVar.a();
                    }
                    try {
                        kotlin.io.j.g(new File(getCacheDir(), "image_http_cache"));
                    } catch (Exception unused2) {
                    }
                    try {
                        kotlin.io.j.g(new File(getCacheDir(), "image_cache"));
                    } catch (Exception unused3) {
                    }
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putBoolean("avif_purged_v2", true);
                    editorEdit2.apply();
                    Context context3 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "CinemaHQApp", "Purged image caches (AVIF fix)");
                } catch (Exception unused4) {
                }
            }
        } catch (Exception unused5) {
        }
        try {
            y yVar2 = this.A;
            if (yVar2 == null) {
                kotlin.jvm.internal.l.f("okHttpClient");
                throw null;
            }
            g0.e(new com.app.mlounge.data.music.e(yVar2, i));
            com.app.mlounge.util.c.d(this);
            com.i4studio.subslib.b bVar = com.i4studio.subslib.b.a;
            com.i4studio.subslib.subdl.a aVar = new com.i4studio.subslib.subdl.a();
            x xVar = new x();
            xVar.i = true;
            new y(xVar);
            com.i4studio.subslib.b.b.add(aVar);
            registerActivityLifecycleCallbacks(new a());
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new b(this, dVar, i), 3, null);
        } catch (Exception e) {
            Context context4 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.d("CinemaHQApp", "NewPipe init failed", e);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 60) {
            BuildersKt__Builders_commonKt.launch$default(this.C, null, null, new b(this, null, 1), 3, null);
        }
    }
}
