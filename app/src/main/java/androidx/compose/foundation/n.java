package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final androidx.compose.ui.unit.c a;
    public long b = 9205357640488583168L;
    public final q0 c;
    public final androidx.compose.runtime.j1 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final androidx.compose.ui.node.k i;

    public n(Context context, androidx.compose.ui.unit.c cVar, long j, androidx.compose.foundation.layout.z0 z0Var) {
        this.a = cVar;
        q0 q0Var = new q0(context, androidx.compose.ui.graphics.a0.y(j));
        this.c = q0Var;
        this.d = new androidx.compose.runtime.j1(kotlin.y.a, androidx.compose.runtime.f.A);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        m mVar = new m(this, 0);
        androidx.compose.ui.input.pointer.m mVar2 = androidx.compose.ui.input.pointer.h0.a;
        androidx.compose.ui.input.pointer.l0 l0Var = new androidx.compose.ui.input.pointer.l0(null, null, mVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new h2(l0Var, this, q0Var) : new x0(l0Var, this, q0Var, z0Var);
    }

    public final void a() {
        boolean z;
        q0 q0Var = this.c;
        EdgeEffect edgeEffect = q0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = q0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = q0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = q0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (r4 == r6) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r19, com.app.mlounge.ui.screens.player.y0 r21, kotlin.coroutines.jvm.internal.c r22) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.n.b(long, com.app.mlounge.ui.screens.player.y0, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final long c() {
        long jR = this.b;
        if ((9223372034707292159L & jR) == 9205357640488583168L) {
            jR = _COROUTINE.b.r(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(kotlin.y.a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = q.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i2 >= 31 ? q.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1 - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = q.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? q.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fC = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fC = q.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i2 >= 31 ? q.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = q.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? q.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean zA = androidx.compose.ui.geometry.e.a(this.g, 0L);
        boolean zA2 = androidx.compose.ui.geometry.e.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iH = kotlin.math.a.H(Float.intBitsToFloat((int) (j >> 32)));
            long jH = (((long) kotlin.math.a.H(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iH) << 32);
            q0 q0Var = this.c;
            q0Var.c = jH;
            EdgeEffect edgeEffect = q0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect2 = q0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect3 = q0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect4 = q0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect5 = q0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect6 = q0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect7 = q0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect8 = q0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jH), (int) (jH >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
