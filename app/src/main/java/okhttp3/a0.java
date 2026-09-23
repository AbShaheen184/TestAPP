package okhttp3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public s a;
    public e0 d;
    public kotlin.collections.g0 e = okhttp3.internal.a.d;
    public String b = "GET";
    public androidx.compose.ui.graphics.vector.g c = new androidx.compose.ui.graphics.vector.g(4);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.g(str, str2);
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        androidx.compose.ui.graphics.vector.g gVar = this.c;
        gVar.getClass();
        kotlin.collections.builders.c.G(str);
        kotlin.collections.builders.c.H(str2, str);
        gVar.y(str);
        kotlin.collections.builders.c.E(gVar, str, str2);
    }

    public final void c(String str, e0 e0Var) {
        str.getClass();
        if (str.length() <= 0) {
            kotlinx.coroutines.future.a.q("method.isEmpty() == true");
            return;
        }
        if (e0Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.r("method ", str, " must have a request body."));
                return;
            }
        } else if (!kotlin.enums.b.d(str)) {
            kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.r("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = e0Var;
    }

    public final void d(String str) {
        str.getClass();
        if (kotlin.text.r.u(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (kotlin.text.r.u(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        com.google.android.material.shape.y yVar = new com.google.android.material.shape.y(1);
        yVar.f(null, str);
        this.a = yVar.c();
    }
}
