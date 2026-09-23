package androidx.compose.material3;

import com.app.mlounge.emulator.LibretroCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p5 {
    public static final androidx.compose.runtime.d0 a = new androidx.compose.runtime.d0(new androidx.activity.compose.b(27));

    public static final void a(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f, float f2, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            rVar = androidx.compose.ui.o.b;
        }
        androidx.compose.ui.r rVar2 = rVar;
        if ((i2 & 2) != 0) {
            n0Var = androidx.compose.ui.graphics.a0.b;
        }
        androidx.compose.ui.graphics.n0 n0Var2 = n0Var;
        long jB = (i2 & 8) != 0 ? u0.b(j, sVar) : j2;
        float f3 = (i2 & 16) != 0 ? 0 : f;
        float f4 = (i2 & 32) != 0 ? 0 : f2;
        androidx.compose.runtime.d0 d0Var = a;
        float f5 = ((androidx.compose.ui.unit.f) sVar.j(d0Var)).e + f3;
        androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{a1.a.a(new androidx.compose.ui.graphics.t(jB)), d0Var.a(new androidx.compose.ui.unit.f(f5))}, androidx.compose.runtime.internal.k.c(421772006, new m5(rVar2, n0Var2, j, f5, null, f4, fVar), sVar), sVar, 56);
    }

    public static final void b(kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, androidx.compose.ui.graphics.n0 n0Var, long j, long j2, float f, androidx.compose.foundation.a0 a0Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.internal.f fVar, androidx.compose.runtime.s sVar, int i, int i2) {
        androidx.compose.foundation.interaction.k kVar2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? u0.b(j, sVar) : j2;
        float f2 = 0;
        float f3 = (i2 & 128) != 0 ? 0 : f;
        androidx.compose.foundation.a0 a0Var2 = (i2 & LibretroCore.SCREEN_WIDTH) != 0 ? null : a0Var;
        if (kVar == null) {
            sVar.b0(-1701037204);
            Object objQ = sVar.Q();
            if (objQ == androidx.compose.runtime.n.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar);
            }
            sVar.p(false);
            kVar2 = (androidx.compose.foundation.interaction.k) objQ;
        } else {
            sVar.b0(2023337163);
            sVar.p(false);
            kVar2 = kVar;
        }
        androidx.compose.runtime.d0 d0Var = a;
        float f4 = ((androidx.compose.ui.unit.f) sVar.j(d0Var)).e + f2;
        androidx.compose.runtime.t.b(new androidx.appcompat.widget.r[]{a1.a.a(new androidx.compose.ui.graphics.t(jB)), d0Var.a(new androidx.compose.ui.unit.f(f4))}, androidx.compose.runtime.internal.k.c(849208527, new n5(rVar, n0Var, j, f4, a0Var2, kVar2, z2, aVar, f3, fVar), sVar), sVar, 56);
    }

    public static final androidx.compose.ui.r c(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, androidx.compose.foundation.a0 a0Var, float f) {
        androidx.compose.ui.graphics.n0 n0Var2;
        androidx.compose.ui.r rVarP;
        androidx.compose.ui.r zVar = androidx.compose.ui.o.b;
        if (f > 0.0f) {
            n0Var2 = n0Var;
            rVarP = androidx.compose.ui.graphics.a0.p(zVar, 0.0f, 0.0f, 0.0f, f, n0Var2, 124895);
        } else {
            n0Var2 = n0Var;
            rVarP = zVar;
        }
        androidx.compose.ui.r rVarD = rVar.d(rVarP);
        if (a0Var != null) {
            zVar = new androidx.compose.foundation.z(a0Var.a, a0Var.b, n0Var2);
        }
        return androidx.compose.ui.draw.h.a(androidx.compose.foundation.s.f(rVarD.d(zVar), j, n0Var2), n0Var2);
    }

    public static final long d(long j, float f, androidx.compose.runtime.s sVar) {
        t0 t0Var = (t0) sVar.j(u0.a);
        boolean zBooleanValue = ((Boolean) sVar.j(u0.b)).booleanValue();
        long j2 = t0Var.p;
        if (androidx.compose.ui.graphics.t.c(j, j2) && zBooleanValue) {
            return androidx.compose.ui.unit.f.d(f, (float) 0) ? j2 : androidx.compose.ui.graphics.a0.j(androidx.compose.ui.graphics.t.b(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, t0Var.t), j2);
        }
        return j;
    }
}
