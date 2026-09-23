package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.exoplayer.source.t0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final Object a = new Object();
    public static boolean b;
    public static int c;

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.q(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.r();
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            androidx.room.b0.i(sb, "Must be called on ", name2, " thread, but got ", name);
            t0.k(sb, ".");
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            kotlinx.coroutines.future.a.q("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            kotlinx.coroutines.future.a.q(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        kotlinx.coroutines.future.a.u(str);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        com.google.firebase.platforminfo.b.h(str);
    }

    public static void i(String str, boolean z) {
        if (z) {
            return;
        }
        kotlinx.coroutines.future.a.u(str);
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
