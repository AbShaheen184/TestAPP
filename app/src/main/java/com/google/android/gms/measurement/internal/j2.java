package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ s2 z;

    public j2(s2 s2Var, long j, int i) {
        this.e = i;
        switch (i) {
            case 1:
                this.y = j;
                this.z = s2Var;
                break;
            default:
                this.y = j;
                Objects.requireNonNull(s2Var);
                this.z = s2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                p1 p1Var = (p1) this.z.e;
                d1 d1Var = p1Var.B;
                p1.k(d1Var);
                androidx.media3.exoplayer.l1 l1Var = d1Var.H;
                long j = this.y;
                l1Var.h(j);
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                u0Var.J.b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                s2 s2Var = this.z;
                s2Var.v();
                s2Var.w();
                p1 p1Var2 = (p1) s2Var.e;
                u0 u0Var2 = p1Var2.C;
                p1.m(u0Var2);
                u0Var2.J.a("Resetting analytics data (FE)");
                u3 u3Var = p1Var2.E;
                p1.l(u3Var);
                u3Var.v();
                androidx.media3.exoplayer.source.r0 r0Var = u3Var.C;
                ((t3) r0Var.z).c();
                ((p1) ((u3) r0Var.A).e).H.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                r0Var.e = jElapsedRealtime;
                r0Var.y = jElapsedRealtime;
                p1Var2.r().A();
                boolean z = !p1Var2.d();
                d1 d1Var2 = p1Var2.B;
                p1.k(d1Var2);
                d1Var2.C.h(this.y);
                p1 p1Var3 = (p1) d1Var2.e;
                d1 d1Var3 = p1Var3.B;
                p1.k(d1Var3);
                if (!TextUtils.isEmpty(d1Var3.S.t())) {
                    d1Var2.S.v(null);
                }
                d1Var2.M.h(0L);
                d1Var2.N.h(0L);
                if (!p1Var3.A.J()) {
                    d1Var2.D(z);
                }
                d1Var2.T.v(null);
                d1Var2.U.h(0L);
                d1Var2.V.K(null);
                m3 m3VarP = p1Var2.p();
                m3VarP.v();
                m3VarP.w();
                r4 r4VarL = m3VarP.L(false);
                m3VarP.H();
                ((p1) m3VarP.e).o().z();
                m3VarP.J(new h3(m3VarP, r4VarL, 0));
                p1.l(u3Var);
                u3Var.B.O();
                s2Var.O = z;
                p1Var2.p().z(new AtomicReference());
                break;
        }
    }
}
