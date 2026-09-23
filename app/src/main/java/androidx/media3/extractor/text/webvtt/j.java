package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.j0;
import androidx.media3.common.util.i0;
import androidx.media3.common.util.v;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        vVar.getClass();
        String strN = vVar.n(StandardCharsets.UTF_8);
        return strN != null && strN.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = i0.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                kotlinx.coroutines.future.a.q("Expected 3 decimal places, got: ".concat(strTrim));
                return 0L;
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    public static void d(v vVar) throws j0 {
        int i = vVar.b;
        if (a(vVar)) {
            return;
        }
        vVar.M(i);
        throw j0.a(null, "Expected WEBVTT. Got " + vVar.n(StandardCharsets.UTF_8));
    }
}
