package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.v;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final v a = new v();
    public final StringBuilder b = new StringBuilder();

    public static String a(v vVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = vVar.b;
        int i2 = vVar.c;
        while (i < i2 && !z) {
            char c2 = (char) vVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        vVar.N(i - vVar.b);
        return sb.toString();
    }

    public static String b(v vVar, StringBuilder sb) {
        c(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String strA = a(vVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) vVar.z());
    }

    public static void c(v vVar) {
        while (true) {
            for (boolean z = true; vVar.a() > 0 && z; z = false) {
                int i = vVar.b;
                byte[] bArr = vVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    vVar.N(1);
                } else {
                    int i2 = vVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            vVar.N(i2 - vVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
