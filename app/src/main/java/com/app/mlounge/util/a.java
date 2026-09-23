package com.app.mlounge.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.foundation.text.contextmenu.internal.g;
import androidx.media3.ui.c0;
import com.app.mlounge.ui.theme.f;
import com.google.firebase.crashlytics.internal.common.q;
import java.util.Collections;
import java.util.Map;
import kotlin.o;
import kotlin.text.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static volatile Context a;
    public static final o b = new o(new f(1));

    public static void a(String str, String str2, String str3) {
        try {
            q qVar = e().a;
            qVar.o.a.a(new com.google.firebase.crashlytics.internal.common.o(qVar, System.currentTimeMillis() - qVar.d, str + "/" + str2 + ": " + str3, 0));
        } catch (Exception unused) {
        }
    }

    public static void b(String str, String str2) {
        a("D", str, str2);
    }

    public static void c(String str, String str2) {
        a("E", str, str2);
    }

    public static void d(String str, String str2, Exception exc) {
        exc.getClass();
        a("E", str, str2);
        try {
            q qVar = e().a;
            Map map = Collections.EMPTY_MAP;
            qVar.o.a.a(new c0(qVar, exc));
        } catch (Exception unused) {
        }
    }

    public static com.google.firebase.crashlytics.b e() {
        Object value = b.getValue();
        value.getClass();
        return (com.google.firebase.crashlytics.b) value;
    }

    public static void f(String str) {
        Context context = a;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("diag_state", 0);
            sharedPreferences.getClass();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("last_state", k.e0(org.mozilla.javascript.Context.VERSION_ES6, str));
            editorEdit.putLong("last_state_ts", System.currentTimeMillis());
            editorEdit.apply();
        } catch (Exception unused) {
        }
    }

    public static void g(String str, String str2) {
        Context context = a;
        if (context == null) {
            return;
        }
        try {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            a("D", str, "MEM " + str2 + ": avail=" + (memoryInfo.availMem / 1048576) + "MB total=" + (memoryInfo.totalMem / 1048576) + "MB lowMem=" + memoryInfo.lowMemory);
        } catch (Exception unused) {
        }
    }

    public static void h(String str, String str2) {
        str2.getClass();
        try {
            q qVar = e().a;
            qVar.o.a.a(new g(8, qVar, str, str2));
        } catch (Exception unused) {
        }
    }

    public static String i(String str) {
        try {
            Uri uri = Uri.parse(str);
            String host = uri.getHost();
            if (host == null) {
                return k.e0(120, str);
            }
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            return k.e0(120, host.concat(path));
        } catch (Exception unused) {
            return k.e0(120, str);
        }
    }
}
