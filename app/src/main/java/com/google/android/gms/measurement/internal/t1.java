package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ w1 e;

    public /* synthetic */ t1(w1 w1Var, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = w1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                w1 w1Var = this.e;
                w1Var.d.W();
                m mVar = w1Var.d.z;
                j4.U(mVar);
                return mVar.t0(this.b, this.c, this.d);
            case 1:
                w1 w1Var2 = this.e;
                w1Var2.d.W();
                m mVar2 = w1Var2.d.z;
                j4.U(mVar2);
                return mVar2.t0(this.b, this.c, this.d);
            case 2:
                w1 w1Var3 = this.e;
                w1Var3.d.W();
                m mVar3 = w1Var3.d.z;
                j4.U(mVar3);
                return mVar3.x0(this.b, this.c, this.d);
            default:
                w1 w1Var4 = this.e;
                w1Var4.d.W();
                m mVar4 = w1Var4.d.z;
                j4.U(mVar4);
                return mVar4.x0(this.b, this.c, this.d);
        }
    }
}
