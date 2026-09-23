package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public final /* synthetic */ int a = 1;
    public final p1 b;

    public f1(j4 j4Var) {
        this.b = j4Var.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.a) {
            case 0:
                p1 p1Var = this.b;
                boolean z = false;
                try {
                    androidx.compose.ui.autofill.r rVarA = com.google.android.gms.common.wrappers.b.a(p1Var.e);
                    if (rVarA == null) {
                        u0 u0Var = p1Var.C;
                        p1.m(u0Var);
                        u0Var.K.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        p1Var = p1Var;
                    } else {
                        int i = rVarA.c(128, "com.android.vending").versionCode;
                        p1Var = i;
                        if (i >= 80837300) {
                            z = true;
                            p1Var = i;
                        }
                    }
                    break;
                } catch (Exception e) {
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.K.b(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                u0 u0Var3 = this.b.C;
                p1.m(u0Var3);
                return Log.isLoggable(u0Var3.F(), 3);
        }
    }

    public f1(f2 f2Var, p1 p1Var) {
        this.b = p1Var;
    }
}
