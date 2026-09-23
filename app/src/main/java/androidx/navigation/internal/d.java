package androidx.navigation.internal;

import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import kotlin.collections.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements t {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ d(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        switch (this.e) {
            case 0:
                f fVar = (f) this.y;
                fVar.r = nVar.a();
                if (fVar.c != null) {
                    for (androidx.navigation.i iVar : p.c0(fVar.f)) {
                        iVar.getClass();
                        c cVar = iVar.E;
                        cVar.getClass();
                        cVar.a.A = nVar.a();
                        cVar.d = nVar.a();
                        cVar.b();
                    }
                }
                break;
            default:
                androidx.savedstate.internal.a aVar = (androidx.savedstate.internal.a) this.y;
                if (nVar == n.ON_START) {
                    aVar.h = true;
                } else if (nVar == n.ON_STOP) {
                    aVar.h = false;
                }
                break;
        }
    }
}
