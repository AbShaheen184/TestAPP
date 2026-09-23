package androidx.activity.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends org.jsoup.helper.n {
    public final Object l;
    public final long m;

    public u(long j, Object obj) {
        this.l = obj;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.l.equals(uVar.l) && this.m == uVar.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + (this.l.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.l + ", compositeKey=" + this.m + ')';
    }
}
