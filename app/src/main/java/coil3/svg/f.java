package coil3.svg;

import androidx.navigation.compose.r;
import androidx.navigation.internal.h;
import coil3.decode.k;
import coil3.decode.q;
import coil3.request.n;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.InterruptibleKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {
    public static final r g = new r(21);
    public final q a;
    public final n b;
    public final c c;
    public final l d;
    public final boolean e;
    public final boolean f;

    public f(q qVar, n nVar, c cVar, l lVar, boolean z, boolean z2) {
        this.a = qVar;
        this.b = nVar;
        this.c = cVar;
        this.d = lVar;
        this.e = z;
        this.f = z2;
    }

    @Override // coil3.decode.k
    public final Object a(kotlin.coroutines.d dVar) {
        return InterruptibleKt.runInterruptible(kotlin.coroutines.k.e, new h(this, 15), dVar);
    }
}
