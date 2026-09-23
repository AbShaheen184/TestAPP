package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class dh implements Iterator {
    public final /* synthetic */ eh A;
    public final kg e;
    public int y;
    public int z;

    public /* synthetic */ dh(eh ehVar, kg kgVar, int i) {
        this.A = ehVar;
        this.e = kgVar;
        int i2 = i & 31;
        this.y = i2;
        this.z = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.y;
        eh ehVar = this.A;
        ka kaVar = ehVar.b;
        int iA = kaVar.a();
        Object objCast = this.e.b.cast(i >= iA ? ehVar.c.j(i - iA) : kaVar.j(i));
        int i2 = this.z;
        if (i2 == 0) {
            this.y = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.z >>>= iNumberOfTrailingZeros;
        this.y += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
