package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends x1 {
    public long A;
    public String B;
    public final s0 C;
    public final s0 D;
    public final s0 E;
    public final s0 F;
    public final s0 G;
    public final s0 H;
    public final s0 I;
    public final s0 J;
    public final s0 K;
    public char z;

    public u0(p1 p1Var) {
        super(p1Var);
        this.z = (char) 0;
        this.A = -1L;
        this.C = new s0(this, 6, false, false);
        this.D = new s0(this, 6, true, false);
        this.E = new s0(this, 6, false, true);
        this.F = new s0(this, 5, false, false);
        this.G = new s0(this, 5, true, false);
        this.H = new s0(this, 5, false, true);
        this.I = new s0(this, 4, false, false);
        this.J = new s0(this, 3, false, false);
        this.K = new s0(this, 2, false, false);
    }

    public static t0 D(String str) {
        if (str == null) {
            return null;
        }
        return new t0(str);
    }

    public static String G(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strH = H(obj, z);
        String strH2 = H(obj2, z);
        String strH3 = H(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strH)) {
            sb.append(str2);
            sb.append(strH);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strH2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strH2);
        }
        if (!TextUtils.isEmpty(strH3)) {
            sb.append(str3);
            sb.append(strH3);
        }
        return sb.toString();
    }

    public static String H(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof t0) {
                return ((t0) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = p1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public final s0 A() {
        return this.F;
    }

    public final s0 B() {
        return this.J;
    }

    public final s0 C() {
        return this.K;
    }

    public final void E(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(F(), i)) {
            Log.println(i, F(), G(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.x.g(str);
        m1 m1Var = ((p1) this.e).D;
        if (m1Var == null) {
            Log.println(6, F(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m1Var.y) {
                Log.println(6, F(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            m1Var.E(new com.app.mlounge.data.remote.ntv.l(this, i, str, obj, obj2, obj3));
        }
    }

    public final String F() {
        String str;
        synchronized (this) {
            try {
                if (this.B == null) {
                    ((p1) ((p1) this.e).A.e).getClass();
                    this.B = "FA";
                }
                com.google.android.gms.common.internal.x.g(this.B);
                str = this.B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.x1
    public final boolean w() {
        return false;
    }

    public final s0 z() {
        return this.C;
    }
}
