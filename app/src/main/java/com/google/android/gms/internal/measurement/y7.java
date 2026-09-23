package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y7 extends i1 {
    private static final y7 zze;
    private static volatile h2 zzf;
    private r1 zzb = k2.B;

    static {
        y7 y7Var = new y7();
        zze = y7Var;
        i1.p(y7.class, y7Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new y7();
        }
        if (i2 == 4) {
            return new k7(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzf;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (y7.class) {
            try {
                h1Var = zzf;
                if (h1Var == null) {
                    h1Var = new h1(zze);
                    zzf = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }
}
