package com.app.mlounge.ui.screens.watchlist;

import com.app.mlounge.data.local.entity.f;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.text.k;
import kotlin.text.r;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ q A;
    public final /* synthetic */ l B;
    public final /* synthetic */ l C;
    public final /* synthetic */ l D;
    public final /* synthetic */ l E;
    public final /* synthetic */ f e;
    public final /* synthetic */ l y;
    public final /* synthetic */ l z;

    public b(f fVar, l lVar, l lVar2, q qVar, l lVar3, l lVar4, l lVar5, l lVar6) {
        this.e = fVar;
        this.y = lVar;
        this.z = lVar2;
        this.A = qVar;
        this.B = lVar3;
        this.C = lVar4;
        this.D = lVar5;
        this.E = lVar6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        Integer numW;
        Integer numW2;
        f fVar = this.e;
        String str = fVar.b;
        String strP = fVar.j;
        String str2 = fVar.a;
        switch (str.hashCode()) {
            case 3714:
                if (str.equals("tv") && (numW = r.w(k.P(str2, "tv_"))) != null) {
                    this.z.invoke(numW);
                }
                break;
            case 92676538:
                if (str.equals("adult")) {
                    if (strP == null) {
                        strP = k.P(str2, "adult_");
                    }
                    this.E.invoke(strP);
                }
                break;
            case 92962932:
                if (str.equals("anime")) {
                    this.B.invoke(k.P(str2, "anime_"));
                }
                break;
            case 104087344:
                if (str.equals("movie") && (numW2 = r.w(k.P(str2, "movie_"))) != null) {
                    this.y.invoke(numW2);
                }
                break;
            case 184289973:
                if (str.equals("live_tv")) {
                    if (strP == null) {
                        strP = fVar.k;
                    }
                    String strY = k.Y(str2, "_", "");
                    if (strP != null) {
                        this.A.invoke(strP, fVar.c, strY);
                    }
                }
                break;
            case 1505733281:
                if (str.equals("music_artist")) {
                    this.D.invoke(k.P(str2, "music_artist_"));
                }
                break;
            case 1572397013:
                if (str.equals("music_album")) {
                    this.C.invoke(k.P(str2, "music_album_"));
                }
                break;
        }
        return y.a;
    }
}
