package com.app.mlounge.ui.screens.adult;

import androidx.compose.foundation.layout.i1;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideo;
import com.app.mlounge.data.remote.model.HiAnimeItem;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.i;
import com.app.mlounge.ui.screens.player.k0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.text.k;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ l z;

    public /* synthetic */ g(List list, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String strA;
        switch (this.e) {
            case 0:
                j jVar = (j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s sVar = (s) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (sVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= sVar.d(iIntValue) ? 32 : 16;
                }
                if (sVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    EpornerVideo epornerVideo = (EpornerVideo) this.y.get(iIntValue);
                    sVar.b0(1879809172);
                    String strD = epornerVideo.d();
                    if (strD == null) {
                        strD = "";
                    }
                    EpornerThumb epornerThumbA = epornerVideo.a();
                    String strI = null;
                    String strA2 = epornerThumbA != null ? epornerThumbA.a() : null;
                    String strC = epornerVideo.c();
                    if (strC != null && !k.J(strC)) {
                        strI = androidx.compose.runtime.j.i("Duration: ", epornerVideo.c());
                    }
                    String str = strI;
                    androidx.compose.ui.graphics.painter.b bVarS = com.google.firebase.b.S(R.drawable.ic_menu_adult_xxx, sVar);
                    l lVar = this.z;
                    boolean zF = sVar.f(lVar) | sVar.h(epornerVideo);
                    Object objQ = sVar.Q();
                    if (zF || objQ == n.a) {
                        objQ = new f(lVar, epornerVideo, 0);
                        sVar.l0(objQ);
                    }
                    b0.h(strD, strA2, (kotlin.jvm.functions.a) objQ, null, null, str, null, null, bVarS, 0.0f, false, false, 1.7777778f, null, sVar, 134217728, 384, 11992);
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
                if ((iIntValue4 & 6) == 0) {
                    i2 = (sVar2.f(dVar) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= sVar2.d(iIntValue3) ? 32 : 16;
                }
                if (sVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem = (HiAnimeItem) this.y.get(iIntValue3);
                    sVar2.b0(834834607);
                    String strA3 = hiAnimeItem.a();
                    String strC2 = hiAnimeItem.c();
                    boolean zF2 = sVar2.f(hiAnimeItem);
                    l lVar2 = this.z;
                    boolean zF3 = zF2 | sVar2.f(lVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF3 || objQ2 == n.a) {
                        objQ2 = new i(hiAnimeItem, lVar2, 0);
                        sVar2.l0(objQ2);
                    }
                    b0.h(strA3, strC2, (kotlin.jvm.functions.a) objQ2, i1.q(o.b, 130), null, null, null, null, null, 0.0f, false, false, 0.0f, null, sVar2, 3072, 0, 16368);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                j jVar2 = (j) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                s sVar3 = (s) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (sVar3.f(jVar2) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= sVar3.d(iIntValue5) ? 32 : 16;
                }
                if (sVar3.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    MusicAlbum musicAlbum = (MusicAlbum) this.y.get(iIntValue5);
                    sVar3.b0(208439932);
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(o.b, 8, 0.0f, 2);
                    q0 q0VarD = p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(sVar3.T);
                    androidx.compose.runtime.internal.j jVarL = sVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(sVar3, rVarS);
                    androidx.compose.ui.node.h.b.getClass();
                    androidx.compose.ui.node.f fVar = androidx.compose.ui.node.g.b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(fVar);
                    } else {
                        sVar3.o0();
                    }
                    t.x(sVar3, q0VarD, androidx.compose.ui.node.g.f);
                    t.x(sVar3, jVarL, androidx.compose.ui.node.g.e);
                    t.p(sVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.g.g);
                    t.t(sVar3, androidx.compose.ui.node.g.h);
                    t.x(sVar3, rVarC, androidx.compose.ui.node.g.d);
                    String strC3 = musicAlbum.c();
                    String strB = musicAlbum.b();
                    String strE = musicAlbum.e();
                    if (strE == null) {
                        strE = "Album";
                    }
                    l lVar3 = this.z;
                    boolean zF4 = sVar3.f(lVar3) | sVar3.f(musicAlbum);
                    Object objQ3 = sVar3.Q();
                    if (zF4 || objQ3 == n.a) {
                        objQ3 = new com.app.mlounge.ui.screens.music.i(lVar3, musicAlbum, 0);
                        sVar3.l0(objQ3);
                    }
                    b0.h(strC3, strB, (kotlin.jvm.functions.a) objQ3, null, null, strE, null, androidx.compose.ui.layout.i.e, null, 0.0f, false, false, 0.0f, null, sVar3, 12582912, 0, 16216);
                    sVar3.p(true);
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                s sVar4 = (s) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i4 = (sVar4.f(dVar2) ? 4 : 2) | iIntValue8;
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= sVar4.d(iIntValue7) ? 32 : 16;
                }
                if (sVar4.T(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    com.app.mlounge.ui.screens.player.a aVar = (com.app.mlounge.ui.screens.player.a) this.y.get(iIntValue7);
                    sVar4.b0(811853802);
                    String str2 = aVar.a;
                    androidx.compose.ui.graphics.vector.f fVarQ = _COROUTINE.b.q();
                    boolean z = aVar.d;
                    l lVar4 = this.z;
                    boolean zF5 = sVar4.f(lVar4) | sVar4.f(aVar);
                    Object objQ4 = sVar4.Q();
                    if (zF5 || objQ4 == n.a) {
                        objQ4 = new com.app.mlounge.ui.screens.downloads.e(2, lVar4, aVar);
                        sVar4.l0(objQ4);
                    }
                    k0.i(str2, fVarQ, z, null, (kotlin.jvm.functions.a) objQ4, sVar4, 0, 8);
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                j jVar3 = (j) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                s sVar5 = (s) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i5 = (sVar5.f(jVar3) ? 4 : 2) | iIntValue10;
                } else {
                    i5 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i5 |= sVar5.d(iIntValue9) ? 32 : 16;
                }
                if (sVar5.T(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    HiAnimeItem hiAnimeItem2 = (HiAnimeItem) this.y.get(iIntValue9);
                    sVar5.b0(-347088184);
                    String strA4 = hiAnimeItem2.a();
                    String strC4 = hiAnimeItem2.c();
                    if (strC4 == null) {
                        strC4 = "";
                    }
                    androidx.compose.ui.graphics.painter.b bVarS2 = com.google.firebase.b.S(R.drawable.ic_menu_anime, sVar5);
                    boolean zF6 = sVar5.f(hiAnimeItem2);
                    l lVar5 = this.z;
                    boolean zF7 = zF6 | sVar5.f(lVar5);
                    Object objQ5 = sVar5.Q();
                    if (zF7 || objQ5 == n.a) {
                        objQ5 = new i(hiAnimeItem2, lVar5, 2);
                        sVar5.l0(objQ5);
                    }
                    b0.h(strA4, strC4, (kotlin.jvm.functions.a) objQ5, null, null, "ANIME", null, null, bVarS2, 0.0f, false, false, 0.0f, null, sVar5, 134414336, 0, 16088);
                    sVar5.p(false);
                } else {
                    sVar5.W();
                }
                break;
            default:
                j jVar4 = (j) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                s sVar6 = (s) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i6 = (sVar6.f(jVar4) ? 4 : 2) | iIntValue12;
                } else {
                    i6 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i6 |= sVar6.d(iIntValue11) ? 32 : 16;
                }
                if (sVar6.T(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    EpornerVideo epornerVideo2 = (EpornerVideo) this.y.get(iIntValue11);
                    sVar6.b0(987775040);
                    String strD2 = epornerVideo2.d();
                    String str3 = "";
                    if (strD2 == null) {
                        strD2 = "";
                    }
                    EpornerThumb epornerThumbA2 = epornerVideo2.a();
                    if (epornerThumbA2 != null && (strA = epornerThumbA2.a()) != null) {
                        str3 = strA;
                    }
                    String strC5 = epornerVideo2.c();
                    String strConcat = strC5 != null ? strC5.concat(" min") : "ADULT";
                    androidx.compose.ui.graphics.painter.b bVarS3 = com.google.firebase.b.S(R.drawable.ic_menu_adult_xxx, sVar6);
                    l lVar6 = this.z;
                    boolean zF8 = sVar6.f(lVar6) | sVar6.h(epornerVideo2);
                    Object objQ6 = sVar6.Q();
                    if (zF8 || objQ6 == n.a) {
                        objQ6 = new f(lVar6, epornerVideo2, 1);
                        sVar6.l0(objQ6);
                    }
                    b0.h(strD2, str3, (kotlin.jvm.functions.a) objQ6, null, null, strConcat, null, null, bVarS3, 0.0f, false, false, 0.0f, null, sVar6, 134217728, 0, 16088);
                    sVar6.p(false);
                } else {
                    sVar6.W();
                }
                break;
        }
        return y.a;
    }
}
