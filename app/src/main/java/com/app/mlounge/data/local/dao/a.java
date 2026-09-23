package com.app.mlounge.data.local.dao;

import kotlin.collections.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ d y;
    public final /* synthetic */ com.app.mlounge.data.local.entity.a z;

    public /* synthetic */ a(d dVar, com.app.mlounge.data.local.entity.a aVar, int i) {
        this.e = i;
        this.y = dVar;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                com.app.mlounge.data.local.entity.a aVar = this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.work.impl.model.b bVar = this.y.b;
                androidx.sqlite.c cVarU = aVar2.U("INSERT OR REPLACE INTO `downloads` (`id`,`url`,`fileName`,`title`,`contentType`,`contentId`,`posterPath`,`quality`,`size`,`status`,`progress`,`downloadedBytes`,`totalBytes`,`filePath`,`headers`,`addedAt`,`completedAt`,`tmdbId`,`season`,`episode`,`failureReason`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    bVar.e(cVarU, aVar);
                    cVarU.Q();
                    q.e(cVarU, null);
                    if (_COROUTINE.a.S(aVar2) == 0) {
                        j = -1;
                    } else {
                        androidx.sqlite.c cVarU2 = aVar2.U("SELECT last_insert_rowid()");
                        try {
                            cVarU2.Q();
                            long j2 = cVarU2.getLong(0);
                            q.e(cVarU2, null);
                            j = j2;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                q.e(cVarU2, th);
                                throw th2;
                            }
                        }
                    }
                    return Long.valueOf(j);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        q.e(cVarU, th3);
                        throw th4;
                    }
                }
            default:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                this.y.c.D(aVar3, this.z);
                return y.a;
        }
    }
}
