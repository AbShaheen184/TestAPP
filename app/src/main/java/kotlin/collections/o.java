package kotlin.collections;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.serialization.internal.m0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static char A(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            androidx.transition.k.m("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        kotlinx.coroutines.future.a.q("Array has more than one element.");
        return (char) 0;
    }

    public static Stream B(org.jsoup.nodes.j jVar, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new org.jsoup.nodes.p(jVar, cls), 273), false);
    }

    public static List C(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return w.e;
        }
        if (length == 1) {
            return q.j(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static Set D(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return y.e;
        }
        if (length == 1) {
            return g0.k(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0.j(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean a(char c, char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean b(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean c(Object obj, Object[] objArr) {
        objArr.getClass();
        return w(obj, objArr) >= 0;
    }

    public static boolean d(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!d((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof kotlin.q) && (obj2 instanceof kotlin.q)) {
                            if (!Arrays.equals(((kotlin.q) obj).e, ((kotlin.q) obj2).e)) {
                            }
                        } else if ((obj instanceof kotlin.x) && (obj2 instanceof kotlin.x)) {
                            if (!Arrays.equals(((kotlin.x) obj).e, ((kotlin.x) obj2).e)) {
                            }
                        } else if ((obj instanceof kotlin.s) && (obj2 instanceof kotlin.s)) {
                            if (!Arrays.equals(((kotlin.s) obj).e, ((kotlin.s) obj2).e)) {
                            }
                        } else if ((obj instanceof kotlin.u) && (obj2 instanceof kotlin.u)) {
                            if (!Arrays.equals(((kotlin.u) obj).e, ((kotlin.u) obj2).e)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void e(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void f(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void h(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static /* synthetic */ void i(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        e(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void j(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        f(0, i, i2, objArr, objArr2);
    }

    public static byte[] k(byte[] bArr, int i, int i2) {
        bArr.getClass();
        m(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] l(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static final void m(int i, int i2) {
        if (i <= i2) {
            return;
        }
        com.google.firebase.platforminfo.b.d(i, "toIndex (", ") is greater than size (", i2);
    }

    public static void n(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void o(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static /* synthetic */ void p(Object[] objArr, Symbol symbol) {
        n(0, objArr.length, symbol, objArr);
    }

    public static ArrayList q(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void r(kotlinx.serialization.c cVar, kotlinx.serialization.encoding.a aVar, String str) {
        cVar.getClass();
        aVar.l().getClass();
        kotlin.jvm.internal.c0.e(1, null);
        m0.f(str, null);
        throw null;
    }

    public static okhttp3.u s(String str) {
        str.getClass();
        kotlin.text.g gVarC = okhttp3.u.e.c(0, str);
        if (gVarC == null) {
            kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.m('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((d0) gVarC.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((d0) gVarC.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = gVarC.b().y;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new okhttp3.u(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            kotlin.text.g gVarC2 = okhttp3.u.f.c(i2, str);
            if (gVarC2 == null) {
                kotlinx.coroutines.future.a.i("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.k kVar = gVarC2.c;
            kotlin.text.f fVarC = kVar.c(1);
            String str3 = fVarC != null ? fVarC.a : null;
            if (str3 == null) {
                i = gVarC2.b().y;
            } else {
                kotlin.text.f fVarC2 = kVar.c(2);
                String strSubstring = fVarC2 != null ? fVarC2.a : null;
                if (strSubstring == null) {
                    kotlin.text.f fVarC3 = kVar.c(3);
                    fVarC3.getClass();
                    strSubstring = fVarC3.a;
                } else if (strSubstring.length() > 0 && kotlin.comparisons.a.e(strSubstring.charAt(0), '\'', false) && kotlin.text.k.D(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i = gVarC2.b().y;
            }
        }
    }

    public static kotlin.ranges.d t(int[] iArr) {
        return new kotlin.ranges.d(0, iArr.length - 1, 1);
    }

    public static int u(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object v(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int w(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String x(byte[] bArr, String str, kotlin.jvm.functions.l lVar, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            lVar = null;
        }
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static byte[] y(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static final String z(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
