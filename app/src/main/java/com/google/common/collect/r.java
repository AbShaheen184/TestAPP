package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterator {
    public final /* synthetic */ u A;
    public final /* synthetic */ int B;
    public final /* synthetic */ u C;
    public int e;
    public int y;
    public int z;

    public r(u uVar, int i) {
        this.B = i;
        this.C = uVar;
        this.A = uVar;
        this.e = uVar.B;
        this.y = uVar.isEmpty() ? -1 : 0;
        this.z = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object tVar;
        u uVar = this.A;
        if (uVar.B != this.e) {
            androidx.collection.g.d();
            return null;
        }
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y;
        this.z = i;
        switch (this.B) {
            case 0:
                tVar = this.C.i()[i];
                break;
            case 1:
                tVar = new t(this.C, i);
                break;
            default:
                tVar = this.C.j()[i];
                break;
        }
        int i2 = this.y + 1;
        if (i2 >= uVar.C) {
            i2 = -1;
        }
        this.y = i2;
        return tVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        u uVar = this.A;
        if (uVar.B != this.e) {
            androidx.collection.g.d();
            return;
        }
        _COROUTINE.a.z("no calls to next() since the last call to remove()", this.z >= 0);
        this.e += 32;
        uVar.remove(uVar.i()[this.z]);
        this.y--;
        this.z = -1;
    }
}
