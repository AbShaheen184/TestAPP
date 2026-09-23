package kotlin.collections;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.w("startIndex: ", ", endIndex: ", i, ", size: ", i2), i3);
        } else {
            if (i <= i2) {
                return;
            }
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("startIndex: ", i, " > endIndex: ", i2));
        }
    }

    public static void b(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            com.google.firebase.platforminfo.b.i(androidx.privacysandbox.ads.adservices.java.internal.a.w("fromIndex: ", ", toIndex: ", i, ", size: ", i2), i3);
        } else {
            if (i <= i2) {
                return;
            }
            kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.g("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    public static org.jsoup.helper.f c(String str) {
        org.jsoup.helper.f fVar = new org.jsoup.helper.f();
        org.jsoup.helper.d dVar = new org.jsoup.helper.d();
        fVar.a = dVar;
        org.jsoup.helper.n.C(str, "url");
        try {
            dVar.a = new com.google.android.material.internal.k(new URL(str)).o();
            return fVar;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(androidx.privacysandbox.ads.adservices.java.internal.a.r("The supplied URL, '", str, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"), e);
        }
    }

    public static final void d(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = kotlin.text.d.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static okhttp3.r e(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            kotlinx.coroutines.future.a.q("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                kotlinx.coroutines.future.a.q("Headers cannot be null");
                return null;
            }
            strArr3[i2] = kotlin.text.k.g0(strArr2[i2]).toString();
        }
        int iD = dagger.hilt.android.internal.a.d(0, strArr3.length - 1, 2);
        if (iD >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                kotlin.collections.builders.c.G(str);
                kotlin.collections.builders.c.H(str2, str);
                if (i == iD) {
                    break;
                }
                i += 2;
            }
        }
        return new okhttp3.r(strArr3);
    }

    public static final void f(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }
}
