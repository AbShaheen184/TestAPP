package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends p0 {
    public int[] a;
    public int b;

    @Override // kotlinx.serialization.internal.p0
    public final Object a() {
        return new kotlin.s(Arrays.copyOf(this.a, this.b));
    }

    @Override // kotlinx.serialization.internal.p0
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.p0
    public final int d() {
        return this.b;
    }
}
