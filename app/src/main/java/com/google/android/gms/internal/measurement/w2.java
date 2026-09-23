package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2 {
    public final Object a;

    public w2() {
        this.a = new ConcurrentHashMap();
    }

    public abstract Object a();

    public abstract void b(Object obj, long j, byte b);

    public Object c(hg hgVar, ka kaVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        Object obj = concurrentHashMap.get(hgVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(hgVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iA = kaVar.a();
        for (int i = 0; i < iA; i++) {
            if (cg.f.equals(kaVar.i(i))) {
                kaVar.j(i);
            }
        }
        return objA;
    }

    public abstract boolean d(long j, Object obj);

    public abstract boolean e(Level level);

    public abstract void f(zf zfVar);

    public abstract void g(Object obj, long j, boolean z);

    public abstract float h(long j, Object obj);

    public void i(RuntimeException runtimeException, zf zfVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void j(Object obj, long j, float f);

    public abstract double k(long j, Object obj);

    public abstract void l(Object obj, long j, double d);
}
