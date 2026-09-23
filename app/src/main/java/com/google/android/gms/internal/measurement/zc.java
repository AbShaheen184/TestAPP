package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class zc {
    public final Context a;
    public final com.google.common.base.q b;
    public final com.google.common.base.q c;
    public final com.google.common.base.q d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile com.google.common.util.concurrent.g0 h = null;

    public zc(Context context, com.google.common.base.q qVar, com.google.common.base.q qVar2, com.google.common.base.q qVar3) {
        this.a = context;
        this.b = qVar;
        this.c = qVar2;
        this.d = qVar3;
    }
}
