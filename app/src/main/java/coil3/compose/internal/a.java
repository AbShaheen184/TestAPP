package coil3.compose.internal;

import coil3.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Object a;
    public final coil3.compose.b b;
    public final p c;

    public a(Object obj, coil3.compose.b bVar, p pVar) {
        this.a = obj;
        this.b = bVar;
        this.c = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        coil3.compose.b bVar = aVar.b;
        coil3.compose.b bVar2 = this.b;
        return l.a(bVar2, bVar) && bVar2.a(this.a, aVar.a) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        coil3.compose.b bVar = this.b;
        return this.c.hashCode() + ((bVar.b(this.a) + (bVar.hashCode() * 31)) * 31);
    }
}
