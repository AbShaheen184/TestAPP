package coil3;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e a = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e(Boolean.TRUE);

    public static v a(String str) {
        String str2 = x.y;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new v(sb.toString(), str2, "file", null, str);
    }

    public static final Drawable b(j jVar, Resources resources) {
        if (jVar instanceof e) {
            return ((e) jVar).a;
        }
        return jVar instanceof a ? new BitmapDrawable(resources, ((a) jVar).a) : new androidx.appcompat.widget.a(jVar, 1);
    }

    public static final j c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new a(((BitmapDrawable) drawable).getBitmap()) : new e(drawable);
    }

    public static final Object d(coil3.request.g gVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar) {
        Object obj = gVar.r.a.get(eVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = gVar.t.n.a.get(eVar);
        return obj2 == null ? eVar.a : obj2;
    }

    public static final Object e(coil3.request.n nVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e eVar) {
        Object obj = nVar.j.a.get(eVar);
        return obj == null ? eVar.a : obj;
    }

    public static final String f(v vVar) {
        List listG = g(vVar);
        String str = vVar.b;
        if (listG.isEmpty()) {
            return null;
        }
        String str2 = vVar.e;
        str2.getClass();
        if (!kotlin.text.r.u(str2, str, false)) {
            str = "";
        }
        return kotlin.collections.p.I(listG, vVar.b, str, null, null, 60);
    }

    public static final List g(v vVar) {
        String str = vVar.e;
        if (str == null) {
            return w.e;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iG = kotlin.text.k.G(str, '/', i2, 4);
            if (iG == -1) {
                iG = str.length();
            }
            String strSubstring = str.substring(i2, iG);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iG;
        }
        return arrayList;
    }

    public static final String h(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    kotlin.collections.c.a(0, i2, bArr.length);
                    return new String(bArr, 0, i2, kotlin.text.a.a);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    kotlin.comparisons.a.c(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static v i(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = x.y;
        String strS = !kotlin.jvm.internal.l.a(str2, "/") ? kotlin.text.r.s(str, str2, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strS.length()) {
            char cCharAt = strS.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strS.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strS.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strS.substring(0, i6);
            strSubstring = strS.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strS.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strS.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strS.substring(i2, strS.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strH = strSubstring2 != null ? h(strSubstring2, bArr) : null;
        String strH2 = strSubstring != null ? h(strSubstring, bArr) : null;
        String strH3 = strSubstring3 != null ? h(strSubstring3, bArr) : null;
        if (str3 != null) {
            h(str3, bArr);
        }
        if (strSubstring5 != null) {
            h(strSubstring5, bArr);
        }
        return new v(strS, str2, strH, strH2, strH3);
    }
}
