package androidx.activity.compose;

import android.media.audiofx.Visualizer;
import android.view.ActionMode;
import android.view.View;
import androidx.activity.y;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.lazy.layout.m0;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.material3.j6;
import androidx.compose.material3.l6;
import androidx.compose.material3.u2;
import androidx.compose.runtime.i0;
import androidx.compose.ui.platform.o1;
import androidx.compose.ui.window.x;
import androidx.compose.ui.window.z;
import com.app.mlounge.R;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.f0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.runtime.i0
    public final void dispose() {
        switch (this.a) {
            case 0:
                androidx.activity.result.g gVar = ((a) this.b).a;
                if (gVar == null) {
                    kotlinx.coroutines.future.a.u("Launcher has not been initialized");
                } else {
                    gVar.b.d(gVar.c);
                }
                break;
            case 1:
                ((w) this.b).d = null;
                break;
            case 2:
                m0 m0Var = (m0) this.b;
                b1 b1Var = m0Var.c;
                if (b1Var != null) {
                    b1Var.e = false;
                }
                m0Var.c = null;
                break;
            case 3:
                ((h0) this.b).f = true;
                break;
            case 4:
                ((androidx.compose.foundation.text.selection.b1) this.b).o();
                break;
            case 5:
                androidx.compose.foundation.text.contextmenu.internal.i iVar = (androidx.compose.foundation.text.contextmenu.internal.i) this.b;
                androidx.compose.runtime.snapshots.t tVar = iVar.e;
                y yVar = tVar.h;
                if (yVar != null) {
                    yVar.h();
                }
                tVar.a();
                ActionMode actionMode = iVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                iVar.h = null;
                break;
            case 6:
                androidx.compose.foundation.text.contextmenu.provider.b bVar = (androidx.compose.foundation.text.contextmenu.provider.b) ((androidx.compose.foundation.text.contextmenu.provider.c) this.b).c.getValue();
                if (bVar != null) {
                    bVar.close();
                }
                break;
            case 7:
                u2 u2Var = (u2) this.b;
                u2Var.dismiss();
                u2Var.F.d();
                break;
            case 8:
                CancellableContinuationImpl cancellableContinuationImpl = ((l6) ((j6) this.b)).c;
                if (cancellableContinuationImpl != null) {
                    CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuationImpl, null, 1, null);
                }
                break;
            case 9:
                ((o1) this.b).y.invoke();
                break;
            case 10:
                x xVar = (x) this.b;
                xVar.dismiss();
                xVar.E.d();
                break;
            case 11:
                z zVar = (z) this.b;
                zVar.d();
                zVar.setTag(R.id.view_tree_lifecycle_owner, null);
                zVar.L.removeViewImmediate(zVar);
                break;
            case 12:
                Visualizer visualizer = (Visualizer) this.b;
                if (visualizer != null) {
                    try {
                        visualizer.setEnabled(false);
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (visualizer != null) {
                    visualizer.release();
                }
                break;
            case 13:
                com.app.mlounge.ui.viewmodel.c cVar = (com.app.mlounge.ui.viewmodel.c) this.b;
                cVar.s.setValue(null);
                cVar.w.setValue(kotlin.collections.x.e);
                break;
            case 14:
                com.app.mlounge.ui.viewmodel.g gVar2 = (com.app.mlounge.ui.viewmodel.g) this.b;
                gVar2.t.setValue(null);
                MutableStateFlow mutableStateFlow = gVar2.x;
                kotlin.collections.w wVar = kotlin.collections.w.e;
                mutableStateFlow.setValue(wVar);
                gVar2.z.setValue(wVar);
                break;
            case 15:
                ((com.app.mlounge.ui.viewmodel.r) this.b).m.setValue(null);
                break;
            case 16:
                f0 f0Var = (f0) this.b;
                f0Var.B.setValue(null);
                f0Var.H.setValue(kotlin.collections.w.e);
                break;
            case 17:
                ((View) this.b).setOnGenericMotionListener(null);
                break;
            default:
                b2 b2Var = (b2) this.b;
                b2Var.H.setValue(null);
                b2Var.N.setValue(null);
                b2Var.P.setValue(kotlin.collections.w.e);
                break;
        }
    }
}
