package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {
    public final Throwable e;

    public l(Throwable th) {
        th.getClass();
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return kotlin.jvm.internal.l.a(this.e, ((l) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.e + ')';
    }
}
