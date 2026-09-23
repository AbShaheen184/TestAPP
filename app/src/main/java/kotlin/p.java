package kotlin;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable {
    public final byte e;

    public /* synthetic */ p(byte b) {
        this.e = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.b(this.e & 255, ((p) obj).e & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.e == ((p) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.e);
    }

    public final String toString() {
        return String.valueOf(this.e & 255);
    }
}
