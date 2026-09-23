package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.d1;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f1;
import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.material3.m6;
import androidx.compose.material3.n6;
import androidx.compose.material3.s3;
import androidx.compose.material3.z5;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.w2;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.compose.ui.r;
import androidx.compose.ui.text.m0;
import coil3.compose.k;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.q;
import kotlin.jvm.functions.l;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.D = obj6;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.d1[] d1VarArr = (androidx.compose.ui.layout.d1[]) this.y;
                List list = (List) this.z;
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) this.A;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.B;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.C;
                s sVar = (s) this.D;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                int length = d1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    androidx.compose.ui.layout.d1 d1Var = d1VarArr[i2];
                    d1Var.getClass();
                    p.b(c1Var, d1Var, (androidx.compose.ui.layout.p0) list.get(i), s0Var.getLayoutDirection(), xVar.e, xVar2.e, sVar.a);
                    i2++;
                    i++;
                }
                break;
            case 1:
                final w2 w2Var = (w2) this.y;
                final com.app.mlounge.ui.viewmodel.f0 f0Var = (com.app.mlounge.ui.viewmodel.f0) this.z;
                final kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                final w2 w2Var2 = (w2) this.B;
                final w2 w2Var3 = (w2) this.C;
                w2 w2Var4 = (w2) this.D;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                hVar.q(((List) w2Var.getValue()).size(), new s3(w2Var, 3), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(true, -1706994611, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.screens.movies.k
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) throws XmlPullParserException, IOException {
                        int iIntValue = ((Integer) obj3).intValue();
                        s sVar2 = (s) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((androidx.compose.foundation.lazy.grid.j) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= sVar2.d(iIntValue) ? 32 : 16;
                        }
                        if (sVar2.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                            TmdbMovie tmdbMovie = (TmdbMovie) ((List) w2Var.getValue()).get(iIntValue);
                            String strE = tmdbMovie.e();
                            if (strE == null) {
                                strE = "Unknown";
                            }
                            String strC = tmdbMovie.c();
                            f0Var.b.getClass();
                            String strB = j0.b(strC, "w500");
                            Double dF = tmdbMovie.f();
                            String strD = tmdbMovie.d();
                            String strE0 = strD != null ? kotlin.text.k.e0(4, strD) : null;
                            androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_movie_placeholder, sVar2);
                            Float f = (Float) ((Map) w2Var2.getValue()).get("movie:" + tmdbMovie.a());
                            float fFloatValue = f != null ? f.floatValue() : 0.0f;
                            boolean zContains = ((Set) w2Var3.getValue()).contains("movie:" + tmdbMovie.a());
                            l lVar2 = lVar;
                            boolean zF = sVar2.f(lVar2) | sVar2.h(tmdbMovie);
                            Object objQ = sVar2.Q();
                            if (zF || objQ == n.a) {
                                objQ = new com.app.mlounge.ui.screens.adult.b(7, lVar2, tmdbMovie);
                                sVar2.l0(objQ);
                            }
                            b0.h(strE, strB, (kotlin.jvm.functions.a) objQ, null, dF, strE0, null, null, bVarS, fFloatValue, zContains, false, 0.0f, null, sVar2, 134217728, 0, 14536);
                        } else {
                            sVar2.W();
                        }
                        return y.a;
                    }
                }));
                if (((Boolean) w2Var4.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.movies.a.b, null);
                }
                break;
            default:
                final MusicArtistDetail musicArtistDetail = (MusicArtistDetail) this.y;
                final kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                final com.app.mlounge.ui.viewmodel.j0 j0Var = (com.app.mlounge.ui.viewmodel.j0) this.A;
                final String str = (String) this.B;
                final w2 w2Var5 = (w2) this.C;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.D;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                androidx.compose.foundation.lazy.grid.h.p(5, hVar2, new androidx.compose.runtime.internal.f(true, -812363632, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.music.h
                    @Override // kotlin.jvm.functions.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        s sVar2 = (s) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((androidx.compose.foundation.lazy.grid.j) obj2).getClass();
                        if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            o oVar = o.b;
                            r rVarG = i1.g(i1.e(oVar, 1.0f), 300);
                            q0 q0VarD = p.d(androidx.compose.ui.c.e, false);
                            int iHashCode = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL = sVar2.l();
                            r rVarC = androidx.compose.ui.a.c(sVar2, rVarG);
                            androidx.compose.ui.node.h.b.getClass();
                            androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.g.f;
                            t.x(sVar2, q0VarD, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.g.e;
                            t.x(sVar2, jVarL, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.g.g;
                            t.p(sVar2, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.g.h;
                            t.t(sVar2, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.g.d;
                            t.x(sVar2, rVarC, eVar4);
                            MusicArtistDetail musicArtistDetail2 = musicArtistDetail;
                            String strC = musicArtistDetail2.c();
                            if (strC == null) {
                                strC = "";
                            }
                            String strD = musicArtistDetail2.d();
                            e0 e0Var = i1.c;
                            k.a(strC, strD, e0Var, null, androidx.compose.ui.layout.i.a, sVar2, 1573248, 1976);
                            long j = androidx.compose.ui.graphics.t.h;
                            p.a(androidx.compose.foundation.s.e(e0Var, androidx.work.impl.model.f.t(q.k(new androidx.compose.ui.graphics.t(j), new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.a)), 0.0f, 0.0f, 14)), sVar2, 6);
                            Object objQ = sVar2.Q();
                            androidx.compose.runtime.f fVar2 = n.a;
                            if (objQ == fVar2) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.i(sVar2);
                            }
                            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                            a1 a1VarB = _COROUTINE.a.B(kVar, sVar2, 6);
                            float f = 16;
                            r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f);
                            androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                            r rVarA = androidx.compose.ui.draw.h.a(rVarQ, dVar2);
                            float f2 = 2;
                            if (((Boolean) a1VarB.getValue()).booleanValue()) {
                                j = com.app.mlounge.ui.theme.b.q;
                            }
                            androidx.compose.material3.q.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarA, f2, j, dVar2), androidx.compose.ui.graphics.t.b(0.5f, androidx.compose.ui.graphics.t.b), a0.b), false, null, kVar, null, b.d, sVar2, 1597440, 44);
                            r rVarQ2 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.t.e(oVar, androidx.compose.ui.c.D), f);
                            w wVarA = u.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, sVar2, 0);
                            int iHashCode2 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL2 = sVar2.l();
                            r rVarC2 = androidx.compose.ui.a.c(sVar2, rVarQ2);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            t.x(sVar2, wVarA, eVar);
                            t.x(sVar2, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, sVar2, eVar3, sVar2, dVar);
                            t.x(sVar2, rVarC2, eVar4);
                            f1 f1VarA = d1.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, sVar2, 48);
                            int iHashCode3 = Long.hashCode(sVar2.T);
                            androidx.compose.runtime.internal.j jVarL3 = sVar2.l();
                            r rVarC3 = androidx.compose.ui.a.c(sVar2, oVar);
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(fVar);
                            } else {
                                sVar2.o0();
                            }
                            t.x(sVar2, f1VarA, eVar);
                            t.x(sVar2, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, sVar2, eVar3, sVar2, dVar);
                            t.x(sVar2, rVarC3, eVar4);
                            String strD2 = musicArtistDetail2.d();
                            m0 m0Var = ((m6) sVar2.j(n6.a)).d;
                            long j2 = androidx.compose.ui.graphics.t.d;
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            z5.b(strD2, new t0(1.0f, true), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, sVar2, 384, 0, 131064);
                            androidx.compose.foundation.layout.b.e(sVar2, i1.q(oVar, f));
                            w2 w2Var6 = w2Var5;
                            String str2 = ((Boolean) w2Var6.getValue()).booleanValue() ? "Favourited" : "Favourite";
                            androidx.compose.ui.graphics.vector.f fVarL = ((Boolean) w2Var6.getValue()).booleanValue() ? okhttp3.internal.platform.android.g.l() : kotlin.math.a.q();
                            com.app.mlounge.ui.viewmodel.j0 j0Var2 = j0Var;
                            boolean zH = sVar2.h(j0Var2) | sVar2.h(musicArtistDetail2);
                            String str3 = str;
                            boolean zF = zH | sVar2.f(str3);
                            Object objQ2 = sVar2.Q();
                            if (zF || objQ2 == fVar2) {
                                objQ2 = new androidx.compose.foundation.gestures.g(17, j0Var2, musicArtistDetail2, str3);
                                sVar2.l0(objQ2);
                            }
                            com.app.mlounge.ui.screens.movies.a.b(str2, fVarL, (kotlin.jvm.functions.a) objQ2, i1.q(oVar, 140), false, sVar2, 3072, 48);
                            androidx.room.b0.g(sVar2, true, true, true);
                        } else {
                            sVar2.W();
                        }
                        return y.a;
                    }
                }), new com.app.mlounge.ui.t(12));
                String strB = musicArtistDetail.b();
                if (strB != null) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar2, new androidx.compose.runtime.internal.f(true, 1726523718, new androidx.compose.foundation.gestures.y(strB, 9)), new com.app.mlounge.ui.t(13));
                }
                if (!musicArtistDetail.a().isEmpty()) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar2, com.app.mlounge.ui.screens.music.b.e, new com.app.mlounge.ui.t(14));
                    List listA = musicArtistDetail.a();
                    hVar2.q(listA.size(), null, new com.app.mlounge.ui.components.u0(11, listA), new androidx.compose.runtime.internal.f(true, -1117249557, new com.app.mlounge.ui.screens.adult.g(listA, lVar2, 2)));
                }
                break;
        }
        return kotlin.y.a;
    }
}
