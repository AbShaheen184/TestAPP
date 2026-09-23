package coil3.svg;

import coil3.decode.j;
import coil3.decode.k;
import coil3.request.n;
import kotlin.jvm.functions.l;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    public final c a = c.e;
    public final l b = f.g;
    public final boolean c = true;
    public final boolean d = true;

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, n nVar) {
        if (!kotlin.jvm.internal.l.a(kVar.b, "image/svg+xml")) {
            h hVarP = kVar.a.P();
            if (!hVarP.B(0L, a.b) || hVarP.p(a.a) == -1) {
                return null;
            }
        }
        return new f(kVar.a, nVar, this.a, this.b, this.c, this.d);
    }
}
