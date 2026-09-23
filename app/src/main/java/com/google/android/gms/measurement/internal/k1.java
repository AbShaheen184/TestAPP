package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends FutureTask implements Comparable {
    public final /* synthetic */ m1 A;
    public final long e;
    public final boolean y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Callable callable, boolean z) {
        super(callable);
        this.A = m1Var;
        long andIncrement = m1.H.getAndIncrement();
        this.e = andIncrement;
        this.z = "Task exception on worker thread";
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            u0 u0Var = ((p1) m1Var.e).C;
            p1.m(u0Var);
            u0Var.C.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k1 k1Var = (k1) obj;
        boolean z = k1Var.y;
        boolean z2 = this.y;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = k1Var.e;
        long j2 = this.e;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        u0 u0Var = ((p1) this.A.e).C;
        p1.m(u0Var);
        u0Var.D.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        u0 u0Var = ((p1) this.A.e).C;
        p1.m(u0Var);
        u0Var.C.b(th, this.z);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.A = m1Var;
        long andIncrement = m1.H.getAndIncrement();
        this.e = andIncrement;
        this.z = str;
        this.y = z;
        if (andIncrement == Long.MAX_VALUE) {
            u0 u0Var = ((p1) m1Var.e).C;
            p1.m(u0Var);
            u0Var.C.a("Tasks index overflow");
        }
    }
}
