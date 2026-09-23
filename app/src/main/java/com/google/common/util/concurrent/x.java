package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends k {
    public static final _COROUTINE.a G;
    public static final s0 H = new s0(x.class);
    public volatile Set E;
    public volatile int F;

    static {
        Throwable th;
        _COROUTINE.a wVar;
        try {
            wVar = new v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, "E"), AtomicIntegerFieldUpdater.newUpdater(x.class, "F"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            wVar = new w();
        }
        G = wVar;
        if (th != null) {
            H.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
