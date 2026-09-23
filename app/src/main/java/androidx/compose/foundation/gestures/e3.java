package androidx.compose.foundation.gestures;

import androidx.compose.material3.c6;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e3 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e3(float f, androidx.compose.ui.graphics.g gVar, androidx.compose.ui.graphics.m mVar) {
        this.y = f;
        this.z = gVar;
        this.A = mVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                g3 g3Var = (g3) this.z;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                long jLongValue = ((Long) obj).longValue();
                if (g3Var.b == Long.MIN_VALUE) {
                    g3Var.b = jLongValue;
                }
                float f = g3Var.e;
                androidx.compose.animation.core.o oVar = new androidx.compose.animation.core.o(f);
                float f2 = this.y;
                androidx.compose.animation.core.o oVar2 = g3.f;
                long jB = f2 == 0.0f ? g3Var.a.b(new androidx.compose.animation.core.o(f), oVar2, g3Var.c) : kotlin.math.a.I((jLongValue - g3Var.b) / f2);
                float f3 = ((androidx.compose.animation.core.o) g3Var.a.t(jB, oVar, oVar2, g3Var.c)).a;
                g3Var.c = (androidx.compose.animation.core.o) g3Var.a.i(jB, oVar, oVar2, g3Var.c);
                g3Var.b = jLongValue;
                float f4 = g3Var.e - f3;
                g3Var.e = f3;
                lVar.invoke(Float.valueOf(f4));
                break;
            case 1:
                float f5 = this.y;
                androidx.compose.ui.graphics.g gVar = (androidx.compose.ui.graphics.g) this.z;
                androidx.compose.ui.graphics.m mVar = (androidx.compose.ui.graphics.m) this.A;
                androidx.compose.ui.node.h0 h0Var = (androidx.compose.ui.node.h0) obj;
                h0Var.b();
                androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
                androidx.appcompat.widget.c2 c2Var = bVar.y;
                long jG = c2Var.G();
                c2Var.v().f();
                try {
                    com.google.firebase.platforminfo.d dVar = (com.google.firebase.platforminfo.d) c2Var.y;
                    dVar.r(f5, 0.0f);
                    dVar.m(45.0f, 0L);
                    bVar.f(gVar, mVar);
                } finally {
                    androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
                }
                break;
            default:
                androidx.compose.ui.layout.d1 d1Var = (androidx.compose.ui.layout.d1) this.z;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                androidx.compose.animation.core.d dVar2 = ((c6) this.A).P;
                androidx.compose.ui.layout.c1.l(c1Var, d1Var, (int) (dVar2 != null ? ((Number) dVar2.d()).floatValue() : this.y), 0);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ e3(g3 g3Var, float f, kotlin.jvm.functions.l lVar) {
        this.z = g3Var;
        this.y = f;
        this.A = lVar;
    }

    public /* synthetic */ e3(androidx.compose.ui.layout.d1 d1Var, c6 c6Var, float f) {
        this.z = d1Var;
        this.A = c6Var;
        this.y = f;
    }
}
