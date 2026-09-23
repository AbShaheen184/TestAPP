package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.t;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {
    public final l0 a;
    public final float b;

    public b(l0 l0Var, float f) {
        this.a = l0Var;
        this.b = f;
    }

    @Override // androidx.compose.ui.text.style.o
    public final float a() {
        return this.b;
    }

    @Override // androidx.compose.ui.text.style.o
    public final long b() {
        int i = t.j;
        return t.i;
    }

    @Override // androidx.compose.ui.text.style.o
    public final androidx.compose.ui.graphics.p c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
