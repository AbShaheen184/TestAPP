package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ w1 d;

    public /* synthetic */ u1(w1 w1Var, r4 r4Var, Bundle bundle, int i) {
        this.a = i;
        this.b = r4Var;
        this.c = bundle;
        this.d = w1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                w1 w1Var = this.d;
                w1Var.d.W();
                return w1Var.d.e0(this.c, this.b);
            default:
                w1 w1Var2 = this.d;
                w1Var2.d.W();
                return w1Var2.d.e0(this.c, this.b);
        }
    }
}
