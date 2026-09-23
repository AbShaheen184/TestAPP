package kotlinx.serialization.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 {
    public boolean[] a;
    public int b;

    @Override // kotlinx.serialization.internal.p0
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // kotlinx.serialization.internal.p0
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // kotlinx.serialization.internal.p0
    public final int d() {
        return this.b;
    }
}
