package coil3.memory;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.media3.exoplayer.source.r0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final androidx.compose.ui.input.pointer.util.b a;
    public final l b;
    public final Object c = new Object();

    public c(androidx.compose.ui.input.pointer.util.b bVar, l lVar) {
        this.a = bVar;
        this.b = lVar;
    }

    public final void a(long j) {
        synchronized (this.c) {
            r0 r0Var = (r0) this.a.c;
            r0Var.e = j;
            r0Var.e(j);
        }
    }
}
