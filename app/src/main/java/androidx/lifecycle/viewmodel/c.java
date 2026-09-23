package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(b bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return l.a(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
