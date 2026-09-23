package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x implements w {
    public final androidx.compose.runtime.internal.a e = new androidx.compose.runtime.internal.a(0);

    public final boolean e(int i) {
        return (i & this.e.get()) != 0;
    }

    public final void f(int i) {
        androidx.compose.runtime.internal.a aVar;
        int i2;
        do {
            aVar = this.e;
            i2 = aVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i2, i2 | i));
    }
}
