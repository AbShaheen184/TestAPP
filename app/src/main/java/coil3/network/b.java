package coil3.network;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b b = new b();
    public final q a;

    public b() {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return kotlin.jvm.internal.l.a(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ")";
    }

    public b(q qVar) {
        this.a = qVar;
    }
}
