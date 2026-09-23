package okhttp3;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final kotlin.text.i e = new kotlin.text.i("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final kotlin.text.i f = new kotlin.text.i(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public u(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public static Charset a(u uVar) {
        String str;
        String[] strArr = uVar.d;
        int i = 0;
        int iD = dagger.hilt.android.internal.a.d(0, strArr.length - 1, 2);
        if (iD < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!kotlin.text.r.o(strArr[i], "charset", true)) {
                if (i == iD) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && kotlin.jvm.internal.l.a(((u) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
