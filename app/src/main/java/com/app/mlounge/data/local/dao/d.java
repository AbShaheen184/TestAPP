package com.app.mlounge.data.local.dao;

import androidx.room.r;
import androidx.work.impl.model.q;
import androidx.work.impl.model.s;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final r a;
    public final androidx.work.impl.model.b b = new androidx.work.impl.model.b(7);
    public final s c = new s(1);

    public d(r rVar) {
        this.a = rVar;
    }

    public static Object c(d dVar, final long j, final String str, final long j2, com.app.mlounge.data.download.f fVar) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Object objU = okhttp3.internal.platform.android.g.u(dVar.a, false, true, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.data.local.dao.b
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) throws Exception {
                long j3 = jCurrentTimeMillis;
                String str2 = str;
                long j4 = j2;
                long j5 = j;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("UPDATE downloads SET status = 'completed', progress = 100, completedAt = ?, filePath = ?, totalBytes = ?, downloadedBytes = ? WHERE id = ?");
                try {
                    cVarU.f(1, j3);
                    cVarU.s(2, str2);
                    cVarU.f(3, j4);
                    cVarU.f(4, j4);
                    cVarU.f(5, j5);
                    cVarU.Q();
                    return y.a;
                } finally {
                    cVarU.close();
                }
            }
        }, fVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }

    public final androidx.room.coroutines.j a() {
        androidx.navigation.compose.r rVar = new androidx.navigation.compose.r(28);
        return com.imsdk.a.g(this.a, new String[]{"downloads"}, rVar);
    }

    public final Object b(long j, kotlin.coroutines.jvm.internal.i iVar) {
        return okhttp3.internal.platform.android.g.u(this.a, true, false, new androidx.compose.foundation.text.c(j, 5), iVar);
    }

    public final Object d(long j, String str, com.app.mlounge.data.download.f fVar) {
        Object objU = okhttp3.internal.platform.android.g.u(this.a, false, true, new q(str, j), fVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }

    public final Object e(com.app.mlounge.data.local.entity.a aVar, kotlin.coroutines.jvm.internal.i iVar) {
        Object objU = okhttp3.internal.platform.android.g.u(this.a, false, true, new a(this, aVar, 1), iVar);
        return objU == kotlin.coroutines.intrinsics.a.e ? objU : y.a;
    }
}
