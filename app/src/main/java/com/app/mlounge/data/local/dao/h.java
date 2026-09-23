package com.app.mlounge.data.local.dao;

import androidx.room.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final r a;
    public final androidx.work.impl.model.b b = new androidx.work.impl.model.b(9);

    public h(r rVar) {
        this.a = rVar;
    }

    public final androidx.room.coroutines.j a() {
        g gVar = new g(0);
        return com.imsdk.a.g(this.a, new String[]{"history"}, gVar);
    }
}
