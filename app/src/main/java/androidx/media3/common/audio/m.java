package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c(ByteBuffer byteBuffer);

    void d(k kVar);

    void e();

    j f(j jVar);

    boolean isActive();

    void reset();

    default long g(long j) {
        return j;
    }
}
