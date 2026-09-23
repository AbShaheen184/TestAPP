package androidx.collection;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {
    public final /* synthetic */ f A;
    public int e;
    public int y = -1;
    public boolean z;

    public d(f fVar) {
        this.A = fVar;
        this.e = fVar.z - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.z) {
            kotlinx.coroutines.future.a.u("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.y;
        f fVar = this.A;
        return kotlin.jvm.internal.l.a(key, fVar.f(i)) && kotlin.jvm.internal.l.a(entry.getValue(), fVar.i(this.y));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.z) {
            return this.A.f(this.y);
        }
        kotlinx.coroutines.future.a.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.z) {
            return this.A.i(this.y);
        }
        kotlinx.coroutines.future.a.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y < this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.z) {
            kotlinx.coroutines.future.a.u("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.y;
        f fVar = this.A;
        Object objF = fVar.f(i);
        Object objI = fVar.i(this.y);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.y++;
        this.z = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.z) {
            org.mozilla.javascript.c.a();
            return;
        }
        this.A.g(this.y);
        this.y--;
        this.e--;
        this.z = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.z) {
            return this.A.h(this.y, obj);
        }
        kotlinx.coroutines.future.a.u("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
