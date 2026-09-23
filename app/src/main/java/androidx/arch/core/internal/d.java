package androidx.arch.core.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {
    public c e;
    public boolean y = true;
    public final /* synthetic */ f z;

    public d(f fVar) {
        this.z = fVar;
    }

    @Override // androidx.arch.core.internal.e
    public final void b(c cVar) {
        c cVar2 = this.e;
        if (cVar == cVar2) {
            c cVar3 = cVar2.A;
            this.e = cVar3;
            this.y = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y) {
            return this.z.e != null;
        }
        c cVar = this.e;
        return (cVar == null || cVar.z == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.y) {
            this.y = false;
            this.e = this.z.e;
        } else {
            c cVar = this.e;
            this.e = cVar != null ? cVar.z : null;
        }
        return this.e;
    }
}
