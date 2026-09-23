package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.d6;
import com.google.android.gms.internal.measurement.f6;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.j6;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.y5;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends y5 {
    public p1 d;
    public final androidx.collection.f e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.e = new androidx.collection.f(0);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void beginAdUnitExposure(String str, long j) {
        c();
        c0 c0Var = this.d.K;
        p1.j(c0Var);
        c0Var.w(str, j);
    }

    public final void c() {
        if (this.d != null) {
            return;
        }
        kotlinx.coroutines.future.a.u("Attempting to perform action before initialize.");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.J(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void clearMeasurementEnabled(long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.w();
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new com.google.common.util.concurrent.k0(17, s2Var, null, false));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void endAdUnitExposure(String str, long j) {
        c();
        c0 c0Var = this.d.K;
        p1.j(c0Var);
        c0Var.x(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void generateEventId(b6 b6Var) {
        c();
        p4 p4Var = this.d.F;
        p1.k(p4Var);
        long jU0 = p4Var.u0();
        c();
        p4 p4Var2 = this.d.F;
        p1.k(p4Var2);
        p4Var2.k0(b6Var, jU0);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getAppInstanceId(b6 b6Var) {
        c();
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        m1Var.E(new n1(this, b6Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCachedAppInstanceId(b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        h((String) s2Var.D.get(), b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getConditionalUserProperties(String str, String str2, b6 b6Var) {
        c();
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        m1Var.E(new androidx.appcompat.view.menu.e(this, b6Var, str, str2, 6));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCurrentScreenClass(b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        d3 d3Var = ((p1) s2Var.e).I;
        p1.l(d3Var);
        a3 a3Var = d3Var.z;
        h(a3Var != null ? a3Var.b : null, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getCurrentScreenName(b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        d3 d3Var = ((p1) s2Var.e).I;
        p1.l(d3Var);
        a3 a3Var = d3Var.z;
        h(a3Var != null ? a3Var.a : null, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getGmpAppId(b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        h(s2Var.K(), b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getMaxUserProperties(String str, b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        com.google.android.gms.common.internal.x.d(str);
        ((p1) s2Var.e).getClass();
        c();
        p4 p4Var = this.d.F;
        p1.k(p4Var);
        p4Var.l0(b6Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getSessionId(b6 b6Var) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new com.google.common.util.concurrent.k0(s2Var, b6Var));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getTestFlag(b6 b6Var, int i) {
        c();
        if (i == 0) {
            p4 p4Var = this.d.F;
            p1.k(p4Var);
            s2 s2Var = this.d.J;
            p1.l(s2Var);
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var = ((p1) s2Var.e).D;
            p1.m(m1Var);
            p4Var.j0((String) m1Var.F(atomicReference, 15000L, "String test flag value", new l2(s2Var, atomicReference, 1)), b6Var);
            return;
        }
        if (i == 1) {
            p4 p4Var2 = this.d.F;
            p1.k(p4Var2);
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            m1 m1Var2 = ((p1) s2Var2.e).D;
            p1.m(m1Var2);
            p4Var2.k0(b6Var, ((Long) m1Var2.F(atomicReference2, 15000L, "long test flag value", new l2(s2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            p4 p4Var3 = this.d.F;
            p1.k(p4Var3);
            s2 s2Var3 = this.d.J;
            p1.l(s2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            m1 m1Var3 = ((p1) s2Var3.e).D;
            p1.m(m1Var3);
            double dDoubleValue = ((Double) m1Var3.F(atomicReference3, 15000L, "double test flag value", new l2(s2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                b6Var.w(bundle);
                return;
            } catch (RemoteException e) {
                u0 u0Var = ((p1) p4Var3.e).C;
                p1.m(u0Var);
                u0Var.F.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            p4 p4Var4 = this.d.F;
            p1.k(p4Var4);
            s2 s2Var4 = this.d.J;
            p1.l(s2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            m1 m1Var4 = ((p1) s2Var4.e).D;
            p1.m(m1Var4);
            p4Var4.l0(b6Var, ((Integer) m1Var4.F(atomicReference4, 15000L, "int test flag value", new l2(s2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        p4 p4Var5 = this.d.F;
        p1.k(p4Var5);
        s2 s2Var5 = this.d.J;
        p1.l(s2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        m1 m1Var5 = ((p1) s2Var5.e).D;
        p1.m(m1Var5);
        p4Var5.n0(b6Var, ((Boolean) m1Var5.F(atomicReference5, 15000L, "boolean test flag value", new l2(s2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void getUserProperties(String str, String str2, boolean z, b6 b6Var) {
        c();
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        m1Var.E(new i2(this, b6Var, str, str2, z));
    }

    public final void h(String str, b6 b6Var) {
        c();
        p4 p4Var = this.d.F;
        p1.k(p4Var);
        p4Var.j0(str, b6Var);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initForTests(Map map) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initialize(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j) {
        p1 p1Var = this.d;
        if (p1Var == null) {
            Context context = (Context) com.google.android.gms.dynamic.b.J(aVar);
            com.google.android.gms.common.internal.x.g(context);
            this.d = p1.s(context, j6Var, Long.valueOf(j), null);
        } else {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void initializeWithElapsedTime(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j, long j2) {
        p1 p1Var = this.d;
        if (p1Var == null) {
            Context context = (Context) com.google.android.gms.dynamic.b.J(aVar);
            com.google.android.gms.common.internal.x.g(context);
            this.d = p1.s(context, j6Var, Long.valueOf(j), Long.valueOf(j2));
        } else {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void isDataCollectionEnabled(b6 b6Var) {
        c();
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        m1Var.E(new n1(this, b6Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.A(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEventAndBundle(String str, String str2, Bundle bundle, b6 b6Var, long j) {
        c();
        com.google.android.gms.common.internal.x.d(str2);
        String str3 = true != this.d.A.G(null, f0.f1) ? "app" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        u uVar = new u(str2, new t(bundle), str3, j, 0L);
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        m1Var.E(new androidx.appcompat.view.menu.e(this, b6Var, uVar, str, 3));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.A(str, str2, bundle, z, z2, j, j2);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void logHealthData(int i, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        c();
        Object objJ = aVar == null ? null : com.google.android.gms.dynamic.b.J(aVar);
        Object objJ2 = aVar2 == null ? null : com.google.android.gms.dynamic.b.J(aVar2);
        Object objJ3 = aVar3 != null ? com.google.android.gms.dynamic.b.J(aVar3) : null;
        u0 u0Var = this.d.C;
        p1.m(u0Var);
        u0Var.E(i, true, false, str, objJ, objJ2, objJ3);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityCreatedByScionActivityInfo(l6.d(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        o2 o2Var = s2Var.z;
        if (o2Var != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
            o2Var.j(l6Var, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityDestroyedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        o2 o2Var = s2Var.z;
        if (o2Var != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
            o2Var.k(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityPausedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityPausedByScionActivityInfo(l6 l6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        o2 o2Var = s2Var.z;
        if (o2Var != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
            o2Var.l(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityResumedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityResumedByScionActivityInfo(l6 l6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        o2 o2Var = s2Var.z;
        if (o2Var != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
            o2Var.m(l6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, b6 b6Var, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(l6.d(activity), b6Var, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, b6 b6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        o2 o2Var = s2Var.z;
        Bundle bundle = new Bundle();
        if (o2Var != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
            o2Var.n(l6Var, bundle);
        }
        try {
            b6Var.w(bundle);
        } catch (RemoteException e) {
            u0 u0Var = this.d.C;
            p1.m(u0Var);
            u0Var.F.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityStartedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStartedByScionActivityInfo(l6 l6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        if (s2Var.z != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        onActivityStoppedByScionActivityInfo(l6.d(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void onActivityStoppedByScionActivityInfo(l6 l6Var, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        if (s2Var.z != null) {
            s2 s2Var2 = this.d.J;
            p1.l(s2Var2);
            s2Var2.O();
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void performAction(Bundle bundle, b6 b6Var, long j) {
        c();
        b6Var.w(null);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void registerOnMeasurementEventListener(f6 f6Var) {
        Object q4Var;
        c();
        androidx.collection.f fVar = this.e;
        synchronized (fVar) {
            try {
                q4Var = (e2) fVar.get(Integer.valueOf(f6Var.b()));
                if (q4Var == null) {
                    q4Var = new q4(this, f6Var);
                    fVar.put(Integer.valueOf(f6Var.b()), q4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.w();
        if (s2Var.B.add(q4Var)) {
            return;
        }
        u0 u0Var = ((p1) s2Var.e).C;
        p1.m(u0Var);
        u0Var.F.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    @Deprecated
    public void resetAnalyticsData(long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.D.set(null);
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new j2(s2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.D.set(null);
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new j2(s2Var, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void retrieveAndUploadBatches(d6 d6Var) {
        y2 y2Var;
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.w();
        p1 p1Var = (p1) s2Var.e;
        m1 m1Var = p1Var.D;
        p1.m(m1Var);
        if (m1Var.B()) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        m1 m1Var2 = p1Var.D;
        p1.m(m1Var2);
        if (Thread.currentThread() == m1Var2.A) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.C.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zV = androidx.work.impl.model.f.v();
        u0 u0Var3 = p1Var.C;
        if (zV) {
            p1.m(u0Var3);
            u0Var3.C.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        p1.m(u0Var3);
        u0Var3.K.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            u0 u0Var4 = p1Var.C;
            p1.m(u0Var4);
            u0Var4.K.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            m1 m1Var3 = p1Var.D;
            p1.m(m1Var3);
            m1Var3.F(atomicReference, 10000L, "[sgtm] Getting upload batches", new l2(s2Var, atomicReference, 6, false));
            d4 d4Var = (d4) atomicReference.get();
            if (d4Var == null) {
                break;
            }
            List list = d4Var.e;
            if (list.isEmpty()) {
                break;
            }
            u0 u0Var5 = p1Var.C;
            p1.m(u0Var5);
            u0Var5.K.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                b4 b4Var = (b4) it.next();
                try {
                    URL url = new URI(b4Var.z).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    n0 n0VarR = ((p1) s2Var.e).r();
                    n0VarR.w();
                    com.google.android.gms.common.internal.x.g(n0VarR.D);
                    String str = n0VarR.D;
                    p1 p1Var2 = (p1) s2Var.e;
                    u0 u0Var6 = p1Var2.C;
                    p1.m(u0Var6);
                    s0 s0Var = u0Var6.K;
                    Long lValueOf = Long.valueOf(b4Var.e);
                    s0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, b4Var.z, Integer.valueOf(b4Var.y.length));
                    if (!TextUtils.isEmpty(b4Var.D)) {
                        u0 u0Var7 = p1Var2.C;
                        p1.m(u0Var7);
                        u0Var7.K.c(lValueOf, b4Var.D, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = b4Var.A;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    w2 w2Var = p1Var2.L;
                    p1.m(w2Var);
                    byte[] bArr = b4Var.y;
                    com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(12, s2Var, atomicReference2, b4Var);
                    w2Var.x();
                    com.google.android.gms.common.internal.x.g(url);
                    com.google.android.gms.common.internal.x.g(bArr);
                    m1 m1Var4 = ((p1) w2Var.e).D;
                    p1.m(m1Var4);
                    m1Var4.H(new x0(w2Var, str, url, bArr, map, jVar));
                    try {
                        p4 p4Var = p1Var2.F;
                        p1.k(p4Var);
                        p1 p1Var3 = (p1) p4Var.e;
                        p1Var3.H.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    p1Var3.H.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        u0 u0Var8 = ((p1) s2Var.e).C;
                        p1.m(u0Var8);
                        u0Var8.F.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    y2Var = atomicReference2.get() == null ? y2.UNKNOWN : (y2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    u0 u0Var9 = ((p1) s2Var.e).C;
                    p1.m(u0Var9);
                    u0Var9.C.d("[sgtm] Bad upload url for row_id", b4Var.z, Long.valueOf(b4Var.e), e);
                    y2Var = y2.FAILURE;
                }
                if (y2Var != y2.SUCCESS) {
                    if (y2Var == y2.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        u0 u0Var10 = p1Var.C;
        p1.m(u0Var10);
        u0Var10.K.c(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            d6Var.d();
        } catch (RemoteException e2) {
            p1 p1Var4 = this.d;
            com.google.android.gms.common.internal.x.g(p1Var4);
            u0 u0Var11 = p1Var4.C;
            p1.m(u0Var11);
            u0Var11.F.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConditionalUserProperty(Bundle bundle, long j) {
        c();
        p1 p1Var = this.d;
        if (bundle == null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.a("Conditional user property must not be null");
        } else {
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.I(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConsentThirdParty(Bundle bundle, long j) throws Throwable {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.P(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j) {
        c();
        Activity activity = (Activity) com.google.android.gms.dynamic.b.J(aVar);
        com.google.android.gms.common.internal.x.g(activity);
        setCurrentScreenByScionActivityInfo(l6.d(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r3 > 500) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6 r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.l6, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setDataCollectionEnabled(boolean z) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.w();
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new androidx.media3.ui.b(s2Var, z));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new m2(s2Var, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setEventInterceptor(f6 f6Var) {
        c();
        androidx.work.impl.k kVar = new androidx.work.impl.k(29, this, f6Var, false);
        m1 m1Var = this.d.D;
        p1.m(m1Var);
        boolean zB = m1Var.B();
        p1 p1Var = this.d;
        if (!zB) {
            m1 m1Var2 = p1Var.D;
            p1.m(m1Var2);
            m1Var2.E(new com.google.common.util.concurrent.k0(19, this, kVar, false));
            return;
        }
        s2 s2Var = p1Var.J;
        p1.l(s2Var);
        s2Var.v();
        s2Var.w();
        androidx.work.impl.k kVar2 = s2Var.A;
        if (kVar != kVar2) {
            com.google.android.gms.common.internal.x.i("EventInterceptor already set.", kVar2 == null);
        }
        s2Var.A = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setInstanceIdProvider(i6 i6Var) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setMeasurementEnabled(boolean z, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        s2Var.w();
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new com.google.common.util.concurrent.k0(17, s2Var, boolValueOf, false));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setMinimumSessionDuration(long j) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setSessionTimeoutDuration(long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        m1 m1Var = ((p1) s2Var.e).D;
        p1.m(m1Var);
        m1Var.E(new j2(s2Var, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setSgtmDebugInfo(Intent intent) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        p1 p1Var = (p1) s2Var.e;
        Uri data = intent.getData();
        if (data == null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.I.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.I.a("[sgtm] Preview Mode was not enabled.");
            p1Var.A.z = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        u0 u0Var3 = p1Var.C;
        p1.m(u0Var3);
        u0Var3.I.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        p1Var.A.z = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setUserId(String str, long j) {
        c();
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        p1 p1Var = (p1) s2Var.e;
        if (str != null && TextUtils.isEmpty(str)) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.F.a("User ID must be non-empty or null");
        } else {
            m1 m1Var = p1Var.D;
            p1.m(m1Var);
            m1Var.E(new com.google.common.util.concurrent.k0(20, s2Var, str));
            s2Var.F(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j) {
        c();
        Object objJ = com.google.android.gms.dynamic.b.J(aVar);
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.F(str, str2, objJ, z, j);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void unregisterOnMeasurementEventListener(f6 f6Var) {
        Object q4Var;
        c();
        androidx.collection.f fVar = this.e;
        synchronized (fVar) {
            q4Var = (e2) fVar.remove(Integer.valueOf(f6Var.b()));
        }
        if (q4Var == null) {
            q4Var = new q4(this, f6Var);
        }
        s2 s2Var = this.d.J;
        p1.l(s2Var);
        s2Var.w();
        if (s2Var.B.remove(q4Var)) {
            return;
        }
        u0 u0Var = ((p1) s2Var.e).C;
        p1.m(u0Var);
        u0Var.F.a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public void setConsent(Bundle bundle, long j) {
    }
}
