package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final enum h extends l {
    public h() {
        super("ALWAYS_TRUE", 0);
    }

    @Override // com.google.common.base.g
    /* JADX INFO: renamed from: apply */
    public final boolean mo13apply(Object obj) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Predicates.alwaysTrue()";
    }
}
