package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends y {
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c c;
    public int d;
    public int e;

    public v(long j, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar) {
        super(j);
        this.c = cVar;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(y yVar) {
        synchronized (r.a) {
            yVar.getClass();
            this.c = ((v) yVar).c;
            this.d = ((v) yVar).d;
            this.e = ((v) yVar).e;
        }
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final y b(long j) {
        return new v(j, this.c);
    }
}
