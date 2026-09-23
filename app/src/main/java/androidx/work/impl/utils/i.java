package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.impl.t;
import androidx.work.y;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final String a = y.g("ProcessUtils");

    public static final boolean a(Context context, androidx.work.b bVar) {
        String strB;
        Object next;
        context.getClass();
        bVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strB = a.b();
        } else {
            strB = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, t.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strB = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strB = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                y.e().b(a, "Unable to check ActivityThread for processName", th);
            }
        }
        return kotlin.jvm.internal.l.a(strB, context.getApplicationInfo().processName);
    }
}
