package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends t {
    public final t c;
    public final int d;

    public a2(t tVar, int i) {
        this.c = tVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return a2Var.c.equals(this.c) && a2Var.d == this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d * 31);
    }
}
