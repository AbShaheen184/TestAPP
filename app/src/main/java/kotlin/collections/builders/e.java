package kotlin.collections.builders;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Map.Entry, kotlin.jvm.internal.markers.c {
    public final f e;
    public final int y;
    public final int z;

    public e(f fVar, int i) {
        fVar.getClass();
        this.e = fVar;
        this.y = i;
        this.z = fVar.E;
    }

    public final void a() {
        if (this.e.E != this.z) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.e.e[this.y];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.e.y;
        objArr.getClass();
        return objArr[this.y];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.e;
        fVar.c();
        Object[] objArr = fVar.y;
        if (objArr == null) {
            int length = fVar.e.length;
            if (length < 0) {
                kotlinx.coroutines.future.a.q("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            fVar.y = objArr;
        }
        int i = this.y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
