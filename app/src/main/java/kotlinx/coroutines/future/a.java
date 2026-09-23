package kotlinx.coroutines.future;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.luminis.quic.impl.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ void a() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(Object obj, String str, int i) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void g(String str) throws net.luminis.tls.alert.a {
        throw new net.luminis.tls.alert.a(str, 2);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void k(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void l(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void m() throws e {
        throw new e();
    }

    public static /* synthetic */ void n(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void o(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void r() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void s(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void t(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void u(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void v(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void w(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void x(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }
}
