package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.i;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public final /* synthetic */ int e;
    public final f y;

    public /* synthetic */ g(f fVar, int i) {
        this.e = i;
        this.y = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.y.clear();
                break;
            default:
                this.y.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.y;
                fVar.getClass();
                int iG = fVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = fVar.y;
                objArr.getClass();
                return l.a(objArr[iG], entry.getValue());
            default:
                return this.y.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                return this.y.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // kotlin.collections.i
    public final int getSize() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                f fVar = this.y;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.y;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.y;
                fVar.getClass();
                fVar.c();
                int iG = fVar.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = fVar.y;
                objArr.getClass();
                if (!l.a(objArr[iG], entry.getValue())) {
                    return false;
                }
                fVar.k(iG);
                return true;
            default:
                f fVar2 = this.y;
                fVar2.c();
                int iG2 = fVar2.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                fVar2.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                this.y.c();
                break;
            default:
                this.y.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                this.y.c();
                break;
            default:
                this.y.c();
                break;
        }
        return super.retainAll(collection);
    }
}
