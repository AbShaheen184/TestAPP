package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements y {
    public final int a;
    public final int b;
    public final z c;

    public k2(int i, int i2, z zVar) {
        this.a = i;
        this.b = i2;
        this.c = zVar;
    }

    @Override // androidx.compose.animation.core.m
    public final m2 a(l2 l2Var) {
        return new u2(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k2) {
            k2 k2Var = (k2) obj;
            if (k2Var.a == this.a && k2Var.b == this.b && kotlin.jvm.internal.l.a(k2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // androidx.compose.animation.core.y, androidx.compose.animation.core.m
    public final o2 a(l2 l2Var) {
        return new u2(this.a, this.b, this.c);
    }
}
