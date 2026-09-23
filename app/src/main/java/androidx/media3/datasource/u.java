package androidx.media3.datasource;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final Pattern a;

    static {
        Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        a = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sbO = androidx.compose.runtime.j.o(j, "bytes=", "-");
        if (j2 != -1) {
            sbO.append((j + j2) - 1);
        }
        return sbO.toString();
    }
}
