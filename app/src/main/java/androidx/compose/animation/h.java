package androidx.compose.animation;

import android.graphics.Canvas;
import androidx.compose.runtime.w2;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(androidx.compose.ui.focus.e0 e0Var, androidx.compose.ui.focus.p pVar, kotlin.jvm.functions.l lVar) {
        super(1);
        this.y = 4;
        this.z = e0Var;
        this.A = pVar;
        this.B = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [kotlin.jvm.functions.l, kotlin.jvm.internal.m] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.y) {
            case 0:
                return new g(0, (androidx.compose.runtime.snapshots.q) this.z, this.A, (v) this.B);
            case 1:
                androidx.compose.ui.graphics.k0 k0Var = (androidx.compose.ui.graphics.k0) obj;
                w2 w2Var = (w2) this.A;
                w2 w2Var2 = (w2) this.z;
                k0Var.c(w2Var2 != null ? ((Number) w2Var2.getValue()).floatValue() : 1.0f);
                k0Var.i(w2Var != null ? ((Number) w2Var.getValue()).floatValue() : 1.0f);
                k0Var.k(w2Var != null ? ((Number) w2Var.getValue()).floatValue() : 1.0f);
                w2 w2Var3 = (w2) this.B;
                k0Var.s(w2Var3 != null ? ((androidx.compose.ui.graphics.q0) w2Var3.getValue()).a : androidx.compose.ui.graphics.q0.b);
                return kotlin.y.a;
            case 2:
                y0 y0Var = (y0) this.B;
                int iOrdinal = ((m0) obj).ordinal();
                androidx.compose.ui.graphics.q0 q0Var = null;
                if (iOrdinal == 0) {
                    h1 h1Var = y0Var.a;
                } else if (iOrdinal == 1) {
                    q0Var = (androidx.compose.ui.graphics.q0) this.z;
                } else {
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    h1 h1Var2 = y0Var.a;
                }
                return new androidx.compose.ui.graphics.q0(q0Var != null ? q0Var.a : androidx.compose.ui.graphics.q0.b);
            case 3:
                z1 z1Var = (z1) obj;
                androidx.compose.ui.draganddrop.g gVar = (androidx.compose.ui.draganddrop.g) z1Var;
                if (!((androidx.compose.ui.draganddrop.b) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w((androidx.compose.ui.draganddrop.g) this.A)).m8getDragAndDropManager()).b.contains(gVar) || !t1.e(gVar, com.imsdk.a.p((com.app.mlounge.data.music.e) this.B))) {
                    return y1.e;
                }
                ((kotlin.jvm.internal.z) this.z).e = z1Var;
                return y1.z;
            case 4:
                androidx.compose.ui.focus.e0 e0Var = (androidx.compose.ui.focus.e0) obj;
                if (kotlin.jvm.internal.l.a(e0Var, (androidx.compose.ui.focus.e0) this.z)) {
                    zBooleanValue = false;
                } else {
                    if (kotlin.jvm.internal.l.a(e0Var, ((androidx.compose.ui.focus.p) this.A).c)) {
                        kotlinx.coroutines.future.a.u("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.m) this.B).invoke(e0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                androidx.compose.ui.viewinterop.w wVar = (androidx.compose.ui.viewinterop.w) this.z;
                androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.A;
                androidx.compose.ui.viewinterop.w wVar2 = (androidx.compose.ui.viewinterop.w) this.B;
                androidx.compose.ui.graphics.r rVarV = ((androidx.compose.ui.graphics.drawscope.d) obj).c0().v();
                if (wVar.getView().getVisibility() != 8) {
                    wVar.V = true;
                    m1 m1Var = f0Var.L;
                    androidx.compose.ui.platform.u uVar = m1Var instanceof androidx.compose.ui.platform.u ? (androidx.compose.ui.platform.u) m1Var : null;
                    if (uVar != null) {
                        Canvas canvasA = androidx.compose.ui.graphics.d.a(rVarV);
                        uVar.getAndroidViewsHandler$ui().getClass();
                        wVar2.draw(canvasA);
                    }
                    wVar.V = false;
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.y = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }
}
