package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements d {
    public final Class e;

    public p(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return l.a(this.e, ((p) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
