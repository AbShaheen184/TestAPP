package com.app.mlounge.ui.screens.livetv;

import androidx.compose.foundation.lazy.grid.q;
import androidx.compose.foundation.text.c0;
import androidx.compose.material3.s3;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.w2;
import androidx.work.impl.v;
import com.app.mlounge.data.remote.model.MusicAlbum;
import com.app.mlounge.data.remote.model.MusicArtist;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.j0;
import com.app.mlounge.ui.components.u0;
import com.app.mlounge.ui.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ l A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long y;
    public final /* synthetic */ l z;

    public /* synthetic */ d(a1 a1Var, long j, l lVar, l lVar2, a1 a1Var2) {
        this.B = a1Var;
        this.y = j;
        this.z = lVar;
        this.A = lVar2;
        this.C = a1Var2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                List list = (List) this.B;
                Map map = (Map) this.C;
                androidx.compose.foundation.lazy.j jVar = (androidx.compose.foundation.lazy.j) obj;
                jVar.getClass();
                jVar.q(list.size(), new c0(13, new com.app.mlounge.ui.components.c0(24), list), new u0(6, list), new androidx.compose.runtime.internal.f(true, 2039820996, new f(list, map, this.z, this.A, this.y)));
                break;
            default:
                final w2 w2Var = (w2) this.B;
                w2 w2Var2 = (w2) this.C;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                int size = ((List) w2Var.getValue()).size();
                s3 s3Var = new s3(w2Var, 4);
                final long j = this.y;
                final l lVar = this.z;
                final l lVar2 = this.A;
                hVar.q(size, s3Var, q.e, new androidx.compose.runtime.internal.f(true, 1716231643, new r() { // from class: com.app.mlounge.ui.screens.music.j
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj3).intValue();
                        s sVar = (s) obj4;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        ((androidx.compose.foundation.lazy.grid.j) obj2).getClass();
                        if ((iIntValue2 & 48) == 0) {
                            iIntValue2 |= sVar.d(iIntValue) ? 32 : 16;
                        }
                        if (sVar.T(iIntValue2 & 1, (iIntValue2 & Token.TARGET) != 144)) {
                            Object obj6 = ((List) w2Var.getValue()).get(iIntValue);
                            boolean z = obj6 instanceof MusicAlbum;
                            long j2 = j;
                            androidx.compose.runtime.f fVar = n.a;
                            androidx.compose.ui.layout.h hVar2 = androidx.compose.ui.layout.i.e;
                            if (z) {
                                sVar.b0(966391987);
                                MusicAlbum musicAlbum = (MusicAlbum) obj6;
                                String strC = musicAlbum.c();
                                String strB = musicAlbum.b();
                                String strA = musicAlbum.a();
                                j0 j0VarW = b0.w(v.x(), j2, sVar, 0);
                                l lVar3 = lVar;
                                boolean zH = sVar.h(obj6) | sVar.f(lVar3);
                                Object objQ = sVar.Q();
                                if (zH || objQ == fVar) {
                                    objQ = new com.app.mlounge.ui.screens.adult.b(11, lVar3, musicAlbum);
                                    sVar.l0(objQ);
                                }
                                b0.h(strC, strB, (kotlin.jvm.functions.a) objQ, null, null, strA, null, hVar2, j0VarW, 0.0f, false, false, 0.0f, null, sVar, 146800640, 0, 15960);
                                sVar.p(false);
                            } else if (obj6 instanceof MusicArtist) {
                                sVar.b0(966987993);
                                MusicArtist musicArtist = (MusicArtist) obj6;
                                String strB2 = musicArtist.b();
                                String strA2 = musicArtist.a();
                                j0 j0VarW2 = b0.w(kotlin.math.a.t(), j2, sVar, 0);
                                l lVar4 = lVar2;
                                boolean zH2 = sVar.h(obj6) | sVar.f(lVar4);
                                Object objQ2 = sVar.Q();
                                if (zH2 || objQ2 == fVar) {
                                    objQ2 = new com.app.mlounge.ui.screens.adult.b(12, lVar4, musicArtist);
                                    sVar.l0(objQ2);
                                }
                                b0.h(strB2, strA2, (kotlin.jvm.functions.a) objQ2, null, null, "Artist", null, hVar2, j0VarW2, 0.0f, false, false, 0.0f, null, sVar, 146997248, 0, 15960);
                                sVar.p(false);
                            } else {
                                sVar.b0(967479591);
                                sVar.p(false);
                            }
                        } else {
                            sVar.W();
                        }
                        return y.a;
                    }
                }));
                if (((Boolean) w2Var2.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar, com.app.mlounge.ui.screens.music.b.f, new t(15));
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ d(List list, Map map, l lVar, l lVar2, long j) {
        this.B = list;
        this.C = map;
        this.z = lVar;
        this.A = lVar2;
        this.y = j;
    }
}
