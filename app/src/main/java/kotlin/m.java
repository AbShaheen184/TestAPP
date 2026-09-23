package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Serializable {
    public final Object e;

    public static final Throwable a(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.a(this.e, ((m) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.e;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
