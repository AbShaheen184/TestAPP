package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h {
    public final androidx.compose.ui.graphics.painter.b a;

    public f(androidx.compose.ui.graphics.painter.b bVar) {
        this.a = bVar;
    }

    @Override // coil3.compose.h
    public final androidx.compose.ui.graphics.painter.b a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.l.a(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        androidx.compose.ui.graphics.painter.b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.a + ")";
    }
}
