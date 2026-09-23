package androidx.room;

import com.caverock.androidsvg.e2;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b0 {
    public static final int a(int i) {
        if (i == 4) {
            kotlinx.coroutines.future.a.q("Can't get the number of an unknown enum value.");
            return 0;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static final int b(int i) {
        if (i == 4) {
            kotlinx.coroutines.future.a.q("Can't get the number of an unknown enum value.");
            return 0;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static int c(Attributes attributes, int i) {
        return e2.a(attributes.getLocalName(i)).ordinal();
    }

    public static dagger.internal.e d(com.app.mlounge.h hVar, int i) {
        return dagger.internal.b.a(new com.app.mlounge.g(hVar, i));
    }

    public static String e(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String f(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static void g(androidx.compose.runtime.s sVar, boolean z, boolean z2, boolean z3) {
        sVar.p(z);
        sVar.p(z2);
        sVar.p(z3);
    }

    public static void h(String str, String str2, String str3, String str4) {
        com.app.mlounge.util.a.a(str3, str4, str + str2);
    }

    public static void i(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(okhttp3.g0 g0Var) throws Exception {
        boolean zIsTerminated;
        if (g0Var instanceof AutoCloseable) {
            g0Var.close();
            return;
        }
        if (!(g0Var instanceof ExecutorService)) {
            kotlinx.coroutines.future.a.r();
            return;
        }
        ExecutorService executorService = (ExecutorService) g0Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "DOH";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i != 3) {
            return i != 4 ? "null" : "UNKNOWN";
        }
        return "CACHE";
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "BOOL_UNSPECIFIED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "BOOL_FALSE";
        }
        return "BOOL_TRUE";
    }

    public static /* synthetic */ int m(String str) {
        if (str == null) {
            com.google.firebase.platforminfo.b.h("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        kotlinx.coroutines.future.a.q("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}
