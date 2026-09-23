package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final Thread a;
    public final f0 b;
    public final m c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public o(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, d0 d0Var, m mVar, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = mVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || d0Var == null || mVar == null) {
            this.b = null;
        } else {
            this.b = d0Var.a(looper, new k(this, 0));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new n(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.i) {
            _COROUTINE.a.A(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            f0 f0Var = this.b;
            f0Var.getClass();
            Handler handler = f0Var.a;
            if (!handler.hasMessages(1)) {
                e0 e0VarA = f0Var.a(1);
                Message message = e0VarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                e0VarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, l lVar) {
        if (this.i) {
            _COROUTINE.a.A(Thread.currentThread() == this.a);
        }
        this.f.add(new androidx.activity.n(new CopyOnWriteArraySet(this.d), i, lVar, 2));
    }

    public final void d() {
        if (this.i) {
            _COROUTINE.a.A(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        for (n nVar : this.d) {
            m mVar = this.c;
            nVar.d = true;
            if (mVar != null && nVar.c) {
                nVar.c = false;
                mVar.f(nVar.a, nVar.b.c());
            }
        }
        this.d.clear();
    }

    public final void e(int i, l lVar) {
        c(i, lVar);
        b();
    }

    public o(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
