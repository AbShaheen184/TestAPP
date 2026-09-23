package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ e c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ e f;

    public s(e eVar, int i, Bundle bundle) {
        this.f = eVar;
        Boolean bool = Boolean.TRUE;
        this.c = eVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(com.google.android.gms.common.b bVar);
}
