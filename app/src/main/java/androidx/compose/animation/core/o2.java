package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface o2 extends p2 {
    @Override // androidx.compose.animation.core.m2
    default long b(s sVar, s sVar2, s sVar3) {
        return ((long) (u() + p())) * 1000000;
    }

    int p();

    int u();
}
