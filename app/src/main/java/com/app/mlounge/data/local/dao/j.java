package com.app.mlounge.data.local.dao;

import androidx.compose.material3.internal.r0;
import androidx.room.r;
import java.util.List;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements i {
    public final r a;
    public final androidx.work.impl.model.b b = new androidx.work.impl.model.b(10);

    public j(r rVar) {
        this.a = rVar;
    }

    public final Object a(String str, kotlin.coroutines.jvm.internal.c cVar) {
        Object objU = okhttp3.internal.platform.android.g.u(this.a, false, true, new androidx.compose.material3.r(str, 25), cVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }

    public final Object b(List list, kotlin.coroutines.jvm.internal.c cVar) {
        Object objU = okhttp3.internal.platform.android.g.u(this.a, false, true, new r0(22, this, list), cVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }
}
