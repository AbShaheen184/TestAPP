package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ u3 z;

    public r3(u3 u3Var, long j, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = j;
                Objects.requireNonNull(u3Var);
                this.z = u3Var;
                break;
            default:
                this.y = j;
                Objects.requireNonNull(u3Var);
                this.z = u3Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                u3 u3Var = this.z;
                androidx.media3.exoplayer.source.r0 r0Var = u3Var.C;
                u3Var.v();
                u3Var.z();
                p1 p1Var = (p1) u3Var.e;
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                s0 s0Var = u0Var.K;
                long j = this.y;
                s0Var.b(Long.valueOf(j), "Activity resumed, time");
                g gVar = p1Var.A;
                if (gVar.G(null, f0.S0)) {
                    if (gVar.K() || u3Var.A) {
                        ((u3) r0Var.A).v();
                        ((t3) r0Var.z).c();
                        r0Var.e = j;
                        r0Var.y = j;
                    }
                } else if (gVar.K()) {
                    ((u3) r0Var.A).v();
                    ((t3) r0Var.z).c();
                    r0Var.e = j;
                    r0Var.y = j;
                } else {
                    d1 d1Var = p1Var.B;
                    p1.k(d1Var);
                    if (d1Var.P.a()) {
                        ((u3) r0Var.A).v();
                        ((t3) r0Var.z).c();
                        r0Var.e = j;
                        r0Var.y = j;
                    }
                }
                androidx.work.impl.k kVar = u3Var.D;
                u3 u3Var2 = (u3) kVar.z;
                u3Var2.v();
                s3 s3Var = (s3) kVar.y;
                if (s3Var != null) {
                    u3Var2.z.removeCallbacks(s3Var);
                }
                d1 d1Var2 = ((p1) u3Var2.e).B;
                p1.k(d1Var2);
                d1Var2.P.b(false);
                u3Var2.v();
                u3Var2.A = false;
                androidx.media3.exoplayer.dash.manifest.t tVar = u3Var.B;
                u3 u3Var3 = (u3) tVar.e;
                u3Var3.v();
                p1 p1Var2 = (p1) u3Var3.e;
                boolean zD = p1Var2.d();
                com.google.android.gms.common.util.a aVar = p1Var2.H;
                if (zD) {
                    aVar.getClass();
                    tVar.P(System.currentTimeMillis(), p1Var2.A.G(null, f0.e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                u3 u3Var4 = this.z;
                u3Var4.v();
                u3Var4.z();
                p1 p1Var3 = (p1) u3Var4.e;
                u0 u0Var2 = p1Var3.C;
                p1.m(u0Var2);
                s0 s0Var2 = u0Var2.K;
                long j2 = this.y;
                s0Var2.b(Long.valueOf(j2), "Activity paused, time");
                androidx.work.impl.k kVar2 = u3Var4.D;
                u3 u3Var5 = (u3) kVar2.z;
                ((p1) u3Var5.e).H.getClass();
                s3 s3Var2 = new s3(kVar2, System.currentTimeMillis(), j2);
                kVar2.y = s3Var2;
                u3Var5.z.postDelayed(s3Var2, 2000L);
                if (p1Var3.A.K()) {
                    ((t3) u3Var4.C.z).c();
                }
                break;
        }
    }
}
