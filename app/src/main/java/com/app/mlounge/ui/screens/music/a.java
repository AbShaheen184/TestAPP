package com.app.mlounge.ui.screens.music;

import androidx.compose.foundation.layout.i1;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.q1;
import androidx.compose.material3.z5;
import androidx.compose.runtime.s;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.o;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.google.firebase.crashlytics.internal.model.t1;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int e;

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        o oVar = o.b;
        y yVar = y.a;
        switch (i) {
            case 0:
                s sVar = (s) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q1.b(v.u(), "Download", i1.m(oVar, 20), com.app.mlounge.ui.theme.b.m, sVar, 3504, 0);
                } else {
                    sVar.W();
                }
                return yVar;
            case 1:
                s sVar2 = (s) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, t.d, sVar2, 3120, 4);
                } else {
                    sVar2.W();
                }
                return yVar;
            case 2:
                s sVar3 = (s) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, t.d, sVar3, 3120, 4);
                } else {
                    sVar3.W();
                }
                return yVar;
            case 3:
                s sVar4 = (s) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    z5.b("Next Episode ▶", androidx.compose.foundation.layout.b.r(oVar, 20, 12), t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((m6) sVar4.j(n6.a)).m, sVar4, 438, 0, 131064);
                } else {
                    sVar4.W();
                }
                return yVar;
            case 4:
                s sVar5 = (s) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    z5.b("Search all content", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 390, 0, 262138);
                } else {
                    sVar5.W();
                }
                return yVar;
            case 5:
                s sVar6 = (s) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.x(), null, null, com.app.mlounge.ui.theme.b.m, sVar6, 3120, 4);
                } else {
                    sVar6.W();
                }
                return yVar;
            case 6:
                s sVar7 = (s) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB = com.google.firebase.b.b;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.v(19.0f, 6.41f);
                        gVar.t(17.59f, 5.0f);
                        gVar.t(12.0f, 10.59f);
                        gVar.t(6.41f, 5.0f);
                        gVar.t(5.0f, 6.41f);
                        gVar.t(10.59f, 12.0f);
                        gVar.t(5.0f, 17.59f);
                        gVar.t(6.41f, 19.0f);
                        gVar.t(12.0f, 13.41f);
                        gVar.t(17.59f, 19.0f);
                        gVar.t(19.0f, 17.59f);
                        gVar.t(13.41f, 12.0f);
                        gVar.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.b, 0, p0Var);
                        fVarB = eVar.b();
                        com.google.firebase.b.b = fVarB;
                    }
                    q1.b(fVarB, "Clear", null, com.app.mlounge.ui.theme.b.m, sVar7, 3120, 4);
                } else {
                    sVar7.W();
                }
                return yVar;
            case 7:
                int iIntValue8 = ((Integer) obj).intValue();
                TmdbMovie tmdbMovie = (TmdbMovie) obj2;
                tmdbMovie.getClass();
                return androidx.compose.runtime.j.g("movie_", tmdbMovie.a(), "_", iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj).intValue();
                TmdbTvShow tmdbTvShow = (TmdbTvShow) obj2;
                tmdbTvShow.getClass();
                return androidx.compose.runtime.j.g("tv_", tmdbTvShow.b(), "_", iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj).intValue();
                HiAnimeItem hiAnimeItem = (HiAnimeItem) obj2;
                hiAnimeItem.getClass();
                return "anime_" + hiAnimeItem.b() + "_" + iIntValue10;
            case 10:
                int iIntValue11 = ((Integer) obj).intValue();
                Game game = (Game) obj2;
                game.getClass();
                return "game_" + game.c() + "_" + iIntValue11;
            case 11:
                int iIntValue12 = ((Integer) obj).intValue();
                IptvChannel iptvChannel = (IptvChannel) obj2;
                iptvChannel.getClass();
                StringBuilder sbQ = androidx.compose.runtime.j.q("ch_", iptvChannel.c(), "_", iptvChannel.d(), "_");
                sbQ.append(iIntValue12);
                return sbQ.toString();
            case 12:
                int iIntValue13 = ((Integer) obj).intValue();
                EpornerVideo epornerVideo = (EpornerVideo) obj2;
                epornerVideo.getClass();
                return "adult_" + epornerVideo.b() + "_" + iIntValue13;
            case 13:
                int iIntValue14 = ((Integer) obj).intValue();
                obj2.getClass();
                if (obj2 instanceof MusicAlbum) {
                    return "album_" + ((MusicAlbum) obj2).d() + "_" + iIntValue14;
                }
                if (obj2 instanceof MusicArtist) {
                    return "artist_" + ((MusicArtist) obj2).c() + "_" + iIntValue14;
                }
                if (obj2 instanceof MusicTrack) {
                    return "track_" + ((MusicTrack) obj2).d() + "_" + iIntValue14;
                }
                return obj2.hashCode() + "_" + iIntValue14;
            case 14:
                s sVar8 = (s) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (sVar8.T(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    z5.b("Username", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 390, 0, 262138);
                } else {
                    sVar8.W();
                }
                return yVar;
            case 15:
                s sVar9 = (s) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (sVar9.T(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    z5.b("Password", null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 390, 0, 262138);
                } else {
                    sVar9.W();
                }
                return yVar;
            case 16:
                s sVar10 = (s) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (sVar10.T(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    z5.b("System File Manager Required", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 390, 0, 262138);
                } else {
                    sVar10.W();
                }
                return yVar;
            case 17:
                s sVar11 = (s) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (sVar11.T(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    z5.b("New Folder", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 390, 0, 262138);
                } else {
                    sVar11.W();
                }
                return yVar;
            case 18:
                s sVar12 = (s) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (sVar12.T(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    z5.b("Folder name", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar12, 6, 0, 262142);
                } else {
                    sVar12.W();
                }
                return yVar;
            case 19:
                s sVar13 = (s) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (sVar13.T(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    z5.b("Permission Required", null, t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar13, 390, 0, 262138);
                } else {
                    sVar13.W();
                }
                return yVar;
            case 20:
                s sVar14 = (s) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (sVar14.T(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    z5.b("CinemaHQ needs permission to manage files on your storage to browse and save downloads. Please enable 'Allow access to manage all files' in the next screen.", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar14, 6, 0, 262138);
                } else {
                    sVar14.W();
                }
                return yVar;
            case 21:
                s sVar15 = (s) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (sVar15.T(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    z5.b("Aspect Ratio", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar15, 6, 0, 262138);
                } else {
                    sVar15.W();
                }
                return yVar;
            case 22:
                s sVar16 = (s) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (sVar16.T(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    z5.b("Controls Opacity", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar16, 6, 0, 262138);
                } else {
                    sVar16.W();
                }
                return yVar;
            case 23:
                s sVar17 = (s) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (sVar17.T(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    z5.b("Select Player", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar17, 6, 0, 262138);
                } else {
                    sVar17.W();
                }
                return yVar;
            case 24:
                s sVar18 = (s) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (sVar18.T(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    z5.b("Custom Player", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar18, 6, 0, 262138);
                } else {
                    sVar18.W();
                }
                return yVar;
            case 25:
                s sVar19 = (s) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (sVar19.T(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    z5.b("Select Download Manager", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar19, 6, 0, 262138);
                } else {
                    sVar19.W();
                }
                return yVar;
            case 26:
                s sVar20 = (s) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (sVar20.T(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    androidx.compose.ui.graphics.vector.f fVarB2 = kotlin.math.a.y;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = h0.a;
                        p0 p0Var2 = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.v(20.0f, 6.0f);
                        gVar2.s(-8.0f);
                        gVar2.u(-2.0f, -2.0f);
                        gVar2.t(4.0f, 4.0f);
                        gVar2.n(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                        gVar2.t(2.0f, 18.0f);
                        gVar2.n(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        gVar2.s(16.0f);
                        gVar2.n(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                        gVar2.t(22.0f, 8.0f);
                        gVar2.n(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        gVar2.l();
                        gVar2.v(19.0f, 14.0f);
                        gVar2.s(-3.0f);
                        gVar2.A(3.0f);
                        gVar2.s(-2.0f);
                        gVar2.A(-3.0f);
                        gVar2.s(-3.0f);
                        gVar2.A(-2.0f);
                        gVar2.s(3.0f);
                        gVar2.t(14.0f, 9.0f);
                        gVar2.s(2.0f);
                        gVar2.A(3.0f);
                        gVar2.s(3.0f);
                        gVar2.A(2.0f);
                        gVar2.l();
                        androidx.compose.ui.graphics.vector.e.a(eVar2, gVar2.b, 0, p0Var2);
                        fVarB2 = eVar2.b();
                        kotlin.math.a.y = fVarB2;
                    }
                    q1.b(fVarB2, "New Folder", null, com.app.mlounge.ui.theme.b.f, sVar20, 48, 4);
                } else {
                    sVar20.W();
                }
                return yVar;
            case 27:
                s sVar21 = (s) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (sVar21.T(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    q1.b(t1.w(), "Close", null, t.d, sVar21, 3120, 4);
                } else {
                    sVar21.W();
                }
                return yVar;
            case 28:
                s sVar22 = (s) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (sVar22.T(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    q1.b(com.google.android.gms.dynamite.g.s(), "Back", null, t.d, sVar22, 3120, 4);
                } else {
                    sVar22.W();
                }
                return yVar;
            default:
                s sVar23 = (s) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (sVar23.T(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    z5.b("Retry", androidx.compose.foundation.layout.b.r(oVar, 24, 10), t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar23, 438, 0, 262136);
                } else {
                    sVar23.W();
                }
                return yVar;
        }
    }
}
