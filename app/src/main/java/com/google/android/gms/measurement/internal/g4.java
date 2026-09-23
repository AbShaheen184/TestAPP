package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends a4 {
    public static final boolean y(String str) {
        String str2 = (String) f0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.J().u()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.f4 w(java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g4.w(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    public final String x(String str) {
        i1 i1Var = this.y.e;
        j4.U(i1Var);
        String strI = i1Var.I(str);
        if (TextUtils.isEmpty(strI)) {
            return (String) f0.r.a(null);
        }
        Uri uri = Uri.parse((String) f0.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strI).length() + 1 + String.valueOf(authority).length());
        sb.append(strI);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
