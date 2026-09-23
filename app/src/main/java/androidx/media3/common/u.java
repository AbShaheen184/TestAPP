package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class u {
    public final long a;

    static {
        new u(new d1());
        androidx.media3.common.util.i0.K(0);
        androidx.media3.common.util.i0.K(1);
        androidx.media3.common.util.i0.K(2);
        androidx.media3.common.util.i0.K(3);
        androidx.media3.common.util.i0.K(4);
        androidx.media3.common.util.i0.K(5);
        androidx.media3.common.util.i0.K(6);
        androidx.media3.common.util.i0.K(7);
    }

    public u(d1 d1Var) {
        String str = androidx.media3.common.util.i0.a;
        this.a = Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.a == ((u) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 923521;
    }
}
