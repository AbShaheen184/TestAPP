package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {
    public final Object e;
    public final Object y;

    public k(Object obj, Object obj2) {
        this.e = obj;
        this.y = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.e, kVar.e) && kotlin.jvm.internal.l.a(this.y, kVar.y);
    }

    public final int hashCode() {
        Object obj = this.e;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.y;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.e + ", " + this.y + ')';
    }
}
