package androidx.compose.ui.node;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public final androidx.compose.ui.layout.d1 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i) {
        this.j = i;
        this.a = (androidx.compose.ui.layout.d1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.layout.d1, androidx.compose.ui.node.a] */
    public static final void a(g0 g0Var, androidx.compose.ui.layout.a aVar, int i, d1 d1Var) {
        HashMap map = g0Var.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jY = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (g0Var.j) {
                    case 0:
                        l1 l1Var = d1Var.i0;
                        if (l1Var != null) {
                            androidx.compose.ui.platform.r1 r1Var = (androidx.compose.ui.platform.r1) l1Var;
                            float[] fArrB = r1Var.b();
                            if (!r1Var.P) {
                                jY = androidx.compose.ui.graphics.f0.b(jY, fArrB);
                            }
                        }
                        jY = androidx.room.t.y(jY, d1Var.W);
                        break;
                    default:
                        o0 o0VarS0 = d1Var.S0();
                        o0VarS0.getClass();
                        long j = o0VarS0.M;
                        jY = androidx.compose.ui.geometry.b.e((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jY);
                        break;
                }
                d1Var = d1Var.N;
                d1Var.getClass();
                if (d1Var.equals(g0Var.a.g())) {
                    int iRound = Math.round(aVar instanceof androidx.compose.ui.layout.n ? Float.intBitsToFloat((int) (jY & 4294967295L)) : Float.intBitsToFloat((int) (jY >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) kotlin.collections.c0.g(aVar, map)).intValue();
                        androidx.compose.ui.layout.n nVar = androidx.compose.ui.layout.d.a;
                        iRound = ((Number) aVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!g0Var.b(d1Var).containsKey(aVar));
            float fC = g0Var.c(d1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(d1 d1Var) {
        switch (this.j) {
            case 0:
                return d1Var.C0().c();
            default:
                o0 o0VarS0 = d1Var.S0();
                o0VarS0.getClass();
                return o0VarS0.C0().c();
        }
    }

    public final int c(d1 d1Var, androidx.compose.ui.layout.a aVar) {
        switch (this.j) {
            case 0:
                return d1Var.b0(aVar);
            default:
                o0 o0VarS0 = d1Var.S0();
                o0VarS0.getClass();
                return o0VarS0.b0(aVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.layout.d1, androidx.compose.ui.node.a] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        a aVarK = r0.k();
        if (aVarK == null) {
            return;
        }
        if (this.c) {
            aVarK.Y();
        } else if (this.e || this.d) {
            aVarK.requestLayout();
        }
        if (this.f) {
            r0.Y();
        }
        if (this.g) {
            r0.requestLayout();
        }
        aVarK.c().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.layout.d1, androidx.compose.ui.node.a] */
    public final void g() {
        HashMap map = this.i;
        map.clear();
        androidx.compose.animation.e eVar = new androidx.compose.animation.e(this, 10);
        ?? r2 = this.a;
        r2.J(eVar);
        map.putAll(b(r2.g()));
        this.b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.layout.d1, androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final void h() {
        a aVar;
        g0 g0VarC;
        g0 g0VarC2;
        boolean zD = d();
        ?? r1 = this.a;
        ?? r2 = r1;
        if (!zD) {
            a aVarK = r1.k();
            if (aVarK == null) {
                return;
            }
            aVar = aVarK.c().h;
            if (aVar == null || !aVar.c().d()) {
                r2 = aVar;
                a aVar2 = this.h;
                if (aVar2 == null || aVar2.c().d()) {
                    return;
                }
                a aVarK2 = aVar2.k();
                if (aVarK2 != null && (g0VarC2 = aVarK2.c()) != null) {
                    g0VarC2.h();
                }
                a aVarK3 = aVar2.k();
                r2 = (aVarK3 == null || (g0VarC = aVarK3.c()) == null) ? 0 : g0VarC.h;
            }
        }
        r2 = aVar;
        this.h = r2;
    }
}
