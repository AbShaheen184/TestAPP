package kotlin;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {
    public final short e;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e & 65535, ((w) obj).e & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.e == ((w) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 65535);
    }
}
