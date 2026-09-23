package androidx.compose.animation;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.runtime.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public g(androidx.navigation.compose.n nVar, androidx.navigation.i iVar, androidx.compose.runtime.snapshots.q qVar) {
        this.a = 3;
        this.b = nVar;
        this.d = iVar;
        this.c = qVar;
    }

    @Override // androidx.compose.runtime.i0
    public final void dispose() {
        switch (this.a) {
            case 0:
                androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) this.c;
                Object obj = this.b;
                qVar.remove(obj);
                ((v) this.d).d.k(obj);
                break;
            case 1:
                androidx.compose.runtime.saveable.e eVar = (androidx.compose.runtime.saveable.e) this.c;
                androidx.collection.o0 o0Var = eVar.y;
                Object obj2 = this.b;
                Object objK = o0Var.k(obj2);
                androidx.compose.runtime.saveable.j jVar = (androidx.compose.runtime.saveable.j) this.d;
                if (objK == jVar) {
                    Map map = eVar.e;
                    Map mapB = jVar.b();
                    if (!mapB.isEmpty()) {
                        map.put(obj2, mapB);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            case 2:
                ((androidx.lifecycle.v) this.c).getLifecycle().b((androidx.core.view.k) this.b);
                androidx.activity.compose.j jVar2 = (androidx.activity.compose.j) ((kotlin.jvm.internal.z) this.d).e;
                if (jVar2 != null) {
                    jVar2.a();
                }
                break;
            default:
                androidx.navigation.compose.n nVar = (androidx.navigation.compose.n) this.b;
                androidx.navigation.i iVar = (androidx.navigation.i) this.d;
                nVar.b().c(iVar);
                ((androidx.compose.runtime.snapshots.q) this.c).remove(iVar);
                break;
        }
    }

    public /* synthetic */ g(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
