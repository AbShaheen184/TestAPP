package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends p1 {
    public final /* synthetic */ l1 A;
    public int e = 2;
    public Object y;
    public final Iterator z;

    public k1(l1 l1Var) {
        this.A = l1Var;
        this.z = l1Var.e.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        _COROUTINE.a.A(this.e != 4);
        int iE = androidx.constraintlayout.core.g.e(this.e);
        if (iE == 0) {
            return true;
        }
        if (iE != 2) {
            this.e = 4;
            do {
                Iterator it = this.z;
                if (!it.hasNext()) {
                    this.e = 3;
                    next = null;
                    break;
                }
                next = it.next();
            } while (!this.A.y.contains(next));
            this.y = next;
            if (this.e != 3) {
                this.e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.e = 2;
        Object obj = this.y;
        this.y = null;
        return obj;
    }
}
