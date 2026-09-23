package androidx.compose.animation.core;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface y1 {
    default boolean a(Enum r2, Enum r3) {
        return r2.equals(b()) && r3.equals(c());
    }

    Object b();

    Object c();
}
