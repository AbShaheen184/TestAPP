package androidx.navigationevent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends _COROUTINE.a {
    public final b m;

    public j(b bVar) {
        bVar.getClass();
        this.m = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && j.class == obj.getClass() && kotlin.jvm.internal.l.a(this.m, ((j) obj).m);
    }

    public final int hashCode() {
        return this.m.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.m + ", direction=-1)";
    }
}
