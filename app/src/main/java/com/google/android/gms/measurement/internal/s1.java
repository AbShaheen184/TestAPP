package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public s1(d3 d3Var, Bundle bundle, a3 a3Var, a3 a3Var2, long j) {
        this.e = 2;
        this.y = bundle;
        this.z = a3Var;
        this.B = a3Var2;
        this.A = j;
        Objects.requireNonNull(d3Var);
        this.C = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                String str = (String) this.z;
                w1 w1Var = (w1) this.C;
                String str2 = (String) this.y;
                if (str2 != null) {
                    a3 a3Var = new a3(this.A, (String) this.B, str2);
                    j4 j4Var = w1Var.d;
                    j4Var.e().v();
                    String str3 = j4Var.d0;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    j4Var.d0 = str;
                    j4Var.c0 = a3Var;
                } else {
                    j4 j4Var2 = w1Var.d;
                    j4Var2.e().v();
                    String str4 = j4Var2.d0;
                    if (str4 == null || str4.equals(str)) {
                        j4Var2.d0 = str;
                        j4Var2.c0 = null;
                    }
                }
                break;
            case 1:
                s2 s2Var = (s2) this.C;
                String str5 = (String) this.y;
                String str6 = (String) this.z;
                s2Var.G(this.A, this.B, str5, str6);
                break;
            default:
                Bundle bundle = (Bundle) this.y;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                d3 d3Var = (d3) this.C;
                p4 p4Var = ((p1) d3Var.e).F;
                p1.k(p4Var);
                d3Var.B((a3) this.z, (a3) this.B, this.A, true, p4Var.F("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ s1(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.e = i;
        this.y = str;
        this.z = str2;
        this.B = obj2;
        this.A = j;
        this.C = obj;
    }
}
