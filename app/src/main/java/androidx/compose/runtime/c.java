package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void c(int i, Object obj);

    void d(Object obj);

    void e();

    void f(int i, int i2, int i3);

    void g(int i, int i2);

    void k();

    default void l(Object obj, kotlin.jvm.functions.p pVar) {
        pVar.invoke(o(), obj);
    }

    void m(int i, Object obj);

    Object o();

    default void n() {
    }
}
