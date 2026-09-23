package dagger.hilt.android.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.time.c;
import okhttp3.internal.d;
import okhttp3.internal.e;
import okhttp3.internal.g;
import okhttp3.m;
import okhttp3.s;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Thread a;

    public static final long b(long j, c cVar) {
        long j2;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                com.google.firebase.platforminfo.b.q(cVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static int d(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static m e(s sVar, String str) {
        long j;
        String str2;
        sVar.getClass();
        str.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        char c = ';';
        int iG = e.g(str, ';', 0, 0, 6);
        int iG2 = e.g(str, '=', 0, iG, 2);
        String str3 = null;
        if (iG2 != iG) {
            String strQ = e.q(0, iG2, str);
            if (strQ.length() != 0 && e.i(strQ) == -1) {
                String strQ2 = e.q(iG2 + 1, iG, str);
                if (e.i(strQ2) == -1) {
                    int i = iG + 1;
                    int length = str.length();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    String str4 = null;
                    boolean z4 = true;
                    long jF = 253402300799999L;
                    long j2 = -1;
                    String strSubstring = null;
                    while (true) {
                        if (i >= length) {
                            if (j2 == Long.MIN_VALUE) {
                                j = Long.MIN_VALUE;
                            } else if (j2 != -1) {
                                long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                                j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                            } else {
                                j = jF;
                            }
                            String str5 = sVar.d;
                            if (str3 != null) {
                                if (l.a(str5, str3) || (r.n(str5, str3, false) && str5.charAt((str5.length() - str3.length()) - 1) == '.' && !d.a.e(str5))) {
                                    str2 = str3;
                                }
                                return null;
                            }
                            str2 = str5;
                            if (str5.length() == str2.length() || okhttp3.internal.publicsuffix.a.d.a(str2) != null) {
                                if (strSubstring == null || !r.u(strSubstring, "/", false)) {
                                    String strB = sVar.b();
                                    int iK = k.K(strB, '/', 0, 6);
                                    strSubstring = iK != 0 ? strB.substring(0, iK) : "/";
                                }
                                return new m(strQ, strQ2, j, str2, strSubstring, z3, z, z2, z4, str4);
                            }
                            return null;
                        }
                        int iE = e.e(str, c, i, length);
                        int iE2 = e.e(str, '=', i, iE);
                        String strQ3 = e.q(i, iE2, str);
                        String strQ4 = iE2 < iE ? e.q(iE2 + 1, iE, str) : "";
                        if (strQ3.equalsIgnoreCase("expires")) {
                            try {
                                jF = f(strQ4.length(), strQ4);
                                z2 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strQ3.equalsIgnoreCase("max-age")) {
                            try {
                                j2 = Long.parseLong(strQ4);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                patternCompile.getClass();
                                if (!patternCompile.matcher(strQ4).matches()) {
                                    throw e;
                                }
                                j2 = r.u(strQ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z2 = true;
                        } else if (strQ3.equalsIgnoreCase("domain")) {
                            if (r.n(strQ4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strB2 = d.b(k.P(strQ4, "."));
                            if (strB2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = strB2;
                            z4 = false;
                        } else if (strQ3.equalsIgnoreCase("path")) {
                            strSubstring = strQ4;
                        } else if (strQ3.equalsIgnoreCase("secure")) {
                            z3 = true;
                        } else if (strQ3.equalsIgnoreCase("httponly")) {
                            z = true;
                        } else if (strQ3.equalsIgnoreCase("samesite")) {
                            str4 = strQ4;
                        }
                        i = iE + 1;
                        c = ';';
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    public static long f(int i, String str) {
        int iD = d(0, i, str, false);
        Matcher matcher = m.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iH = -1;
        int i5 = -1;
        int i6 = -1;
        while (iD < i) {
            int iD2 = d(iD + 1, i, str, true);
            matcher.region(iD, iD2);
            if (i3 == -1 && matcher.usePattern(m.n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(m.m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iH == -1) {
                Pattern pattern = m.l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iH = k.H(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(m.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iD = d(iD2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        if (iH == -1) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            kotlinx.coroutines.future.a.q("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(g.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iH - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final byte[] g(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        c(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public abstract List a(String str, List list);
}
