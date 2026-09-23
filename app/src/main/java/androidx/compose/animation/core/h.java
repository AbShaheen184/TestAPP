package androidx.compose.animation.core;

import androidx.compose.runtime.w2;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final k1 a = e.n(0.0f, 0.0f, null, 7);

    static {
        Object obj = v2.a;
        e.n(0.0f, 0.0f, new androidx.compose.ui.unit.f(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final w2 a(float f, k1 k1Var, androidx.compose.runtime.s sVar) {
        return c(new androidx.compose.ui.unit.f(f), e.l, k1Var, null, "DpAnimation", sVar, 0, 8);
    }

    public static final w2 b(float f, k1 k1Var, androidx.compose.runtime.s sVar, int i, int i2) {
        Float fValueOf = Float.valueOf(0.01f);
        String str = (i2 & 8) != 0 ? "FloatAnimation" : "magnitude";
        if (k1Var == a) {
            sVar.b0(1144089983);
            boolean zC = sVar.c(0.01f);
            Object objQ = sVar.Q();
            if (zC || objQ == androidx.compose.runtime.n.a) {
                objQ = e.n(0.0f, 0.0f, fValueOf, 3);
                sVar.l0(objQ);
            }
            k1Var = (k1) objQ;
            sVar.p(false);
        } else {
            sVar.b0(1144199909);
            sVar.p(false);
        }
        return c(Float.valueOf(f), e.j, k1Var, fValueOf, str, sVar, (i << 3) & 57344, 0);
    }

    public static final w2 c(Object obj, l2 l2Var, m mVar, Float f, String str, androidx.compose.runtime.s sVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objQ = sVar.Q();
        Object obj2 = androidx.compose.runtime.n.a;
        if (objQ == obj2) {
            objQ = androidx.compose.runtime.t.r(null);
            sVar.l0(objQ);
        }
        androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == obj2) {
            objQ2 = new d(obj, l2Var, f);
            sVar.l0(objQ2);
        }
        d dVar = (d) objQ2;
        Object objV = androidx.compose.runtime.t.v(null, sVar);
        if (f != null && (mVar instanceof k1)) {
            k1 k1Var = (k1) mVar;
            if (!kotlin.jvm.internal.l.a(k1Var.c, f)) {
                mVar = new k1(k1Var.a, k1Var.b, f);
            }
        }
        Object objV2 = androidx.compose.runtime.t.v(mVar, sVar);
        Object objQ3 = sVar.Q();
        if (objQ3 == obj2) {
            objQ3 = ChannelKt.Channel$default(-1, null, null, 6, null);
            sVar.l0(objQ3);
        }
        Object obj3 = (Channel) objQ3;
        boolean zH = sVar.h(obj3) | sVar.h(obj);
        Object objQ4 = sVar.Q();
        if (zH || objQ4 == obj2) {
            objQ4 = new androidx.activity.compose.f(2, obj3, obj);
            sVar.l0(objQ4);
        }
        androidx.compose.runtime.l0.e((kotlin.jvm.functions.a) objQ4, sVar);
        boolean zH2 = sVar.h(obj3) | sVar.h(dVar) | sVar.f(objV2) | sVar.f(objV);
        Object objQ5 = sVar.Q();
        if (zH2 || objQ5 == obj2) {
            Object gVar = new g(obj3, dVar, objV2, objV, (kotlin.coroutines.d) null, 0);
            sVar.l0(gVar);
            objQ5 = gVar;
        }
        androidx.compose.runtime.l0.c(sVar, obj3, (kotlin.jvm.functions.p) objQ5);
        w2 w2Var = (w2) a1Var.getValue();
        return w2Var == null ? dVar.c : w2Var;
    }
}
