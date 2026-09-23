package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.compose.runtime.tooling.c {
    public final v e;

    public y(v vVar) {
        this.e = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.e.equals(((y) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() * 31;
    }
}
