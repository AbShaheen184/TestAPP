package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final coil3.p a;
    public final coil3.request.g b;
    public final b c;

    public c(coil3.p pVar, coil3.request.g gVar, b bVar) {
        this.a = pVar;
        this.b = gVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.a.equals(cVar.a)) {
            return false;
        }
        b bVar = cVar.c;
        b bVar2 = this.c;
        return kotlin.jvm.internal.l.a(bVar2, bVar) && bVar2.a(this.b, cVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b bVar = this.c;
        return bVar.b(this.b) + ((bVar.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
