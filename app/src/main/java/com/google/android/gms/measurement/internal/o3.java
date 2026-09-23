package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends e4 {
    public final HashMap A;
    public final androidx.media3.exoplayer.l1 B;
    public final androidx.media3.exoplayer.l1 C;
    public final androidx.media3.exoplayer.l1 D;
    public final androidx.media3.exoplayer.l1 E;
    public final androidx.media3.exoplayer.l1 F;
    public final androidx.media3.exoplayer.l1 G;

    public o3(j4 j4Var) {
        super(j4Var);
        this.A = new HashMap();
        d1 d1Var = ((p1) this.e).B;
        p1.k(d1Var);
        this.B = new androidx.media3.exoplayer.l1(d1Var, "last_delete_stale", 0L);
        d1 d1Var2 = ((p1) this.e).B;
        p1.k(d1Var2);
        this.C = new androidx.media3.exoplayer.l1(d1Var2, "last_delete_stale_batch", 0L);
        d1 d1Var3 = ((p1) this.e).B;
        p1.k(d1Var3);
        this.D = new androidx.media3.exoplayer.l1(d1Var3, "backoff", 0L);
        d1 d1Var4 = ((p1) this.e).B;
        p1.k(d1Var4);
        this.E = new androidx.media3.exoplayer.l1(d1Var4, "last_upload", 0L);
        d1 d1Var5 = ((p1) this.e).B;
        p1.k(d1Var5);
        this.F = new androidx.media3.exoplayer.l1(d1Var5, "last_upload_attempt", 0L);
        d1 d1Var6 = ((p1) this.e).B;
        p1.k(d1Var6);
        this.G = new androidx.media3.exoplayer.l1(d1Var6, "midnight_offset", 0L);
    }

    public final Pair A(String str) {
        n3 n3Var;
        androidx.room.v vVarA;
        v();
        p1 p1Var = (p1) this.e;
        com.google.android.gms.common.util.a aVar = p1Var.H;
        g gVar = p1Var.A;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.A;
        n3 n3Var2 = (n3) map.get(str);
        if (n3Var2 != null && jElapsedRealtime < n3Var2.c) {
            return new Pair(n3Var2.a, Boolean.valueOf(n3Var2.b));
        }
        long jD = gVar.D(str, f0.b) + jElapsedRealtime;
        try {
            try {
                vVarA = com.google.android.gms.ads.identifier.a.a(p1Var.e);
            } catch (PackageManager.NameNotFoundException unused) {
                if (n3Var2 != null && jElapsedRealtime < n3Var2.c + gVar.D(str, f0.c)) {
                    return new Pair(n3Var2.a, Boolean.valueOf(n3Var2.b));
                }
                vVarA = null;
            }
            if (vVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = vVarA.b;
            n3Var = str2 != null ? new n3(str2, jD, vVarA.c) : new n3("", jD, vVarA.c);
            map.put(str, n3Var);
            return new Pair(n3Var.a, Boolean.valueOf(n3Var.b));
        } catch (Exception e) {
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.J.b(e, "Unable to get advertising id");
            n3Var = new n3("", jD, false);
        }
    }

    public final String B(r4 r4Var, c2 c2Var) {
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        if (!c2Var.i(b2.AD_STORAGE) || !r4Var.K) {
            return "";
        }
        v();
        String str2 = (String) A(str).first;
        MessageDigest messageDigestO = p4.O();
        if (messageDigestO == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestO.digest(str2.getBytes())));
    }

    public final Pair z(r4 r4Var, c2 c2Var) {
        String str = r4Var.e;
        com.google.android.gms.common.internal.x.d(str);
        return (c2Var.i(b2.AD_STORAGE) && r4Var.K) ? A(str) : new Pair("", Boolean.FALSE);
    }

    @Override // com.google.android.gms.measurement.internal.e4
    public final void y() {
    }
}
