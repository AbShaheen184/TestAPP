package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 extends i1 {
    private static final p8 zze;
    private static volatile h2 zzf;
    private r1 zzb = k2.B;

    static {
        p8 p8Var = new p8();
        zze = p8Var;
        i1.p(p8.class, p8Var);
    }

    public static m8 v() {
        return (m8) zze.k();
    }

    public static p8 w() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", o8.class});
        }
        if (i2 == 3) {
            return new p8();
        }
        if (i2 == 4) {
            return new m8(zze);
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
        synchronized (p8.class) {
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

    public final List u() {
        return this.zzb;
    }

    public final void x(ArrayList arrayList) {
        r1 r1Var = this.zzb;
        if (!((n0) r1Var).e) {
            this.zzb = com.google.android.datatransport.runtime.a.p(r1Var);
        }
        m0.d(arrayList, this.zzb);
    }
}
