package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke implements com.google.common.util.concurrent.z {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xc b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ ke(xc xcVar, int i, ArrayList arrayList) {
        this.b = xcVar;
        this.d = i;
        this.c = arrayList;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.d;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) com.google.common.util.concurrent.m0.b((Future) this.c.get(i2))).booleanValue()) {
                        ((List) this.b.b).get(i2).getClass();
                        androidx.transition.k.h();
                        return null;
                    }
                }
                com.google.common.collect.h0 h0VarM = com.google.common.collect.h0.m(arrayList);
                com.google.common.util.concurrent.a0 a0Var = new com.google.common.util.concurrent.a0();
                com.google.common.util.concurrent.c0 c0Var = new com.google.common.util.concurrent.c0(h0VarM, true);
                c0Var.K = new com.google.common.util.concurrent.b0(c0Var, a0Var);
                c0Var.s();
                return c0Var;
            default:
                ArrayList arrayList2 = this.c;
                com.google.common.collect.h0 h0VarM2 = com.google.common.collect.h0.m(arrayList2);
                com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
                xc xcVar = this.b;
                nVar.y = xcVar;
                nVar.z = (m0) obj;
                nVar.e = this.d;
                nVar.A = arrayList2;
                j5 j5VarA = rf.a(nVar);
                Executor executor = (Executor) xcVar.c;
                com.google.common.util.concurrent.c0 c0Var2 = new com.google.common.util.concurrent.c0(h0VarM2, false);
                c0Var2.K = new com.google.common.util.concurrent.b0(c0Var2, j5VarA, executor);
                c0Var2.s();
                return c0Var2;
        }
    }

    public /* synthetic */ ke(xc xcVar, ArrayList arrayList, int i) {
        this.b = xcVar;
        this.c = arrayList;
        this.d = i;
    }
}
