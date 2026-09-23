package com.app.mlounge.data.music;

import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.text.k;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.jsoup.nodes.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ c y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = cVar;
        this.z = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a(this.y, this.z, dVar, 0);
            default:
                return new a(this.y, this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String string;
        String str;
        String strD0;
        String strD1;
        String string2;
        String strD2;
        String string3;
        String strD3;
        String strD4;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                c cVar = this.y;
                String str2 = this.z;
                org.jsoup.nodes.g gVarJ = c.j(cVar, str2);
                if (gVarJ == null) {
                    return null;
                }
                j jVarC0 = gVarJ.c0("h1");
                if (jVarC0 == null || (strD2 = jVarC0.d0()) == null || (string = k.g0(strD2).toString()) == null) {
                    string = "Unknown Album";
                }
                String str3 = string;
                org.jsoup.select.e eVarB0 = gVarJ.b0("[itemprop=byArtist], a.album_report__artist, .album_info__artist");
                eVarB0.getClass();
                ArrayList arrayList = new ArrayList(r.p(eVarB0, 10));
                Iterator it = eVarB0.iterator();
                while (it.hasNext()) {
                    String strD5 = ((j) it.next()).d0();
                    strD5.getClass();
                    arrayList.add(k.g0(strD5).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                String strI = kotlin.collections.p.I(kotlin.collections.p.b0(kotlin.collections.p.e0(arrayList2)), ", ", null, null, null, 62);
                if (k.J(strI)) {
                    strI = "Unknown Artist";
                }
                String str4 = strI;
                j jVarC1 = gVarJ.c0("img.art_wrap__img");
                if (jVarC1 == null || (strB = jVarC1.b("src")) == null) {
                    j jVarC2 = gVarJ.c0("img.album_report__image");
                    if (jVarC2 != null) {
                        String strB = jVarC2.b("src");
                        str = strB;
                    } else {
                        str = null;
                    }
                } else {
                    str = strB;
                }
                j jVarC3 = gVarJ.c0("[itemprop=datePublished]");
                if (jVarC3 == null || (strD0 = jVarC3.d("content")) == null) {
                    j jVarC4 = gVarJ.c0(".album_info__date");
                    strD0 = jVarC4 != null ? jVarC4.d0() : null;
                }
                String strE0 = (strD0 == null || (string2 = k.g0(strD0).toString()) == null) ? null : k.e0(4, string2);
                org.jsoup.select.e eVarB1 = gVarJ.b0(".album_info__genre, [itemprop=genre]");
                eVarB1.getClass();
                String strI2 = kotlin.collections.p.I(eVarB1, ", ", null, null, new com.app.mlounge.data.local.dao.g(7), 30);
                j jVarC5 = gVarJ.c0(".album_info__description, .album_description, [itemprop=description]");
                String string4 = (jVarC5 == null || (strD1 = jVarC5.d0()) == null) ? null : k.g0(strD1).toString();
                org.jsoup.select.e<j> eVarB2 = gVarJ.b0("tr.song");
                eVarB2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (j jVar : eVarB2) {
                    jVar.getClass();
                    MusicTrack musicTrackI = c.i(cVar, jVar, str4, str3, str2);
                    if (musicTrackI != null) {
                        arrayList3.add(musicTrackI);
                    }
                }
                return new MusicAlbumDetail(str3, str4, str, strE0, k.J(strI2) ? null : strI2, string4, arrayList3);
            default:
                kotlin.a.e(obj);
                c cVar2 = this.y;
                org.jsoup.nodes.g gVarJ2 = c.j(cVar2, this.z);
                String string5 = null;
                if (gVarJ2 == null) {
                    return null;
                }
                j jVarC6 = gVarJ2.c0("h1");
                if (jVarC6 == null || (strD4 = jVarC6.d0()) == null || (string3 = k.g0(strD4).toString()) == null) {
                    string3 = "Unknown Artist";
                }
                j jVarC7 = gVarJ2.c0("img.artist_image, .artist_info__image img");
                String strB2 = jVarC7 != null ? jVarC7.b("src") : null;
                j jVarC8 = gVarJ2.c0("div.artist_bio, .artist_info__description");
                if (jVarC8 != null && (strD3 = jVarC8.d0()) != null) {
                    string5 = k.g0(strD3).toString();
                }
                return new MusicArtistDetail(string3, strB2, string5, c.h(cVar2, gVarJ2));
        }
    }
}
