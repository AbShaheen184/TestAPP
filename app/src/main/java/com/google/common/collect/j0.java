package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends a0 {
    @Override // com.google.common.collect.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j0 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public k0 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = k0.z;
            return h1.G;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            k0 k0VarK = k0.k(i, objArr);
            this.b = k0VarK.size();
            this.c = true;
            return k0VarK;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = k0.z;
        return new n1(obj);
    }
}
