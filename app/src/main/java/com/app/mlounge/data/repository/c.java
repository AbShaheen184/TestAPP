package com.app.mlounge.data.repository;

import android.content.Context;
import com.app.mlounge.data.providers.f1;
import com.app.mlounge.data.remote.model.EpornerResolveResponse;
import com.app.mlounge.data.remote.model.EpornerSourceDetail;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ r A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, a aVar, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.z = aVar;
        this.A = rVar;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c(0, this.z, this.A, this.B, dVar);
            default:
                return new c(1, this.z, this.A, this.B, dVar);
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
        return ((c) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x026b  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        String str6;
        String str7;
        Object objE;
        String str8;
        Object objF;
        switch (this.e) {
            case 0:
                String str9 = this.B;
                r rVar = this.A;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    int iOrdinal = this.z.ordinal();
                    if (iOrdinal == 0) {
                        com.app.mlounge.data.providers.s sVar = rVar.b;
                        sVar.getClass();
                        kotlin.k kVarC = com.app.mlounge.data.providers.s.c(str9);
                        String str10 = (String) kVarC.e;
                        String strI = androidx.compose.runtime.j.i("https://www.xvideos.com", str10);
                        Context context = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "EpornerScraper", "getVideoDetail: ".concat(strI));
                        String strB = sVar.b(strI);
                        if (strB == null) {
                            return null;
                        }
                        kotlin.text.g gVarS = androidx.compose.runtime.j.s("<meta\\s+property=\"og:title\"\\s+content=\"([^\"]+)\"", 0, strB, strB);
                        if (gVarS == null || (string = (String) ((kotlin.collections.d0) gVarS.a()).get(1)) == null) {
                            kotlin.text.g gVarS2 = androidx.compose.runtime.j.s("<title>([^<]+)", 0, strB, strB);
                            if (gVarS2 == null || (str2 = (String) ((kotlin.collections.d0) gVarS2.a()).get(1)) == null) {
                                str = "";
                            } else {
                                String string2 = kotlin.text.k.g0(kotlin.text.r.s(str2, " - XVIDEOS.COM", "", false)).toString();
                                str = string2;
                            }
                        } else {
                            str = string2;
                        }
                        kotlin.text.g gVarS3 = androidx.compose.runtime.j.s("<meta\\s+property=\"og:image\"\\s+content=\"([^\"]+)\"", 0, strB, strB);
                        if (gVarS3 == null || (str3 = (String) ((kotlin.collections.d0) gVarS3.a()).get(1)) == null) {
                            str3 = "";
                        }
                        kotlin.text.g gVarS4 = androidx.compose.runtime.j.s("<meta\\s+property=\"og:duration\"\\s+content=\"(\\d+)\"", 0, strB, strB);
                        if (gVarS4 == null || (str6 = (String) ((kotlin.collections.d0) gVarS4.a()).get(1)) == null) {
                            str4 = "";
                        } else {
                            Integer numW = kotlin.text.r.w(str6);
                            if (numW != null) {
                                int iIntValue = numW.intValue();
                                str7 = (iIntValue / 60) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue % 60)}, 1));
                            } else {
                                str7 = null;
                            }
                            if (str7 != null) {
                                str4 = str7;
                            } else {
                                str4 = "";
                            }
                        }
                        kotlin.text.g gVarS5 = androidx.compose.runtime.j.s("\"views\"\\s*:\\s*\"([^\"]+)\"", 0, strB, strB);
                        if (gVarS5 == null || (string = (String) ((kotlin.collections.d0) gVarS5.a()).get(1)) == null) {
                            kotlin.text.g gVarS6 = androidx.compose.runtime.j.s("<div\\s+class=[\"']video-views[\"'][^>]*>([^<]+)", 0, strB, strB);
                            string = (gVarS6 == null || (str5 = (String) ((kotlin.collections.d0) gVarS6.a()).get(1)) == null) ? "" : kotlin.text.k.g0(str5).toString();
                        }
                        ArrayList arrayList = new ArrayList();
                        androidx.collection.m0 m0Var = new androidx.collection.m0(kotlin.text.i.b(new kotlin.text.i("<a\\s+href=\"[^\"]*tags[^\"]*\"[^>]*>([^<]+)</a>"), strB));
                        while (m0Var.hasNext()) {
                            arrayList.add(kotlin.text.k.g0((String) ((kotlin.collections.d0) ((kotlin.text.g) m0Var.next()).a()).get(1)).toString());
                        }
                        if (arrayList.isEmpty()) {
                            kotlin.text.g gVarS7 = androidx.compose.runtime.j.s("\"keywords\"\\s*:\\s*\"([^\"]+)\"", 0, strB, strB);
                            String str11 = gVarS7 != null ? (String) ((kotlin.collections.d0) gVarS7.a()).get(1) : null;
                            if (str11 != null) {
                                List listU = kotlin.text.k.U(str11, new String[]{","}, 6);
                                ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(listU, 10));
                                Iterator it = listU.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(kotlin.text.k.g0((String) it.next()).toString());
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        return new EpornerVideoDetail(androidx.compose.runtime.j.i("xvideos_", str10), str, kotlin.collections.p.I(arrayList, ", ", null, null, null, 62), kotlin.text.r.x(kotlin.text.r.s(string, ",", "", false)), null, null, str4, str3.length() > 0 ? new EpornerThumb(str3, null, null) : null, null);
                    }
                    if (iOrdinal == 1) {
                        return rVar.c.c(str9);
                    }
                    if (iOrdinal != 2) {
                        coil3.g.a();
                        return null;
                    }
                    f1 f1Var = rVar.d;
                    this.y = 1;
                    objE = f1Var.e(str9, this);
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objE = obj;
                }
                return (EpornerVideoDetail) objE;
            default:
                String str12 = this.B;
                r rVar2 = this.A;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    int iOrdinal2 = this.z.ordinal();
                    if (iOrdinal2 == 0) {
                        com.app.mlounge.data.providers.s sVar2 = rVar2.b;
                        sVar2.getClass();
                        str12.getClass();
                        String strI2 = androidx.compose.runtime.j.i("https://www.xvideos.com", (String) com.app.mlounge.data.providers.s.c(str12).e);
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "EpornerScraper", "resolveVideo: ".concat(strI2));
                        String strB2 = sVar2.b(strI2);
                        if (strB2 == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        kotlin.text.g gVarS8 = androidx.compose.runtime.j.s("\"contentUrl\"\\s*:\\s*\"([^\"]+)\"", 0, strB2, strB2);
                        String strS = (gVarS8 == null || (str8 = (String) ((kotlin.collections.d0) gVarS8.a()).get(1)) == null) ? null : kotlin.text.r.s(str8, "\\/", "/", false);
                        if (strS != null) {
                            linkedHashMap.put("MP4", new EpornerSourceDetail("MP4", strS, "mp4", Boolean.TRUE));
                        }
                        kotlin.text.g gVarS9 = androidx.compose.runtime.j.s("html5player\\.setVideoHLS\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str13 = gVarS9 != null ? (String) ((kotlin.collections.d0) gVarS9.a()).get(1) : null;
                        if (str13 != null) {
                            linkedHashMap.put("HLS", new EpornerSourceDetail("HLS", str13, "hls", Boolean.valueOf(linkedHashMap.isEmpty())));
                        }
                        kotlin.text.g gVarS10 = androidx.compose.runtime.j.s("html5player\\.setVideoUrlHigh\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str14 = gVarS10 != null ? (String) ((kotlin.collections.d0) gVarS10.a()).get(1) : null;
                        if (str14 != null && !linkedHashMap.containsKey("MP4")) {
                            linkedHashMap.put("High", new EpornerSourceDetail("High", str14, "mp4", Boolean.valueOf(linkedHashMap.isEmpty())));
                        }
                        kotlin.text.g gVarS11 = androidx.compose.runtime.j.s("html5player\\.setVideoUrlLow\\(['\"]([^'\"]+)['\"]", 0, strB2, strB2);
                        String str15 = gVarS11 != null ? (String) ((kotlin.collections.d0) gVarS11.a()).get(1) : null;
                        if (str15 != null && linkedHashMap.isEmpty()) {
                            linkedHashMap.put("Low", new EpornerSourceDetail("Low", str15, "mp4", Boolean.TRUE));
                        }
                        if (linkedHashMap.isEmpty()) {
                            com.app.mlounge.util.a.a("W", "EpornerScraper", "extractVideoSources — no sources found in HTML");
                            return null;
                        }
                        Map mapSingletonMap = Collections.singletonMap("mp4", linkedHashMap);
                        mapSingletonMap.getClass();
                        return new EpornerResolveResponse(mapSingletonMap);
                    }
                    if (iOrdinal2 == 1) {
                        return rVar2.c.d(str12);
                    }
                    if (iOrdinal2 != 2) {
                        coil3.g.a();
                        return null;
                    }
                    f1 f1Var2 = rVar2.d;
                    this.y = 1;
                    objF = f1Var2.f(str12, this);
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                    objF = obj;
                }
                return (EpornerResolveResponse) objF;
        }
    }
}
