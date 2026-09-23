package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public i2(s2 s2Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.B = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = z;
        Objects.requireNonNull(s2Var);
        this.C = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x016b A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018d A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: RuntimeException -> 0x00e5, TryCatch #1 {RuntimeException -> 0x00e5, blocks: (B:53:0x010b, B:55:0x0116, B:58:0x0123, B:60:0x0129, B:62:0x0143, B:64:0x014c, B:66:0x0152, B:69:0x016b, B:71:0x017a, B:70:0x0172, B:72:0x018d, B:74:0x0193, B:76:0x0199, B:78:0x019f, B:80:0x01a5, B:82:0x01ad, B:84:0x01b5, B:86:0x01bb, B:87:0x01cd, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:101:0x0094 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        u0 u0Var;
        Bundle bundleX0;
        String str;
        u0 u0Var2;
        s0 s0Var;
        Bundle bundleX1;
        switch (this.e) {
            case 0:
                m3 m3VarP = ((AppMeasurementDynamiteService) this.C).d.p();
                b6 b6Var = (b6) this.B;
                String str2 = (String) this.y;
                String str3 = (String) this.z;
                m3VarP.v();
                m3VarP.w();
                m3VarP.J(new e3(m3VarP, str2, str3, m3VarP.L(false), this.A, b6Var));
                break;
            case 1:
                String str4 = (String) this.y;
                String str5 = (String) this.z;
                m3 m3VarP2 = ((p1) ((s2) this.C).e).p();
                AtomicReference atomicReference = (AtomicReference) this.B;
                m3VarP2.v();
                m3VarP2.w();
                m3VarP2.J(new e3(m3VarP2, atomicReference, str4, str5, m3VarP2.L(false), this.A));
                break;
            case 2:
                o2 o2Var = (o2) this.C;
                s2 s2Var = (s2) o2Var.y;
                s2Var.v();
                p1 p1Var = (p1) s2Var.e;
                o1 o1Var = s2Var.N;
                String str6 = (String) this.z;
                Uri uri = (Uri) this.B;
                try {
                    p4 p4Var = p1Var.F;
                    u0 u0Var3 = p1Var.C;
                    p1.k(p4Var);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            u0Var = u0Var3;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    u0Var = u0Var3;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        u0 u0Var4 = ((p1) p4Var.e).C;
                                        p1.m(u0Var4);
                                        u0Var4.J.a("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.y;
                                    if (this.A) {
                                        p4 p4Var2 = p1Var.F;
                                        p1.k(p4Var2);
                                        bundleX1 = p4Var2.x0(uri);
                                        if (bundleX1 != null) {
                                            bundleX1.putString("_cis", "intent");
                                            if (bundleX1.containsKey("gclid") && bundleX0 != null && bundleX0.containsKey("gclid")) {
                                                bundleX1.putString("_cer", "gclid=" + bundleX0.getString("gclid"));
                                            }
                                            s2Var.C(str, "_cmp", bundleX1);
                                            o1Var.a(str, bundleX1);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        p1.m(u0Var);
                                        u0Var2 = u0Var;
                                        s0Var = u0Var2.J;
                                        s0Var.b(str6, "Activity created with referrer");
                                        if (p1Var.A.G(null, f0.G0)) {
                                            if (bundleX0 != null) {
                                                s2Var.C(str, "_cmp", bundleX0);
                                                o1Var.a(str, bundleX0);
                                            } else {
                                                p1.m(u0Var2);
                                                s0Var.b(str6, "Referrer does not contain valid parameters");
                                            }
                                            p1Var.H.getClass();
                                            s2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            p1.m(u0Var2);
                                            s0Var.a(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            p1Var.H.getClass();
                                            s2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    u0Var = u0Var3;
                                }
                                bundleX0 = p4Var.x0(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleX0 != null) {
                                    bundleX0.putString("_cis", "referrer");
                                }
                                str = (String) this.y;
                                if (this.A) {
                                    p4 p4Var3 = p1Var.F;
                                    p1.k(p4Var3);
                                    bundleX1 = p4Var3.x0(uri);
                                    if (bundleX1 != null) {
                                        bundleX1.putString("_cis", "intent");
                                        if (bundleX1.containsKey("gclid")) {
                                        }
                                        s2Var.C(str, "_cmp", bundleX1);
                                        o1Var.a(str, bundleX1);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    p1.m(u0Var);
                                    u0Var2 = u0Var;
                                    s0Var = u0Var2.J;
                                    s0Var.b(str6, "Activity created with referrer");
                                    if (p1Var.A.G(null, f0.G0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        p1.m(u0Var2);
                                        s0Var.a(str7);
                                    } else {
                                        if (bundleX0 != null) {
                                            s2Var.C(str, "_cmp", bundleX0);
                                            o1Var.a(str, bundleX0);
                                        } else {
                                            p1.m(u0Var2);
                                            s0Var.b(str6, "Referrer does not contain valid parameters");
                                        }
                                        p1Var.H.getClass();
                                        s2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                o2Var = o2Var;
                                u0 u0Var5 = ((p1) ((s2) o2Var.y).e).C;
                                p1.m(u0Var5);
                                u0Var5.C.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleX0 = null;
                        str = (String) this.y;
                        if (this.A) {
                            p4 p4Var4 = p1Var.F;
                            p1.k(p4Var4);
                            bundleX1 = p4Var4.x0(uri);
                            if (bundleX1 != null) {
                                bundleX1.putString("_cis", "intent");
                                if (bundleX1.containsKey("gclid")) {
                                }
                                s2Var.C(str, "_cmp", bundleX1);
                                o1Var.a(str, bundleX1);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            p1.m(u0Var);
                            u0Var2 = u0Var;
                            s0Var = u0Var2.J;
                            s0Var.b(str6, "Activity created with referrer");
                            if (p1Var.A.G(null, f0.G0)) {
                                if (str6.contains("gclid")) {
                                }
                                p1.m(u0Var2);
                                s0Var.a(str7);
                            } else {
                                if (bundleX0 != null) {
                                    s2Var.C(str, "_cmp", bundleX0);
                                    o1Var.a(str, bundleX0);
                                } else {
                                    p1.m(u0Var2);
                                    s0Var.b(str6, "Referrer does not contain valid parameters");
                                }
                                p1Var.H.getClass();
                                s2Var.F(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        u0 u0Var6 = ((p1) ((s2) o2Var.y).e).C;
                        p1.m(u0Var6);
                        u0Var6.C.b(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                m3 m3Var = (m3) this.C;
                i0 i0Var = m3Var.A;
                p1 p1Var2 = (p1) m3Var.e;
                if (i0Var == null) {
                    u0 u0Var7 = p1Var2.C;
                    p1.m(u0Var7);
                    u0Var7.C.a("Failed to send default event parameters to service");
                } else {
                    boolean zG = p1Var2.A.G(null, f0.W0);
                    r4 r4Var = (r4) this.B;
                    if (zG) {
                        m3Var.N(i0Var, this.A ? null : (t) this.y, r4Var);
                    } else {
                        try {
                            i0Var.v((Bundle) this.z, r4Var);
                            m3Var.I();
                        } catch (RemoteException e4) {
                            u0 u0Var8 = p1Var2.C;
                            p1.m(u0Var8);
                            u0Var8.C.b(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public i2(o2 o2Var, boolean z, Uri uri, String str, String str2) {
        this.A = z;
        this.B = uri;
        this.y = str;
        this.z = str2;
        this.C = o2Var;
    }

    public i2(AppMeasurementDynamiteService appMeasurementDynamiteService, b6 b6Var, String str, String str2, boolean z) {
        this.B = b6Var;
        this.y = str;
        this.z = str2;
        this.A = z;
        this.C = appMeasurementDynamiteService;
    }

    public i2(m3 m3Var, r4 r4Var, boolean z, t tVar, Bundle bundle) {
        this.B = r4Var;
        this.A = z;
        this.y = tVar;
        this.z = bundle;
        Objects.requireNonNull(m3Var);
        this.C = m3Var;
    }
}
