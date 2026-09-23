package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ha;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.na;
import com.google.android.gms.internal.measurement.oa;
import com.google.android.gms.internal.measurement.ra;
import com.google.android.gms.internal.measurement.ta;
import com.google.android.gms.internal.measurement.z9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlinx.coroutines.DebugKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements y1 {
    public static volatile p1 c0;
    public final g A;
    public final d1 B;
    public final u0 C;
    public final m1 D;
    public final u3 E;
    public final p4 F;
    public final q0 G;
    public final com.google.android.gms.common.util.a H;
    public final d3 I;
    public final s2 J;
    public final c0 K;
    public final w2 L;
    public final String M;
    public p0 N;
    public m3 O;
    public p P;
    public n0 Q;
    public x2 R;
    public Boolean T;
    public long U;
    public volatile Boolean V;
    public volatile boolean W;
    public int X;
    public int Y;
    public final long a0;
    public final long b0;
    public final Context e;
    public final boolean y;
    public final androidx.work.impl.model.f z;
    public boolean S = false;
    public final AtomicInteger Z = new AtomicInteger(0);

    public p1(f2 f2Var) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = f2Var.a;
        androidx.work.impl.model.f fVar = new androidx.work.impl.model.f(22);
        this.z = fVar;
        d2.n = fVar;
        this.e = context;
        this.y = f2Var.e;
        this.V = f2Var.b;
        this.M = f2Var.h;
        this.W = true;
        if (ra.b == null && context != null) {
            Object obj = ra.a;
            synchronized (obj) {
                try {
                    if (ra.b == null) {
                        synchronized (obj) {
                            try {
                                ha haVar = ra.b;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (haVar == null || haVar.a != applicationContext2) {
                                    if (haVar != null) {
                                        Iterator it = ia.a.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        ta.a();
                                    }
                                    ra.b = new ha(applicationContext2, android.support.v4.media.session.b.w(new oa(applicationContext2, 2)));
                                    ra.c.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.H = com.google.android.gms.common.util.a.a;
        z9 z9Var = new z9(context, com.google.android.gms.internal.measurement.e1.a, com.google.android.gms.common.api.b.a, com.google.android.gms.common.api.e.c);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        androidx.compose.foundation.text.selection.q0 q0VarC = androidx.compose.foundation.text.selection.q0.c();
        q0VarC.z = new j5(2, strConcat, new String[0]);
        z9Var.b(0, q0VarC.b());
        AtomicReference atomicReference = na.k;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                na.b();
                com.google.android.gms.internal.measurement.h.h(Level.WARNING, (Executor) na.m.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = f2Var.f;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.H.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.a0 = jCurrentTimeMillis;
        Long l2 = f2Var.g;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.H.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.b0 = jElapsedRealtime;
        g gVar = new g(this);
        gVar.A = com.google.android.gms.common.internal.k.z;
        this.A = gVar;
        d1 d1Var = new d1(this);
        d1Var.y();
        this.B = d1Var;
        u0 u0Var = new u0(this);
        u0Var.y();
        this.C = u0Var;
        p4 p4Var = new p4(this);
        p4Var.y();
        this.F = p4Var;
        this.G = new q0(new f1(f2Var, this));
        this.K = new c0(this);
        d3 d3Var = new d3(this);
        d3Var.x();
        this.I = d3Var;
        s2 s2Var = new s2(this);
        s2Var.x();
        this.J = s2Var;
        u3 u3Var = new u3(this);
        u3Var.x();
        this.E = u3Var;
        w2 w2Var = new w2(this);
        w2Var.y();
        this.L = w2Var;
        m1 m1Var = new m1(this);
        m1Var.y();
        this.D = m1Var;
        j6 j6Var = f2Var.d;
        boolean z = j6Var == null || j6Var.y == 0;
        if (this.e.getApplicationContext() instanceof Application) {
            l(s2Var);
            if (((p1) s2Var.e).e.getApplicationContext() instanceof Application) {
                Application application = (Application) ((p1) s2Var.e).e.getApplicationContext();
                if (s2Var.z == null) {
                    s2Var.z = new o2(s2Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(s2Var.z);
                    application.registerActivityLifecycleCallbacks(s2Var.z);
                    u0 u0Var2 = ((p1) s2Var.e).C;
                    m(u0Var2);
                    u0Var2.K.a("Registered activity lifecycle callback");
                }
            }
        } else {
            m(u0Var);
            u0Var.F.a("Application context is not an Application");
        }
        m1Var.E(new com.google.common.util.concurrent.k0(14, this, f2Var, false));
    }

    public static final void j(d0 d0Var) {
        if (d0Var != null) {
            return;
        }
        kotlinx.coroutines.future.a.u("Component not created");
    }

    public static final void k(androidx.compose.animation.core.j2 j2Var) {
        if (j2Var != null) {
            return;
        }
        kotlinx.coroutines.future.a.u("Component not created");
    }

    public static final void l(h0 h0Var) {
        if (h0Var == null) {
            kotlinx.coroutines.future.a.u("Component not created");
        } else {
            if (h0Var.y) {
                return;
            }
            kotlinx.coroutines.future.a.u("Component not initialized: ".concat(String.valueOf(h0Var.getClass())));
        }
    }

    public static final void m(x1 x1Var) {
        if (x1Var == null) {
            kotlinx.coroutines.future.a.u("Component not created");
        } else {
            if (x1Var.y) {
                return;
            }
            kotlinx.coroutines.future.a.u("Component not initialized: ".concat(String.valueOf(x1Var.getClass())));
        }
    }

    public static p1 s(Context context, j6 j6Var, Long l, Long l2) {
        Bundle bundle;
        if (j6Var != null) {
            Bundle bundle2 = j6Var.A;
            j6Var = new j6(j6Var.e, j6Var.y, j6Var.z, bundle2, null);
        }
        com.google.android.gms.common.internal.x.g(context);
        com.google.android.gms.common.internal.x.g(context.getApplicationContext());
        if (c0 == null) {
            synchronized (p1.class) {
                try {
                    if (c0 == null) {
                        c0 = new p1(new f2(context, j6Var, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (j6Var != null && (bundle = j6Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.x.g(c0);
            c0.V = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.x.g(c0);
        return c0;
    }

    @Override // com.google.android.gms.measurement.internal.y1
    public final androidx.work.impl.model.f a() {
        return this.z;
    }

    @Override // com.google.android.gms.measurement.internal.y1
    public final u0 b() {
        u0 u0Var = this.C;
        m(u0Var);
        return u0Var;
    }

    @Override // com.google.android.gms.measurement.internal.y1
    public final com.google.android.gms.common.util.a c() {
        return this.H;
    }

    public final boolean d() {
        return g() == 0;
    }

    @Override // com.google.android.gms.measurement.internal.y1
    public final m1 e() {
        m1 m1Var = this.D;
        m(m1Var);
        return m1Var;
    }

    @Override // com.google.android.gms.measurement.internal.y1
    public final Context f() {
        return this.e;
    }

    public final int g() {
        m1 m1Var = this.D;
        m(m1Var);
        m1Var.v();
        g gVar = this.A;
        if (gVar.J()) {
            return 1;
        }
        m(m1Var);
        m1Var.v();
        if (!this.W) {
            return 8;
        }
        d1 d1Var = this.B;
        k(d1Var);
        d1Var.v();
        Boolean boolValueOf = d1Var.z().contains("measurement_enabled") ? Boolean.valueOf(d1Var.z().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        androidx.work.impl.model.f fVar = ((p1) gVar.e).z;
        Boolean boolI = gVar.I("firebase_analytics_collection_enabled");
        if (boolI != null) {
            return boolI.booleanValue() ? 0 : 4;
        }
        return (this.V == null || this.V.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        p4 p4Var;
        boolean z;
        Context context;
        if (!this.S) {
            kotlinx.coroutines.future.a.u("AppMeasurement is not initialized");
            return false;
        }
        m1 m1Var = this.D;
        m(m1Var);
        m1Var.v();
        Boolean bool = this.T;
        com.google.android.gms.common.util.a aVar = this.H;
        if (bool == null || this.U == 0) {
            aVar.getClass();
            this.U = SystemClock.elapsedRealtime();
            p4Var = this.F;
            k(p4Var);
            z = false;
            if (p4Var.Z("android.permission.INTERNET") && p4Var.Z("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.e;
                if (com.google.android.gms.common.wrappers.b.a(context).d() || this.A.y() || (p4.r0(context) && p4.Q(context))) {
                    z = true;
                }
            }
            this.T = Boolean.valueOf(z);
            if (z) {
                this.T = Boolean.valueOf(p4Var.B(r().C()));
            }
        } else if (!bool.booleanValue()) {
            aVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.U) > 1000) {
                aVar.getClass();
                this.U = SystemClock.elapsedRealtime();
                p4Var = this.F;
                k(p4Var);
                z = false;
                if (p4Var.Z("android.permission.INTERNET")) {
                    context = this.e;
                    if (com.google.android.gms.common.wrappers.b.a(context).d()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.T = Boolean.valueOf(z);
                if (z) {
                    this.T = Boolean.valueOf(p4Var.B(r().C()));
                }
            }
        }
        return this.T.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i(int i, Throwable th, byte[] bArr) {
        u0 u0Var;
        u0 u0Var2;
        int i2 = i;
        u0 u0Var3 = this.C;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                d1 d1Var = this.B;
                k(d1Var);
                d1Var.Q.b(true);
                if (bArr != null || bArr.length == 0) {
                    m(u0Var3);
                    u0Var3.J.a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        m(u0Var3);
                        u0Var3.J.a("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    p4 p4Var = this.F;
                    k(p4Var);
                    p1 p1Var = (p1) p4Var.e;
                    if (TextUtils.isEmpty(strOptString)) {
                        u0Var2 = u0Var3;
                    } else {
                        Context context = p1Var.e;
                        u0Var2 = u0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.J.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = p1Var.e;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    u0 u0Var4 = ((p1) p4Var.e).C;
                                    m(u0Var4);
                                    u0Var4.C.b(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            u0Var = u0Var2;
                            m(u0Var);
                            u0Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    m(u0Var2);
                    u0Var = u0Var2;
                    try {
                        u0Var.F.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        m(u0Var);
                        u0Var.C.b(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    u0Var = u0Var3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                d1 d1Var2 = this.B;
                k(d1Var2);
                d1Var2.Q.b(true);
                if (bArr != null) {
                }
                m(u0Var3);
                u0Var3.J.a("Deferred Deep Link response empty.");
                return;
            }
        }
        m(u0Var3);
        u0Var3.F.c(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public final q0 n() {
        return this.G;
    }

    public final p0 o() {
        l(this.N);
        return this.N;
    }

    public final m3 p() {
        l(this.O);
        return this.O;
    }

    public final p q() {
        m(this.P);
        return this.P;
    }

    public final n0 r() {
        l(this.Q);
        return this.Q;
    }
}
