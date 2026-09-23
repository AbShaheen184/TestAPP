package com.app.mlounge.ui.screens.anime;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.work.impl.v;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.j0;
import com.app.mlounge.ui.components.r0;
import com.app.mlounge.ui.screens.player.c1;
import com.app.mlounge.ui.screens.player.k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements r {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ List z;

    public l(List list, c1 c1Var, kotlin.jvm.functions.l lVar) {
        this.e = 1;
        this.z = list;
        this.A = c1Var;
        this.y = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        String str;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
                if ((iIntValue2 & 6) == 0) {
                    i = (sVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem = (HiAnimeItem) ((ArrayList) this.z).get(iIntValue);
                    sVar.b0(1662225337);
                    String strA = hiAnimeItem.a();
                    String strC = hiAnimeItem.c();
                    String strD = hiAnimeItem.d();
                    androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar);
                    Map map = (Map) ((w2) this.A).getValue();
                    String strB = hiAnimeItem.b();
                    if (strB == null) {
                        strB = "";
                    }
                    Float f = (Float) map.get("anime:".concat(strB));
                    float fFloatValue = f != null ? f.floatValue() : 0.0f;
                    boolean zF = sVar.f(hiAnimeItem) | sVar.f(lVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == n.a) {
                        objQ = new i(hiAnimeItem, lVar, 1);
                        sVar.l0(objQ);
                    }
                    b0.h(strA, strC, (kotlin.jvm.functions.a) objQ, null, null, strD, null, null, bVarS, fFloatValue, false, false, 0.0f, null, sVar, 134217728, 0, 15576);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                s sVar2 = (s) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.y;
                if ((iIntValue4 & 6) == 0) {
                    i2 = (sVar2.f(dVar) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    c1 c1Var = (c1) this.z.get(iIntValue3);
                    sVar2.b0(-927539213);
                    String str2 = c1Var.a;
                    androidx.compose.ui.graphics.vector.f fVarM = c1Var.d ? _COROUTINE.a.M() : _COROUTINE.a.R();
                    boolean zA = kotlin.jvm.internal.l.a((c1) this.A, c1Var);
                    String str3 = c1Var.i;
                    boolean zF2 = sVar2.f(lVar2) | sVar2.f(c1Var);
                    Object objQ2 = sVar2.Q();
                    if (zF2 || objQ2 == n.a) {
                        objQ2 = new com.app.mlounge.ui.screens.downloads.e(3, lVar2, c1Var);
                        sVar2.l0(objQ2);
                    }
                    k0.i(str2, fVarM, zA, str3, (kotlin.jvm.functions.a) objQ2, sVar2, 0, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                androidx.compose.foundation.lazy.grid.j jVar2 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                s sVar3 = (s) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                p pVar = (p) this.A;
                a1 a1Var = (a1) this.y;
                if ((iIntValue6 & 6) == 0) {
                    i3 = (sVar3.f(jVar2) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= sVar3.d(iIntValue5) ? 32 : 16;
                }
                if (sVar3.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    Game game = (Game) this.z.get(iIntValue5);
                    sVar3.b0(-1262214126);
                    String strA2 = game.a();
                    if (strA2 == null) {
                        strA2 = "Unknown";
                    }
                    String strB2 = game.b();
                    if (strB2 == null) {
                        strB2 = "";
                    }
                    String strD2 = game.d();
                    String strE0 = strD2 != null ? kotlin.text.k.e0(4, strD2) : "";
                    androidx.compose.ui.graphics.painter.b bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_games, sVar3);
                    boolean zF3 = sVar3.f(a1Var) | sVar3.f(pVar) | sVar3.f(game);
                    Object objQ3 = sVar3.Q();
                    if (zF3 || objQ3 == n.a) {
                        objQ3 = new r0(4, pVar, game, a1Var);
                        sVar3.l0(objQ3);
                    }
                    b0.h(strA2, strB2, (kotlin.jvm.functions.a) objQ3, null, null, strE0, null, null, bVarS2, 0.0f, false, false, 0.0f, null, sVar3, 134217728, 0, 16088);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.grid.j jVar3 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                s sVar4 = (s) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.A;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.y;
                if ((iIntValue8 & 6) == 0) {
                    i4 = (sVar4.f(jVar3) ? 4 : 2) | iIntValue8;
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= sVar4.d(iIntValue7) ? 32 : 16;
                }
                if (sVar4.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    Object obj5 = this.z.get(iIntValue7);
                    sVar4.b0(2057642708);
                    long j = com.app.mlounge.ui.theme.b.n;
                    boolean z2 = obj5 instanceof MusicAlbum;
                    androidx.compose.runtime.f fVar = n.a;
                    androidx.compose.ui.layout.h hVar = androidx.compose.ui.layout.i.e;
                    if (z2) {
                        sVar4.b0(2057767420);
                        MusicAlbum musicAlbum = (MusicAlbum) obj5;
                        String strC2 = musicAlbum.c();
                        String strB3 = musicAlbum.b();
                        str = strB3 != null ? strB3 : "";
                        String strA3 = musicAlbum.a();
                        j0 j0VarW = b0.w(v.x(), j, sVar4, 48);
                        boolean zH = sVar4.h(obj5) | sVar4.f(lVar4);
                        Object objQ4 = sVar4.Q();
                        if (zH || objQ4 == fVar) {
                            objQ4 = new com.app.mlounge.ui.screens.music.i(lVar4, musicAlbum, 1);
                            sVar4.l0(objQ4);
                        }
                        z = false;
                        b0.h(strC2, str, (kotlin.jvm.functions.a) objQ4, null, null, strA3, null, hVar, j0VarW, 0.0f, false, false, 0.0f, null, sVar4, 146800640, 0, 15960);
                        sVar4 = sVar4;
                        sVar4.p(false);
                    } else {
                        z = false;
                        if (obj5 instanceof MusicArtist) {
                            sVar4.b0(2058374338);
                            MusicArtist musicArtist = (MusicArtist) obj5;
                            String strB4 = musicArtist.b();
                            String strA4 = musicArtist.a();
                            str = strA4 != null ? strA4 : "";
                            j0 j0VarW2 = b0.w(kotlin.math.a.t(), j, sVar4, 48);
                            boolean zH2 = sVar4.h(obj5) | sVar4.f(lVar3);
                            Object objQ5 = sVar4.Q();
                            if (zH2 || objQ5 == fVar) {
                                objQ5 = new com.app.mlounge.ui.screens.downloads.e(5, lVar3, musicArtist);
                                sVar4.l0(objQ5);
                            }
                            b0.h(strB4, str, (kotlin.jvm.functions.a) objQ5, null, null, "Artist", null, hVar, j0VarW2, 0.0f, false, false, 0.0f, null, sVar4, 146997248, 0, 15960);
                            sVar4 = sVar4;
                            sVar4.p(false);
                        } else if (obj5 instanceof MusicTrack) {
                            sVar4.b0(2058981814);
                            MusicTrack musicTrack = (MusicTrack) obj5;
                            String strG = musicTrack.g();
                            String strE = musicTrack.e();
                            str = strE != null ? strE : "";
                            String strB5 = musicTrack.b();
                            j0 j0VarW3 = b0.w(v.x(), j, sVar4, 48);
                            boolean zH3 = sVar4.h(obj5) | sVar4.f(lVar4);
                            Object objQ6 = sVar4.Q();
                            if (zH3 || objQ6 == fVar) {
                                objQ6 = new com.app.mlounge.ui.screens.downloads.e(6, musicTrack, lVar4);
                                sVar4.l0(objQ6);
                            }
                            b0.h(strG, str, (kotlin.jvm.functions.a) objQ6, null, null, strB5, null, hVar, j0VarW3, 0.0f, false, false, 0.0f, null, sVar4, 146800640, 0, 15960);
                            sVar4 = sVar4;
                            sVar4.p(false);
                        } else {
                            sVar4.b0(2059710779);
                            sVar4.p(false);
                        }
                    }
                    sVar4.p(z);
                } else {
                    sVar4.W();
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ l(List list, Object obj, Object obj2, int i) {
        this.e = i;
        this.z = list;
        this.y = obj;
        this.A = obj2;
    }
}
