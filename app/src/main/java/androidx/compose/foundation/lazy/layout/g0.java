package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.j1;
import androidx.compose.runtime.w2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements w2 {
    public int A;
    public final int e;
    public final int y;
    public final j1 z;

    public g0(int i, int i2, int i3) {
        this.e = i2;
        this.y = i3;
        int i4 = (i / i2) * i2;
        this.z = new j1(kotlin.collections.i0.n(Math.max(i4 - i3, 0), i4 + i2 + i3), androidx.compose.runtime.f.D);
        this.A = i;
    }

    public final void b(int i) {
        if (i != this.A) {
            this.A = i;
            int i2 = this.e;
            int i3 = (i / i2) * i2;
            int i4 = this.y;
            this.z.setValue(kotlin.collections.i0.n(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // androidx.compose.runtime.w2
    public final Object getValue() {
        return (kotlin.ranges.d) this.z.getValue();
    }
}
