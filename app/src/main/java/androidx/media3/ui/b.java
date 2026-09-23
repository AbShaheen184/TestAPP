package androidx.media3.ui;

import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int e = 0;
    public boolean y;
    public final /* synthetic */ Object z;

    public b(s2 s2Var, boolean z) {
        this.y = z;
        Objects.requireNonNull(s2Var);
        this.z = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.e) {
            case 0:
                this.y = false;
                int i = AspectRatioFrameLayout.A;
                break;
            default:
                s2 s2Var = (s2) this.z;
                p1 p1Var = (p1) s2Var.e;
                boolean zD = p1Var.d();
                boolean z2 = p1Var.V != null && p1Var.V.booleanValue();
                boolean z3 = this.y;
                p1Var.V = Boolean.valueOf(z3);
                if (z2 == z3) {
                    u0 u0Var = p1Var.C;
                    p1.m(u0Var);
                    u0Var.K.b(Boolean.valueOf(z3), "Default data collection state already set to");
                }
                if (p1Var.d() != zD) {
                    boolean zD2 = p1Var.d();
                    if (p1Var.V != null && p1Var.V.booleanValue()) {
                        z = true;
                    }
                    if (zD2 != z) {
                        u0 u0Var2 = p1Var.C;
                        p1.m(u0Var2);
                        u0Var2.H.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
                    }
                } else {
                    u0 u0Var3 = p1Var.C;
                    p1.m(u0Var3);
                    u0Var3.H.c(Boolean.valueOf(z3), Boolean.valueOf(zD), "Default data collection is different than actual status");
                }
                s2Var.N();
                break;
        }
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.z = aspectRatioFrameLayout;
    }
}
