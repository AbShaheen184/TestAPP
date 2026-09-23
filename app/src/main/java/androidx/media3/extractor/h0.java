package androidx.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {
    default int a(androidx.media3.common.i iVar, int i, boolean z) {
        return c(iVar, i, z);
    }

    void b(androidx.media3.common.util.v vVar, int i, int i2);

    int c(androidx.media3.common.i iVar, int i, boolean z);

    void e(androidx.media3.common.r rVar);

    default void f(int i, androidx.media3.common.util.v vVar) {
        b(vVar, i, 0);
    }

    void g(long j, int i, int i2, int i3, g0 g0Var);

    default void d(long j) {
    }
}
