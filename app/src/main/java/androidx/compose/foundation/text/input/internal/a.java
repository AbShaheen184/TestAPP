package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.c2;
import androidx.datastore.core.j0;
import androidx.datastore.core.z;
import androidx.lifecycle.m0;
import com.app.mlounge.MainActivity;
import com.app.mlounge.data.repository.b0;
import com.app.mlounge.ui.viewmodel.b1;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.l0;
import com.app.mlounge.ui.viewmodel.r0;
import com.appsalt.internal.h1;
import com.appsalt.internal.s0;
import com.google.firebase.sessions.e1;
import com.google.firebase.sessions.k0;
import java.util.ArrayList;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements FlowCollector {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Object objG;
        switch (this.e) {
            case 0:
                o oVar = (o) this.y;
                if (Build.VERSION.SDK_INT >= 34) {
                    e.b(oVar.l(), (View) oVar.y);
                }
                return y.a;
            case 1:
                ((c2) this.y).e.h(((Number) obj).floatValue());
                return y.a;
            case 2:
                z zVar = (z) this.y;
                return ((zVar.h.b() instanceof j0) || (objG = z.g(zVar, true, dVar)) != kotlin.coroutines.intrinsics.a.e) ? y.a : objG;
            case 3:
                ((MainActivity) this.y).setRequestedOrientation(((Boolean) obj).booleanValue() ? -1 : 0);
                return y.a;
            case 4:
                b0 b0Var = (b0) obj;
                if (b0Var.c) {
                    ((ArrayList) this.y).addAll(b0Var.b);
                }
                return y.a;
            case 5:
                kotlin.k kVar = (kotlin.k) obj;
                Integer num = (Integer) kVar.e;
                int iIntValue = ((Number) kVar.y).intValue();
                int iIntValue2 = num != null ? num.intValue() : 0;
                if (iIntValue > 0 && iIntValue2 >= iIntValue - 6) {
                    b1 b1Var = (b1) this.y;
                    String str = (String) b1Var.h.getValue();
                    if (str.length() >= 2 && !((Boolean) b1Var.D.getValue()).booleanValue()) {
                        int iIntValue3 = ((Number) b1Var.F.getValue()).intValue();
                        boolean z = iIntValue3 == 0 && b1Var.Q < b1Var.R;
                        boolean z2 = iIntValue3 == 1 && b1Var.S < b1Var.T;
                        boolean z3 = iIntValue3 == 2 && b1Var.V;
                        int iIntValue4 = ((Number) b1Var.H.getValue()).intValue();
                        boolean z4 = iIntValue3 == 3 && iIntValue4 == 0 && b1Var.Y < b1Var.Z;
                        boolean z5 = iIntValue3 == 3 && iIntValue4 == 1 && b1Var.a0 < b1Var.b0;
                        boolean z6 = iIntValue3 == 3 && iIntValue4 == 2 && b1Var.c0 < b1Var.d0;
                        boolean z7 = iIntValue3 == 5 && b1Var.f0 && b1Var.e0 != null;
                        boolean z8 = iIntValue3 == 6 && b1Var.W < b1Var.X;
                        if (z || z2 || z3 || z4 != 0 || z5 != 0 || z6 || z7 || z8) {
                            BuildersKt__Builders_commonKt.launch$default(m0.g(b1Var), null, null, new r0(b1Var, z, str, z2, z3, z4, z5, z6, z7, z8, null), 3, null);
                        }
                    }
                }
                return y.a;
            case 6:
                l0 l0Var = (l0) obj;
                ((kotlin.jvm.functions.w) this.y).c(l0Var.a, l0Var.b, l0Var.c, l0Var.d, new Integer(l0Var.e), l0Var.f, new Integer(l0Var.g), new Integer(l0Var.h), l0Var.i);
                return y.a;
            case 7:
                kotlin.k kVar2 = (kotlin.k) obj;
                int iIntValue5 = ((Number) kVar2.e).intValue();
                int iIntValue6 = ((Number) kVar2.y).intValue();
                b2 b2Var = (b2) this.y;
                b2Var.k.h(iIntValue5);
                b2Var.l.h(iIntValue6);
                return y.a;
            case 8:
                kotlin.k kVar3 = (kotlin.k) obj;
                int iIntValue7 = ((Number) kVar3.e).intValue();
                int iIntValue8 = ((Number) kVar3.y).intValue();
                d2 d2Var = (d2) this.y;
                d2Var.k.h(iIntValue7);
                d2Var.l.h(iIntValue8);
                return y.a;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((com.app.mlounge.ui.viewmodel.r) this.y).J.setValue(bool);
                return y.a;
            case 10:
                h1 h1Var = (h1) obj;
                com.appsalt.internal.g gVar = (com.appsalt.internal.g) this.y;
                gVar.b.getClass();
                if (gVar.m && !kotlin.text.k.J(gVar.f)) {
                    int iE = androidx.constraintlayout.core.g.e(h1Var.b);
                    if (iE != 0) {
                        if (iE == 1) {
                            int iE2 = androidx.constraintlayout.core.g.e(h1Var.a);
                            if (iE2 == 0) {
                                gVar.j.b(true);
                                s0 s0Var = gVar.h;
                                gVar.j = s0Var;
                                s0Var.c(gVar.f, true);
                            } else if (iE2 == 1) {
                                gVar.j.b(true);
                                androidx.work.impl.z zVar2 = gVar.i;
                                gVar.j = zVar2;
                                zVar2.c(gVar.f, true);
                            } else {
                                coil3.g.a();
                            }
                        } else {
                            coil3.g.a();
                        }
                        return null;
                    }
                    gVar.j.a();
                }
                return y.a;
            default:
                k0 k0Var = (k0) obj;
                e1 e1Var = (e1) this.y;
                k0Var.getClass();
                e1Var.h = k0Var;
                if (e1Var.j) {
                    e1Var.j = false;
                    e1Var.c();
                }
                Object objA = e1.a(e1Var, k0Var.a.a, com.google.firebase.sessions.b1.e, dVar);
                return objA == kotlin.coroutines.intrinsics.a.e ? objA : y.a;
        }
    }
}
