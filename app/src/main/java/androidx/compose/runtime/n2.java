package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends androidx.compose.runtime.snapshots.y {
    public long c;

    public n2(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.c = ((n2) yVar).c;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final androidx.compose.runtime.snapshots.y b(long j) {
        return new n2(j, this.c);
    }
}
