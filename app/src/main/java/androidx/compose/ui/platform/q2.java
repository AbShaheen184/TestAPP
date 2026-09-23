package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface q2 {
    long a();

    long b();

    default float c() {
        return 2.0f;
    }

    default long d() {
        float f = 48;
        return android.support.v4.media.session.b.b(f, f);
    }

    default float e() {
        return Float.MAX_VALUE;
    }

    float f();

    default float g() {
        return 16.0f;
    }
}
