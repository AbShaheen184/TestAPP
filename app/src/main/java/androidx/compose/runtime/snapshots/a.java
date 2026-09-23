package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.r1;
import androidx.compose.runtime.x0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // androidx.compose.runtime.snapshots.b
    public final b C(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2) {
        return (b) ((f) n.e(new r1(1, new androidx.compose.foundation.text.c0(4, lVar, lVar2))));
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void c() {
        synchronized (n.c) {
            o();
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void k() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void l() {
        r.l();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final void m() {
        n.a();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.f
    public final f u(kotlin.jvm.functions.l lVar) {
        int i = 1;
        return (e) ((f) n.e(new r1(i, new x0(i, lVar))));
    }

    @Override // androidx.compose.runtime.snapshots.b
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
