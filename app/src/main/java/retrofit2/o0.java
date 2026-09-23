package retrofit2;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final okhttp3.s b;
    public String c;
    public com.google.android.material.shape.y d;
    public final okhttp3.a0 e = new okhttp3.a0();
    public final androidx.compose.ui.graphics.vector.g f;
    public okhttp3.u g;
    public final boolean h;
    public final com.google.android.datatransport.runtime.j i;
    public final com.google.android.material.internal.k j;
    public okhttp3.e0 k;

    public o0(String str, okhttp3.s sVar, String str2, okhttp3.r rVar, okhttp3.u uVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = sVar;
        this.c = str2;
        this.g = uVar;
        this.h = z;
        if (rVar != null) {
            this.f = rVar.d();
        } else {
            this.f = new androidx.compose.ui.graphics.vector.g(4);
        }
        if (z2) {
            this.j = new com.google.android.material.internal.k(19);
        } else if (z3) {
            com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j(22);
            this.i = jVar;
            jVar.w(okhttp3.w.g);
        }
    }

    public final void a(String str, String str2, boolean z) {
        com.google.android.material.internal.k kVar = this.j;
        if (z) {
            kVar.getClass();
            str.getClass();
            ((ArrayList) kVar.y).add(okhttp3.internal.url.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) kVar.z).add(okhttp3.internal.url.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        kVar.getClass();
        str.getClass();
        ((ArrayList) kVar.y).add(okhttp3.internal.url.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) kVar.z).add(okhttp3.internal.url.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                kotlin.text.i iVar = okhttp3.u.e;
                this.g = kotlin.collections.o.s(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(androidx.compose.runtime.j.i("Malformed content type: ", str2), e);
            }
        }
        androidx.compose.ui.graphics.vector.g gVar = this.f;
        if (z) {
            gVar.j(str, str2);
        } else {
            gVar.g(str, str2);
        }
    }

    public final void c(okhttp3.r rVar, okhttp3.e0 e0Var) {
        com.google.android.datatransport.runtime.j jVar = this.i;
        jVar.getClass();
        e0Var.getClass();
        if (rVar.b("Content-Type") != null) {
            kotlinx.coroutines.future.a.q("Unexpected header: Content-Type");
        } else if (rVar.b("Content-Length") != null) {
            kotlinx.coroutines.future.a.q("Unexpected header: Content-Length");
        } else {
            ((ArrayList) jVar.A).add(new okhttp3.v(rVar, e0Var));
        }
    }

    public final void d(String str, String str2, boolean z) {
        com.google.android.material.shape.y yVar;
        String str3 = this.c;
        if (str3 != null) {
            okhttp3.s sVar = this.b;
            sVar.getClass();
            try {
                yVar = new com.google.android.material.shape.y(1);
                yVar.f(sVar, str3);
            } catch (IllegalArgumentException unused) {
                yVar = null;
            }
            this.d = yVar;
            if (yVar == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(sVar);
                org.mozilla.javascript.typedarrays.c.e(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        com.google.android.material.shape.y yVar2 = this.d;
        if (!z) {
            yVar2.a(str, str2);
            return;
        }
        yVar2.getClass();
        str.getClass();
        if (((ArrayList) yVar2.h) == null) {
            yVar2.h = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) yVar2.h;
        arrayList.getClass();
        arrayList.add(okhttp3.internal.url.a.a(str, 0, 0, " \"'<>#&=", 83));
        ArrayList arrayList2 = (ArrayList) yVar2.h;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? okhttp3.internal.url.a.a(str2, 0, 0, " \"'<>#&=", 83) : null);
    }
}
