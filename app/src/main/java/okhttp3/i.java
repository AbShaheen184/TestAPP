package okhttp3;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i c = new i(kotlin.collections.p.f0(new ArrayList()), null);
    public final Set a;
    public final dagger.hilt.android.internal.b b;

    public i(Set set, dagger.hilt.android.internal.b bVar) {
        this.a = set;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.a.equals(this.a) && kotlin.jvm.internal.l.a(iVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        dagger.hilt.android.internal.b bVar = this.b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
