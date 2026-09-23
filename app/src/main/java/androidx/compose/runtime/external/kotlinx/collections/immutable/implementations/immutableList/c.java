package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends kotlin.collections.f {
    public abstract c c(int i, Object obj);

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(Object obj);

    public c e(Collection collection) {
        g gVarF = f();
        gVarF.addAll(collection);
        return gVarF.d();
    }

    public abstract g f();

    public abstract c h(b bVar);

    public abstract c i(int i);

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i, Object obj);

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i, int i2) {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.a(this, i, i2);
    }
}
