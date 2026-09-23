package coil3.memory;

import coil3.j;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final j a;
    public final Map b;

    public b(j jVar, Map map) {
        this.a = jVar;
        this.b = android.support.v4.media.session.b.J(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.a, bVar.a) && l.a(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
