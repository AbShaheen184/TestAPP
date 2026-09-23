package androidx.compose.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements r {
    public final r b;
    public final r c;

    public l(r rVar, r rVar2) {
        this.b = rVar;
        this.c = rVar2;
    }

    @Override // androidx.compose.ui.r
    public final Object a(Object obj, kotlin.jvm.functions.p pVar) {
        return this.c.a(this.b.a(obj, pVar), pVar);
    }

    @Override // androidx.compose.ui.r
    public final boolean b(kotlin.jvm.functions.l lVar) {
        return this.b.b(lVar) && this.c.b(lVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.b.equals(lVar.b) && kotlin.jvm.internal.l.a(this.c, lVar.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("["), (String) a("", k.y), ']');
    }
}
