package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterator {
    public final /* synthetic */ int e;
    public int y = 0;
    public final /* synthetic */ AbstractSet z;

    public /* synthetic */ u(AbstractSet abstractSet, int i) {
        this.e = i;
        this.z = abstractSet;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                int i = this.y;
                v vVar = (v) this.z;
                return i < vVar.c() - vVar.b();
            default:
                return this.y < ((eh) ((androidx.collection.a) this.z).y).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.y;
                v vVar = (v) this.z;
                if (i >= vVar.c() - vVar.b()) {
                    org.mozilla.javascript.typedarrays.c.a();
                    return null;
                }
                w wVar = vVar.y;
                Object obj = wVar.e[vVar.b() + i];
                this.y = i + 1;
                return obj;
            default:
                int i2 = this.y;
                this.y = i2 + 1;
                eh ehVar = (eh) ((androidx.collection.a) this.z).y;
                return ehVar.d(ehVar.d[i2] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
