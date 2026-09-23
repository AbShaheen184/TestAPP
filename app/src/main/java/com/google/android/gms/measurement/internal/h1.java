package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.y9;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1(i1 i1Var) {
        this.b = i1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return new y9(((i1) this.b).I);
            default:
                w1 w1Var = (w1) this.b;
                w1Var.d.W();
                y0 y0Var = w1Var.d.E;
                j4.U(y0Var);
                y0Var.v();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public h1(w1 w1Var, u uVar, String str) {
        this.b = w1Var;
    }
}
