package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.l6;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends h0 {
    public volatile a3 A;
    public a3 B;
    public final ConcurrentHashMap C;
    public l6 D;
    public volatile boolean E;
    public volatile a3 F;
    public a3 G;
    public boolean H;
    public final Object I;
    public volatile a3 z;

    public d3(p1 p1Var) {
        super(p1Var);
        this.I = new Object();
        this.C = new ConcurrentHashMap();
    }

    public final String A(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        p1 p1Var = (p1) this.e;
        int length2 = str2.length();
        p1Var.A.getClass();
        if (length2 <= 500) {
            return str2;
        }
        p1Var.A.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void B(a3 a3Var, a3 a3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = a3Var.e;
        p1 p1Var = (p1) this.e;
        v();
        boolean z4 = false;
        if (a3Var2 != null) {
            if (a3Var2.c == a3Var.c && Objects.equals(a3Var2.b, a3Var.b) && Objects.equals(a3Var2.a, a3Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.B != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            p4.s0(a3Var, bundle3, true);
            if (a3Var2 != null) {
                String str = a3Var2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = a3Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", a3Var2.c);
            }
            if (z4) {
                u3 u3Var = p1Var.E;
                p1.l(u3Var);
                androidx.media3.exoplayer.source.r0 r0Var = u3Var.C;
                long j3 = j - r0Var.y;
                r0Var.y = j;
                if (j3 > 0) {
                    p4 p4Var = p1Var.F;
                    p1.k(p4Var);
                    p4Var.i0(bundle3, j3);
                }
            }
            g gVar = p1Var.A;
            com.google.android.gms.common.util.a aVar = p1Var.H;
            if (!gVar.K()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "app";
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = a3Var.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = p1Var.A.G(null, f0.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = a3Var.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            s2 s2Var = p1Var.J;
            p1.l(s2Var);
            s2Var.D(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            E(this.B, true, j);
        }
        this.B = a3Var;
        if (z3) {
            this.G = a3Var;
        }
        m3 m3VarP = p1Var.p();
        m3VarP.v();
        m3VarP.w();
        m3VarP.J(new com.google.common.util.concurrent.k0(m3VarP, a3Var));
    }

    public final void C(l6 l6Var, Bundle bundle) {
        Bundle bundle2;
        if (!((p1) this.e).A.K() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.C.put(Integer.valueOf(l6Var.e), new a3(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void D(String str, a3 a3Var, boolean z) {
        a3 a3Var2;
        a3 a3Var3 = this.z == null ? this.A : this.z;
        if (a3Var.b == null) {
            a3Var2 = new a3(a3Var.a, str != null ? A(str) : null, a3Var.c, a3Var.e, a3Var.f, a3Var.g);
        } else {
            a3Var2 = a3Var;
        }
        this.A = this.z;
        this.z = a3Var2;
        p1 p1Var = (p1) this.e;
        p1Var.H.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m1 m1Var = p1Var.D;
        p1.m(m1Var);
        m1Var.E(new b3(this, a3Var2, a3Var3, jElapsedRealtime, z));
    }

    public final void E(a3 a3Var, boolean z, long j) {
        p1 p1Var = (p1) this.e;
        c0 c0Var = p1Var.K;
        p1.j(c0Var);
        p1Var.H.getClass();
        c0Var.y(SystemClock.elapsedRealtime());
        boolean z2 = a3Var != null && a3Var.d;
        u3 u3Var = p1Var.E;
        p1.l(u3Var);
        if (!u3Var.C.g(j, z2, z) || a3Var == null) {
            return;
        }
        a3Var.d = false;
    }

    public final a3 F(l6 l6Var) {
        com.google.android.gms.common.internal.x.g(l6Var);
        Integer numValueOf = Integer.valueOf(l6Var.e);
        ConcurrentHashMap concurrentHashMap = this.C;
        a3 a3Var = (a3) concurrentHashMap.get(numValueOf);
        if (a3Var == null) {
            String strA = A(l6Var.y);
            p4 p4Var = ((p1) this.e).F;
            p1.k(p4Var);
            a3 a3Var2 = new a3(p4Var.u0(), null, strA);
            concurrentHashMap.put(numValueOf, a3Var2);
            a3Var = a3Var2;
        }
        return this.F != null ? this.F : a3Var;
    }

    @Override // com.google.android.gms.measurement.internal.h0
    public final boolean y() {
        return false;
    }

    public final a3 z(boolean z) {
        w();
        v();
        a3 a3Var = this.B;
        return (z && a3Var == null) ? this.G : a3Var;
    }
}
