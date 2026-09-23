package androidx.media3.common;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public final int a;
    public final String b;
    public final int c;
    public final r[] d;
    public int e;

    static {
        androidx.media3.common.util.i0.K(0);
        androidx.media3.common.util.i0.K(1);
    }

    public w0(String str, r... rVarArr) {
        _COROUTINE.a.o(rVarArr.length > 0);
        this.b = str;
        this.d = rVarArr;
        this.a = rVarArr.length;
        String str2 = rVarArr[0].o;
        this.c = TextUtils.isEmpty(str2) ? i0.i(rVarArr[0].n) : i0.i(str2);
        String str3 = rVarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = rVarArr[0].f | 16384;
        for (int i2 = 1; i2 < rVarArr.length; i2++) {
            String str4 = rVarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                b("languages", i2, rVarArr[0].d, rVarArr[i2].d);
                return;
            } else {
                if (i != (rVarArr[i2].f | 16384)) {
                    b("role flags", i2, Integer.toBinaryString(rVarArr[0].f), Integer.toBinaryString(rVarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sbQ = androidx.compose.runtime.j.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbQ.append(str3);
        sbQ.append("' (track ");
        sbQ.append(i);
        sbQ.append(")");
        androidx.media3.common.util.b.g("TrackGroup", "", new IllegalStateException(sbQ.toString()));
    }

    public final int a(r rVar) {
        int i = 0;
        while (true) {
            r[] rVarArr = this.d;
            if (i >= rVarArr.length) {
                return -1;
            }
            if (rVar == rVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.b.equals(w0Var.b) && Arrays.equals(this.d, w0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.g(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
