package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface o extends androidx.media3.common.i {
    boolean b(byte[] bArr, int i, int i2, boolean z);

    boolean d(int i, boolean z);

    boolean e(byte[] bArr, int i, int i2, boolean z);

    long f();

    void g(int i);

    long getLength();

    long getPosition();

    int i(int i);

    int j(byte[] bArr, int i, int i2);

    void n();

    void o(int i);

    void readFully(byte[] bArr, int i, int i2);

    void w(byte[] bArr, int i, int i2);
}
