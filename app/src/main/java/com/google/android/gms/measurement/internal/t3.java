package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Object obj, y1 y1Var, int i) {
        super(y1Var);
        this.e = i;
        this.f = obj;
    }

    @Override // com.google.android.gms.measurement.internal.n
    public final void a() {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.source.r0 r0Var = (androidx.media3.exoplayer.source.r0) this.f;
                u3 u3Var = (u3) r0Var.A;
                u3Var.v();
                p1 p1Var = (p1) u3Var.e;
                p1Var.H.getClass();
                r0Var.g(SystemClock.elapsedRealtime(), false, false);
                c0 c0Var = p1Var.K;
                p1.j(c0Var);
                p1Var.H.getClass();
                c0Var.y(SystemClock.elapsedRealtime());
                break;
            case 1:
                z3 z3Var = (z3) this.f;
                z3Var.A();
                u0 u0Var = ((p1) z3Var.e).C;
                p1.m(u0Var);
                u0Var.K.a("Starting upload from DelayedRunnable");
                z3Var.y.q();
                break;
            default:
                j4 j4Var = (j4) this.f;
                j4Var.e().v();
                String str = (String) j4Var.N.pollFirst();
                if (str != null) {
                    j4Var.c().getClass();
                    j4Var.f0 = SystemClock.elapsedRealtime();
                    j4Var.b().K.b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    j4.S(j4Var.I.e, intent);
                }
                j4Var.H();
                break;
        }
    }
}
