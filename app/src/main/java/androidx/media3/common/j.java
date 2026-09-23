package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final /* synthetic */ int c = 0;
    public final int a = 0;
    public final int b = 0;

    static {
        androidx.media3.common.util.i0.K(0);
        androidx.media3.common.util.i0.K(1);
        androidx.media3.common.util.i0.K(2);
        androidx.media3.common.util.i0.K(3);
    }

    public j(d1 d1Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
