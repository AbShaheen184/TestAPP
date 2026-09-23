package coil3.transition;

import coil3.compose.j;
import coil3.decode.h;
import coil3.request.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {
    public final int b;

    public b(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        kotlinx.coroutines.future.a.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.f
    public final g a(j jVar, coil3.request.j jVar2) {
        if (jVar2 instanceof p) {
            return ((p) jVar2).c == h.e ? new e(jVar, jVar2) : new c(jVar, jVar2, this.b);
        }
        return new e(jVar, jVar2);
    }
}
