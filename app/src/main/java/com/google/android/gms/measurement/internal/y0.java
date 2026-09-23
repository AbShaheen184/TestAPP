package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.measurement.z8;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends e4 {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(j4 j4Var, int i) {
        super(j4Var);
        this.A = i;
    }

    public void C(String str, f4 f4Var, z8 z8Var, w0 w0Var) {
        String str2;
        String str3 = f4Var.a;
        p1 p1Var = (p1) this.e;
        v();
        w();
        try {
            URL url = new URI(str3).toURL();
            this.y.k0();
            byte[] bArrA = z8Var.a();
            m1 m1Var = p1Var.D;
            p1.m(m1Var);
            Map map = f4Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                m1Var.H(new x0(this, str2, url, bArrA, map, w0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                u0Var.C.c(u0.D(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    @Override // com.google.android.gms.measurement.internal.e4
    public final void y() {
        int i = this.A;
    }

    public boolean z() {
        w();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((p1) this.e).e.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private final void A() {
    }

    private final void B() {
    }
}
