package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(s2 s2Var, y1 y1Var, int i) {
        super(y1Var);
        this.e = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(s2Var);
                this.f = s2Var;
                super(y1Var);
                break;
            case 2:
                Objects.requireNonNull(s2Var);
                this.f = s2Var;
                super(y1Var);
                break;
            case 3:
                this.f = s2Var;
                super(y1Var);
                break;
            default:
                Objects.requireNonNull(s2Var);
                this.f = s2Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0289 A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x029a A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a2 A[Catch: IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, TryCatch #5 {IllegalArgumentException -> 0x0290, MalformedURLException -> 0x0292, blocks: (B:80:0x0241, B:82:0x0289, B:87:0x0294, B:89:0x029a, B:91:0x02a2, B:92:0x02a8, B:93:0x02ac), top: B:116:0x0241 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c6  */
    @Override // com.google.android.gms.measurement.internal.n
    public final void a() throws Throwable {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        m3 m3VarP;
        p1 p1Var;
        i0 i0Var;
        i iVarU;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        p1 p1Var2;
        URL url;
        String strConcat;
        switch (this.e) {
            case 0:
                s2 s2Var = ((p1) this.f.e).J;
                p1.l(s2Var);
                new Thread(new g2(s2Var, 0)).start();
                break;
            case 1:
                this.f.U();
                break;
            case 2:
                this.f.B();
                break;
            default:
                s2 s2Var2 = this.f;
                p1 p1Var3 = (p1) s2Var2.e;
                d1 d1Var = p1Var3.B;
                u0 u0Var = p1Var3.C;
                m1 m1Var = p1Var3.D;
                p1.m(m1Var);
                m1Var.v();
                w2 w2Var = p1Var3.L;
                p1.m(w2Var);
                p1 p1Var4 = (p1) w2Var.e;
                p1.m(w2Var);
                String strB = p1Var3.r().B();
                Boolean boolI = p1Var3.A.I("google_analytics_adid_collection_enabled");
                boolean z = false;
                if (boolI == null || boolI.booleanValue()) {
                    p1.k(d1Var);
                    p1 p1Var5 = (p1) d1Var.e;
                    d1Var.v();
                    if (d1Var.C().i(b2.AD_STORAGE)) {
                        p1Var5.H.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = d1Var.E;
                        if (str3 == null || jElapsedRealtime >= d1Var.G) {
                            d1Var.G = p1Var5.A.D(strB, f0.b) + jElapsedRealtime;
                            try {
                                androidx.room.v vVarA = com.google.android.gms.ads.identifier.a.a(p1Var5.e);
                                d1Var.E = "";
                                String str4 = vVarA.b;
                                if (str4 != null) {
                                    d1Var.E = str4;
                                }
                                d1Var.F = vVarA.c;
                            } catch (Exception e) {
                                u0 u0Var2 = p1Var5.C;
                                p1.m(u0Var2);
                                u0Var2.J.b(e, "Unable to get advertising id");
                                d1Var.E = "";
                            }
                            pair = new Pair(d1Var.E, Boolean.valueOf(d1Var.F));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(d1Var.F));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        p1.m(w2Var);
                        w2Var.x();
                        ConnectivityManager connectivityManager = (ConnectivityManager) p1Var4.e.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            m3 m3VarP2 = p1Var3.p();
                            m3VarP2.v();
                            m3VarP2.w();
                            if (!m3VarP2.C()) {
                                s2 s2Var3 = p1Var3.J;
                                p1.l(s2Var3);
                                p1 p1Var6 = (p1) s2Var3.e;
                                s2Var3.v();
                                m3VarP = p1Var6.p();
                                p1Var = (p1) m3VarP.e;
                                m3VarP.v();
                                m3VarP.w();
                                i0Var = m3VarP.A;
                                if (i0Var == null) {
                                    m3VarP.B();
                                    u0 u0Var3 = p1Var.C;
                                    p1.m(u0Var3);
                                    u0Var3.J.a("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        iVarU = i0Var.u(m3VarP.L(false));
                                        m3VarP.I();
                                    } catch (RemoteException e2) {
                                        u0 u0Var4 = p1Var.C;
                                        p1.m(u0Var4);
                                        u0Var4.C.b(e2, "Failed to get consents; remote exception");
                                        iVarU = null;
                                    }
                                    if (iVarU != null) {
                                        bundle = iVarU.e;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = p1Var3.Y;
                                        p1Var3.Y = i + 1;
                                        z = i < 10;
                                        p1.m(u0Var);
                                        s0 s0Var = u0Var.J;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        s0Var.b(Integer.valueOf(p1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb2, str2, " retryCount"));
                                    } else {
                                        c2 c2VarB = c2.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c2VarB.f());
                                        o oVarC = o.c(100, bundle);
                                        str = oVarC.d;
                                        sb.append("&dma=");
                                        Boolean bool2 = oVarC.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = c2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i2);
                                        p1.m(u0Var);
                                        u0Var.K.b(sb, "Consent query parameters to Bow");
                                        p4 p4Var = p1Var3.F;
                                        p1.k(p4Var);
                                        ((p1) p1Var3.r().e).A.B();
                                        String str5 = (String) pair.first;
                                        long jG = d1Var.R.g() - 1;
                                        string = sb.toString();
                                        p1Var2 = (p1) p4Var.e;
                                        try {
                                            com.google.android.gms.common.internal.x.d(str5);
                                            com.google.android.gms.common.internal.x.d(strB);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var.h0()) + "&rdid=" + str5 + "&bundleid=" + strB + "&retry=" + jG;
                                            if (strB.equals(p1Var2.A.z("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            u0 u0Var5 = p1Var2.C;
                                            p1.m(u0Var5);
                                            u0Var5.C.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            u0 u0Var6 = p1Var2.C;
                                            p1.m(u0Var6);
                                            u0Var6.C.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            p1.m(w2Var);
                                            o1 o1Var = new o1(p1Var3);
                                            w2Var.x();
                                            m1 m1Var2 = p1Var4.D;
                                            p1.m(m1Var2);
                                            m1Var2.H(new x0(w2Var, strB, url, (byte[]) null, (HashMap) null, o1Var));
                                        }
                                    }
                                }
                                iVarU = null;
                                if (iVarU != null) {
                                    bundle = iVarU.e;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = p1Var3.Y;
                                    p1Var3.Y = i + 1;
                                    if (i < 10) {
                                    }
                                    p1.m(u0Var);
                                    s0 s0Var2 = u0Var.J;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    s0Var2.b(Integer.valueOf(p1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb3, str2, " retryCount"));
                                } else {
                                    c2 c2VarB2 = c2.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(c2VarB2.f());
                                    o oVarC2 = o.c(100, bundle);
                                    str = oVarC2.d;
                                    sb.append("&dma=");
                                    Boolean bool3 = oVarC2.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = c2.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i3);
                                    p1.m(u0Var);
                                    u0Var.K.b(sb, "Consent query parameters to Bow");
                                    p4 p4Var2 = p1Var3.F;
                                    p1.k(p4Var2);
                                    ((p1) p1Var3.r().e).A.B();
                                    String str6 = (String) pair.first;
                                    long jG2 = d1Var.R.g() - 1;
                                    string = sb.toString();
                                    p1Var2 = (p1) p4Var2.e;
                                    com.google.android.gms.common.internal.x.d(str6);
                                    com.google.android.gms.common.internal.x.d(strB);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var2.h0()) + "&rdid=" + str6 + "&bundleid=" + strB + "&retry=" + jG2;
                                    if (strB.equals(p1Var2.A.z("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        p1.m(w2Var);
                                        o1 o1Var2 = new o1(p1Var3);
                                        w2Var.x();
                                        m1 m1Var3 = p1Var4.D;
                                        p1.m(m1Var3);
                                        m1Var3.H(new x0(w2Var, strB, url, (byte[]) null, (HashMap) null, o1Var2));
                                    }
                                }
                                break;
                            } else {
                                p4 p4Var3 = ((p1) m3VarP2.e).F;
                                p1.k(p4Var3);
                                if (p4Var3.h0() >= 234200) {
                                    s2 s2Var4 = p1Var3.J;
                                    p1.l(s2Var4);
                                    p1 p1Var7 = (p1) s2Var4.e;
                                    s2Var4.v();
                                    m3VarP = p1Var7.p();
                                    p1Var = (p1) m3VarP.e;
                                    m3VarP.v();
                                    m3VarP.w();
                                    i0Var = m3VarP.A;
                                    if (i0Var == null) {
                                        m3VarP.B();
                                        u0 u0Var7 = p1Var.C;
                                        p1.m(u0Var7);
                                        u0Var7.J.a("Failed to get consents; not connected to service yet.");
                                    } else {
                                        iVarU = i0Var.u(m3VarP.L(false));
                                        m3VarP.I();
                                        if (iVarU != null) {
                                            bundle = iVarU.e;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = p1Var3.Y;
                                            p1Var3.Y = i + 1;
                                            if (i < 10) {
                                            }
                                            p1.m(u0Var);
                                            s0 s0Var3 = u0Var.J;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            s0Var3.b(Integer.valueOf(p1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb4, str2, " retryCount"));
                                        } else {
                                            c2 c2VarB3 = c2.b(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(c2VarB3.f());
                                            o oVarC3 = o.c(100, bundle);
                                            str = oVarC3.d;
                                            sb.append("&dma=");
                                            Boolean bool4 = oVarC3.c;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = c2.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i4);
                                            p1.m(u0Var);
                                            u0Var.K.b(sb, "Consent query parameters to Bow");
                                            p4 p4Var4 = p1Var3.F;
                                            p1.k(p4Var4);
                                            ((p1) p1Var3.r().e).A.B();
                                            String str7 = (String) pair.first;
                                            long jG3 = d1Var.R.g() - 1;
                                            string = sb.toString();
                                            p1Var2 = (p1) p4Var4.e;
                                            com.google.android.gms.common.internal.x.d(str7);
                                            com.google.android.gms.common.internal.x.d(strB);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var4.h0()) + "&rdid=" + str7 + "&bundleid=" + strB + "&retry=" + jG3;
                                            if (strB.equals(p1Var2.A.z("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                p1.m(w2Var);
                                                o1 o1Var3 = new o1(p1Var3);
                                                w2Var.x();
                                                m1 m1Var4 = p1Var4.D;
                                                p1.m(m1Var4);
                                                m1Var4.H(new x0(w2Var, strB, url, (byte[]) null, (HashMap) null, o1Var3));
                                            }
                                        }
                                    }
                                    iVarU = null;
                                    if (iVarU != null) {
                                        bundle = iVarU.e;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = p1Var3.Y;
                                        p1Var3.Y = i + 1;
                                        if (i < 10) {
                                        }
                                        p1.m(u0Var);
                                        s0 s0Var4 = u0Var.J;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        s0Var4.b(Integer.valueOf(p1Var3.Y), androidx.privacysandbox.ads.adservices.java.internal.a.u(sb5, str2, " retryCount"));
                                    } else {
                                        c2 c2VarB4 = c2.b(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c2VarB4.f());
                                        o oVarC4 = o.c(100, bundle);
                                        str = oVarC4.d;
                                        sb.append("&dma=");
                                        Boolean bool5 = oVarC4.c;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = c2.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i5);
                                        p1.m(u0Var);
                                        u0Var.K.b(sb, "Consent query parameters to Bow");
                                        p4 p4Var5 = p1Var3.F;
                                        p1.k(p4Var5);
                                        ((p1) p1Var3.r().e).A.B();
                                        String str8 = (String) pair.first;
                                        long jG4 = d1Var.R.g() - 1;
                                        string = sb.toString();
                                        p1Var2 = (p1) p4Var5.e;
                                        com.google.android.gms.common.internal.x.d(str8);
                                        com.google.android.gms.common.internal.x.d(strB);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var5.h0()) + "&rdid=" + str8 + "&bundleid=" + strB + "&retry=" + jG4;
                                        if (strB.equals(p1Var2.A.z("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            p1.m(w2Var);
                                            o1 o1Var4 = new o1(p1Var3);
                                            w2Var.x();
                                            m1 m1Var5 = p1Var4.D;
                                            p1.m(m1Var5);
                                            m1Var5.H(new x0(w2Var, strB, url, (byte[]) null, (HashMap) null, o1Var4));
                                        }
                                    }
                                } else {
                                    p4 p4Var6 = p1Var3.F;
                                    p1.k(p4Var6);
                                    ((p1) p1Var3.r().e).A.B();
                                    String str9 = (String) pair.first;
                                    long jG5 = d1Var.R.g() - 1;
                                    string = sb.toString();
                                    p1Var2 = (p1) p4Var6.e;
                                    com.google.android.gms.common.internal.x.d(str9);
                                    com.google.android.gms.common.internal.x.d(strB);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + p4Var6.h0()) + "&rdid=" + str9 + "&bundleid=" + strB + "&retry=" + jG5;
                                    if (strB.equals(p1Var2.A.z("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        p1.m(w2Var);
                                        o1 o1Var5 = new o1(p1Var3);
                                        w2Var.x();
                                        m1 m1Var6 = p1Var4.D;
                                        p1.m(m1Var6);
                                        m1Var6.H(new x0(w2Var, strB, url, (byte[]) null, (HashMap) null, o1Var5));
                                    }
                                }
                            }
                        } else {
                            p1.m(u0Var);
                            u0Var.F.a("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        p1.m(u0Var);
                        u0Var.K.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    p1.m(u0Var);
                    u0Var.K.a("ADID collection is disabled from Manifest. Skipping");
                }
                if (z) {
                    s2Var2.P.b(2000L);
                }
                break;
        }
    }
}
