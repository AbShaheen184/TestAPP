package androidx.media3.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.media3.common.o0, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ v e;

    public k(v vVar) {
        this.e = vVar;
    }

    @Override // androidx.media3.common.o0
    public final void d(androidx.media3.common.n0 n0Var) {
        boolean zA = n0Var.a(4, 5, 13);
        v vVar = this.e;
        if (zA) {
            vVar.q();
        }
        if (n0Var.a(4, 5, 7, 13)) {
            vVar.s();
        }
        if (n0Var.a(8, 13)) {
            vVar.t();
        }
        if (n0Var.a(9, 13)) {
            vVar.v();
        }
        if (n0Var.a(8, 9, 11, 0, 16, 17, 13)) {
            vVar.p();
        }
        if (n0Var.a(11, 0, 13)) {
            vVar.w();
        }
        if (n0Var.a(12, 13)) {
            vVar.r();
        }
        if (n0Var.a(2, 13)) {
            vVar.x();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVar = this.e;
        ImageView imageView = vVar.d0;
        View view2 = vVar.i0;
        View view3 = vVar.h0;
        View view4 = vVar.g0;
        a0 a0Var = vVar.e;
        androidx.media3.common.q0 q0Var = vVar.N0;
        if (q0Var == null) {
            return;
        }
        a0Var.g();
        if (vVar.R == view) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var.u(9)) {
                c0Var.H();
                return;
            }
            return;
        }
        if (vVar.Q == view) {
            androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var2.u(7)) {
                c0Var2.I();
                return;
            }
            return;
        }
        if (vVar.T == view) {
            androidx.media3.exoplayer.c0 c0Var3 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var3.q() == 4 || !c0Var3.u(12)) {
                return;
            }
            c0Var3.V();
            long j = c0Var3.j() + c0Var3.k0;
            long jO = c0Var3.o();
            if (jO != -9223372036854775807L) {
                j = Math.min(j, jO);
            }
            c0Var3.G(Math.max(j, 0L));
            return;
        }
        if (vVar.U == view) {
            androidx.media3.exoplayer.c0 c0Var4 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var4.u(11)) {
                c0Var4.V();
                long j2 = c0Var4.j() + (-c0Var4.j0);
                long jO2 = c0Var4.o();
                if (jO2 != -9223372036854775807L) {
                    j2 = Math.min(j2, jO2);
                }
                c0Var4.G(Math.max(j2, 0L));
                return;
            }
            return;
        }
        if (vVar.S == view) {
            if (androidx.media3.common.util.i0.a0(q0Var, vVar.R0)) {
                androidx.media3.common.util.i0.I(q0Var);
                return;
            }
            androidx.media3.exoplayer.c0 c0Var5 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var5.u(1)) {
                c0Var5.M(false);
                return;
            }
            return;
        }
        if (vVar.a0 == view) {
            androidx.media3.exoplayer.c0 c0Var6 = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var6.u(15)) {
                c0Var6.V();
                int i = c0Var6.G;
                int i2 = vVar.X0;
                for (int i3 = 1; i3 <= 2; i3++) {
                    int i4 = (i + i3) % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 || (i2 & 2) == 0) {
                            }
                        } else if ((i2 & 1) == 0) {
                        }
                    }
                    i = i4;
                }
                c0Var6.N(i);
                return;
            }
            return;
        }
        if (vVar.b0 != view) {
            if (view4 == view) {
                a0Var.f();
                vVar.e(vVar.J, view4);
                return;
            }
            if (view3 == view) {
                a0Var.f();
                vVar.e(vVar.K, view3);
                return;
            } else if (view2 == view) {
                a0Var.f();
                vVar.e(vVar.M, view2);
                return;
            } else {
                if (imageView == view) {
                    a0Var.f();
                    vVar.e(vVar.L, imageView);
                    return;
                }
                return;
            }
        }
        androidx.media3.exoplayer.c0 c0Var7 = (androidx.media3.exoplayer.c0) q0Var;
        if (c0Var7.u(14)) {
            c0Var7.V();
            boolean z = !c0Var7.H;
            androidx.media3.common.util.o oVar = c0Var7.m;
            c0Var7.V();
            if (c0Var7.H != z) {
                c0Var7.H = z;
                androidx.media3.common.util.f0 f0Var = c0Var7.l.E;
                f0Var.getClass();
                androidx.media3.common.util.e0 e0VarC = androidx.media3.common.util.f0.c();
                e0VarC.a = f0Var.a.obtainMessage(12, z ? 1 : 0, 0);
                e0VarC.b();
                oVar.c(9, new androidx.media3.exoplayer.s(0, z));
                c0Var7.R();
                oVar.b();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        v vVar = this.e;
        if (vVar.d1) {
            vVar.e.g();
        }
    }
}
