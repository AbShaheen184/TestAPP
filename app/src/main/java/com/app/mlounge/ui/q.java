package com.app.mlounge.ui;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.viewmodel.b2;
import com.google.firebase.crashlytics.internal.model.t1;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.r {
    public final /* synthetic */ w2 A;
    public final /* synthetic */ w2 B;
    public final /* synthetic */ w2 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ kotlin.d z;

    public /* synthetic */ q(b2 b2Var, kotlin.jvm.functions.l lVar, w2 w2Var, w2 w2Var2, w2 w2Var3, w2 w2Var4) {
        this.e = 2;
        this.y = b2Var;
        this.z = lVar;
        this.B = w2Var;
        this.C = w2Var2;
        this.A = w2Var3;
        this.D = w2Var4;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                androidx.navigation.y yVar = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.z;
                a1 a1Var = (a1) this.A;
                final androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH = sVar.h(yVar);
                Object objQ = sVar.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                if (zH || objQ == fVar) {
                    objQ = new b(yVar, a1Var, 21);
                    sVar.l0(objQ);
                }
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
                boolean zH2 = sVar.h(yVar);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == fVar) {
                    objQ2 = new b(yVar, a1Var, 22);
                    sVar.l0(objQ2);
                }
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ2;
                boolean zH3 = sVar.h(yVar);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == fVar) {
                    objQ3 = new b(yVar, a1Var, 23);
                    sVar.l0(objQ3);
                }
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ3;
                boolean zH4 = sVar.h(yVar);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == fVar) {
                    objQ4 = new b(yVar, a1Var, 24);
                    sVar.l0(objQ4);
                }
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ4;
                boolean zH5 = sVar.h(yVar);
                Object objQ5 = sVar.Q();
                if (zH5 || objQ5 == fVar) {
                    objQ5 = new b(yVar, a1Var, 25);
                    sVar.l0(objQ5);
                }
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ5;
                boolean zF = sVar.f(rVar);
                Object objQ6 = sVar.Q();
                if (zF || objQ6 == fVar) {
                    objQ6 = new d(1, rVar);
                    sVar.l0(objQ6);
                }
                kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ6;
                boolean zH6 = sVar.h(yVar);
                Object objQ7 = sVar.Q();
                if (zH6 || objQ7 == fVar) {
                    objQ7 = new b(yVar, a1Var, 26);
                    sVar.l0(objQ7);
                }
                kotlin.jvm.functions.l lVar6 = (kotlin.jvm.functions.l) objQ7;
                boolean z = ((Boolean) this.B.getValue()).booleanValue() && ((Boolean) this.C.getValue()).booleanValue();
                Object objQ8 = sVar.Q();
                if (objQ8 == fVar) {
                    final int i = 1;
                    objQ8 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.k
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    androidx.compose.ui.focus.y.a(yVar2);
                                    break;
                                default:
                                    androidx.compose.ui.focus.y.a(yVar2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar.l0(objQ8);
                }
                t1.b(lVar, lVar2, lVar3, lVar4, lVar5, qVar, lVar6, z, (kotlin.jvm.functions.a) objQ8, null, sVar, 100663296);
                break;
            case 1:
                androidx.navigation.y yVar3 = (androidx.navigation.y) this.y;
                kotlin.jvm.functions.r rVar2 = (kotlin.jvm.functions.r) this.z;
                a1 a1Var2 = (a1) this.A;
                final androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zH7 = sVar2.h(yVar3);
                Object objQ9 = sVar2.Q();
                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.n.a;
                if (zH7 || objQ9 == fVar2) {
                    objQ9 = new b(yVar3, a1Var2, 9);
                    sVar2.l0(objQ9);
                }
                kotlin.jvm.functions.l lVar7 = (kotlin.jvm.functions.l) objQ9;
                boolean zH8 = sVar2.h(yVar3);
                Object objQ10 = sVar2.Q();
                if (zH8 || objQ10 == fVar2) {
                    objQ10 = new b(yVar3, a1Var2, 10);
                    sVar2.l0(objQ10);
                }
                kotlin.jvm.functions.l lVar8 = (kotlin.jvm.functions.l) objQ10;
                boolean zH9 = sVar2.h(yVar3);
                Object objQ11 = sVar2.Q();
                if (zH9 || objQ11 == fVar2) {
                    objQ11 = new b(yVar3, a1Var2, 11);
                    sVar2.l0(objQ11);
                }
                kotlin.jvm.functions.l lVar9 = (kotlin.jvm.functions.l) objQ11;
                boolean zF2 = sVar2.f(rVar2);
                Object objQ12 = sVar2.Q();
                if (zF2 || objQ12 == fVar2) {
                    objQ12 = new androidx.compose.ui.text.platform.c(rVar2, 2);
                    sVar2.l0(objQ12);
                }
                kotlin.jvm.functions.r rVar3 = (kotlin.jvm.functions.r) objQ12;
                boolean zH10 = sVar2.h(yVar3);
                Object objQ13 = sVar2.Q();
                if (zH10 || objQ13 == fVar2) {
                    objQ13 = new b(yVar3, a1Var2, 12);
                    sVar2.l0(objQ13);
                }
                kotlin.jvm.functions.l lVar10 = (kotlin.jvm.functions.l) objQ13;
                boolean z2 = ((Boolean) this.B.getValue()).booleanValue() && ((Boolean) this.C.getValue()).booleanValue();
                Object objQ14 = sVar2.Q();
                if (objQ14 == fVar2) {
                    final int i2 = 0;
                    objQ14 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.k
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    androidx.compose.ui.focus.y.a(yVar4);
                                    break;
                                default:
                                    androidx.compose.ui.focus.y.a(yVar4);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar2.l0(objQ14);
                }
                com.app.mlounge.ui.screens.history.a.a(lVar7, lVar8, lVar9, rVar3, lVar10, z2, (kotlin.jvm.functions.a) objQ14, null, sVar2, 1572864);
                break;
            default:
                b2 b2Var = (b2) this.y;
                kotlin.jvm.functions.l lVar11 = (kotlin.jvm.functions.l) this.z;
                w2 w2Var = (w2) this.D;
                int iIntValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= sVar3.d(iIntValue) ? 32 : 16;
                }
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) ((List) this.B.getValue()).get(iIntValue);
                    Integer num = (Integer) ((Map) this.C.getValue()).get(Integer.valueOf(tmdbTvShow.b()));
                    int iIntValue3 = num != null ? num.intValue() : 0;
                    Integer numD = (Integer) ((Map) this.A.getValue()).get(Integer.valueOf(tmdbTvShow.b()));
                    if (numD == null) {
                        numD = tmdbTvShow.d();
                    }
                    boolean z3 = numD != null && numD.intValue() > 0 && iIntValue3 >= numD.intValue();
                    boolean z4 = iIntValue3 > 0 && !z3;
                    String strC = tmdbTvShow.c();
                    if (strC == null) {
                        strC = "Unknown";
                    }
                    String strF = tmdbTvShow.f();
                    b2Var.b.getClass();
                    String strB = j0.b(strF, "w500");
                    Double dG = tmdbTvShow.g();
                    String strA = tmdbTvShow.a();
                    String strE0 = strA != null ? kotlin.text.k.e0(4, strA) : null;
                    androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_tv_placeholder, sVar3);
                    Float f = (Float) ((Map) w2Var.getValue()).get("movie:" + tmdbTvShow.b());
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    boolean zF3 = sVar3.f(lVar11) | sVar3.h(tmdbTvShow);
                    Object objQ15 = sVar3.Q();
                    if (zF3 || objQ15 == androidx.compose.runtime.n.a) {
                        objQ15 = new com.app.mlounge.ui.screens.adult.b(19, lVar11, tmdbTvShow);
                        sVar3.l0(objQ15);
                    }
                    com.app.mlounge.ui.components.b0.h(strC, strB, (kotlin.jvm.functions.a) objQ15, null, dG, strE0, null, null, bVarS, fFloatValue, z3, z4, 0.0f, null, sVar3, 134217728, 0, 12488);
                } else {
                    sVar3.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ q(androidx.navigation.y yVar, kotlin.jvm.functions.r rVar, a1 a1Var, w2 w2Var, w2 w2Var2, androidx.compose.ui.focus.y yVar2, int i) {
        this.e = i;
        this.y = yVar;
        this.z = rVar;
        this.A = a1Var;
        this.B = w2Var;
        this.C = w2Var2;
        this.D = yVar2;
    }
}
