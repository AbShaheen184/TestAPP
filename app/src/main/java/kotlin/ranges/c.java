package kotlin.ranges;

import kotlin.collections.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b0 {
    public int A;
    public final int e;
    public final int y;
    public boolean z;

    public c(int i, int i2, int i3) {
        this.e = i3;
        this.y = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.z = z;
        this.A = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z;
    }

    @Override // kotlin.collections.b0
    public final int nextInt() {
        int i = this.A;
        if (i != this.y) {
            this.A = this.e + i;
            return i;
        }
        if (this.z) {
            this.z = false;
            return i;
        }
        org.mozilla.javascript.typedarrays.c.a();
        return 0;
    }
}
