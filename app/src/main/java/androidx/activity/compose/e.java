package androidx.activity.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends org.jsoup.helper.n {
    public final Object l;
    public final long m;

    public e(long j, Object obj) {
        this.l = obj;
        this.m = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.l.equals(eVar.l) && this.m == eVar.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + (this.l.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.l + ", compositeKey=" + this.m + ')';
    }
}
