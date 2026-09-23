package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.w4;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements w, com.google.firebase.crashlytics.internal.analytics.a, com.google.firebase.crashlytics.internal.stacktrace.a, okhttp3.internal.platform.android.l {
    public static volatile a0 T;
    public final /* synthetic */ int e;
    public static final /* synthetic */ a0 y = new a0(0);
    public static final /* synthetic */ a0 z = new a0(1);
    public static final /* synthetic */ a0 A = new a0(2);
    public static final /* synthetic */ a0 B = new a0(3);
    public static final /* synthetic */ a0 C = new a0(4);
    public static final /* synthetic */ a0 D = new a0(5);
    public static final /* synthetic */ a0 E = new a0(6);
    public static final /* synthetic */ a0 F = new a0(7);
    public static final /* synthetic */ a0 G = new a0(8);
    public static final /* synthetic */ a0 H = new a0(9);
    public static final /* synthetic */ a0 I = new a0(10);
    public static final /* synthetic */ a0 J = new a0(11);
    public static final /* synthetic */ a0 K = new a0(12);
    public static final /* synthetic */ a0 L = new a0(13);
    public static final /* synthetic */ a0 M = new a0(14);
    public static final /* synthetic */ a0 N = new a0(15);
    public static final /* synthetic */ a0 O = new a0(16);
    public static final /* synthetic */ a0 P = new a0(17);
    public static final /* synthetic */ a0 Q = new a0(18);
    public static final /* synthetic */ a0 R = new a0(19);
    public static final /* synthetic */ a0 S = new a0(20);

    public /* synthetic */ a0(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static okio.i d(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = okio.a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new okio.i(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new okio.i(bArrCopyOf);
        }
        return null;
    }

    public static okio.i e(String str) {
        if (str.length() % 2 != 0) {
            kotlinx.coroutines.future.a.s("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (okio.internal.b.a(str.charAt(i2 + 1)) + (okio.internal.b.a(str.charAt(i2)) << 4));
        }
        return new okio.i(bArr);
    }

    public static okio.i g(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(kotlin.text.a.a);
        bytes.getClass();
        okio.i iVar = new okio.i(bytes);
        iVar.z = str;
        return iVar;
    }

    public static okio.i h(byte[] bArr) {
        okio.i iVar = okio.i.A;
        bArr.getClass();
        int length = bArr.length;
        okio.b.d(bArr.length, 0, length);
        return new okio.i(kotlin.collections.o.k(bArr, 0, length));
    }

    public static boolean i(Collection collection, String str) {
        boolean zEquals;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (list.get(0).equals(2)) {
                    String str2 = (String) list.get(1);
                    if (str == null || str2 == null || str.trim().isEmpty() || str2.trim().isEmpty()) {
                        kotlinx.coroutines.future.a.q("can't be null or empty");
                        return false;
                    }
                    if (str2.startsWith("*.")) {
                        int iIndexOf = str.indexOf(".");
                        zEquals = (iIndexOf > 0 && str.substring(iIndexOf + 1).equals(str2.substring(2))) || str.equals(str2.substring(2));
                    } else {
                        zEquals = str.equals(str2);
                    }
                    if (zEquals) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 0:
                List list = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(5, 86400000L, "measurement.config.cache_time").get();
            case 1:
                List list2 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 2:
                List list3 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 3:
                List list4 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(77, 1800000L, "measurement.upload.retry_time").get();
            case 4:
                List list5 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
            case 5:
                List list6 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f4.a.b(0, "measurement.test.boolean_flag", false).get();
            case 6:
                List list7 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Long) com.google.android.gms.internal.measurement.f4.a.g(1, -1L, "measurement.test.cached_long_flag").get();
            case 7:
                List list8 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(23, 27L, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 8:
                List list9 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(62, 7200000L, "measurement.redaction.app_instance_id.ttl").get();
            case 9:
                List list10 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.uri_scheme", 60, "https").get();
            case 10:
                List list11 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.app_allowlist", 32, "").get();
            case 11:
                List list12 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(75, 65536L, "measurement.upload.max_batch_size").get()).longValue());
            case 12:
                List list13 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(25, 0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            case 13:
                List list14 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(30, 3000L, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            case 14:
                List list15 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.u3.b.get();
            case 15:
                List list16 = f0.a;
                return (Boolean) w4.a.get();
            case 16:
                List list17 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.s3.b.get();
            case 17:
                List list18 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(6, "measurement.rb.attribution.service", true).get();
            case 18:
                List list19 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 19:
                List list20 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.a.get();
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.y3.b.get()).booleanValue());
        }
    }

    @Override // okhttp3.internal.platform.android.l
    public boolean b(SSLSocket sSLSocket) {
        return kotlin.text.r.u(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // okhttp3.internal.platform.android.l
    public okhttp3.internal.platform.android.n c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new okhttp3.internal.platform.android.e(superclass);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void k(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }
}
