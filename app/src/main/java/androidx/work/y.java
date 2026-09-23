package androidx.work;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final Object b = new Object();
    public static volatile y c;
    public final int a;

    public y(int i) {
        this.a = i;
    }

    public static y e() {
        y yVar;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new y(3);
                }
                yVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void a(String str, String str2) {
        if (this.a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (this.a <= 3) {
            Log.d(str, str2, th);
        }
    }

    public final void c(String str, String str2) {
        if (this.a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void f(String str, String str2) {
        if (this.a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void h(String str, String str2) {
        if (this.a <= 5) {
            Log.w(str, str2);
        }
    }
}
