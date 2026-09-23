package androidx.media3.common.util;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public f0(Handler handler) {
        this.a = handler;
    }

    public static e0 c() {
        e0 e0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                e0Var = arrayList.isEmpty() ? new e0() : (e0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0Var;
    }

    public final e0 a(int i) {
        e0 e0VarC = c();
        e0VarC.a = this.a.obtainMessage(i);
        return e0VarC;
    }

    public final e0 b(int i, Object obj) {
        e0 e0VarC = c();
        e0VarC.a = this.a.obtainMessage(i, obj);
        return e0VarC;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e(int i) {
        _COROUTINE.a.o(i != 0);
        this.a.removeMessages(i);
    }

    public final void f(int i) {
        this.a.sendEmptyMessage(i);
    }
}
