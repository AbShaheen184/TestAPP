package kotlin.collections;

import java.util.Objects;
import okhttp3.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i) {
        this.a = i;
    }

    public static final void a(int i, int i2) {
        String strQ;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                strQ = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("size ", i, " must be greater than zero.");
            }
            kotlinx.coroutines.future.a.s(strQ);
        }
    }

    public static double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float c(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int d(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long e(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbO = androidx.compose.runtime.j.o(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbO.append(j2);
        sbO.append('.');
        throw new IllegalArgumentException(sbO.toString());
    }

    public static kotlin.ranges.b l(kotlin.ranges.d dVar, int i) {
        dVar.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = dVar.e;
        int i3 = dVar.y;
        if (dVar.z <= 0) {
            i = -i;
        }
        return new kotlin.ranges.b(i2, i3, i);
    }

    public static final okhttp3.g0 m(okhttp3.g0 g0Var) {
        g0Var.getClass();
        okhttp3.f0 f0VarN = g0Var.n();
        j0 j0Var = g0Var.D;
        f0VarN.g = new okhttp3.internal.c(j0Var.x(), j0Var.n());
        return f0VarN.a();
    }

    public static kotlin.ranges.d n(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new kotlin.ranges.d(i, i2 - 1, 1);
        }
        kotlin.ranges.d dVar = kotlin.ranges.d.A;
        return kotlin.ranges.d.A;
    }

    public org.schabi.newpipe.extractor.linkhandler.a f(String str) {
        if (org.schabi.newpipe.extractor.utils.g.h(str)) {
            kotlinx.coroutines.future.a.q("The url is null or empty");
            return null;
        }
        String strB = org.schabi.newpipe.extractor.utils.g.b(str);
        return g(strB, org.schabi.newpipe.extractor.utils.g.c(strB));
    }

    public org.schabi.newpipe.extractor.linkhandler.a g(String str, String str2) throws org.schabi.newpipe.extractor.exceptions.f {
        Objects.requireNonNull(str, "URL cannot be null");
        if (!k(str)) {
            throw new org.schabi.newpipe.extractor.exceptions.f("URL not accepted: ".concat(str));
        }
        String strH = h(str);
        return new org.schabi.newpipe.extractor.linkhandler.a(str, j(strH, str2), strH);
    }

    public abstract String h(String str);

    public int hashCode() {
        switch (this.a) {
            case 2:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract String i(String str);

    public String j(String str, String str2) {
        return i(str);
    }

    public abstract boolean k(String str);

    public String toString() {
        switch (this.a) {
            case 2:
                String strC = kotlin.jvm.internal.a0.a(getClass()).c();
                strC.getClass();
                return strC;
            default:
                return super.toString();
        }
    }
}
