package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.o1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements androidx.compose.foundation.lazy.layout.q {
    public final y a;

    public g(y yVar) {
        this.a = yVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int a() {
        return this.a.i().n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int b() {
        return Math.min(a() - 1, ((t) kotlin.collections.p.J(this.a.i().k)).a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final int c() {
        int i;
        y yVar = this.a;
        int size = 0;
        if (yVar.i().k.isEmpty()) {
            return 0;
        }
        s sVarI = yVar.i();
        int iG = (int) (sVarI.o == o1.e ? sVarI.g() & 4294967295L : sVarI.g() >> 32);
        s sVarI2 = yVar.i();
        ?? r3 = sVarI2.k;
        if (!r3.isEmpty()) {
            int size2 = r3.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((t) r3.get(size)).m;
                size++;
            }
            size = (i2 / r3.size()) + sVarI2.q;
        }
        if (size != 0 && (i = iG / size) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // androidx.compose.foundation.lazy.layout.q
    public final boolean d() {
        return !this.a.i().k.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.q
    public final int e() {
        return Math.max(0, this.a.g());
    }
}
