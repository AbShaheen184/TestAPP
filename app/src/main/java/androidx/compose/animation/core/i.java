package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface i {
    boolean a();

    long b();

    l2 c();

    s d(long j);

    default boolean e(long j) {
        return j >= b();
    }

    Object f(long j);

    Object g();
}
