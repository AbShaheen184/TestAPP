package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i4 {
    public final j4 a;
    public int b = 1;
    public long c = a();

    public i4(j4 j4Var) {
        this.a = j4Var;
    }

    public final long a() {
        j4 j4Var = this.a;
        com.google.android.gms.common.internal.x.g(j4Var);
        long jLongValue = ((Long) f0.v.a(null)).longValue();
        long jLongValue2 = ((Long) f0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        j4Var.c().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
