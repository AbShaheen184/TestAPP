package coil3.transition;

import androidx.transition.k;
import coil3.compose.j;
import coil3.l;
import coil3.request.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final j a;
    public final coil3.request.j b;
    public final int c;

    public c(j jVar, coil3.request.j jVar2, int i) {
        this.a = jVar;
        this.b = jVar2;
        this.c = i;
        if (i > 0) {
            return;
        }
        kotlinx.coroutines.future.a.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.g
    public final void a() {
        this.a.getClass();
        coil3.request.j jVar = this.b;
        if (jVar.a() != null) {
            k.o();
            return;
        }
        boolean z = jVar instanceof p;
        a aVar = new a(jVar.b().p, this.c, (z && ((p) jVar).g) ? false : true);
        if (z) {
            l.c(aVar);
        } else if (jVar instanceof coil3.request.c) {
            l.c(aVar);
        } else {
            coil3.g.a();
        }
    }
}
