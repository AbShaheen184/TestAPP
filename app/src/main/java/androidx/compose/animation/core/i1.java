package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements y {
    public final int a;

    public i1(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.core.m
    public final o2 a(l2 l2Var) {
        return new t2(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i1) && ((i1) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
