package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends p0 {
    public long[] a;
    public int b;

    @Override // kotlinx.serialization.internal.p0
    public final Object a() {
        return new kotlin.u(Arrays.copyOf(this.a, this.b));
    }

    @Override // kotlinx.serialization.internal.p0
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.p0
    public final int d() {
        return this.b;
    }
}
