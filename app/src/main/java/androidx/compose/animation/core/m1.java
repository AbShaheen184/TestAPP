package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements m2 {
    public final m2 e;
    public final long y;

    public m1(m2 m2Var, long j) {
        this.e = m2Var;
        this.y = j;
    }

    @Override // androidx.compose.animation.core.m2
    public final boolean a() {
        return this.e.a();
    }

    @Override // androidx.compose.animation.core.m2
    public final long b(s sVar, s sVar2, s sVar3) {
        return this.e.b(sVar, sVar2, sVar3) + this.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return m1Var.y == this.y && kotlin.jvm.internal.l.a(m1Var.e, this.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.y) + (this.e.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.m2
    public final s i(long j, s sVar, s sVar2, s sVar3) {
        long j2 = this.y;
        return j < j2 ? sVar3 : this.e.i(j - j2, sVar, sVar2, sVar3);
    }

    @Override // androidx.compose.animation.core.m2
    public final s t(long j, s sVar, s sVar2, s sVar3) {
        long j2 = this.y;
        return j < j2 ? sVar : this.e.t(j - j2, sVar, sVar2, sVar3);
    }
}
