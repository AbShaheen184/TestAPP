package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends y {
    public final int d;

    public x(int i) {
        this.d = i;
    }

    @Override // com.google.common.collect.y
    public final int e() {
        return this.d;
    }

    @Override // com.google.common.collect.y
    public final y a(int i, int i2) {
        return this;
    }

    @Override // com.google.common.collect.y
    public final y c(boolean z, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.y
    public final y d(boolean z, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.y
    public final y b(Object obj, Object obj2, Comparator comparator) {
        return this;
    }
}
