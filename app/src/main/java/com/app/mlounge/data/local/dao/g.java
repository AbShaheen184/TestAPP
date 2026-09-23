package com.app.mlounge.data.local.dao;

import android.content.Context;
import androidx.navigation.i0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.d0;
import kotlin.text.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ g(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.e) {
            case 0:
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT * FROM history ORDER BY watchedAt DESC");
                try {
                    int iU = _COROUTINE.b.u(cVarU, "contentId");
                    int iU2 = _COROUTINE.b.u(cVarU, "contentType");
                    int iU3 = _COROUTINE.b.u(cVarU, "title");
                    int iU4 = _COROUTINE.b.u(cVarU, "posterPath");
                    int iU5 = _COROUTINE.b.u(cVarU, "backdropPath");
                    int iU6 = _COROUTINE.b.u(cVarU, "rating");
                    int iU7 = _COROUTINE.b.u(cVarU, "releaseDate");
                    int iU8 = _COROUTINE.b.u(cVarU, "overview");
                    int iU9 = _COROUTINE.b.u(cVarU, "watchedAt");
                    int iU10 = _COROUTINE.b.u(cVarU, "progress");
                    int iU11 = _COROUTINE.b.u(cVarU, "duration");
                    int iU12 = _COROUTINE.b.u(cVarU, "externalId");
                    int iU13 = _COROUTINE.b.u(cVarU, "season");
                    int iU14 = _COROUTINE.b.u(cVarU, "episode");
                    int iU15 = _COROUTINE.b.u(cVarU, "episodeTitle");
                    ArrayList arrayList = new ArrayList();
                    while (cVarU.Q()) {
                        String strF = cVarU.F(iU);
                        String strF2 = cVarU.F(iU2);
                        String strF3 = cVarU.F(iU3);
                        String strF4 = cVarU.isNull(iU4) ? null : cVarU.F(iU4);
                        int i = iU15;
                        arrayList.add(new com.app.mlounge.data.local.entity.c(strF, strF2, strF3, strF4, cVarU.isNull(iU5) ? null : cVarU.F(iU5), cVarU.isNull(iU6) ? null : Double.valueOf(cVarU.getDouble(iU6)), cVarU.isNull(iU7) ? null : cVarU.F(iU7), cVarU.isNull(iU8) ? null : cVarU.F(iU8), cVarU.getLong(iU9), cVarU.isNull(iU10) ? null : Long.valueOf(cVarU.getLong(iU10)), cVarU.isNull(iU11) ? null : Long.valueOf(cVarU.getLong(iU11)), cVarU.isNull(iU12) ? null : cVarU.F(iU12), cVarU.isNull(iU13) ? null : Integer.valueOf((int) cVarU.getLong(iU13)), cVarU.isNull(iU14) ? null : Integer.valueOf((int) cVarU.getLong(iU14)), cVarU.isNull(i) ? null : cVarU.F(i)));
                        iU15 = i;
                        iU3 = iU3;
                        iU4 = iU4;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarU.close();
                }
            case 1:
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("SELECT * FROM history ORDER BY watchedAt DESC");
                try {
                    int iU16 = _COROUTINE.b.u(cVarU2, "contentId");
                    int iU17 = _COROUTINE.b.u(cVarU2, "contentType");
                    int iU18 = _COROUTINE.b.u(cVarU2, "title");
                    int iU19 = _COROUTINE.b.u(cVarU2, "posterPath");
                    int iU20 = _COROUTINE.b.u(cVarU2, "backdropPath");
                    int iU21 = _COROUTINE.b.u(cVarU2, "rating");
                    int iU22 = _COROUTINE.b.u(cVarU2, "releaseDate");
                    int iU23 = _COROUTINE.b.u(cVarU2, "overview");
                    int iU24 = _COROUTINE.b.u(cVarU2, "watchedAt");
                    int iU25 = _COROUTINE.b.u(cVarU2, "progress");
                    int iU26 = _COROUTINE.b.u(cVarU2, "duration");
                    int iU27 = _COROUTINE.b.u(cVarU2, "externalId");
                    int iU28 = _COROUTINE.b.u(cVarU2, "season");
                    int iU29 = _COROUTINE.b.u(cVarU2, "episode");
                    int iU30 = _COROUTINE.b.u(cVarU2, "episodeTitle");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarU2.Q()) {
                        String strF5 = cVarU2.F(iU16);
                        String strF6 = cVarU2.F(iU17);
                        String strF7 = cVarU2.F(iU18);
                        String strF8 = cVarU2.isNull(iU19) ? null : cVarU2.F(iU19);
                        int i2 = iU30;
                        arrayList2.add(new com.app.mlounge.data.local.entity.c(strF5, strF6, strF7, strF8, cVarU2.isNull(iU20) ? null : cVarU2.F(iU20), cVarU2.isNull(iU21) ? null : Double.valueOf(cVarU2.getDouble(iU21)), cVarU2.isNull(iU22) ? null : cVarU2.F(iU22), cVarU2.isNull(iU23) ? null : cVarU2.F(iU23), cVarU2.getLong(iU24), cVarU2.isNull(iU25) ? null : Long.valueOf(cVarU2.getLong(iU25)), cVarU2.isNull(iU26) ? null : Long.valueOf(cVarU2.getLong(iU26)), cVarU2.isNull(iU27) ? null : cVarU2.F(iU27), cVarU2.isNull(iU28) ? null : Integer.valueOf((int) cVarU2.getLong(iU28)), cVarU2.isNull(iU29) ? null : Integer.valueOf((int) cVarU2.getLong(iU29)), cVarU2.isNull(i2) ? null : cVarU2.F(i2)));
                        iU30 = i2;
                        iU18 = iU18;
                        iU19 = iU19;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarU2.close();
                }
            case 2:
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("DELETE FROM history");
                try {
                    cVarU3.Q();
                    return y.a;
                } finally {
                    cVarU3.close();
                }
            case 3:
                androidx.sqlite.a aVar4 = (androidx.sqlite.a) obj;
                aVar4.getClass();
                androidx.sqlite.c cVarU4 = aVar4.U("SELECT * FROM watch_progress");
                try {
                    int iU31 = _COROUTINE.b.u(cVarU4, "contentKey");
                    int iU32 = _COROUTINE.b.u(cVarU4, "positionMs");
                    int iU33 = _COROUTINE.b.u(cVarU4, "durationMs");
                    int iU34 = _COROUTINE.b.u(cVarU4, "updatedAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarU4.Q()) {
                        arrayList3.add(new com.app.mlounge.data.local.entity.e(cVarU4.F(iU31), cVarU4.getLong(iU32), cVarU4.getLong(iU33), cVarU4.getLong(iU34)));
                    }
                    cVarU4.close();
                    return arrayList3;
                } catch (Throwable th) {
                    cVarU4.close();
                    throw th;
                }
            case 4:
                androidx.sqlite.a aVar5 = (androidx.sqlite.a) obj;
                aVar5.getClass();
                androidx.sqlite.c cVarU5 = aVar5.U("SELECT * FROM watchlist ORDER BY addedAt DESC");
                try {
                    int iU35 = _COROUTINE.b.u(cVarU5, "contentId");
                    int iU36 = _COROUTINE.b.u(cVarU5, "contentType");
                    int iU37 = _COROUTINE.b.u(cVarU5, "title");
                    int iU38 = _COROUTINE.b.u(cVarU5, "posterPath");
                    int iU39 = _COROUTINE.b.u(cVarU5, "backdropPath");
                    int iU40 = _COROUTINE.b.u(cVarU5, "rating");
                    int iU41 = _COROUTINE.b.u(cVarU5, "releaseDate");
                    int iU42 = _COROUTINE.b.u(cVarU5, "overview");
                    int iU43 = _COROUTINE.b.u(cVarU5, "addedAt");
                    int iU44 = _COROUTINE.b.u(cVarU5, "externalId");
                    int iU45 = _COROUTINE.b.u(cVarU5, "providerData");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarU5.Q()) {
                        arrayList4.add(new com.app.mlounge.data.local.entity.f(cVarU5.F(iU35), cVarU5.F(iU36), cVarU5.F(iU37), cVarU5.isNull(iU38) ? null : cVarU5.F(iU38), cVarU5.isNull(iU39) ? null : cVarU5.F(iU39), cVarU5.isNull(iU40) ? null : Double.valueOf(cVarU5.getDouble(iU40)), cVarU5.isNull(iU41) ? null : cVarU5.F(iU41), cVarU5.isNull(iU42) ? null : cVarU5.F(iU42), cVarU5.getLong(iU43), cVarU5.isNull(iU44) ? null : cVarU5.F(iU44), cVarU5.isNull(iU45) ? null : cVarU5.F(iU45)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarU5.close();
                }
            case 5:
                androidx.sqlite.a aVar6 = (androidx.sqlite.a) obj;
                aVar6.getClass();
                androidx.sqlite.c cVarU6 = aVar6.U("SELECT * FROM watchlist ORDER BY addedAt DESC");
                try {
                    int iU46 = _COROUTINE.b.u(cVarU6, "contentId");
                    int iU47 = _COROUTINE.b.u(cVarU6, "contentType");
                    int iU48 = _COROUTINE.b.u(cVarU6, "title");
                    int iU49 = _COROUTINE.b.u(cVarU6, "posterPath");
                    int iU50 = _COROUTINE.b.u(cVarU6, "backdropPath");
                    int iU51 = _COROUTINE.b.u(cVarU6, "rating");
                    int iU52 = _COROUTINE.b.u(cVarU6, "releaseDate");
                    int iU53 = _COROUTINE.b.u(cVarU6, "overview");
                    int iU54 = _COROUTINE.b.u(cVarU6, "addedAt");
                    int iU55 = _COROUTINE.b.u(cVarU6, "externalId");
                    int iU56 = _COROUTINE.b.u(cVarU6, "providerData");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarU6.Q()) {
                        arrayList5.add(new com.app.mlounge.data.local.entity.f(cVarU6.F(iU46), cVarU6.F(iU47), cVarU6.F(iU48), cVarU6.isNull(iU49) ? null : cVarU6.F(iU49), cVarU6.isNull(iU50) ? null : cVarU6.F(iU50), cVarU6.isNull(iU51) ? null : Double.valueOf(cVarU6.getDouble(iU51)), cVarU6.isNull(iU52) ? null : cVarU6.F(iU52), cVarU6.isNull(iU53) ? null : cVarU6.F(iU53), cVarU6.getLong(iU54), cVarU6.isNull(iU55) ? null : cVarU6.F(iU55), cVarU6.isNull(iU56) ? null : cVarU6.F(iU56)));
                        break;
                    }
                    return arrayList5;
                } finally {
                    cVarU6.close();
                }
            case 6:
                androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                bVar.getClass();
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.d("DataStore", "Preferences file corrupt! User settings may be reset. Error: " + bVar.getMessage(), bVar);
                return new androidx.datastore.preferences.core.a(true);
            case 7:
                String strD0 = ((org.jsoup.nodes.j) obj).d0();
                strD0.getClass();
                return kotlin.text.k.g0(strD0).toString();
            case 8:
                kotlin.text.g gVar = (kotlin.text.g) obj;
                gVar.getClass();
                return r.w((String) ((d0) gVar.a()).get(1));
            case 9:
                kotlin.text.g gVar2 = (kotlin.text.g) obj;
                gVar2.getClass();
                return r.w((String) ((d0) gVar2.a()).get(1));
            case 10:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(kotlin.text.k.z(str, ".m3u8", false));
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + "=" + entry.getValue();
            case 12:
                androidx.navigation.h hVar = (androidx.navigation.h) obj;
                hVar.getClass();
                hVar.a.z = i0.i;
                return y.a;
            case 13:
                androidx.navigation.h hVar2 = (androidx.navigation.h) obj;
                hVar2.getClass();
                hVar2.a.z = i0.i;
                return y.a;
            case 14:
                androidx.navigation.h hVar3 = (androidx.navigation.h) obj;
                hVar3.getClass();
                hVar3.a.z = i0.i;
                return y.a;
            case 15:
                androidx.navigation.h hVar4 = (androidx.navigation.h) obj;
                hVar4.getClass();
                hVar4.a.z = i0.i;
                return y.a;
            case 16:
                androidx.navigation.h hVar5 = (androidx.navigation.h) obj;
                hVar5.getClass();
                hVar5.a.z = i0.i;
                return y.a;
            case 17:
                androidx.navigation.h hVar6 = (androidx.navigation.h) obj;
                hVar6.getClass();
                hVar6.a.z = i0.i;
                hVar6.a("");
                return y.a;
            case 18:
                androidx.navigation.h hVar7 = (androidx.navigation.h) obj;
                hVar7.getClass();
                hVar7.a.z = i0.i;
                hVar7.a("");
                return y.a;
            case 19:
                androidx.navigation.h hVar8 = (androidx.navigation.h) obj;
                hVar8.getClass();
                hVar8.a.z = i0.i;
                hVar8.a("tv");
                return y.a;
            case 20:
                androidx.navigation.h hVar9 = (androidx.navigation.h) obj;
                hVar9.getClass();
                hVar9.a.z = i0.a;
                return y.a;
            case 21:
                androidx.navigation.h hVar10 = (androidx.navigation.h) obj;
                hVar10.getClass();
                hVar10.a.z = i0.i;
                hVar10.a("");
                return y.a;
            case 22:
                androidx.navigation.h hVar11 = (androidx.navigation.h) obj;
                hVar11.getClass();
                hVar11.a.z = i0.a;
                hVar11.a(0);
                return y.a;
            case 23:
                androidx.navigation.h hVar12 = (androidx.navigation.h) obj;
                hVar12.getClass();
                hVar12.a.z = i0.a;
                hVar12.a(0);
                return y.a;
            case 24:
                androidx.navigation.h hVar13 = (androidx.navigation.h) obj;
                hVar13.getClass();
                hVar13.a.z = i0.a;
                hVar13.a(0);
                return y.a;
            case 25:
                androidx.navigation.h hVar14 = (androidx.navigation.h) obj;
                hVar14.getClass();
                hVar14.a.z = i0.i;
                hVar14.a("");
                return y.a;
            case 26:
                androidx.navigation.h hVar15 = (androidx.navigation.h) obj;
                hVar15.getClass();
                hVar15.a.z = i0.i;
                hVar15.a("");
                return y.a;
            case 27:
                androidx.navigation.h hVar16 = (androidx.navigation.h) obj;
                hVar16.getClass();
                hVar16.a.z = i0.i;
                return y.a;
            case 28:
                androidx.navigation.h hVar17 = (androidx.navigation.h) obj;
                hVar17.getClass();
                hVar17.a.z = i0.i;
                return y.a;
            default:
                androidx.navigation.h hVar18 = (androidx.navigation.h) obj;
                hVar18.getClass();
                hVar18.a.z = i0.i;
                hVar18.a("Sources");
                return y.a;
        }
    }
}
