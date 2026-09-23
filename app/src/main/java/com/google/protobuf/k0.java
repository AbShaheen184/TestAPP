package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends y {
    public final Object a;

    public k0(l1 l1Var, Object obj, l1 l1Var2, j0 j0Var) {
        if (l1Var == null) {
            kotlinx.coroutines.future.a.q("Null containingTypeDefaultInstance");
            throw null;
        }
        if (j0Var.y == t2.B && l1Var2 == null) {
            kotlinx.coroutines.future.a.q("Null messageDefaultInstance");
            throw null;
        }
        this.a = obj;
    }
}
