package androidx.sqlite;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    String F(int i);

    boolean Q();

    void f(int i, long j);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    void h(byte[] bArr, int i);

    boolean isNull(int i);

    void j(int i);

    void k();

    void reset();

    void s(int i, String str);

    default boolean u() {
        return getLong(0) != 0;
    }

    void v(double d);
}
