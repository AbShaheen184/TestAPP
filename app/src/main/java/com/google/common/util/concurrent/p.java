package com.google.common.util.concurrent;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends org.jsoup.helper.n {
    public static final Unsafe l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                androidx.media3.exoplayer.source.t0.j("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new o());
        }
        try {
            n = unsafe.objectFieldOffset(r.class.getDeclaredField("z"));
            m = unsafe.objectFieldOffset(r.class.getDeclaredField("y"));
            o = unsafe.objectFieldOffset(r.class.getDeclaredField("e"));
            p = unsafe.objectFieldOffset(q.class.getDeclaredField("a"));
            q = unsafe.objectFieldOffset(q.class.getDeclaredField("b"));
            l = unsafe;
        } catch (NoSuchFieldException e2) {
            kotlinx.coroutines.future.a.l(e2);
        }
    }

    @Override // org.jsoup.helper.n
    public final void H(q qVar, q qVar2) {
        l.putObject(qVar, q, qVar2);
    }

    @Override // org.jsoup.helper.n
    public final void I(q qVar, Thread thread) {
        l.putObject(qVar, p, thread);
    }

    @Override // org.jsoup.helper.n
    public final boolean i(r rVar, f fVar, f fVar2) {
        return m.a(l, rVar, m, fVar, fVar2);
    }

    @Override // org.jsoup.helper.n
    public final boolean j(r rVar, Object obj, Object obj2) {
        return n.a(l, rVar, o, obj, obj2);
    }

    @Override // org.jsoup.helper.n
    public final boolean k(r rVar, q qVar, q qVar2) {
        return l.a(l, rVar, n, qVar, qVar2);
    }

    @Override // org.jsoup.helper.n
    public final f p(r rVar) {
        f fVar;
        f fVar2 = f.d;
        do {
            fVar = rVar.y;
            if (fVar2 == fVar) {
                break;
            }
        } while (!i(rVar, fVar, fVar2));
        return fVar;
    }

    @Override // org.jsoup.helper.n
    public final q q(r rVar) {
        q qVar;
        q qVar2 = q.c;
        do {
            qVar = rVar.z;
            if (qVar2 == qVar) {
                break;
            }
        } while (!k(rVar, qVar, qVar2));
        return qVar;
    }
}
