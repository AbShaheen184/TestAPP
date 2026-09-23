package kotlin.collections;

import androidx.collection.b1;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b1 implements ListIterator {
    public final /* synthetic */ f A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i) {
        super(fVar, 6);
        this.A = fVar;
        int iB = fVar.b();
        if (i < 0 || i > iB) {
            com.google.firebase.platforminfo.b.l(androidx.compose.runtime.j.g("index: ", i, ", size: ", iB));
            throw null;
        }
        this.y = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y - 1;
        this.y = i;
        return this.A.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.y - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
