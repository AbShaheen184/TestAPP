package com.app.mlounge.data.local.dao;

import androidx.compose.material3.internal.r0;
import androidx.room.r;
import androidx.work.impl.model.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final r a;
    public final androidx.localbroadcastmanager.content.b b = new androidx.localbroadcastmanager.content.b(27, new androidx.work.impl.model.b(11), new s(2));

    public k(r rVar) {
        this.a = rVar;
    }

    public final Object a(com.app.mlounge.data.local.entity.e eVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object objU = okhttp3.internal.platform.android.g.u(this.a, false, true, new r0(23, this, eVar), iVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }
}
