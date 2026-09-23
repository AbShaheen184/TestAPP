package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 extends i1 {
    private static final x8 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private h8 zzg;

    static {
        x8 x8Var = new x8();
        zzh = x8Var;
        i1.p(x8.class, x8Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new x8();
        }
        if (i2 == 4) {
            return new k7(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (x8.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }
}
