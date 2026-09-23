package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;

    public /* synthetic */ x0(int i, kotlin.jvm.functions.l lVar) {
        this.e = i;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                return this.y.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                androidx.compose.runtime.snapshots.l lVar = (androidx.compose.runtime.snapshots.l) obj;
                synchronized (androidx.compose.runtime.snapshots.n.c) {
                    j = androidx.compose.runtime.snapshots.n.e;
                    androidx.compose.runtime.snapshots.n.e = ((long) 1) + j;
                }
                return new androidx.compose.runtime.snapshots.e(j, lVar, this.y);
        }
    }
}
