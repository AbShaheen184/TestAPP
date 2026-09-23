package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface m2 {
    boolean a();

    long b(s sVar, s sVar2, s sVar3);

    s i(long j, s sVar, s sVar2, s sVar3);

    default s q(s sVar, s sVar2, s sVar3) {
        return i(b(sVar, sVar2, sVar3), sVar, sVar2, sVar3);
    }

    s t(long j, s sVar, s sVar2, s sVar3);
}
