package com.app.mlounge.data.music;

import android.content.Context;
import androidx.core.view.w0;
import com.app.mlounge.data.remote.model.MusicAlbumDetail;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.MusicTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.text.k;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import org.schabi.newpipe.extractor.l;
import org.schabi.newpipe.extractor.services.youtube.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.y = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(0, this.y, dVar);
            case 1:
                return new f(1, this.y, dVar);
            case 2:
                return new f(2, this.y, dVar);
            default:
                return new f(3, this.y, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return ((f) create(coroutineScope, dVar)).invokeSuspend(y.a);
            case 1:
                return ((f) create(coroutineScope, dVar)).invokeSuspend(y.a);
            case 2:
                return ((f) create(coroutineScope, dVar)).invokeSuspend(y.a);
            default:
                f fVar = (f) create(coroutineScope, dVar);
                y yVar = y.a;
                fVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        MusicStreamResult musicStreamResult;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                Context context = com.app.mlounge.util.a.a;
                String str2 = this.y;
                com.app.mlounge.util.a.a("D", "YouTubeMusic", "getAlbumDetail: url=".concat(str2));
                try {
                    org.schabi.newpipe.extractor.playlist.b bVarB = org.schabi.newpipe.extractor.playlist.b.b(l.a, str2);
                    String str3 = bVarB.B;
                    List list = bVarB.D;
                    com.app.mlounge.util.a.a("D", "YouTubeMusic", "getAlbumDetail: found " + list.size() + " total related items");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof org.schabi.newpipe.extractor.stream.g) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        org.schabi.newpipe.extractor.stream.g gVar = (org.schabi.newpipe.extractor.stream.g) it.next();
                        String str4 = str3;
                        String str5 = gVar.z;
                        str5.getClass();
                        String str6 = gVar.z;
                        str6.getClass();
                        String str7 = gVar.A;
                        str7.getClass();
                        String str8 = gVar.D;
                        if (str8 == null) {
                            str8 = "Unknown";
                        }
                        str4.getClass();
                        long j = gVar.G;
                        if (j > 0) {
                            long j2 = 60;
                            str = (j / j2) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{new Long(j % j2)}, 1));
                        } else {
                            str = null;
                        }
                        List list2 = gVar.B;
                        list2.getClass();
                        org.schabi.newpipe.extractor.a aVar = (org.schabi.newpipe.extractor.a) kotlin.collections.p.D(list2);
                        arrayList2.add(new MusicTrack(str5, str6, str7, str8, str4, str, aVar != null ? aVar.e : null, str2));
                        it = it;
                        str3 = str4;
                    }
                    String str9 = str3;
                    str9.getClass();
                    String str10 = bVarB.F;
                    if (str10 == null) {
                        str10 = "Unknown Artist";
                    }
                    String str11 = str10;
                    List list3 = bVarB.G;
                    list3.getClass();
                    org.schabi.newpipe.extractor.a aVar2 = (org.schabi.newpipe.extractor.a) kotlin.collections.p.D(list3);
                    return new MusicAlbumDetail(str9, str11, aVar2 != null ? aVar2.e : null, null, null, null, arrayList2);
                } catch (Exception e) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("YouTubeMusic", "getAlbumDetail failed for ".concat(str2), e);
                    return null;
                }
            case 1:
                kotlin.a.e(obj);
                j jVar = l.a;
                String str12 = this.y;
                jVar.getClass();
                org.schabi.newpipe.extractor.services.youtube.extractors.c cVar = new org.schabi.newpipe.extractor.services.youtube.extractors.c(jVar, org.schabi.newpipe.extractor.services.youtube.linkHandler.a.b.f(str12));
                cVar.d();
                org.schabi.newpipe.extractor.channel.a aVar3 = new org.schabi.newpipe.extractor.channel.a(((w0) cVar.c).y, cVar.g(), cVar.l(), ((org.schabi.newpipe.extractor.linkhandler.a) cVar.d).e, cVar.h());
                aVar3.E = Collections.EMPTY_LIST;
                try {
                    aVar3.E = cVar.c0();
                } catch (Exception e2) {
                    aVar3.a(e2);
                }
                try {
                    cVar.a();
                    if (cVar.i != null) {
                        List list4 = Collections.EMPTY_LIST;
                    }
                } catch (Exception e3) {
                    aVar3.a(e3);
                }
                try {
                    org.schabi.newpipe.extractor.services.youtube.i.j(cVar.g());
                    try {
                        cVar.e0();
                        break;
                    } catch (Exception e4) {
                        aVar3.a(e4);
                    }
                    try {
                        aVar3.D = cVar.d0();
                        break;
                    } catch (Exception e5) {
                        aVar3.a(e5);
                    }
                    try {
                        List list5 = Collections.EMPTY_LIST;
                        break;
                    } catch (Exception e6) {
                        aVar3.a(e6);
                    }
                    try {
                        cVar.g0();
                        break;
                    } catch (Exception e7) {
                        aVar3.a(e7);
                    }
                    try {
                        cVar.f0();
                        break;
                    } catch (Exception e8) {
                        aVar3.a(e8);
                    }
                    try {
                        cVar.O();
                        break;
                    } catch (Exception e9) {
                        aVar3.a(e9);
                    }
                    String str13 = aVar3.B;
                    str13.getClass();
                    List list6 = aVar3.E;
                    list6.getClass();
                    org.schabi.newpipe.extractor.a aVar4 = (org.schabi.newpipe.extractor.a) kotlin.collections.p.D(list6);
                    return new MusicArtistDetail(str13, aVar4 != null ? aVar4.e : null, aVar3.D, w.e);
                } catch (Exception e10) {
                    try {
                        throw new org.schabi.newpipe.extractor.exceptions.f("Could not get feed URL", e10);
                    } catch (Exception e11) {
                        aVar3.a(e11);
                    }
                }
                break;
            case 2:
                String str14 = this.y;
                kotlin.a.e(obj);
                try {
                    org.schabi.newpipe.extractor.stream.f fVarE = org.schabi.newpipe.extractor.stream.f.e(l.a, str14);
                    String str15 = fVarE.G;
                    if (str15 == null || k.J(str15)) {
                        List list7 = fVarE.E;
                        list7.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list7) {
                            if (!((org.schabi.newpipe.extractor.stream.j) obj3).C) {
                                arrayList3.add(obj3);
                            }
                        }
                        org.schabi.newpipe.extractor.stream.j jVar2 = (org.schabi.newpipe.extractor.stream.j) kotlin.collections.p.D(kotlin.collections.p.W(arrayList3, new androidx.constraintlayout.core.e(10)));
                        if (jVar2 != null) {
                            String str16 = jVar2.y;
                            str16.getClass();
                            if (!k.J(str16)) {
                                musicStreamResult = new MusicStreamResult(str16, "mp4");
                            }
                        }
                        String str17 = fVarE.H;
                        if (str17 != null && !k.J(str17)) {
                            musicStreamResult = new MusicStreamResult(str17, "hls");
                        }
                        List list8 = fVarE.F;
                        list8.getClass();
                        org.schabi.newpipe.extractor.stream.b bVar = (org.schabi.newpipe.extractor.stream.b) kotlin.collections.p.D(kotlin.collections.p.W(list8, new androidx.constraintlayout.core.e(11)));
                        if (bVar != null) {
                            String str18 = bVar.y;
                            str18.getClass();
                            if (!k.J(str18)) {
                                return new MusicStreamResult(str18, "mp3");
                            }
                        }
                        return null;
                    }
                    musicStreamResult = new MusicStreamResult(str15, "dash");
                    return musicStreamResult;
                } catch (Exception e12) {
                    Context context3 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("YouTubeMusic", "resolveTrack failed for " + str14, e12);
                }
                break;
            default:
                kotlin.a.e(obj);
                String str19 = this.y;
                if (str19 != null) {
                    Context context4 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.h("screen", str19);
                    com.app.mlounge.util.a.a("D", "Nav", "screen=".concat(str19));
                    com.app.mlounge.util.a.f("screen=".concat(str19));
                }
                return y.a;
        }
    }
}
