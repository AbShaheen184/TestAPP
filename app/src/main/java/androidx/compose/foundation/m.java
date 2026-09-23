package androidx.compose.foundation;

import androidx.compose.foundation.gestures.c3;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        kotlin.coroutines.d dVar2 = null;
        Object obj = this.b;
        kotlin.y yVar2 = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        switch (i) {
            case 0:
                Object objI = com.google.firebase.crashlytics.internal.model.t1.i(yVar, new l((n) obj, dVar2, i3), dVar);
                return objI == aVar ? objI : yVar2;
            case 1:
                final l0 l0Var = (l0) obj;
                kotlin.jvm.functions.l lVar = (!l0Var.S || l0Var.j0 == null) ? null : new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.j0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                l0 l0Var2 = l0Var;
                                kotlin.jvm.functions.a aVar2 = l0Var2.j0;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (l0Var2.k0) {
                                    ((androidx.compose.ui.hapticfeedback.a) androidx.compose.ui.node.l.h(l0Var2, androidx.compose.ui.platform.l1.l)).a(0);
                                }
                                break;
                            default:
                                l0 l0Var3 = l0Var;
                                if (l0Var3.S) {
                                    l0Var3.T.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                k0 k0Var = new k0(l0Var, null);
                kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.j0
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                l0 l0Var2 = l0Var;
                                kotlin.jvm.functions.a aVar2 = l0Var2.j0;
                                if (aVar2 != null) {
                                    aVar2.invoke();
                                }
                                if (l0Var2.k0) {
                                    ((androidx.compose.ui.hapticfeedback.a) androidx.compose.ui.node.l.h(l0Var2, androidx.compose.ui.platform.l1.l)).a(0);
                                }
                                break;
                            default:
                                l0 l0Var3 = l0Var;
                                if (l0Var3.S) {
                                    l0Var3.T.invoke();
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                androidx.compose.foundation.gestures.n0 n0Var = c3.a;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.g(yVar, k0Var, lVar, (kotlin.jvm.functions.l) null, lVar2, (kotlin.coroutines.d) null), dVar);
                if (objCoroutineScope != aVar) {
                    objCoroutineScope = yVar2;
                }
                return objCoroutineScope == aVar ? objCoroutineScope : yVar2;
            case 2:
                androidx.compose.foundation.text.selection.b1 b1Var = (androidx.compose.foundation.text.selection.b1) obj;
                androidx.compose.foundation.text.selection.q0 q0Var = b1Var.A;
                androidx.compose.foundation.text.selection.z0 z0Var = b1Var.z;
                androidx.compose.ui.input.pointer.l0 l0Var2 = (androidx.compose.ui.input.pointer.l0) yVar;
                l0Var2.getClass();
                Object objI2 = com.google.firebase.crashlytics.internal.model.t1.i(yVar, new androidx.compose.foundation.text.handwriting.c(new androidx.appcompat.widget.x(androidx.compose.ui.node.l.v(l0Var2).Y), q0Var, z0Var, null), dVar);
                if (objI2 != aVar) {
                    objI2 = yVar2;
                }
                return objI2 == aVar ? objI2 : yVar2;
            case 3:
                Object objI3 = com.google.firebase.crashlytics.internal.model.t1.i(yVar, new androidx.compose.foundation.text.contextmenu.gestures.b(i3, dVar2, new c(1, (androidx.compose.foundation.text.contextmenu.modifier.g) obj, androidx.compose.foundation.text.contextmenu.modifier.g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 2)), dVar);
                if (objI3 != aVar) {
                    objI3 = yVar2;
                }
                return objI3 == aVar ? objI3 : yVar2;
            case 4:
                Object objI4 = com.google.firebase.crashlytics.internal.model.t1.i(yVar, new androidx.compose.foundation.text.handwriting.c((androidx.compose.foundation.text.handwriting.d) obj, null), dVar);
                return objI4 == aVar ? objI4 : yVar2;
            case 5:
                Object objM0 = ((androidx.compose.ui.input.pointer.l0) yVar).M0(new androidx.compose.foundation.text.contextmenu.gestures.b(i2, dVar2, (kotlin.jvm.functions.l) obj), dVar);
                return objM0 == aVar ? objM0 : yVar2;
            case 6:
                Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.u0(yVar, (androidx.compose.foundation.text.x0) obj, dVar2, i3), dVar);
                if (objCoroutineScope2 != aVar) {
                    objCoroutineScope2 = yVar2;
                }
                return objCoroutineScope2 == aVar ? objCoroutineScope2 : yVar2;
            case 7:
                Object objD = c3.d(yVar, new androidx.compose.foundation.text.selection.g1(2, (kotlin.jvm.functions.a) obj), dVar);
                return objD == aVar ? objD : yVar2;
            default:
                Object objD2 = c3.d(yVar, new com.app.mlounge.ui.screens.player.n((com.app.mlounge.ui.screens.player.a1) obj, 9), dVar);
                return objD2 == aVar ? objD2 : yVar2;
        }
    }
}
