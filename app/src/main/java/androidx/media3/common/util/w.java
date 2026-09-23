package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final w c = new w(-1, -1);
    public final int a;
    public final int b;

    static {
        new w(0, 0);
        i0.K(0);
        i0.K(1);
    }

    public w(int i, int i2) {
        _COROUTINE.a.o((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.a == wVar.a && this.b == wVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
