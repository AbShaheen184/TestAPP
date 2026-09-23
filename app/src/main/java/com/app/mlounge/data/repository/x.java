package com.app.mlounge.data.repository;

import androidx.compose.material3.internal.r0;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final com.app.mlounge.data.local.dao.m a;
    public final com.app.mlounge.data.local.dao.h b;
    public final dagger.internal.b c;

    public x(com.app.mlounge.data.local.dao.m mVar, com.app.mlounge.data.local.dao.h hVar, dagger.internal.b bVar) {
        this.a = mVar;
        this.b = hVar;
        this.c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(com.app.mlounge.data.local.entity.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        s sVar;
        if (cVar2 instanceof s) {
            sVar = (s) cVar2;
            int i = sVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.A = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar2);
            }
        } else {
            sVar = new s(this, cVar2);
        }
        s sVar2 = sVar;
        Object obj = sVar2.y;
        int i2 = sVar2.A;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            sVar2.e = cVar;
            sVar2.A = 1;
            com.app.mlounge.data.local.dao.h hVar = this.b;
            Object objU = okhttp3.internal.platform.android.g.u(hVar.a, false, true, new r0(21, hVar, cVar), sVar2);
            if (objU != aVar) {
                objU = yVar;
            }
            if (objU != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return yVar;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cVar = sVar2.e;
        kotlin.a.e(obj);
        TraktSyncManager traktSyncManager = (TraktSyncManager) this.c.get();
        String str = cVar.b;
        String str2 = cVar.l;
        Integer num = cVar.m;
        Integer num2 = cVar.n;
        sVar2.e = null;
        sVar2.A = 2;
        return traktSyncManager.k(str, str2, num, num2, sVar2) == aVar ? aVar : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(com.app.mlounge.data.local.entity.f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i = tVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.A = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object obj = tVar.y;
        int i2 = tVar.A;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 != 0) {
            if (i2 == 1) {
                fVar = tVar.e;
                kotlin.a.e(obj);
            } else {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        }
        kotlin.a.e(obj);
        tVar.e = fVar;
        tVar.A = 1;
        com.app.mlounge.data.local.dao.m mVar = this.a;
        Object objU = okhttp3.internal.platform.android.g.u(mVar.a, false, true, new r0(25, mVar, fVar), tVar);
        if (objU != aVar) {
            objU = yVar;
        }
        if (objU != aVar) {
        }
        TraktSyncManager traktSyncManager = (TraktSyncManager) this.c.get();
        String str = fVar.b;
        String str2 = fVar.j;
        tVar.e = null;
        tVar.A = 2;
        return traktSyncManager.m(str, str2, tVar) == aVar ? aVar : yVar;
    }

    public final androidx.room.coroutines.j c(String str) {
        return com.imsdk.a.g(this.a.a, new String[]{"watchlist"}, new com.app.mlounge.data.local.dao.l(str, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, kotlin.coroutines.jvm.internal.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i = uVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.A = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.y;
        int i2 = uVar.A;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(obj);
            uVar.e = str;
            uVar.A = 1;
            Object objU = okhttp3.internal.platform.android.g.u(this.b.a, false, true, new androidx.compose.material3.r(str, 24), uVar);
            if (objU != aVar) {
                objU = yVar;
            }
            if (objU != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kotlin.a.e(obj);
                return yVar;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = uVar.e;
        kotlin.a.e(obj);
        TraktSyncManager traktSyncManager = (TraktSyncManager) this.c.get();
        uVar.e = null;
        uVar.A = 2;
        return traktSyncManager.l(str, uVar) == aVar ? aVar : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, kotlin.coroutines.jvm.internal.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i = vVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.A = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object obj = vVar.y;
        int i2 = vVar.A;
        kotlin.y yVar = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 != 0) {
            if (i2 == 1) {
                str = vVar.e;
                kotlin.a.e(obj);
            } else {
                if (i2 != 2) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
        }
        kotlin.a.e(obj);
        vVar.e = str;
        vVar.A = 1;
        Object objU = okhttp3.internal.platform.android.g.u(this.a.a, false, true, new com.app.mlounge.data.local.dao.l(str, 0), vVar);
        if (objU != aVar) {
            objU = yVar;
        }
        if (objU != aVar) {
        }
        TraktSyncManager traktSyncManager = (TraktSyncManager) this.c.get();
        vVar.e = null;
        vVar.A = 2;
        return traktSyncManager.n(str, vVar) == aVar ? aVar : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r2.n(r1, r5) == r15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r2.m(r3, r1, r5) == r15) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(com.app.mlounge.data.local.entity.f r17, kotlin.coroutines.jvm.internal.c r18) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.x.f(com.app.mlounge.data.local.entity.f, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
