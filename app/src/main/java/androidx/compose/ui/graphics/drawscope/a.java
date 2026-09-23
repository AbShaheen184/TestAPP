package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.r;
import androidx.compose.ui.unit.m;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public androidx.compose.ui.unit.c a;
    public m b;
    public r c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && this.b == aVar.b && l.a(this.c, aVar.c) && androidx.compose.ui.geometry.e.a(this.d, aVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) androidx.compose.ui.geometry.e.f(this.d)) + ')';
    }
}
