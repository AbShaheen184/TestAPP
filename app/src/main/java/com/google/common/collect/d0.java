package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a0 {
    @Override // com.google.common.collect.a0
    public final a0 a(Object obj) {
        b(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        q.e(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final a1 g() {
        this.c = true;
        return h0.j(this.b, this.a);
    }
}
