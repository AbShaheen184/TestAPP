package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    public /* synthetic */ c0(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z5.b("More", null, 0L, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, sVar, 6, 24576, 245758);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                EpornerVideo epornerVideo = (EpornerVideo) obj2;
                epornerVideo.getClass();
                return iIntValue2 + "_" + epornerVideo.b();
            case 2:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, androidx.compose.ui.graphics.t.d, sVar2, 3120, 4);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 3:
                int iIntValue4 = ((Integer) obj).intValue();
                HiAnimeItem hiAnimeItem = (HiAnimeItem) obj2;
                hiAnimeItem.getClass();
                Object objB = hiAnimeItem.b();
                if (objB == null) {
                    objB = Integer.valueOf(hiAnimeItem.hashCode());
                }
                return iIntValue4 + "_" + objB;
            case 4:
                int iIntValue5 = ((Integer) obj).intValue();
                HiAnimeItem hiAnimeItem2 = (HiAnimeItem) obj2;
                hiAnimeItem2.getClass();
                Object objB2 = hiAnimeItem2.b();
                if (objB2 == null) {
                    objB2 = Integer.valueOf(hiAnimeItem2.hashCode());
                }
                return iIntValue5 + "_" + objB2;
            case 5:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, androidx.compose.ui.graphics.t.d, sVar3, 3120, 4);
                } else {
                    sVar3.W();
                }
                return yVar;
            case 6:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.a.e;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarJ = androidx.privacysandbox.ads.adservices.java.internal.a.j(17.65f, 6.35f);
                        gVarJ.m(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
                        gVarJ.n(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
                        gVarJ.x(3.57f, 8.0f, 7.99f, 8.0f);
                        gVarJ.n(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
                        gVarJ.s(-2.08f);
                        gVarJ.n(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
                        gVarJ.n(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        gVarJ.x(2.69f, -6.0f, 6.0f, -6.0f);
                        gVarJ.n(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                        gVarJ.t(13.0f, 11.0f);
                        gVarJ.s(7.0f);
                        gVarJ.z(4.0f);
                        gVarJ.u(-2.35f, 2.35f);
                        gVarJ.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVarJ.b, 0, p0Var);
                        fVarB = eVar.b();
                        _COROUTINE.a.e = fVarB;
                    }
                    q1.b(fVarB, "Retry", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.f, sVar4, 3504, 0);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 7:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    q1.b(okhttp3.internal.platform.android.g.k(), "Delete", i1.m(oVar, 20), androidx.compose.ui.graphics.a0.d(4294198070L), sVar5, 3504, 0);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 8:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    q1.b(okhttp3.internal.platform.android.g.n(), "Play", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.f, sVar6, 3504, 0);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 9:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (sVar7.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    q1.b(okhttp3.internal.platform.android.g.k(), "Delete", i1.m(oVar, 20), androidx.compose.ui.graphics.a0.d(4294198070L), sVar7, 3504, 0);
                } else {
                    sVar7.W();
                }
                return yVar;
            case 10:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (sVar8.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    z5.b("Delete Download", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 390, 0, 262138);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 11:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (sVar9.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    q1.b(com.imsdk.a.o(), "Pause", i1.m(oVar, 20), androidx.compose.ui.graphics.a0.d(4294944550L), sVar9, 3504, 0);
                } else {
                    sVar9.W();
                }
                return yVar;
            case 12:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (sVar10.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    q1.b(t1.w(), "Cancel", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar10, 3504, 0);
                } else {
                    sVar10.W();
                }
                return yVar;
            case 13:
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (sVar11.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    q1.b(t1.w(), "Cancel", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar11, 3504, 0);
                } else {
                    sVar11.W();
                }
                return yVar;
            case 14:
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (sVar12.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    q1.b(okhttp3.internal.platform.android.g.n(), "Resume", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.f, sVar12, 3504, 0);
                } else {
                    sVar12.W();
                }
                return yVar;
            case 15:
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (sVar13.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    q1.b(okhttp3.internal.platform.android.g.k(), "Delete", i1.m(oVar, 20), androidx.compose.ui.graphics.a0.d(4294198070L), sVar13, 3504, 0);
                } else {
                    sVar13.W();
                }
                return yVar;
            case 16:
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (sVar14.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, androidx.compose.ui.graphics.t.d, sVar14, 3120, 4);
                } else {
                    sVar14.W();
                }
                return yVar;
            case 17:
                ((Integer) obj).intValue();
                com.app.mlounge.data.local.entity.c cVar = (com.app.mlounge.data.local.entity.c) obj2;
                cVar.getClass();
                return cVar.a;
            case 18:
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!sVar15.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    sVar15.W();
                }
                return yVar;
            case 19:
                androidx.compose.runtime.s sVar16 = (androidx.compose.runtime.s) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (sVar16.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    z5.b("Choose Source", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 6, 0, 262142);
                } else {
                    sVar16.W();
                }
                return yVar;
            case 20:
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!sVar17.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    sVar17.W();
                }
                return yVar;
            case 21:
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (sVar18.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    z5.b("Resolving Stream", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar18, 6, 0, 262142);
                } else {
                    sVar18.W();
                }
                return yVar;
            case 22:
                int iIntValue22 = ((Integer) obj).intValue();
                SportsMatch sportsMatch = (SportsMatch) obj2;
                sportsMatch.getClass();
                return "sport_" + iIntValue22 + "_" + sportsMatch.c();
            case 23:
                int iIntValue23 = ((Integer) obj).intValue();
                IptvChannel iptvChannel = (IptvChannel) obj2;
                iptvChannel.getClass();
                return iIntValue23 + "_" + iptvChannel.c() + "_" + iptvChannel.d();
            case 24:
                int iIntValue24 = ((Integer) obj).intValue();
                IptvChannel iptvChannel2 = (IptvChannel) obj2;
                iptvChannel2.getClass();
                String strC = iptvChannel2.c();
                String strE = iptvChannel2.e();
                String strD = iptvChannel2.d();
                StringBuilder sb = new StringBuilder();
                sb.append(iIntValue24);
                sb.append("_");
                sb.append(strC);
                sb.append("_");
                sb.append(strE);
                return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, "_", strD);
            case 25:
                androidx.compose.runtime.s sVar19 = (androidx.compose.runtime.s) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (sVar19.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, androidx.compose.ui.graphics.t.d, sVar19, 3120, 4);
                } else {
                    sVar19.W();
                }
                return yVar;
            case 26:
                int iIntValue26 = ((Integer) obj).intValue();
                TmdbMovie tmdbMovie = (TmdbMovie) obj2;
                tmdbMovie.getClass();
                return iIntValue26 + "_" + tmdbMovie.a();
            case 27:
                int iIntValue27 = ((Integer) obj).intValue();
                TmdbCastMember tmdbCastMember = (TmdbCastMember) obj2;
                tmdbCastMember.getClass();
                return iIntValue27 + "_" + tmdbCastMember.b();
            case 28:
                androidx.compose.runtime.s sVar20 = (androidx.compose.runtime.s) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (sVar20.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, androidx.compose.ui.graphics.t.d, sVar20, 3120, 4);
                } else {
                    sVar20.W();
                }
                return yVar;
            default:
                androidx.compose.runtime.s sVar21 = (androidx.compose.runtime.s) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (sVar21.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    q1.b(org.jsoup.helper.n.w(), "Play", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.f, sVar21, 3504, 0);
                } else {
                    sVar21.W();
                }
                return yVar;
        }
    }
}
