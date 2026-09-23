package androidx.compose.animation.core;

import android.content.Context;
import androidx.compose.runtime.x2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ n1(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.h] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                return yVar;
            case 1:
                h1 h1Var = (h1) obj;
                long j = h1Var.C;
                ((androidx.compose.runtime.snapshots.t) i2.b.getValue()).d(h1Var, i2.a, h1Var.D);
                long j2 = h1Var.C;
                if (j != j2) {
                    y0 y0Var = h1Var.K;
                    if (y0Var != null) {
                        if (y0Var.a > j2) {
                            h1Var.B();
                        } else {
                            y0Var.g = j2;
                            if (y0Var.b == null) {
                                y0Var.h = kotlin.math.a.I((1.0d - ((double) y0Var.e.a(0))) * h1Var.C);
                            }
                        }
                    } else if (j2 != 0) {
                        h1Var.E();
                    }
                }
                return yVar;
            case 2:
                ((kotlin.jvm.functions.a) obj).invoke();
                return yVar;
            case 3:
                return new o(((Float) obj).floatValue());
            case 4:
                return new o(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((o) obj).a);
            case 6:
                return new o(((androidx.compose.ui.unit.f) obj).e);
            case 7:
                return new androidx.compose.ui.unit.f(((o) obj).a);
            case 8:
                androidx.compose.ui.unit.g gVar = (androidx.compose.ui.unit.g) obj;
                return new p(Float.intBitsToFloat((int) (gVar.a >> 32)), Float.intBitsToFloat((int) (gVar.a & 4294967295L)));
            case 9:
                p pVar = (p) obj;
                return new androidx.compose.ui.unit.g((((long) Float.floatToRawIntBits(pVar.a)) << 32) | (((long) Float.floatToRawIntBits(pVar.b)) & 4294967295L));
            case 10:
                androidx.compose.ui.geometry.e eVar = (androidx.compose.ui.geometry.e) obj;
                return new p(Float.intBitsToFloat((int) (eVar.a >> 32)), Float.intBitsToFloat((int) (eVar.a & 4294967295L)));
            case 11:
                p pVar2 = (p) obj;
                return new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(pVar2.a)) << 32) | (((long) Float.floatToRawIntBits(pVar2.b)) & 4294967295L));
            case 12:
                androidx.compose.ui.geometry.b bVar = (androidx.compose.ui.geometry.b) obj;
                return new p(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
            case 13:
                p pVar3 = (p) obj;
                return new androidx.compose.ui.geometry.b((((long) Float.floatToRawIntBits(pVar3.a)) << 32) | (((long) Float.floatToRawIntBits(pVar3.b)) & 4294967295L));
            case 14:
                long j3 = ((androidx.compose.ui.unit.j) obj).a;
                return new p((int) (j3 >> 32), (int) (j3 & 4294967295L));
            case 15:
                p pVar4 = (p) obj;
                return new androidx.compose.ui.unit.j((((long) Math.round(pVar4.a)) << 32) | (((long) Math.round(pVar4.b)) & 4294967295L));
            case 16:
                long j4 = ((androidx.compose.ui.unit.l) obj).a;
                return new p((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 17:
                p pVar5 = (p) obj;
                int iRound = Math.round(pVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(pVar5.b);
                return new androidx.compose.ui.unit.l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 18:
                androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) obj;
                return new r(cVar.a, cVar.b, cVar.c, cVar.d);
            case 19:
                r rVar = (r) obj;
                return new androidx.compose.ui.geometry.c(rVar.a, rVar.b, rVar.c, rVar.d);
            case 20:
                return Float.valueOf(((o) obj).a);
            case 21:
                ((androidx.compose.ui.node.h0) obj).b();
                return yVar;
            case 22:
                androidx.compose.ui.semantics.a0 a0Var = (androidx.compose.ui.semantics.a0) obj;
                androidx.compose.ui.semantics.y.c(a0Var, "App icon");
                androidx.compose.ui.semantics.y.d(a0Var, 5);
                return yVar;
            case 23:
                return yVar;
            case 24:
                ((Long) obj).getClass();
                return yVar;
            case 25:
                androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) obj;
                int i2 = androidx.compose.foundation.p.a;
                x2 x2Var = androidx.compose.ui.platform.m0.b;
                jVar.getClass();
                Context context = (Context) androidx.compose.runtime.t.s(jVar, x2Var);
                androidx.compose.ui.unit.c cVar2 = (androidx.compose.ui.unit.c) androidx.compose.runtime.t.s(jVar, androidx.compose.ui.platform.l1.h);
                androidx.compose.foundation.p1 p1Var = (androidx.compose.foundation.p1) androidx.compose.runtime.t.s(jVar, androidx.compose.foundation.q1.a);
                if (p1Var == null) {
                    return null;
                }
                return new androidx.compose.foundation.o(context, cVar2, p1Var.a, p1Var.b);
            case 26:
                androidx.compose.ui.semantics.i iVar = androidx.compose.ui.semantics.i.c;
                kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.y.a;
                androidx.compose.ui.semantics.z zVar = androidx.compose.ui.semantics.w.c;
                kotlin.reflect.j jVar2 = androidx.compose.ui.semantics.y.a[1];
                ((androidx.compose.ui.semantics.a0) obj).b(zVar, iVar);
                return yVar;
            case 27:
                return new androidx.compose.foundation.c2(((Integer) obj).intValue());
            case 28:
                androidx.compose.runtime.internal.j jVar3 = (androidx.compose.runtime.internal.j) obj;
                x2 x2Var2 = androidx.compose.ui.platform.m0.b;
                jVar3.getClass();
                if (((Context) androidx.compose.runtime.t.s(jVar3, x2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return androidx.compose.foundation.gestures.e.b;
                }
                androidx.compose.foundation.gestures.c.a.getClass();
                return androidx.compose.foundation.gestures.b.c;
            default:
                return Boolean.TRUE;
        }
    }
}
