package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.app.mlounge.emulator.LibretroCore;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.compose.animation.core.j2 {
    public f A;
    public Boolean B;
    public Boolean y;
    public String z;

    public final int A(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(E(str, f0.g0), 500), 100) : 500, LibretroCore.SCREEN_WIDTH);
    }

    public final void B() {
        ((p1) this.e).getClass();
    }

    public final String C(String str, e0 e0Var) {
        return TextUtils.isEmpty(str) ? (String) e0Var.a(null) : (String) e0Var.a(this.A.d(str, e0Var.a));
    }

    public final long D(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        String strD = this.A.d(str, e0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Long) e0Var.a(null)).longValue();
        }
        try {
            return ((Long) e0Var.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e0Var.a(null)).longValue();
        }
    }

    public final int E(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        String strD = this.A.d(str, e0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) e0Var.a(null)).intValue();
        }
        try {
            return ((Integer) e0Var.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e0Var.a(null)).intValue();
        }
    }

    public final double F(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        String strD = this.A.d(str, e0Var.a);
        if (TextUtils.isEmpty(strD)) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
        try {
            return ((Double) e0Var.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e0Var.a(null)).doubleValue();
        }
    }

    public final boolean G(String str, e0 e0Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e0Var.a(null)).booleanValue();
        }
        String strD = this.A.d(str, e0Var.a);
        return TextUtils.isEmpty(strD) ? ((Boolean) e0Var.a(null)).booleanValue() : ((Boolean) e0Var.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    public final Bundle H() {
        p1 p1Var = (p1) this.e;
        try {
            Context context = p1Var.e;
            Context context2 = p1Var.e;
            u0 u0Var = p1Var.C;
            if (context.getPackageManager() == null) {
                p1.m(u0Var);
                u0Var.C.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = com.google.android.gms.common.wrappers.b.a(context2).b(128, context2.getPackageName());
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            p1.m(u0Var);
            u0Var.C.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.C.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean I(String str) {
        com.google.android.gms.common.internal.x.d(str);
        Bundle bundleH = H();
        if (bundleH != null) {
            if (bundleH.containsKey(str)) {
                return Boolean.valueOf(bundleH.getBoolean(str));
            }
            return null;
        }
        u0 u0Var = ((p1) this.e).C;
        p1.m(u0Var);
        u0Var.C.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean J() {
        ((p1) this.e).getClass();
        Boolean boolI = I("firebase_analytics_collection_deactivated");
        return boolI != null && boolI.booleanValue();
    }

    public final boolean K() {
        Boolean boolI = I("google_analytics_automatic_screen_reporting_enabled");
        return boolI == null || boolI.booleanValue();
    }

    public final z1 L(String str, boolean z) {
        Object obj;
        com.google.android.gms.common.internal.x.d(str);
        p1 p1Var = (p1) this.e;
        Bundle bundleH = H();
        if (bundleH == null) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleH.get(str);
        }
        z1 z1Var = z1.UNINITIALIZED;
        if (obj == null) {
            return z1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return z1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return z1.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return z1.POLICY;
        }
        u0 u0Var2 = p1Var.C;
        p1.m(u0Var2);
        u0Var2.F.b(str, "Invalid manifest metadata for");
        return z1Var;
    }

    public final boolean w(String str) {
        p1.k(((p1) this.e).F);
        if (p4.Y((String) f0.g1.a(null), str) || p4.Y((String) f0.h1.a(null), str) || p4.Y((String) f0.i1.a(null), str)) {
            return true;
        }
        return "1".equals(this.A.d(str, "gaia_collection_enabled"));
    }

    public final boolean x(String str) {
        return "1".equals(this.A.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean y() {
        if (this.y == null) {
            Boolean boolI = I("app_measurement_lite");
            this.y = boolI;
            if (boolI == null) {
                this.y = Boolean.FALSE;
            }
        }
        return this.y.booleanValue() || !((p1) this.e).y;
    }

    public final String z(String str) {
        p1 p1Var = (p1) this.e;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.x.g(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.C.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.C.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            u0 u0Var3 = p1Var.C;
            p1.m(u0Var3);
            u0Var3.C.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            u0 u0Var4 = p1Var.C;
            p1.m(u0Var4);
            u0Var4.C.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }
}
