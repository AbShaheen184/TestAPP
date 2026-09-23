package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ s2 y;

    public /* synthetic */ g2(s2 s2Var, int i) {
        this.e = i;
        this.y = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.S();
                break;
            case 1:
                o1 o1Var = this.y.N;
                p1 p1Var = o1Var.e;
                m1 m1Var = p1Var.D;
                s2 s2Var = p1Var.J;
                d1 d1Var = p1Var.B;
                p1.m(m1Var);
                m1Var.v();
                if (o1Var.c()) {
                    if (o1Var.b()) {
                        p1.k(d1Var);
                        d1Var.T.v(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        p1.l(s2Var);
                        s2Var.C(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
                    } else {
                        p1.k(d1Var);
                        androidx.compose.foundation.lazy.layout.b1 b1Var = d1Var.T;
                        String strT = b1Var.t();
                        if (TextUtils.isEmpty(strT)) {
                            u0 u0Var = p1Var.C;
                            p1.m(u0Var);
                            u0Var.D.a("Cache still valid but referrer not found");
                        } else {
                            long jG = d1Var.U.g() / 3600000;
                            Uri uri = Uri.parse(strT);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jG - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            p1.l(s2Var);
                            s2Var.C(str2, "_cmp", (Bundle) pair.second);
                        }
                        b1Var.v(null);
                    }
                    p1.k(d1Var);
                    d1Var.U.h(0L);
                    break;
                }
                break;
            case 2:
                s2 s2Var2 = this.y;
                s2Var2.v();
                p1 p1Var2 = (p1) s2Var2.e;
                d1 d1Var2 = p1Var2.B;
                u0 u0Var2 = p1Var2.C;
                p1.k(d1Var2);
                b1 b1Var2 = d1Var2.Q;
                if (b1Var2.a()) {
                    p1.m(u0Var2);
                    u0Var2.J.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    androidx.media3.exoplayer.l1 l1Var = d1Var2.R;
                    long jG2 = l1Var.g();
                    l1Var.h(1 + jG2);
                    if (jG2 >= 5) {
                        p1.m(u0Var2);
                        u0Var2.F.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        b1Var2.b(true);
                    } else {
                        if (s2Var2.P == null) {
                            s2Var2.P = new h2(s2Var2, p1Var2, 3);
                        }
                        s2Var2.P.b(0L);
                    }
                }
                break;
            default:
                this.y.S();
                break;
        }
    }
}
