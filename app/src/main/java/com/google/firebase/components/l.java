package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.google.firebase.events.c, com.google.firebase.events.b {
    public final HashMap a;
    public ArrayDeque b;
    public final com.google.firebase.concurrent.i c;

    public l() {
        com.google.firebase.concurrent.i iVar = com.google.firebase.concurrent.i.e;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = iVar;
    }

    public final synchronized void a(Executor executor, com.google.firebase.events.a aVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(com.google.firebase.b.class)) {
                this.a.put(com.google.firebase.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(com.google.firebase.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
