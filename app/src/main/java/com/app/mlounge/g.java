package com.app.mlounge;

import android.content.Context;
import com.app.mlounge.data.anime.AnikotoScraper;
import com.app.mlounge.data.iptv.c0;
import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.providers.f1;
import com.app.mlounge.data.providers.m1;
import com.app.mlounge.data.providers.w;
import com.app.mlounge.data.remote.api.ChqApi;
import com.app.mlounge.data.remote.api.ChqNtvApi;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.api.TmdbApi;
import com.app.mlounge.data.remote.debrid.AllDebridApi;
import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeApi;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridApi;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxApi;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.trakt.TraktApi;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;
import com.app.mlounge.data.repository.a0;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.m0;
import com.app.mlounge.data.repository.q0;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.x;
import okhttp3.y;
import okhttp3.z;
import org.mozilla.javascript.Token;
import retrofit2.t0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements dagger.internal.e {
    public final h a;
    public final int b;

    public g(h hVar, int i) {
        this.a = hVar;
        this.b = i;
    }

    @Override // javax.inject.a
    public final Object get() {
        dagger.internal.b bVar;
        okhttp3.logging.a aVar = okhttp3.logging.a.e;
        z zVar = z.HTTP_1_1;
        int i = this.b;
        int i2 = 0;
        int i3 = 3;
        int i4 = 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i5 = 1;
        switch (i) {
            case 0:
                return new PremiumizeManager((PremiumizeApi) this.a.e.get(), (y1) this.a.f.get());
            case 1:
                t0 t0Var = (t0) this.a.d.get();
                t0Var.getClass();
                Object objB = t0Var.b(PremiumizeApi.class);
                objB.getClass();
                return (PremiumizeApi) objB;
            case 2:
                y yVar = (y) this.a.c.get();
                yVar.getClass();
                com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(26);
                nVar.k("https://www.premiumize.me/api/");
                nVar.y = yVar;
                nVar.g(retrofit2.converter.gson.a.c());
                return nVar.l();
            case 3:
                Context context = this.a.a.e;
                okhttp3.logging.c cVar = new okhttp3.logging.c();
                cVar.d = aVar;
                okhttp3.f fVar = new okhttp3.f(new File(context.getCacheDir(), "http_cache"));
                List listK = kotlin.collections.q.k(okhttp3.l.e, okhttp3.l.f, okhttp3.l.g);
                x xVar = new x();
                xVar.b = new com.google.android.material.behavior.d(20);
                xVar.b(kotlin.collections.q.j(zVar));
                if (!listK.equals(xVar.s)) {
                    xVar.E = null;
                }
                xVar.s = okhttp3.internal.g.j(listK);
                xVar.c.add(new com.app.mlounge.di.a(i5));
                xVar.c.add(cVar);
                xVar.l = fVar;
                xVar.a(15L);
                xVar.c(20L);
                timeUnit.getClass();
                xVar.A = okhttp3.internal.g.b("timeout", 20L);
                return new y(xVar);
            case 4:
                return new y1(this.a.a.e);
            case 5:
                return new TorBoxManager((TorBoxApi) this.a.i.get(), (y1) this.a.f.get());
            case 6:
                t0 t0Var2 = (t0) this.a.h.get();
                t0Var2.getClass();
                Object objB2 = t0Var2.b(TorBoxApi.class);
                objB2.getClass();
                return (TorBoxApi) objB2;
            case 7:
                y yVar2 = (y) this.a.c.get();
                yVar2.getClass();
                com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(26);
                nVar2.k("https://api.torbox.app/");
                nVar2.y = yVar2;
                nVar2.g(retrofit2.converter.gson.a.c());
                return nVar2.l();
            case 8:
                h hVar = this.a;
                Context context2 = hVar.a.e;
                AppDatabase appDatabase = (AppDatabase) hVar.k.get();
                appDatabase.getClass();
                com.app.mlounge.data.local.dao.d dVarR = appDatabase.r();
                dagger.internal.d.a(dVarR);
                return new com.app.mlounge.data.download.h(context2, dVarR, (y1) this.a.f.get(), (y) this.a.c.get());
            case 9:
                androidx.room.p pVarN = coil3.svg.internal.a.n(this.a.a.e, AppDatabase.class, "cinemahq_db");
                pVarN.a(AppDatabase.m, AppDatabase.n, AppDatabase.l);
                return (AppDatabase) pVarN.b();
            case 10:
                h hVar2 = this.a;
                Context context3 = hVar2.a.e;
                y yVar3 = (y) hVar2.c.get();
                com.app.mlounge.data.local.dao.i iVarA = this.a.a();
                yVar3.getClass();
                return new c0(context3, yVar3, iVarA);
            case 11:
                Context context4 = this.a.a.e;
                okhttp3.logging.c cVar2 = new okhttp3.logging.c();
                cVar2.d = aVar;
                okhttp3.f fVar2 = new okhttp3.f(new File(context4.getCacheDir(), "image_http_cache"));
                List listK2 = kotlin.collections.q.k(okhttp3.l.e, okhttp3.l.f, okhttp3.l.g);
                x xVar2 = new x();
                xVar2.b = new com.google.android.material.behavior.d(20);
                xVar2.b(kotlin.collections.q.j(zVar));
                if (!listK2.equals(xVar2.s)) {
                    xVar2.E = null;
                }
                xVar2.s = okhttp3.internal.g.j(listK2);
                xVar2.c.add(new com.app.mlounge.di.a(i2));
                xVar2.c.add(cVar2);
                xVar2.l = fVar2;
                xVar2.a(15L);
                xVar2.c(20L);
                timeUnit.getClass();
                xVar2.A = okhttp3.internal.g.b("timeout", 20L);
                return new y(xVar2);
            case 12:
                return new com.app.mlounge.data.repository.r((ChqApi) this.a.p.get(), (com.app.mlounge.data.providers.s) this.a.q.get(), (com.app.mlounge.data.providers.q) this.a.r.get(), (f1) this.a.s.get(), (w) this.a.v.get(), (y1) this.a.f.get(), (PremiumizeManager) this.a.g.get(), (TorBoxManager) this.a.j.get(), (AllDebridManager) this.a.y.get(), (RealDebridManager) this.a.B.get(), (AnikotoScraper) this.a.C.get(), (j0) this.a.F.get(), (y) this.a.c.get(), (m1) this.a.u.get(), this.a.a.e);
            case 13:
                t0 t0Var3 = (t0) this.a.o.get();
                t0Var3.getClass();
                Object objB3 = t0Var3.b(ChqApi.class);
                objB3.getClass();
                return (ChqApi) objB3;
            case 14:
                y yVar4 = (y) this.a.c.get();
                yVar4.getClass();
                com.google.firebase.messaging.n nVar3 = new com.google.firebase.messaging.n(26);
                nVar3.k("https://chq-api.ddns.me/");
                nVar3.y = yVar4;
                nVar3.g(retrofit2.converter.gson.a.c());
                return nVar3.l();
            case 15:
                y yVar5 = (y) this.a.c.get();
                yVar5.getClass();
                return new com.app.mlounge.data.providers.s(yVar5);
            case 16:
                y yVar6 = (y) this.a.c.get();
                yVar6.getClass();
                return new com.app.mlounge.data.providers.q(yVar6);
            case 17:
                y yVar7 = (y) this.a.c.get();
                Context context5 = this.a.a.e;
                yVar7.getClass();
                return new f1(context5, yVar7);
            case 18:
                y yVar8 = (y) this.a.c.get();
                m1 m1Var = (m1) this.a.u.get();
                yVar8.getClass();
                m1Var.getClass();
                return new w(yVar8, m1Var);
            case 19:
                y yVar9 = (y) this.a.t.get();
                yVar9.getClass();
                return new m1(yVar9);
            case 20:
                okhttp3.logging.c cVar3 = new okhttp3.logging.c(new androidx.transition.k(13));
                cVar3.d = okhttp3.logging.a.z;
                x xVar3 = new x();
                xVar3.c.add(new com.app.mlounge.di.a(i4));
                xVar3.c.add(cVar3);
                xVar3.d.add(new com.app.mlounge.di.a(i3));
                xVar3.b(kotlin.collections.q.j(zVar));
                xVar3.a(30L);
                xVar3.c(30L);
                timeUnit.getClass();
                xVar3.A = okhttp3.internal.g.b("timeout", 30L);
                return new y(xVar3);
            case 21:
                return new AllDebridManager((AllDebridApi) this.a.x.get(), (y1) this.a.f.get());
            case 22:
                t0 t0Var4 = (t0) this.a.w.get();
                t0Var4.getClass();
                Object objB4 = t0Var4.b(AllDebridApi.class);
                objB4.getClass();
                return (AllDebridApi) objB4;
            case 23:
                y yVar10 = (y) this.a.c.get();
                yVar10.getClass();
                com.google.firebase.messaging.n nVar4 = new com.google.firebase.messaging.n(26);
                nVar4.k("https://api.alldebrid.com/");
                nVar4.y = yVar10;
                nVar4.g(retrofit2.converter.gson.a.c());
                return nVar4.l();
            case 24:
                return new RealDebridManager((RealDebridApi) this.a.A.get(), (y1) this.a.f.get());
            case 25:
                t0 t0Var5 = (t0) this.a.z.get();
                t0Var5.getClass();
                Object objB5 = t0Var5.b(RealDebridApi.class);
                objB5.getClass();
                return (RealDebridApi) objB5;
            case 26:
                y yVar11 = (y) this.a.c.get();
                yVar11.getClass();
                com.google.firebase.messaging.n nVar5 = new com.google.firebase.messaging.n(26);
                nVar5.k("https://api.real-debrid.com/");
                nVar5.y = yVar11;
                nVar5.g(retrofit2.converter.gson.a.c());
                return nVar5.l();
            case 27:
                y yVar12 = (y) this.a.c.get();
                yVar12.getClass();
                return new AnikotoScraper(yVar12);
            case 28:
                return new j0((TmdbApi) this.a.E.get());
            case 29:
                t0 t0Var6 = (t0) this.a.D.get();
                t0Var6.getClass();
                Object objB6 = t0Var6.b(TmdbApi.class);
                objB6.getClass();
                return (TmdbApi) objB6;
            case 30:
                y yVar13 = (y) this.a.t.get();
                yVar13.getClass();
                com.google.firebase.messaging.n nVar6 = new com.google.firebase.messaging.n(26);
                nVar6.k("https://api.themoviedb.org/3/");
                nVar6.y = yVar13;
                nVar6.g(retrofit2.converter.gson.a.c());
                return nVar6.l();
            case 31:
                return new com.app.mlounge.data.remote.ntv.q((y) this.a.c.get());
            case 32:
                AppDatabase appDatabase2 = (AppDatabase) this.a.k.get();
                appDatabase2.getClass();
                com.app.mlounge.data.local.dao.m mVarW = appDatabase2.w();
                dagger.internal.d.a(mVarW);
                AppDatabase appDatabase3 = (AppDatabase) this.a.k.get();
                appDatabase3.getClass();
                com.app.mlounge.data.local.dao.h hVarT = appDatabase3.t();
                dagger.internal.d.a(hVarT);
                dagger.internal.e eVar = this.a.M;
                if (eVar instanceof dagger.internal.b) {
                    bVar = (dagger.internal.b) eVar;
                } else {
                    eVar.getClass();
                    bVar = new dagger.internal.b(eVar);
                }
                return new com.app.mlounge.data.repository.x(mVarW, hVarT, bVar);
            case Token.GETPROP /* 33 */:
                return new TraktSyncManager((TraktManager) this.a.K.get(), (com.app.mlounge.data.repository.x) this.a.L.get(), (j0) this.a.F.get());
            case Token.GETPROPNOWARN /* 34 */:
                return new TraktManager((TraktApi) this.a.J.get(), (y1) this.a.f.get());
            case 35:
                t0 t0Var7 = (t0) this.a.I.get();
                t0Var7.getClass();
                Object objB7 = t0Var7.b(TraktApi.class);
                objB7.getClass();
                return (TraktApi) objB7;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                y yVar14 = (y) this.a.c.get();
                yVar14.getClass();
                x xVarA = yVar14.a();
                xVarA.c.add(new com.app.mlounge.di.a(4));
                y yVar15 = new y(xVarA);
                com.google.firebase.messaging.n nVar7 = new com.google.firebase.messaging.n(26);
                nVar7.k("https://api.trakt.tv/");
                nVar7.y = yVar15;
                nVar7.g(retrofit2.converter.gson.a.c());
                return nVar7.l();
            case Token.SETPROP /* 37 */:
                return new com.app.mlounge.data.local.prefs.a();
            case Token.SETPROP_SUPER /* 38 */:
                return new m0(this.a.b());
            case Token.GETELEM /* 39 */:
                AppDatabase appDatabase4 = (AppDatabase) this.a.k.get();
                appDatabase4.getClass();
                com.app.mlounge.data.local.dao.h hVarT2 = appDatabase4.t();
                dagger.internal.d.a(hVarT2);
                return new q0(hVarT2, this.a.b());
            case Token.GETELEM_SUPER /* 40 */:
                h hVar3 = this.a;
                Context context6 = hVar3.a.e;
                y yVar16 = (y) hVar3.c.get();
                com.app.mlounge.data.local.dao.i iVarA2 = this.a.a();
                yVar16.getClass();
                return new com.app.mlounge.data.iptv.l(context6, yVar16, iVarA2);
            case Token.SETELEM /* 41 */:
                t0 t0Var8 = (t0) this.a.R.get();
                t0Var8.getClass();
                Object objB8 = t0Var8.b(NtvApi.class);
                objB8.getClass();
                return (NtvApi) objB8;
            case Token.SETELEM_SUPER /* 42 */:
                y yVar17 = (y) this.a.c.get();
                yVar17.getClass();
                com.google.firebase.messaging.n nVar8 = new com.google.firebase.messaging.n(26);
                nVar8.k("https://ntv.cx/");
                nVar8.y = yVar17;
                nVar8.g(retrofit2.converter.gson.a.c());
                return nVar8.l();
            case Token.CALL /* 43 */:
                t0 t0Var9 = (t0) this.a.o.get();
                t0Var9.getClass();
                Object objB9 = t0Var9.b(ChqNtvApi.class);
                objB9.getClass();
                return (ChqNtvApi) objB9;
            case Token.NAME /* 44 */:
                return new com.app.mlounge.data.music.h();
            case Token.NUMBER /* 45 */:
                return new a0((com.app.mlounge.data.music.c) this.a.V.get(), (com.app.mlounge.data.music.h) this.a.U.get(), (com.app.mlounge.data.repository.x) this.a.L.get());
            case Token.STRING /* 46 */:
                return new com.app.mlounge.data.music.c((y) this.a.c.get());
            default:
                throw new AssertionError(i);
        }
    }
}
