package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.collections.b0 {
    public int e;
    public final /* synthetic */ z0 y;

    public a1(z0 z0Var) {
        this.y = z0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.y.f();
    }

    @Override // kotlin.collections.b0
    public final int nextInt() {
        int i = this.e;
        this.e = i + 1;
        return this.y.d(i);
    }
}
