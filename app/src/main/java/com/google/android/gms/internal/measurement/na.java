package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class na {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile na l = null;
    public static final com.google.common.base.q m = android.support.v4.media.session.b.w(f1.C);
    public final com.google.android.datatransport.runtime.j a = new com.google.android.datatransport.runtime.j(9);
    public final Context b;
    public final com.google.common.base.q c;
    public final com.google.common.base.q d;
    public final com.google.common.base.q e;
    public final com.google.common.base.q f;
    public final ld g;
    public final com.google.common.base.q h;
    public final zc i;

    public na(Context context, com.google.common.base.q qVar, com.google.common.base.q qVar2, com.google.common.base.q qVar3, com.google.common.base.q qVar4, com.google.common.base.q qVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        qVar.getClass();
        qVar2.getClass();
        qVar3.getClass();
        qVar4.getClass();
        qVar5.getClass();
        com.google.common.base.q qVarW = android.support.v4.media.session.b.w(qVar);
        com.google.common.base.q qVarW2 = android.support.v4.media.session.b.w(qVar2);
        com.google.common.base.q qVarW3 = android.support.v4.media.session.b.w(new qa(qVar3, 0));
        com.google.common.base.q qVarW4 = android.support.v4.media.session.b.w(qVar4);
        com.google.common.base.q qVarW5 = android.support.v4.media.session.b.w(qVar5);
        this.b = applicationContext;
        this.c = qVarW;
        this.d = qVarW2;
        this.e = qVarW3;
        this.f = qVarW4;
        this.g = new ld(applicationContext, qVarW, qVarW4, qVarW2);
        this.h = qVarW5;
        this.i = new zc(applicationContext, qVarW, qVarW3, qVarW2);
    }

    public static void b() {
        synchronized (ea.c) {
        }
        if (k.get() == null && ea.d == null) {
            ea.d = new androidx.compose.runtime.snapshots.g(6);
        }
    }

    public final com.google.common.util.concurrent.v0 a() {
        return (com.google.common.util.concurrent.v0) this.c.get();
    }
}
