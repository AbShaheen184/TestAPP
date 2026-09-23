package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.m1;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends androidx.compose.ui.q implements androidx.compose.ui.focus.w, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View L;
    public ViewTreeObserver M;
    public final q N = new q(this, 0);
    public final q O = new q(this, 1);

    @Override // androidx.compose.ui.q
    public final void E0() {
        ViewTreeObserver viewTreeObserver = androidx.compose.ui.node.l.x(this).getViewTreeObserver();
        this.M = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        ViewTreeObserver viewTreeObserver = this.M;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.M = null;
        androidx.compose.ui.node.l.x(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.L = null;
    }

    public final e0 M0() {
        if (!this.e.K) {
            androidx.compose.ui.internal.a.b("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.q qVar = this.e;
        if ((qVar.A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
            boolean z = false;
            for (androidx.compose.ui.q qVar2 = qVar.C; qVar2 != null; qVar2 = qVar2.C) {
                if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    androidx.compose.ui.q qVarE = qVar2;
                    androidx.compose.runtime.collection.b bVar = null;
                    while (qVarE != null) {
                        if (qVarE instanceof e0) {
                            e0 e0Var = (e0) qVarE;
                            if (z) {
                                return e0Var;
                            }
                            z = true;
                        } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.k)) {
                            int i = 0;
                            for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.k) qVarE).M; qVar3 != null; qVar3 = qVar3.C) {
                                if ((qVar3.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVarE = qVar3;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (qVarE != null) {
                                            bVar.b(qVarE);
                                            qVarE = null;
                                        }
                                        bVar.b(qVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVarE = androidx.compose.ui.node.l.e(bVar);
                    }
                }
            }
        }
        kotlinx.coroutines.future.a.u("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (androidx.compose.ui.node.l.v(this).L == null) {
            return;
        }
        View viewC = j.c(this);
        androidx.compose.ui.focus.l focusOwner = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.l.w(this)).getFocusOwner();
        m1 m1VarW = androidx.compose.ui.node.l.w(this);
        if (view != null && !view.equals(m1VarW)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewC.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(m1VarW)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else {
                    if (parent2 == viewC.getParent()) {
                        z2 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.L = view2;
            return;
        }
        if (!z2) {
            if (!z) {
                this.L = null;
                return;
            }
            this.L = null;
            if (M0().R0().a()) {
                ((androidx.compose.ui.focus.p) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.L = view2;
        e0 e0VarM0 = M0();
        int iOrdinal = e0VarM0.R0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            androidx.compose.ui.focus.d.x(e0VarM0);
        } else {
            coil3.g.a();
        }
    }

    @Override // androidx.compose.ui.focus.w
    public final void u(androidx.compose.ui.focus.r rVar) {
        rVar.d(false);
        rVar.g(this.N);
        rVar.f(this.O);
    }
}
