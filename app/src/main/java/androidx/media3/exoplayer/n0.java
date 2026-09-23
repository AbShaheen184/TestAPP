package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {
    public final long a;
    public final float b;
    public final long c;

    public n0(m0 m0Var) {
        this.a = m0Var.a;
        this.b = m0Var.b;
        this.c = m0Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && this.b == n0Var.b && this.c == n0Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
