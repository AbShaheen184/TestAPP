package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends androidx.compose.runtime.snapshots.y {
    public Object c;

    public o2(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final void a(androidx.compose.runtime.snapshots.y yVar) {
        yVar.getClass();
        this.c = ((o2) yVar).c;
    }

    @Override // androidx.compose.runtime.snapshots.y
    public final androidx.compose.runtime.snapshots.y b(long j) {
        return new o2(androidx.compose.runtime.snapshots.n.j().g(), this.c);
    }
}
