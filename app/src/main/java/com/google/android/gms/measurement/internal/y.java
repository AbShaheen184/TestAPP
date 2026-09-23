package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.bc;
import com.google.android.gms.internal.measurement.ec;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.s5;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements w, com.google.firebase.components.e, com.google.firebase.crashlytics.internal.settings.b, net.luminis.quic.log.a, okhttp3.logging.b {
    public final /* synthetic */ int e;
    public static final /* synthetic */ y y = new y(0);
    public static final /* synthetic */ y z = new y(1);
    public static final /* synthetic */ y A = new y(2);
    public static final /* synthetic */ y B = new y(3);
    public static final /* synthetic */ y C = new y(4);
    public static final /* synthetic */ y D = new y(5);
    public static final /* synthetic */ y E = new y(6);
    public static final /* synthetic */ y F = new y(7);
    public static final /* synthetic */ y G = new y(8);
    public static final /* synthetic */ y H = new y(9);
    public static final /* synthetic */ y I = new y(10);
    public static final /* synthetic */ y J = new y(11);
    public static final /* synthetic */ y K = new y(12);
    public static final /* synthetic */ y L = new y(13);
    public static final /* synthetic */ y M = new y(14);
    public static final /* synthetic */ y N = new y(15);
    public static final /* synthetic */ y O = new y(16);
    public static final /* synthetic */ y P = new y(17);
    public static final /* synthetic */ y Q = new y(18);
    public static final /* synthetic */ y R = new y(19);
    public static final /* synthetic */ y S = new y(20);
    public static final /* synthetic */ y T = new y(21);
    public static final /* synthetic */ y U = new y(22);

    public /* synthetic */ y(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 0:
                List list = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(48, 600000L, "measurement.sgtm.upload.min_delay_after_background").get();
            case 1:
                List list2 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(79, 3600000L, "measurement.upload.window_interval").get();
            case 2:
                List list3 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(28, 500L, "measurement.upload.minimum_delay").get();
            case 3:
                List list4 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(64, 15000L, "measurement.upload.initial_upload_delay_time").get();
            case 4:
                List list5 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(73, 518400000L, "measurement.upload.max_queue_time").get();
            case 5:
                List list6 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(36, 5000L, "measurement.service_client.idle_disconnect_millis").get();
            case 6:
                List list7 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.config.url_authority", 7, "app-measurement.com").get();
            case 7:
                List list8 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                j5 j5Var = com.google.android.gms.internal.measurement.f4.a;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) j5Var.y;
                ec ecVar = (ec) atomicReferenceArray.get(2);
                if (ecVar == null) {
                    bc bcVar = new bc("measurement.test.double_flag", (com.appsalt.internal.r0) ((s5) j5Var.z).y);
                    while (!atomicReferenceArray.compareAndSet(2, null, bcVar)) {
                        if (atomicReferenceArray.get(2) != null) {
                            ecVar = (ec) atomicReferenceArray.get(2);
                            ecVar.getClass();
                        }
                    }
                    ecVar = bcVar;
                }
                return (Double) ecVar.get();
            case 8:
                List list9 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(3, 100L, "measurement.max_bundles_per_iteration").get()).longValue());
            case 9:
                List list10 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
            case 10:
                List list11 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_path", 58, "privacy-sandbox/register-app-conversion").get();
            case 11:
                List list12 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.event_params", 13, "value|currency").get();
            case 12:
                List list13 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(54, 16L, "measurement.rb.attribution.max_retry_delay_seconds").get()).longValue());
            case 13:
                List list14 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 14:
                List list15 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(11, 3600000L, "45769094").get();
            case 15:
                List list16 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.c.get();
            case 16:
                List list17 = f0.a;
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.h3.a.get()).longValue());
            case 17:
                List list18 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(70, 1000L, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 18:
                List list19 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 19:
                List list20 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 20:
                List list21 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(0, 10000L, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.n4.a.get()).booleanValue());
        }
    }

    @Override // okhttp3.logging.b
    public void d(String str) {
        okhttp3.internal.platform.e eVar = okhttp3.internal.platform.e.a;
        okhttp3.internal.platform.e.a.i(4, str, null);
    }

    @Override // net.luminis.quic.log.a
    public z e() {
        return new z(27);
    }

    @Override // com.google.firebase.components.e
    public /* synthetic */ Object g(com.caverock.androidsvg.x1 x1Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(x1Var);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.b
    public com.google.firebase.crashlytics.internal.settings.a h(y yVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        androidx.compose.animation.core.t2 t2Var = jSONObject.has("session") ? new androidx.compose.animation.core.t2(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new androidx.compose.animation.core.t2(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        androidx.media3.exoplayer.audio.g gVar = new androidx.media3.exoplayer.audio.g(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new com.google.firebase.crashlytics.internal.settings.a(jCurrentTimeMillis, t2Var, gVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    public List i(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (com.google.firebase.components.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.a;
            if (str != null) {
                bVar = new com.google.firebase.components.b(str, bVar.b, bVar.c, bVar.d, bVar.e, new androidx.media3.exoplayer.analytics.c(13, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // net.luminis.quic.log.a
    public void f() {
    }

    @Override // net.luminis.quic.log.a
    public void b(String str) {
    }

    @Override // net.luminis.quic.log.a
    public void c(String str, Throwable th) {
    }
}
