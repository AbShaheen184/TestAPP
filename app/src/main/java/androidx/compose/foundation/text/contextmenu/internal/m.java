package androidx.compose.foundation.text.contextmenu.internal;

import android.graphics.drawable.Drawable;
import androidx.compose.animation.core.a2;
import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.j2;
import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import androidx.compose.material3.b1;
import androidx.compose.material3.g6;
import androidx.compose.material3.i6;
import androidx.compose.runtime.j1;
import androidx.compose.ui.graphics.a0;
import java.io.IOException;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ m(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        switch (this.e) {
            case 0:
                long j = ((androidx.compose.ui.graphics.t) obj).a;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= sVar.e(j) ? 4 : 2;
                }
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    n.b(((androidx.compose.foundation.text.contextmenu.data.d) this.y).c, j, sVar, (iIntValue << 3) & Token.ASSIGN_MOD);
                } else {
                    sVar.W();
                }
                return y.a;
            case 1:
                long j2 = ((androidx.compose.ui.graphics.t) obj).a;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v.a.d((Drawable) this.y, sVar2, 48);
                } else {
                    sVar2.W();
                }
                return y.a;
            case 2:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ((kotlin.jvm.functions.p) this.y).invoke(sVar3, 0);
                } else {
                    sVar3.W();
                }
                return y.a;
            case 3:
                i6 i6Var = (i6) obj;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? sVar4.f(i6Var) : sVar4.h(i6Var) ? 4 : 2;
                }
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    g6.a(i6Var, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-999924215, new b1((String) this.y, 4), sVar4), sVar4, (iIntValue4 & 14) | 805306368);
                } else {
                    sVar4.W();
                }
                return y.a;
            default:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj2;
                ((Number) obj3).intValue();
                sVar5.b0(-1498516085);
                k1 k1VarR = androidx.compose.material3.q.r(androidx.compose.material3.tokens.p.y, sVar5);
                k1 k1VarR2 = androidx.compose.material3.q.r(androidx.compose.material3.tokens.p.A, sVar5);
                e2 e2Var = (e2) this.y;
                l2 l2Var = androidx.compose.animation.core.e.j;
                j2 j2Var = e2Var.a;
                j1 j1Var = e2Var.d;
                boolean zBooleanValue = ((Boolean) j2Var.n()).booleanValue();
                sVar5.b0(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                sVar5.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) j1Var.getValue()).booleanValue();
                sVar5.b0(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                sVar5.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                e2Var.f();
                sVar5.b0(386845748);
                sVar5.p(false);
                a2 a2VarC = i2.c(e2Var, fValueOf, fValueOf2, k1VarR, l2Var, sVar5, 196608);
                boolean zBooleanValue3 = ((Boolean) e2Var.a.n()).booleanValue();
                sVar5.b0(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                sVar5.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) j1Var.getValue()).booleanValue();
                sVar5.b0(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                sVar5.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                e2Var.f();
                sVar5.b0(-281714272);
                sVar5.p(false);
                androidx.compose.ui.r rVarP = a0.p(rVar, ((Number) a2VarC.G.getValue()).floatValue(), ((Number) a2VarC.G.getValue()).floatValue(), ((Number) i2.c(e2Var, fValueOf3, fValueOf4, k1VarR2, l2Var, sVar5, 196608).G.getValue()).floatValue(), 0.0f, null, 131064);
                sVar5.p(false);
                return rVarP;
        }
    }
}
