package androidx.navigation;

import androidx.compose.runtime.s2;
import androidx.media3.exoplayer.source.t0;
import com.app.mlounge.ui.viewmodel.q0;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public l a;
    public boolean b;

    public abstract t a();

    public final l b() {
        l lVar = this.a;
        if (lVar != null) {
            return lVar;
        }
        kotlinx.coroutines.future.a.u("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, b0 b0Var) {
        kotlin.sequences.f fVar = new kotlin.sequences.f(new kotlin.sequences.g(new kotlin.sequences.n(new kotlin.collections.u(list, 0), new s2(7, this, b0Var), 1), false, new q0(12)));
        while (fVar.hasNext()) {
            b().f((i) fVar.next());
        }
    }

    public void e(i iVar, boolean z) {
        List list = (List) b().e.getValue();
        if (!list.contains(iVar)) {
            t0.i("popBackStack was called with ", iVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        i iVar2 = null;
        while (f()) {
            iVar2 = (i) listIterator.previous();
            if (kotlin.jvm.internal.l.a(iVar2, iVar)) {
                break;
            }
        }
        if (iVar2 != null) {
            b().d(iVar2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public t c(t tVar) {
        return tVar;
    }
}
