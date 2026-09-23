package androidx.compose.ui.platform;

import android.view.View;
import com.app.mlounge.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ int y;
    public final /* synthetic */ f3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(f3 f3Var, kotlin.jvm.functions.p pVar, int i) {
        super(2);
        this.y = i;
        this.z = f3Var;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.y) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m0.a(this.z.e, this.A, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f3 f3Var = this.z;
                    u uVar = f3Var.e;
                    Object tag = uVar.getTag(R.id.inspection_slot_table_set);
                    kotlin.coroutines.d dVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof kotlin.jvm.internal.markers.a) && !(tag instanceof kotlin.jvm.internal.markers.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = uVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof kotlin.jvm.internal.markers.a) && !(tag2 instanceof kotlin.jvm.internal.markers.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(sVar2.z());
                        sVar2.q = true;
                        sVar2.C = true;
                        sVar2.c.c();
                        sVar2.H.c();
                        androidx.compose.runtime.k2 k2Var = sVar2.I;
                        androidx.compose.runtime.h2 h2Var = k2Var.a;
                        k2Var.e = h2Var.G;
                        k2Var.f = h2Var.H;
                    }
                    boolean zH = sVar2.h(f3Var);
                    Object objQ = sVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.n.a;
                    if (zH || objQ == fVar) {
                        objQ = new d3(f3Var, dVar, 0);
                        sVar2.l0(objQ);
                    }
                    androidx.compose.runtime.l0.c(sVar2, uVar, (kotlin.jvm.functions.p) objQ);
                    boolean zH2 = sVar2.h(f3Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new d3(f3Var, dVar, 1);
                        sVar2.l0(objQ2);
                    }
                    androidx.compose.runtime.l0.c(sVar2, uVar, (kotlin.jvm.functions.p) objQ2);
                    androidx.compose.runtime.t.a(androidx.compose.runtime.tooling.g.a.a(set), androidx.compose.runtime.internal.k.c(-280240369, new e3(f3Var, this.A, 0), sVar2), sVar2, 56);
                } else {
                    sVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
