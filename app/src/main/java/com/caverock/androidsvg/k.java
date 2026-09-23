package com.caverock.androidsvg;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {
    public final boolean a;
    public final String b;

    public k(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    @Override // com.caverock.androidsvg.e
    public final boolean a(w0 w0Var) {
        int i;
        boolean z = this.a;
        String strN = this.b;
        if (z && strN == null) {
            strN = w0Var.n();
        }
        u0 u0Var = w0Var.b;
        if (u0Var != null) {
            Iterator it = u0Var.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                w0 w0Var2 = (w0) ((y0) it.next());
                if (strN == null || w0Var2.n().equals(strN)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? androidx.privacysandbox.ads.adservices.java.internal.a.r("only-of-type <", this.b, ">") : "only-child";
    }
}
