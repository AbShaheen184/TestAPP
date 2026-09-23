package androidx.activity.compose;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.activity.d0;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.n1;
import androidx.compose.foundation.gestures.r2;
import androidx.compose.foundation.gestures.u1;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.text.i1;
import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.foundation.text.selection.j0;
import androidx.compose.foundation.text.selection.q0;
import androidx.compose.foundation.text.t0;
import androidx.compose.foundation.x;
import androidx.compose.material3.h3;
import androidx.compose.material3.j6;
import androidx.compose.material3.u2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.g1;
import androidx.compose.runtime.y1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.g0;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.platform.m0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ g(g gVar, androidx.compose.foundation.c cVar) {
        this.e = 20;
        this.y = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:237:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:250:0x0614  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.ui.graphics.m mVar;
        int i;
        c0 c0Var;
        c0 c0Var2;
        boolean z;
        long j;
        androidx.compose.ui.graphics.drawscope.b bVar;
        c2 c2Var;
        float f;
        float f2;
        long jG;
        boolean z2;
        androidx.compose.foundation.lazy.s sVar;
        androidx.compose.foundation.lazy.grid.n nVar;
        boolean z3;
        r0 r0Var;
        switch (this.e) {
            case 0:
                m mVar2 = (m) this.y;
                ((d0) mVar2.a).e(true);
                ((androidx.activity.compose.internal.a) mVar2.b).f(true);
                return new j((androidx.lifecycle.compose.b) obj, mVar2, 0);
            case 1:
                androidx.compose.animation.core.l lVar = (androidx.compose.animation.core.l) obj;
                ((kotlin.jvm.functions.p) this.y).invoke(lVar.e.getValue(), androidx.compose.animation.core.e.j.b.invoke(lVar.f));
                return y.a;
            case 2:
                androidx.compose.foundation.y yVar = (androidx.compose.foundation.y) this.y;
                androidx.compose.ui.draw.d dVar = (androidx.compose.ui.draw.d) obj;
                if (dVar.a() * yVar.O < 0.0f || androidx.compose.ui.geometry.e.c(dVar.e.d()) <= 0.0f) {
                    return dVar.b(new n1(21));
                }
                float f3 = 2;
                final float fMin = Math.min(androidx.compose.ui.unit.f.d(yVar.O, 0.0f) ? 1.0f : (float) Math.ceil(dVar.a() * yVar.O), (float) Math.ceil(androidx.compose.ui.geometry.e.c(dVar.e.d()) / f3));
                final float f4 = fMin / f3;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e.d() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e.d() >> 32)) - fMin)) << 32);
                float f5 = fMin * f3;
                boolean z4 = f5 > androidx.compose.ui.geometry.e.c(dVar.e.d());
                a0 a0VarA = yVar.Q.a(dVar.e.d(), dVar.e.getLayoutDirection(), dVar);
                if (!(a0VarA instanceof g0)) {
                    if (!(a0VarA instanceof i0)) {
                        boolean z5 = z4;
                        if (!(a0VarA instanceof h0)) {
                            coil3.g.a();
                            return null;
                        }
                        final p0 p0Var = yVar.P;
                        final long j2 = z5 ? 0L : jFloatToRawIntBits;
                        final long jD = z5 ? dVar.e.d() : jFloatToRawIntBits2;
                        final androidx.compose.ui.graphics.drawscope.e hVar = z5 ? androidx.compose.ui.graphics.drawscope.g.a : new androidx.compose.ui.graphics.drawscope.h(fMin, 0.0f, 0, 0, 30);
                        return dVar.b(new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.v
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) {
                                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj2;
                                h0Var.b();
                                androidx.compose.ui.graphics.drawscope.d.Z(h0Var, p0Var, j2, jD, 0.0f, hVar, Token.ASSIGN_LOGICAL_AND);
                                return kotlin.y.a;
                            }
                        });
                    }
                    final p0 p0Var2 = yVar.P;
                    androidx.compose.ui.geometry.d dVar2 = ((i0) a0VarA).f;
                    if (_COROUTINE.a.W(dVar2)) {
                        final long j3 = dVar2.e;
                        final androidx.compose.ui.graphics.drawscope.h hVar2 = new androidx.compose.ui.graphics.drawscope.h(fMin, 0.0f, 0, 0, 30);
                        final boolean z6 = z4;
                        return dVar.b(new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.w
                            @Override // kotlin.jvm.functions.l
                            public final Object invoke(Object obj2) throws Throwable {
                                androidx.appcompat.widget.c2 c2Var2;
                                long j4;
                                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj2;
                                h0Var.b();
                                androidx.compose.ui.graphics.drawscope.b bVar2 = h0Var.e;
                                boolean z7 = z6;
                                androidx.compose.ui.graphics.p pVar = p0Var2;
                                long j5 = j3;
                                if (z7) {
                                    androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, 0L, 0L, j5, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar2.d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) - f7;
                                        androidx.appcompat.widget.c2 c2Var3 = bVar2.y;
                                        long jG2 = c2Var3.G();
                                        c2Var3.v().f();
                                        try {
                                            ((androidx.appcompat.widget.c2) ((com.google.firebase.platforminfo.d) c2Var3.y).e).v().o(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j4 = jG2;
                                            c2Var2 = c2Var3;
                                            try {
                                                androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, 0L, 0L, j5, null, 246);
                                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var2, j4);
                                            } catch (Throwable th) {
                                                th = th;
                                                androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var2, j4);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c2Var2 = c2Var3;
                                            j4 = jG2;
                                        }
                                    } else {
                                        androidx.compose.ui.graphics.drawscope.d.z(h0Var, pVar, jFloatToRawIntBits, jFloatToRawIntBits2, s.s(f6, j5), hVar2, 208);
                                    }
                                }
                                return kotlin.y.a;
                            }
                        });
                    }
                    boolean z7 = z4;
                    if (yVar.N == null) {
                        yVar.N = new androidx.compose.foundation.u();
                    }
                    androidx.compose.foundation.u uVar = yVar.N;
                    uVar.getClass();
                    androidx.compose.ui.graphics.j jVarA = uVar.d;
                    if (jVarA == null) {
                        jVarA = androidx.compose.ui.graphics.l.a();
                        uVar.d = jVarA;
                    }
                    jVarA.e();
                    androidx.compose.ui.graphics.j.b(jVarA, dVar2);
                    if (!z7) {
                        androidx.compose.ui.graphics.j jVarA2 = androidx.compose.ui.graphics.l.a();
                        androidx.compose.ui.graphics.j.b(jVarA2, new androidx.compose.ui.geometry.d(fMin, fMin, (dVar2.c - dVar2.a) - fMin, (dVar2.d - dVar2.b) - fMin, androidx.compose.foundation.s.s(fMin, dVar2.e), androidx.compose.foundation.s.s(fMin, dVar2.f), androidx.compose.foundation.s.s(fMin, dVar2.g), androidx.compose.foundation.s.s(fMin, dVar2.h)));
                        jVarA.d(jVarA, jVarA2, 0);
                    }
                    return dVar.b(new h(8, jVarA, p0Var2));
                }
                p0 p0Var3 = yVar.P;
                g0 g0Var = (g0) a0VarA;
                androidx.compose.ui.graphics.j jVar = g0Var.f;
                if (z4) {
                    return dVar.b(new h(9, g0Var, p0Var3));
                }
                if (p0Var3 != null) {
                    mVar = new androidx.compose.ui.graphics.m(androidx.compose.ui.graphics.t.b(1.0f, p0Var3.a), 5);
                    i = 1;
                } else {
                    mVar = null;
                    i = 0;
                }
                androidx.compose.ui.geometry.c cVarC = jVar.c();
                float f6 = cVarC.b;
                float f7 = cVarC.a;
                if (yVar.N == null) {
                    yVar.N = new androidx.compose.foundation.u();
                }
                androidx.compose.foundation.u uVar2 = yVar.N;
                uVar2.getClass();
                androidx.compose.ui.graphics.j jVarA3 = uVar2.d;
                if (jVarA3 == null) {
                    jVarA3 = androidx.compose.ui.graphics.l.a();
                    uVar2.d = jVarA3;
                }
                jVarA3.e();
                jVarA3.getClass();
                float f8 = cVarC.a;
                float f9 = cVarC.d;
                float f10 = cVarC.c;
                float f11 = cVarC.b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    androidx.compose.ui.graphics.l.b("Invalid rectangle, make sure no value is NaN");
                }
                if (jVarA3.b == null) {
                    jVarA3.b = new RectF();
                }
                RectF rectF = jVarA3.b;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = jVarA3.a;
                RectF rectF2 = jVarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                jVarA3.d(jVarA3, jVar, 0);
                z zVar = new z();
                long jCeil = (((long) ((int) Math.ceil(cVarC.d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(cVarC.c - f7))) << 32);
                androidx.compose.foundation.u uVar3 = yVar.N;
                uVar3.getClass();
                androidx.compose.ui.graphics.g gVarF = uVar3.a;
                androidx.compose.ui.graphics.c cVarA = uVar3.b;
                if (gVarF != null) {
                    Bitmap.Config config = gVarF.a.getConfig();
                    config.getClass();
                    c0Var = new c0(androidx.compose.ui.graphics.h.d(config));
                } else {
                    c0Var = null;
                }
                if (c0Var != null && c0Var.a == 0) {
                    z = true;
                } else {
                    if (gVarF != null) {
                        Bitmap.Config config2 = gVarF.a.getConfig();
                        config2.getClass();
                        c0Var2 = new c0(androidx.compose.ui.graphics.h.d(config2));
                    } else {
                        c0Var2 = null;
                    }
                    if (c0Var2 != null && i == c0Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (gVarF != null && cVarA != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e.d() >> 32));
                            Bitmap bitmap = gVarF.a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (dVar.e.d() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            bVar = uVar3.c;
                            if (bVar == null) {
                                bVar = new androidx.compose.ui.graphics.drawscope.b();
                                uVar3.c = bVar;
                            }
                            c2Var = bVar.y;
                            androidx.compose.ui.graphics.drawscope.a aVar = bVar.e;
                            androidx.compose.ui.graphics.j jVar2 = jVarA3;
                            long jF = coil3.network.g.F(j);
                            androidx.compose.ui.unit.m layoutDirection = dVar.e.getLayoutDirection();
                            androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
                            androidx.compose.ui.unit.c cVar = aVar.a;
                            androidx.compose.ui.unit.m mVar3 = aVar.b;
                            androidx.compose.ui.graphics.r rVar = aVar.c;
                            long j4 = aVar.d;
                            aVar.a = dVar;
                            aVar.b = layoutDirection;
                            aVar.c = cVarA;
                            aVar.d = jF;
                            cVarA.f();
                            androidx.compose.ui.graphics.drawscope.d.G(bVar2, androidx.compose.ui.graphics.t.b, 0L, jF, 0.0f, 58);
                            f = -f7;
                            f2 = -f6;
                            ((com.google.firebase.platforminfo.d) c2Var.y).r(f, f2);
                            androidx.compose.ui.graphics.drawscope.d.C(bVar2, g0Var.f, p0Var3, 0.0f, new androidx.compose.ui.graphics.drawscope.h(f5, 0.0f, 0, 0, 30), 52);
                            float f12 = 1;
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (bVar2.d() >> 32)) + f12) / Float.intBitsToFloat((int) (bVar2.d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) + f12) / Float.intBitsToFloat((int) (bVar2.d() & 4294967295L));
                            long jK0 = bVar2.k0();
                            androidx.compose.ui.graphics.g gVar = gVarF;
                            androidx.compose.ui.graphics.c cVar2 = cVarA;
                            jG = c2Var.G();
                            c2Var.v().f();
                            ((com.google.firebase.platforminfo.d) c2Var.y).n(fIntBitsToFloat2, fIntBitsToFloat3, jK0);
                            androidx.compose.ui.graphics.drawscope.d.C(bVar2, jVar2, p0Var3, 0.0f, null, 28);
                            c2Var.v().q();
                            c2Var.b0(jG);
                            ((com.google.firebase.platforminfo.d) c2Var.y).r(-f, -f2);
                            cVar2.q();
                            aVar.a = cVar;
                            aVar.b = mVar3;
                            aVar.c = rVar;
                            aVar.d = j4;
                            gVar.a.prepareToDraw();
                            zVar.e = gVar;
                            return dVar.b(new x(cVarC, zVar, j, mVar));
                        }
                        j = jCeil;
                        ((com.google.firebase.platforminfo.d) c2Var.y).n(fIntBitsToFloat2, fIntBitsToFloat3, jK0);
                        androidx.compose.ui.graphics.drawscope.d.C(bVar2, jVar2, p0Var3, 0.0f, null, 28);
                        c2Var.v().q();
                        c2Var.b0(jG);
                        ((com.google.firebase.platforminfo.d) c2Var.y).r(-f, -f2);
                        cVar2.q();
                        aVar.a = cVar;
                        aVar.b = mVar3;
                        aVar.c = rVar;
                        aVar.d = j4;
                        gVar.a.prepareToDraw();
                        zVar.e = gVar;
                        return dVar.b(new x(cVarC, zVar, j, mVar));
                    } catch (Throwable th) {
                        c2Var.v().q();
                        c2Var.b0(jG);
                        throw th;
                    }
                    androidx.compose.ui.graphics.drawscope.d.C(bVar2, g0Var.f, p0Var3, 0.0f, new androidx.compose.ui.graphics.drawscope.h(f5, 0.0f, 0, 0, 30), 52);
                    float f13 = 1;
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (bVar2.d() >> 32)) + f13) / Float.intBitsToFloat((int) (bVar2.d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (bVar2.d() & 4294967295L)) + f13) / Float.intBitsToFloat((int) (bVar2.d() & 4294967295L));
                    long jK1 = bVar2.k0();
                    androidx.compose.ui.graphics.g gVar2 = gVarF;
                    androidx.compose.ui.graphics.c cVar3 = cVarA;
                    jG = c2Var.G();
                    c2Var.v().f();
                } catch (Throwable th2) {
                    ((com.google.firebase.platforminfo.d) c2Var.y).r(-f, -f2);
                    throw th2;
                }
                gVarF = a0.f((int) (j >> 32), (int) (j & 4294967295L), i);
                uVar3.a = gVarF;
                cVarA = a0.a(gVarF);
                uVar3.b = cVarA;
                bVar = uVar3.c;
                if (bVar == null) {
                    bVar = new androidx.compose.ui.graphics.drawscope.b();
                    uVar3.c = bVar;
                }
                c2Var = bVar.y;
                androidx.compose.ui.graphics.drawscope.a aVar2 = bVar.e;
                androidx.compose.ui.graphics.j jVar3 = jVarA3;
                long jF2 = coil3.network.g.F(j);
                androidx.compose.ui.unit.m layoutDirection2 = dVar.e.getLayoutDirection();
                androidx.compose.ui.graphics.drawscope.b bVar3 = bVar;
                androidx.compose.ui.unit.c cVar4 = aVar2.a;
                androidx.compose.ui.unit.m mVar4 = aVar2.b;
                androidx.compose.ui.graphics.r rVar2 = aVar2.c;
                long j5 = aVar2.d;
                aVar2.a = dVar;
                aVar2.b = layoutDirection2;
                aVar2.c = cVarA;
                aVar2.d = jF2;
                cVarA.f();
                androidx.compose.ui.graphics.drawscope.d.G(bVar3, androidx.compose.ui.graphics.t.b, 0L, jF2, 0.0f, 58);
                f = -f7;
                f2 = -f6;
                ((com.google.firebase.platforminfo.d) c2Var.y).r(f, f2);
                break;
            case 3:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.y;
                z1 z1Var = (z1) obj;
                if (vVar.e) {
                    z2 = true;
                } else {
                    z1Var.getClass();
                    if (((u1) z1Var).L) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                vVar.e = z2;
                return Boolean.valueOf(!z2);
            case 4:
                androidx.compose.foundation.c2 c2Var2 = (androidx.compose.foundation.c2) this.y;
                float fFloatValue = ((Float) obj).floatValue();
                g1 g1Var = c2Var2.a;
                float fG = g1Var.g() + fFloatValue + c2Var2.f;
                float fC = kotlin.collections.i0.c(fG, 0.0f, c2Var2.e.g());
                boolean z8 = fG == fC;
                float fG2 = fC - g1Var.g();
                int iRound = Math.round(fG2);
                g1Var.h(g1Var.g() + iRound);
                c2Var2.f = fG2 - iRound;
                if (!z8) {
                    fFloatValue = fG2;
                }
                return Float.valueOf(fFloatValue);
            case 5:
                ((t0) this.y).invoke();
                return y.a;
            case 6:
                r2 r2Var = (r2) this.y;
                return new androidx.compose.ui.geometry.b(r2Var.c(r2Var.k, ((androidx.compose.ui.geometry.b) obj).a, r2Var.j));
            case 7:
                Object obj2 = this.y;
                ((Integer) obj).getClass();
                return obj2;
            case 8:
                androidx.compose.foundation.lazy.p pVar = (androidx.compose.foundation.lazy.p) this.y;
                return pVar.w(((Integer) obj).intValue(), pVar.A);
            case 9:
                androidx.compose.foundation.lazy.y yVar2 = (androidx.compose.foundation.lazy.y) this.y;
                float f14 = -((Float) obj).floatValue();
                if ((f14 >= 0.0f || yVar2.d()) && (f14 <= 0.0f || yVar2.b())) {
                    if (Math.abs(yVar2.h) > 0.5f) {
                        androidx.compose.foundation.internal.b.c("entered drag with non-zero pending scroll");
                    }
                    yVar2.d = true;
                    float f15 = yVar2.h + f14;
                    yVar2.h = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = yVar2.h;
                        int iRound2 = Math.round(f16);
                        androidx.compose.foundation.lazy.s sVarF = ((androidx.compose.foundation.lazy.s) yVar2.f.getValue()).f(iRound2, !yVar2.b);
                        if (sVarF != null && (sVar = yVar2.c) != null) {
                            androidx.compose.foundation.lazy.s sVarF2 = sVar.f(iRound2, true);
                            if (sVarF2 != null) {
                                yVar2.c = sVarF2;
                            } else {
                                sVarF = null;
                            }
                        }
                        if (sVarF != null) {
                            yVar2.f(sVarF, yVar2.b, true);
                            yVar2.v.setValue(y.a);
                            yVar2.j(f16 - yVar2.h, sVarF);
                        } else {
                            f0 f0Var = yVar2.k;
                            if (f0Var != null) {
                                f0Var.k();
                            }
                            yVar2.j(f16 - yVar2.h, yVar2.i());
                        }
                    }
                    if (Math.abs(yVar2.h) > 0.5f) {
                        f14 -= yVar2.h;
                        yVar2.h = 0.0f;
                    }
                } else {
                    f14 = 0.0f;
                }
                return Float.valueOf(-f14);
            case 10:
                return Integer.valueOf(((androidx.compose.foundation.lazy.grid.u) this.y).d(((Integer) obj).intValue()));
            case 11:
                androidx.compose.foundation.lazy.grid.x xVar = (androidx.compose.foundation.lazy.grid.x) this.y;
                float f17 = -((Float) obj).floatValue();
                if ((f17 >= 0.0f || xVar.d()) && (f17 <= 0.0f || xVar.b())) {
                    if (Math.abs(xVar.g) > 0.5f) {
                        androidx.compose.foundation.internal.b.c("entered drag with non-zero pending scroll");
                    }
                    float f18 = xVar.g + f17;
                    xVar.g = f18;
                    if (Math.abs(f18) > 0.5f) {
                        float f19 = xVar.g;
                        int iH = kotlin.math.a.H(f19);
                        androidx.compose.foundation.lazy.grid.n nVarF = ((androidx.compose.foundation.lazy.grid.n) xVar.e.getValue()).f(iH, !xVar.b);
                        if (nVarF != null && (nVar = xVar.c) != null) {
                            androidx.compose.foundation.lazy.grid.n nVarF2 = nVar.f(iH, true);
                            if (nVarF2 != null) {
                                xVar.c = nVarF2;
                            } else {
                                nVarF = null;
                            }
                        }
                        if (nVarF != null) {
                            xVar.f(nVarF, xVar.b, true);
                            xVar.r.setValue(y.a);
                            xVar.i(f19 - xVar.g, nVarF);
                        } else {
                            f0 f0Var2 = xVar.j;
                            if (f0Var2 != null) {
                                f0Var2.k();
                            }
                            xVar.i(f19 - xVar.g, xVar.h());
                        }
                    }
                    if (Math.abs(xVar.g) > 0.5f) {
                        f17 -= xVar.g;
                        xVar.g = 0.0f;
                    }
                } else {
                    f17 = 0.0f;
                }
                return Float.valueOf(-f17);
            case 12:
                return new d((w) this.y, 1);
            case 13:
                return new d((androidx.compose.foundation.lazy.layout.h0) this.y, 3);
            case 14:
                androidx.compose.runtime.saveable.g gVar3 = (androidx.compose.runtime.saveable.g) this.y;
                return Boolean.valueOf(gVar3 != null ? gVar3.a(obj) : true);
            case 15:
                ((androidx.compose.ui.semantics.a0) obj).b(j0.c, new androidx.compose.foundation.text.selection.i0(androidx.compose.foundation.text.f0.e, ((androidx.compose.foundation.text.selection.m) this.y).a(), androidx.compose.foundation.text.selection.h0.y, true));
                return y.a;
            case 16:
                i1 i1Var = (i1) this.y;
                float fFloatValue2 = ((Float) obj).floatValue();
                f1 f1Var = i1Var.a;
                float fG3 = f1Var.g() + fFloatValue2;
                f1 f1Var2 = i1Var.b;
                if (fG3 > f1Var2.g()) {
                    fFloatValue2 = f1Var2.g() - f1Var.g();
                } else if (fG3 < 0.0f) {
                    fFloatValue2 = -f1Var.g();
                }
                f1Var.h(f1Var.g() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 17:
                Drawable drawable = (Drawable) this.y;
                androidx.compose.ui.graphics.drawscope.d dVar3 = (androidx.compose.ui.graphics.drawscope.d) obj;
                androidx.compose.ui.graphics.r rVarV = dVar3.c0().v();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (dVar3.d() >> 32)), (int) Float.intBitsToFloat((int) (dVar3.d() & 4294967295L)));
                drawable.draw(androidx.compose.ui.graphics.d.a(rVarV));
                return y.a;
            case 18:
                androidx.compose.foundation.text.contextmenu.modifier.c cVar5 = (androidx.compose.foundation.text.contextmenu.modifier.c) this.y;
                cVar5.N.invoke((androidx.compose.foundation.text.contextmenu.builder.a) obj, androidx.compose.ui.node.l.h(cVar5, m0.b));
                return y.a;
            case 19:
                ((kotlin.jvm.functions.l) obj).invoke((androidx.compose.foundation.text.contextmenu.builder.a) this.y);
                return y.a;
            case 20:
                g gVar4 = (g) this.y;
                z1 z1Var2 = (z1) obj;
                if (z1Var2 instanceof androidx.compose.foundation.text.contextmenu.modifier.a) {
                    gVar4.invoke(((androidx.compose.foundation.text.contextmenu.modifier.a) z1Var2).L);
                    return Boolean.TRUE;
                }
                kotlinx.coroutines.future.a.u("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 21:
                return new d((androidx.compose.foundation.text.contextmenu.provider.c) this.y, 6);
            case 22:
                ((androidx.compose.foundation.text.input.internal.x) this.y).a((androidx.compose.ui.text.input.g) obj);
                return y.a;
            case 23:
                q0 q0Var = (q0) this.y;
                androidx.compose.ui.input.pointer.v vVar2 = (androidx.compose.ui.input.pointer.v) obj;
                long j6 = vVar2.c;
                b1 b1Var = (b1) q0Var.A;
                if (!b1Var.k() || b1Var.n().a.y.length() == 0 || (r0Var = b1Var.d) == null || r0Var.d() == null) {
                    z3 = false;
                } else {
                    q0Var.g(b1Var.n(), j6, false, androidx.compose.foundation.text.selection.a0.d);
                    z3 = true;
                }
                if (z3) {
                    vVar2.a();
                }
                return y.a;
            case 24:
                k0 k0Var = (k0) obj;
                float fFloatValue3 = ((Number) ((androidx.compose.animation.core.d) this.y).d()).floatValue();
                float fD = h3.d(k0Var, fFloatValue3);
                float fE = h3.e(k0Var, fFloatValue3);
                k0Var.k(fE == 0.0f ? 1.0f : fD / fE);
                k0Var.s(h3.c);
                return y.a;
            case 25:
                u2 u2Var = (u2) this.y;
                u2Var.show();
                return new d(u2Var, 7);
            case 26:
                ((g1) this.y).h((int) (((androidx.compose.ui.unit.l) obj).a >> 32));
                return y.a;
            case 27:
                return new d((j6) this.y, 8);
            case 28:
                ((androidx.compose.runtime.z) this.y).z(obj);
                return y.a;
            default:
                y1 y1Var = (y1) this.y;
                Throwable th3 = (Throwable) obj;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th3);
                synchronized (y1Var.c) {
                    try {
                        Job job = y1Var.d;
                        if (job != null) {
                            y1Var.u.setValue(androidx.compose.runtime.u1.y);
                            job.cancel(CancellationException);
                            y1Var.r = null;
                            job.invokeOnCompletion(new androidx.compose.material3.internal.r0(4, y1Var, th3));
                        } else {
                            y1Var.e = CancellationException;
                            y1Var.u.setValue(androidx.compose.runtime.u1.e);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return y.a;
        }
    }

    public /* synthetic */ g(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }
}
