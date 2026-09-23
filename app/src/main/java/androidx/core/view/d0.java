package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public Iterator y;
    public final Object z;

    public d0(kotlin.sequences.n nVar) {
        this.e = 1;
        this.z = nVar;
        this.y = nVar.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                break;
        }
        return this.y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                Object next = this.y.next();
                ArrayList arrayList = (ArrayList) this.z;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                androidx.collection.b1 b1Var = viewGroup != null ? new androidx.collection.b1(viewGroup, 1) : null;
                if (b1Var == null || !b1Var.hasNext()) {
                    while (!this.y.hasNext() && !arrayList.isEmpty()) {
                        this.y = (Iterator) kotlin.collections.p.J(arrayList);
                        kotlin.collections.p.S(arrayList);
                    }
                } else {
                    arrayList.add(this.y);
                    this.y = b1Var;
                }
                return next;
            default:
                return ((kotlin.sequences.n) this.z).c.invoke(this.y.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d0(androidx.collection.b1 b1Var) {
        this.e = 0;
        this.z = new ArrayList();
        this.y = b1Var;
    }
}
