package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends i {
    public final x1 e;
    public m y = b();

    public w1(z1 z1Var) {
        this.e = new x1(z1Var);
    }

    @Override // com.google.protobuf.m
    public final byte a() {
        m mVar = this.y;
        if (mVar == null) {
            org.mozilla.javascript.typedarrays.c.a();
            return (byte) 0;
        }
        byte bA = mVar.a();
        if (!this.y.hasNext()) {
            this.y = b();
        }
        return bA;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.protobuf.m] */
    public final m b() {
        x1 x1Var = this.e;
        if (x1Var.hasNext()) {
            return x1Var.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y != null;
    }
}
