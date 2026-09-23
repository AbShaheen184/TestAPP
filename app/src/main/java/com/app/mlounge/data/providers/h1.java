package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.IptvChannel;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    int label;
    final /* synthetic */ i1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new h1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0244 A[Catch: Exception -> 0x0159, TryCatch #2 {Exception -> 0x0159, blocks: (B:42:0x0115, B:44:0x014a, B:46:0x0154, B:50:0x015e, B:53:0x0169, B:56:0x0172, B:57:0x017b, B:59:0x0181, B:61:0x0193, B:64:0x019a, B:67:0x01a3, B:69:0x01ab, B:72:0x01b5, B:74:0x01bd, B:76:0x01c3, B:79:0x01cb, B:81:0x01d3, B:83:0x01d9, B:85:0x01e7, B:88:0x01f2, B:90:0x0244, B:92:0x024d), top: B:108:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x024b  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.google.gson.g gVarL;
        String strH;
        com.google.gson.j jVarO;
        com.google.gson.g gVarL2;
        String strH2;
        String strH3;
        com.google.gson.f fVarM;
        Iterator it;
        String strH4;
        String strH5;
        String strH6;
        com.google.gson.g gVarL3;
        String strH7;
        com.google.gson.g gVarI;
        com.google.gson.g gVarI2;
        kotlin.collections.w wVar = kotlin.collections.w.e;
        if (this.label != 0) {
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            String string = UUID.randomUUID().toString();
            string.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String str = "https://boot.pluto.tv/v4/start?appName=web&appVersion=9.9.1&deviceVersion=130.0.0&deviceModel=web&deviceMake=Firefox&deviceType=web&clientID=" + string + "&clientModelNumber=1.0.0&serverSideAds=false&constraints=&drmCapabilities=&blockingMode=&clientTime=" + simpleDateFormat.format(new Date());
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", this.this$0.ua);
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N) {
                com.google.gson.e eVar = this.this$0.gson;
                okhttp3.j0 j0Var = g0VarE.D;
                com.google.gson.j jVar = (com.google.gson.j) eVar.d(com.google.gson.j.class, j0Var != null ? j0Var.A() : null);
                if (jVar != null && (gVarL = jVar.l("sessionToken")) != null && (strH = gVarL.h()) != null && (jVarO = jVar.o("servers")) != null && (gVarL2 = jVarO.l("stitcher")) != null && (strH2 = gVarL2.h()) != null) {
                    com.google.gson.g gVarL4 = jVar.l("stitcherParams");
                    if (gVarL4 == null || (strH3 = gVarL4.h()) == null) {
                        strH3 = "";
                    }
                    String str2 = strH3;
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : i1.REGIONS.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        try {
                            okhttp3.a0 a0Var2 = new okhttp3.a0();
                            a0Var2.d("https://service-channels.clusters.pluto.tv/v2/guide/channels?channelIds=&offset=0&limit=1000&sort=number%3Aasc");
                            a0Var2.b("User-Agent", this.this$0.ua);
                            try {
                                a0Var2.b("Authorization", "Bearer " + strH);
                                a0Var2.b("X-Forwarded-For", str4);
                                okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                                okhttp3.y yVar2 = this.this$0.client;
                                yVar2.getClass();
                                boolean z = false;
                                okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                if (g0VarE2.N) {
                                    com.google.gson.e eVar2 = this.this$0.gson;
                                    okhttp3.j0 j0Var2 = g0VarE2.D;
                                    com.google.gson.j jVar2 = (com.google.gson.j) eVar2.d(com.google.gson.j.class, j0Var2 != null ? j0Var2.A() : null);
                                    if (jVar2 != null && (fVarM = jVar2.m("data")) != null) {
                                        Iterator it2 = fVarM.e.iterator();
                                        it2.getClass();
                                        while (it2.hasNext()) {
                                            com.google.gson.j jVarE = ((com.google.gson.g) it2.next()).e();
                                            com.google.gson.g gVarL5 = jVarE.l("name");
                                            if (gVarL5 == null || (strH4 = gVarL5.h()) == null) {
                                                it = it2;
                                                it2 = it;
                                                z = false;
                                            } else {
                                                com.google.gson.j jVarO2 = jVarE.o("stitched");
                                                if (jVarO2 != null) {
                                                    com.google.gson.g gVarL6 = jVarO2.l("path");
                                                    if (gVarL6 == null || (strH5 = gVarL6.h()) == null) {
                                                        it = it2;
                                                    } else {
                                                        com.google.gson.f fVarM2 = jVarE.m("categoryIDs");
                                                        if (fVarM2 == null || (gVarI2 = fVarM2.i()) == null || (strH6 = gVarI2.h()) == null) {
                                                            strH6 = "Uncategorized";
                                                        }
                                                        com.google.gson.f fVarM3 = jVarE.m("images");
                                                        if (fVarM3 == null || (gVarI = fVarM3.i()) == null) {
                                                            it = it2;
                                                        } else {
                                                            it = it2;
                                                            com.google.gson.g gVarL7 = gVarI.e().l("url");
                                                            String strH8 = gVarL7 != null ? gVarL7.h() : null;
                                                            String str5 = strH2 + "/v2" + strH5 + "?" + str2 + "&jwt=" + strH + "&masterJWTPassthrough=true";
                                                            String upperCase = str3.toUpperCase(Locale.ROOT);
                                                            upperCase.getClass();
                                                            String str6 = upperCase + " - " + strH6;
                                                            gVarL3 = jVarE.l("id");
                                                            if (gVarL3 != null) {
                                                                strH7 = gVarL3.h();
                                                            } else {
                                                                strH7 = null;
                                                            }
                                                            arrayList.add(new IptvChannel(strH4, str5, strH8, str6, "plutotv", strH7));
                                                        }
                                                        String str7 = strH2 + "/v2" + strH5 + "?" + str2 + "&jwt=" + strH + "&masterJWTPassthrough=true";
                                                        String upperCase2 = str3.toUpperCase(Locale.ROOT);
                                                        upperCase2.getClass();
                                                        String str8 = upperCase2 + " - " + strH6;
                                                        gVarL3 = jVarE.l("id");
                                                        if (gVarL3 != null) {
                                                            strH7 = gVarL3.h();
                                                        } else {
                                                            strH7 = null;
                                                        }
                                                        arrayList.add(new IptvChannel(strH4, str7, strH8, str8, "plutotv", strH7));
                                                    }
                                                    it2 = it;
                                                    z = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                Context context = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.a("W", "PlutoTV", "Region " + str3 + " failed: " + e.getMessage());
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    }
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "PlutoTV", "PlutoTV: " + arrayList.size() + " channels");
                    return arrayList;
                }
            }
            return wVar;
        } catch (Exception e3) {
            Context context3 = com.app.mlounge.util.a.a;
            androidx.room.b0.h("Error: ", e3.getMessage(), "E", "PlutoTV");
            return wVar;
        }
    }
}
