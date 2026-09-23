package com.app.mlounge;

import com.app.mlounge.data.iptv.c0;
import com.app.mlounge.data.local.AppDatabase;
import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.remote.api.ChqNtvApi;
import com.app.mlounge.data.remote.api.NtvApi;
import com.app.mlounge.data.remote.debrid.AllDebridManager;
import com.app.mlounge.data.remote.debrid.PremiumizeManager;
import com.app.mlounge.data.remote.debrid.RealDebridManager;
import com.app.mlounge.data.remote.debrid.TorBoxManager;
import com.app.mlounge.data.remote.trakt.TraktManager;
import com.app.mlounge.data.remote.trakt.TraktSyncManager;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.data.repository.m0;
import com.app.mlounge.data.repository.q0;
import com.app.mlounge.data.repository.x;
import com.app.mlounge.ui.screens.player.a1;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.b1;
import com.app.mlounge.ui.viewmodel.b2;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.f0;
import com.app.mlounge.ui.viewmodel.h1;
import com.app.mlounge.ui.viewmodel.k0;
import com.app.mlounge.ui.viewmodel.p1;
import com.app.mlounge.ui.viewmodel.w1;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements dagger.internal.e {
    public final h a;
    public final j b;
    public final int c;

    public i(h hVar, j jVar, int i) {
        this.a = hVar;
        this.b = jVar;
        this.c = i;
    }

    @Override // javax.inject.a
    public final Object get() {
        h hVar = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                return new com.app.mlounge.ui.viewmodel.c((com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (com.app.mlounge.data.local.prefs.a) hVar.N.get());
            case 1:
                return new com.app.mlounge.ui.viewmodel.g((com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 2:
                return new com.app.mlounge.ui.viewmodel.k((y1) hVar.f.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get());
            case 3:
                return new com.app.mlounge.ui.viewmodel.o((com.app.mlounge.data.download.h) hVar.l.get(), (y1) hVar.f.get());
            case 4:
                com.app.mlounge.data.repository.r rVar = (com.app.mlounge.data.repository.r) hVar.G.get();
                AppDatabase appDatabase = (AppDatabase) hVar.k.get();
                appDatabase.getClass();
                com.app.mlounge.data.local.dao.f fVarS = appDatabase.s();
                dagger.internal.d.a(fVarS);
                return new com.app.mlounge.ui.viewmodel.r(rVar, fVarS, hVar.a.e);
            case 5:
                return new com.app.mlounge.ui.viewmodel.s((x) hVar.L.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 6:
                return new a0(hVar.a.e, (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (NtvApi) hVar.S.get(), (ChqNtvApi) hVar.T.get(), (com.app.mlounge.data.remote.ntv.q) hVar.H.get(), (c0) hVar.m.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get(), hVar.a(), (y1) hVar.f.get());
            case 7:
                return new f0((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (com.app.mlounge.data.music.h) hVar.U.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 8:
                return new com.app.mlounge.ui.viewmodel.j0(hVar.a.e, (com.app.mlounge.data.repository.a0) hVar.W.get(), (com.app.mlounge.data.download.h) hVar.l.get(), (y1) hVar.f.get());
            case 9:
                return new k0((j0) hVar.F.get());
            case 10:
                return new a1(hVar.b(), (com.app.mlounge.data.repository.r) hVar.G.get(), (y1) hVar.f.get(), (com.app.mlounge.data.remote.ntv.q) hVar.H.get(), (y) hVar.c.get(), dagger.hilt.android.internal.a.c(hVar.a.e));
            case 11:
                return new b1((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (com.app.mlounge.data.repository.a0) hVar.W.get(), (c0) hVar.m.get(), (com.app.mlounge.data.iptv.l) hVar.Q.get(), hVar.a(), (NtvApi) hVar.S.get(), (y1) hVar.f.get());
            case 12:
                return new h1((y1) hVar.f.get(), (PremiumizeManager) hVar.g.get(), (TorBoxManager) hVar.j.get(), (AllDebridManager) hVar.y.get(), (RealDebridManager) hVar.B.get(), (TraktManager) hVar.K.get(), (TraktSyncManager) hVar.M.get());
            case 13:
                return new p1((y1) hVar.f.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (y) hVar.c.get());
            case 14:
                return new w1(hVar.a.e, (com.app.mlounge.data.repository.r) hVar.G.get(), (y1) hVar.f.get(), (com.app.mlounge.data.download.h) hVar.l.get(), (y) hVar.c.get(), this.b.a);
            case 15:
                return new b2((j0) hVar.F.get(), (com.app.mlounge.data.repository.r) hVar.G.get(), (x) hVar.L.get(), (y1) hVar.f.get(), (m0) hVar.O.get(), (q0) hVar.P.get());
            case 16:
                return new d2((x) hVar.L.get(), (m0) hVar.O.get(), (j0) hVar.F.get(), (q0) hVar.P.get());
            default:
                throw new AssertionError(i);
        }
    }
}
