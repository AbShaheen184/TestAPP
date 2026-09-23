package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends f {
    public final /* synthetic */ int e = 0;
    public final Object y;

    public d0(List list) {
        list.getClass();
        this.y = list;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.e) {
            case 0:
                return ((List) this.y).size();
            default:
                return ((kotlin.text.g) this.y).a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.e) {
            case 0:
                List list = (List) this.y;
                if (i >= 0 && i <= q.h(this)) {
                    return list.get(q.h(this) - i);
                }
                StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Element index ", i, " must be in range [");
                sbV.append(new kotlin.ranges.d(0, q.h(this), 1));
                sbV.append("].");
                throw new IndexOutOfBoundsException(sbV.toString());
            default:
                String strGroup = ((kotlin.text.g) this.y).a.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.e) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, 0);
            default:
                return super.listIterator();
        }
    }

    public d0(kotlin.text.g gVar) {
        this.y = gVar;
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new androidx.compose.runtime.snapshots.z(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
