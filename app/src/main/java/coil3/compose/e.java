package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {
    public final androidx.compose.ui.graphics.painter.b a;
    public final coil3.request.c b;

    public e(androidx.compose.ui.graphics.painter.b bVar, coil3.request.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    @Override // coil3.compose.h
    public final androidx.compose.ui.graphics.painter.b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.a, eVar.a) && this.b.equals(eVar.b);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.painter.b bVar = this.a;
        return this.b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ")";
    }
}
