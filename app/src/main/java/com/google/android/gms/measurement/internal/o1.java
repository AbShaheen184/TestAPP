package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements u2 {
    public final p1 e;

    public /* synthetic */ o1(p1 p1Var) {
        this.e = p1Var;
    }

    public void a(String str, Bundle bundle) {
        String string;
        p1 p1Var = this.e;
        m1 m1Var = p1Var.D;
        d1 d1Var = p1Var.B;
        p1.m(m1Var);
        m1Var.v();
        if (p1Var.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        p1.k(d1Var);
        d1Var.T.v(string);
        androidx.media3.exoplayer.l1 l1Var = d1Var.U;
        p1Var.H.getClass();
        l1Var.h(System.currentTimeMillis());
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        p1 p1Var = this.e;
        p1Var.H.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        d1 d1Var = p1Var.B;
        p1.k(d1Var);
        return jCurrentTimeMillis - d1Var.U.g() > p1Var.A.D(null, f0.i0);
    }

    public boolean c() {
        d1 d1Var = this.e.B;
        p1.k(d1Var);
        return d1Var.U.g() > 0;
    }

    @Override // com.google.android.gms.measurement.internal.u2, com.google.android.gms.measurement.internal.w0
    public /* synthetic */ void g(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.e.i(i, th, bArr);
    }
}
