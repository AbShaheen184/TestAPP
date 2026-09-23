package com.app.mlounge.ui;

import androidx.compose.foundation.text.o0;
import androidx.navigation.i0;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import com.app.mlounge.ui.screens.player.k0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ t(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        androidx.navigation.d dVar = i0.i;
        androidx.navigation.d dVar2 = i0.a;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.navigation.h hVar = (androidx.navigation.h) obj;
                hVar.getClass();
                hVar.a.z = dVar2;
                hVar.a(0);
                return yVar;
            case 1:
                androidx.navigation.h hVar2 = (androidx.navigation.h) obj;
                hVar2.getClass();
                hVar2.a.z = dVar2;
                hVar2.a(0);
                return yVar;
            case 2:
                androidx.navigation.h hVar3 = (androidx.navigation.h) obj;
                hVar3.getClass();
                hVar3.a.z = dVar;
                hVar3.a("play");
                return yVar;
            case 3:
                androidx.navigation.h hVar4 = (androidx.navigation.h) obj;
                hVar4.getClass();
                hVar4.a.z = dVar2;
                return yVar;
            case 4:
                androidx.navigation.h hVar5 = (androidx.navigation.h) obj;
                hVar5.getClass();
                hVar5.a.z = dVar;
                return yVar;
            case 5:
                androidx.navigation.h hVar6 = (androidx.navigation.h) obj;
                hVar6.getClass();
                hVar6.a.z = dVar;
                return yVar;
            case 6:
                androidx.navigation.h hVar7 = (androidx.navigation.h) obj;
                hVar7.getClass();
                hVar7.a.z = dVar2;
                return yVar;
            case 7:
                androidx.navigation.c0 c0Var = (androidx.navigation.c0) obj;
                String str = com.app.mlounge.ui.navigation.k.g.a;
                c0Var.getClass();
                c0Var.a(str);
                c0Var.d = -1;
                c0Var.f = true;
                c0Var.g = false;
                c0Var.b = true;
                return yVar;
            case 8:
                com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) obj;
                wVar.getClass();
                return wVar.a;
            case 9:
                HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) obj;
                hiAnimeEpisode.getClass();
                return androidx.compose.runtime.j.i("ep_", hiAnimeEpisode.a());
            case 10:
                com.app.mlounge.data.local.entity.a aVar = (com.app.mlounge.data.local.entity.a) obj;
                aVar.getClass();
                return Long.valueOf(aVar.a);
            case 11:
                TmdbGenre tmdbGenre = (TmdbGenre) obj;
                tmdbGenre.getClass();
                return tmdbGenre.b();
            case 12:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 13:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 14:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 15:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 16:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 17:
                TmdbMultiResult tmdbMultiResult = (TmdbMultiResult) obj;
                tmdbMultiResult.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbMultiResult.b(), "mov_");
            case 18:
                TmdbMultiResult tmdbMultiResult2 = (TmdbMultiResult) obj;
                tmdbMultiResult2.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbMultiResult2.b(), "tv_");
            case 19:
                ((Boolean) obj).getClass();
                Object obj2 = k0.a;
                return yVar;
            case 20:
                String str2 = (String) obj;
                str2.getClass();
                return (!kotlin.text.r.u(str2, "#EXT-X-STREAM-INF:", false) || kotlin.text.k.z(str2, "BANDWIDTH=", true)) ? str2 : kotlin.text.r.s(str2, "#EXT-X-STREAM-INF:", "#EXT-X-STREAM-INF:BANDWIDTH=0,", false);
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                return Boolean.valueOf(kotlin.text.k.g0(str3).toString().length() > 0);
            case 22:
                ((androidx.compose.foundation.lazy.grid.s) obj).getClass();
                return new androidx.compose.foundation.lazy.grid.b(coil3.svg.internal.a.a(androidx.compose.foundation.lazy.grid.s.b));
            case 23:
                ((o0) obj).getClass();
                return yVar;
            case 24:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            case 25:
                File file2 = (File) obj;
                file2.getClass();
                String absolutePath = file2.getAbsolutePath();
                absolutePath.getClass();
                return absolutePath;
            case 26:
                TmdbEpisode tmdbEpisode = (TmdbEpisode) obj;
                tmdbEpisode.getClass();
                return androidx.privacysandbox.ads.adservices.java.internal.a.n(tmdbEpisode.b(), "ep_");
            case 27:
                TmdbGenre tmdbGenre2 = (TmdbGenre) obj;
                tmdbGenre2.getClass();
                return tmdbGenre2.b();
            case 28:
                return Integer.valueOf(((TmdbMovie) obj).a());
            default:
                return Integer.valueOf(((TmdbMultiResult) obj).b());
        }
    }
}
