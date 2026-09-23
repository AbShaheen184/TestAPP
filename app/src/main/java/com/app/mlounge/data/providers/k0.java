package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements l0 {
    public static final int $stable = 8;
    private static final String BASE_URL = "https://none.eat-peach.sbs";
    private static final String ORIGIN = "https://peachify.pro";
    private static final String REFERER = "https://peachify.pro/";
    private static final String TAG = "HollyProvider";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final com.google.gson.e gson;
    private final String name;
    public static final g0 Companion = new g0();
    private static final List<String> VARIANTS = kotlin.collections.q.k("holly", "air", "multi", "moviebox");

    public k0(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "Holly";
        this.gson = new com.google.gson.e();
    }

    public static final Object b(k0 k0Var, String str, String str2, String str3, Integer num, Integer num2) {
        String strE;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.f fVarM;
        String strH;
        String strH2;
        String strH3;
        k0Var.getClass();
        kotlin.collections.w wVar = kotlin.collections.w.e;
        if (!kotlin.jvm.internal.l.a(str3, "tv") || num == null || num2 == null) {
            strE = androidx.room.b0.e("https://none.eat-peach.sbs/", str, "/movie/", str2);
        } else {
            StringBuilder sbQ = androidx.compose.runtime.j.q("https://none.eat-peach.sbs/", str, "/tv/", str2, "/");
            sbQ.append(num);
            sbQ.append("/");
            sbQ.append(num2);
            strE = sbQ.toString();
        }
        try {
            okhttp3.y yVar = k0Var.client;
            okhttp3.b0 b0VarD = d(strE);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0VarD, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strA = j0Var.A()) != null && (jVar = (com.google.gson.j) k0Var.gson.d(com.google.gson.j.class, strA)) != null && (fVarM = jVar.m("sources")) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = fVarM.e.iterator();
                while (it.hasNext()) {
                    com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                    com.google.gson.g gVarL = jVarE.l("url");
                    ChqStream chqStream = null;
                    if (gVarL != null && (strH = gVarL.h()) != null) {
                        com.google.gson.g gVarL2 = jVarE.l("type");
                        if (gVarL2 == null || (strH2 = gVarL2.h()) == null) {
                            strH2 = "hls";
                        }
                        String str4 = strH2;
                        com.google.gson.g gVarL3 = jVarE.l("dub");
                        String str5 = "";
                        if (gVarL3 == null || (strH3 = gVarL3.h()) == null) {
                            strH3 = "";
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        com.google.gson.j jVarO = jVarE.o("headers");
                        if (jVarO != null) {
                            Iterator it2 = ((com.google.gson.internal.l) jVarO.e.entrySet()).iterator();
                            while (((com.google.gson.internal.k) it2).hasNext()) {
                                com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it2).c();
                                linkedHashMap.put(mVarC.getKey(), ((com.google.gson.g) mVarC.getValue()).h());
                            }
                        }
                        if (!kotlin.text.k.J(strH3)) {
                            str5 = strH3;
                        }
                        chqStream = new ChqStream(kotlin.text.k.g0("Holly (" + str + ") " + ((Object) str5)).toString(), strH, kotlin.text.k.z(strH3, "sub", true) ? "SUB" : "DUB", str4, str4, null, linkedHashMap.isEmpty() ? null : linkedHashMap, null, null, null, null, null, null, 8064);
                    }
                    if (chqStream != null) {
                        arrayList.add(chqStream);
                    }
                }
                return arrayList;
            }
            return wVar;
        } catch (Exception e) {
            Context context = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("E", TAG, androidx.room.b0.e("Error fetching from ", str, ": ", e.getMessage()));
            return wVar;
        }
    }

    public static okhttp3.b0 d(String str) {
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", UA);
        a0Var.b("Accept", "*/*");
        a0Var.b("Origin", ORIGIN);
        a0Var.b("Referer", REFERER);
        a0Var.b("Sec-Fetch-Mode", "cors");
        a0Var.b("Sec-Fetch-Site", "cross-site");
        return new okhttp3.b0(a0Var);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new j0(this, str, str2, num, num2, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }
}
