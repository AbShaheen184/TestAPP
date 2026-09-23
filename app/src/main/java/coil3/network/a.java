package coil3.network;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final q a;

    public a(q qVar) {
        this.a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && kotlin.jvm.internal.l.a(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar != null) {
            return qVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ")";
    }
}
