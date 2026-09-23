package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends androidx.compose.runtime.snapshots.y {
    public float c;

    public l2(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.c = ((l2) yVar).c;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final androidx.compose.runtime.snapshots.y b(long j) {
        return new l2(this.c, j);
    }
}
