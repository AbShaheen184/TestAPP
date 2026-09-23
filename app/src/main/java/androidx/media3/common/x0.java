package androidx.media3.common;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {
    public final w0 a;
    public final com.google.common.collect.h0 b;

    static {
        androidx.media3.common.util.i0.K(0);
        androidx.media3.common.util.i0.K(1);
    }

    public x0(w0 w0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= w0Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = w0Var;
        this.b = com.google.common.collect.h0.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.a.equals(x0Var.a) && this.b.equals(x0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public x0(w0 w0Var, int i) {
        this(w0Var, com.google.common.collect.h0.s(Integer.valueOf(i)));
    }
}
