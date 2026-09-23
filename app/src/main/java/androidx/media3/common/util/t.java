package androidx.media3.common.util;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static t f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public t(Context context) {
        Executor executorH = b.h();
        this.a = executorH;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorH.execute(new androidx.activity.c(5, this, context));
    }

    public static synchronized t a(Context context) {
        try {
            if (f == null) {
                f = new t(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = this.b;
        for (r rVar : copyOnWriteArrayList) {
            if (rVar.a.get() == null) {
                copyOnWriteArrayList.remove(rVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (r rVar2 : this.b) {
                    rVar2.b.execute(new androidx.activity.l(rVar2, 12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
