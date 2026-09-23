package com.app.mlounge.data.providers;

import android.content.Context;
import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = o0Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new n0(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0228 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:111:0x024e A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0267 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:124:0x028d A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0293  */
    /* JADX WARN: Code duplicated, block: B:127:0x0295 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:129:0x029b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b0 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:177:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0222 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0261 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0201  */
    /* JADX WARN: Code duplicated, block: B:93:0x0205 A[Catch: Exception -> 0x0110, TRY_ENTER, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0209 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:38:0x00fe, B:40:0x0106, B:47:0x0116, B:51:0x0133, B:57:0x0148, B:59:0x014e, B:61:0x0158, B:63:0x0160, B:66:0x0168, B:68:0x0172, B:70:0x017a, B:72:0x0180, B:81:0x019f, B:84:0x01e7, B:86:0x01f1, B:88:0x01f7, B:93:0x0205, B:95:0x0209, B:98:0x020f, B:101:0x0219, B:102:0x0222, B:104:0x0228, B:106:0x023a, B:108:0x0246, B:111:0x024e, B:114:0x0258, B:115:0x0261, B:117:0x0267, B:119:0x0279, B:121:0x0285, B:124:0x028d, B:130:0x029d, B:131:0x02aa, B:133:0x02b0, B:135:0x02c2, B:138:0x02cb, B:140:0x02d4, B:141:0x02e5, B:143:0x02f1, B:145:0x02f7, B:157:0x0327, B:160:0x038a, B:149:0x0309, B:152:0x0314, B:154:0x031c, B:127:0x0295), top: B:166:0x00fe }] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        kotlin.collections.w wVar;
        com.google.gson.f fVarM;
        com.google.gson.f fVar;
        com.google.gson.j jVarE;
        com.google.gson.g gVarL;
        String strH;
        boolean z;
        boolean z2;
        String str;
        okhttp3.g0 g0VarE;
        okhttp3.j0 j0Var;
        String strA;
        com.google.gson.j jVar;
        com.google.gson.f fVarM2;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.g gVarL2;
        ChqStream chqStream;
        String strH2;
        com.google.gson.f fVarM3;
        Iterator it2;
        com.google.gson.j jVarE2;
        com.google.gson.f fVarM4;
        Iterator it3;
        com.google.gson.j jVarE3;
        com.google.gson.g gVarL3;
        com.google.gson.g gVarL4;
        String strH3;
        String strH4;
        String strH5;
        kotlin.collections.w wVar2 = kotlin.collections.w.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            m1 m1Var = this.this$0.tmdbHelper;
            String str2 = this.$tmdbId;
            String str3 = this.$mediaType;
            this.label = 1;
            objC = m1Var.c(str2, str3, this);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objC = obj;
        }
        j1 j1Var = (j1) objC;
        if (j1Var != null) {
            try {
                String str4 = "https://app.cloud-mb.xyz/api/search/" + URLEncoder.encode(j1Var.a(), "UTF-8") + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str4);
                a0Var.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                a0Var.b("x-request-x", "com.movieblast");
                a0Var.b("hash256", "86dc03244adddb3cbedbf0ae36074a736ee293a64774b18e82a6244eafd0df30");
                a0Var.b("packagename", "com.movieblast");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE2.N) {
                    com.google.gson.e eVar = this.this$0.gson;
                    okhttp3.j0 j0Var2 = g0VarE2.D;
                    com.google.gson.j jVar2 = (com.google.gson.j) eVar.d(com.google.gson.j.class, j0Var2 != null ? j0Var2.A() : null);
                    if (jVar2 != null && (fVarM = jVar2.m("search")) != null) {
                        ArrayList arrayList2 = fVarM.e;
                        String lowerCase = j1Var.a().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        Integer numB = j1Var.b();
                        Iterator it4 = arrayList2.iterator();
                        it4.getClass();
                        while (true) {
                            if (!it4.hasNext()) {
                                wVar = wVar2;
                                fVar = fVarM;
                                jVarE = null;
                                break;
                            }
                            jVarE = ((com.google.gson.g) it4.next()).e();
                            com.google.gson.g gVarL5 = jVarE.l("name");
                            if (gVarL5 == null || (strH4 = gVarL5.h()) == null) {
                                wVar = wVar2;
                                fVar = fVarM;
                            } else {
                                wVar = wVar2;
                                try {
                                    com.google.gson.g gVarL6 = jVarE.l("release_date");
                                    if (gVarL6 == null || (strH5 = gVarL6.h()) == null) {
                                        strH5 = "";
                                    }
                                    fVar = fVarM;
                                    Integer numW = kotlin.text.r.w(kotlin.text.k.e0(4, strH5));
                                    String lowerCase2 = strH4.toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    if (kotlin.text.k.z(lowerCase2, lowerCase, false) && (numB == null || numW == null || numB.equals(numW))) {
                                        break;
                                        break;
                                        break;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                }
                            }
                            wVar2 = wVar;
                            fVarM = fVar;
                        }
                        if (jVarE == null && arrayList2.size() > 0) {
                            jVarE = fVar.i().e();
                        }
                        if (jVarE != null && (gVarL = jVarE.l("id")) != null && (strH = gVarL.h()) != null) {
                            if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                                com.google.gson.g gVarL7 = jVarE.l("type");
                                if (gVarL7 != null && (strH3 = gVarL7.h()) != null) {
                                    String lowerCase3 = strH3.toLowerCase(Locale.ROOT);
                                    lowerCase3.getClass();
                                    z = true;
                                    if (kotlin.text.k.z(lowerCase3, "serie", false)) {
                                    }
                                    if (z2) {
                                        str = "series/show";
                                    } else {
                                        str = "media/detail";
                                    }
                                    String str5 = "https://app.cloud-mb.xyz/api/" + str + "/" + strH + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                                    okhttp3.a0 a0Var2 = new okhttp3.a0();
                                    a0Var2.d(str5);
                                    a0Var2.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                                    a0Var2.b("x-request-x", "com.movieblast");
                                    okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                                    okhttp3.y yVar2 = this.this$0.client;
                                    yVar2.getClass();
                                    g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                    if (!g0VarE.N) {
                                        return wVar;
                                    }
                                    com.google.gson.e eVar2 = this.this$0.gson;
                                    j0Var = g0VarE.D;
                                    if (j0Var != null) {
                                        strA = j0Var.A();
                                    } else {
                                        strA = null;
                                    }
                                    jVar = (com.google.gson.j) eVar2.d(com.google.gson.j.class, strA);
                                    if (jVar == null) {
                                        return wVar;
                                    }
                                    if (z2) {
                                        if (this.$season == null && this.$episode != null && (fVarM3 = jVar.m("seasons")) != null) {
                                            it2 = fVarM3.e.iterator();
                                            it2.getClass();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    jVarE2 = null;
                                                    break;
                                                }
                                                com.google.gson.g gVar = (com.google.gson.g) it2.next();
                                                gVarL4 = gVar.e().l("season_number");
                                                if (gVarL4 == null && gVarL4.c() == this.$season.intValue()) {
                                                    jVarE2 = gVar.e();
                                                    break;
                                                }
                                            }
                                            if (jVarE2 == null && (fVarM4 = jVarE2.m("episodes")) != null) {
                                                it3 = fVarM4.e.iterator();
                                                it3.getClass();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        jVarE3 = null;
                                                        break;
                                                    }
                                                    com.google.gson.g gVar2 = (com.google.gson.g) it3.next();
                                                    gVarL3 = gVar2.e().l("episode_number");
                                                    if (gVarL3 == null && gVarL3.c() == this.$episode.intValue()) {
                                                        jVarE3 = gVar2.e();
                                                        break;
                                                    }
                                                }
                                                if (jVarE3 == null) {
                                                    return wVar;
                                                }
                                                fVarM2 = jVarE3.m("videos");
                                                if (fVarM2 == null) {
                                                    return wVar;
                                                }
                                            }
                                            return wVar;
                                        }
                                        return wVar;
                                    }
                                    fVarM2 = jVar.m("videos");
                                    if (fVarM2 == null) {
                                        return wVar;
                                    }
                                    o0 o0Var = this.this$0;
                                    arrayList = new ArrayList();
                                    it = fVarM2.e.iterator();
                                    while (it.hasNext()) {
                                        com.google.gson.j jVarE4 = ((com.google.gson.g) it.next()).e();
                                        gVarL2 = jVarE4.l("link");
                                        if (gVarL2 == null && (strH2 = gVarL2.h()) != null) {
                                            if (!kotlin.text.r.u(strH2, "http", false)) {
                                                strH2 = "https://" + strH2;
                                            }
                                            String strB = o0.b(o0Var, strH2);
                                            com.google.gson.g gVarL8 = jVarE4.l("server");
                                            String strF = o0.f(o0Var, gVarL8 != null ? gVarL8.h() : null);
                                            String str6 = "hls";
                                            if (!kotlin.text.k.z(strB, ".m3u8", false)) {
                                                if (kotlin.text.k.z(strB, ".mpd", false)) {
                                                    str6 = "dash";
                                                } else if (kotlin.text.k.z(strB, ".mp4", false) || kotlin.text.k.z(strB, ".mkv", false)) {
                                                    str6 = "mp4";
                                                }
                                            }
                                            String str7 = str6;
                                            chqStream = new ChqStream("MovieBlast", strB, strF, str7, str7, null, kotlin.collections.c0.k(new kotlin.k("Accept-Encoding", "identity"), new kotlin.k("Connection", "Keep-Alive"), new kotlin.k("Icy-MetaData", "1"), new kotlin.k("Referer", "MovieBlast"), new kotlin.k("User-Agent", "MovieBlast"), new kotlin.k("x-request-x", "com.movieblast")), null, null, null, null, null, null, 8064);
                                        }
                                        if (chqStream != null) {
                                            arrayList.add(chqStream);
                                        }
                                    }
                                    return arrayList;
                                }
                                z2 = false;
                                if (z2) {
                                    str = "series/show";
                                } else {
                                    str = "media/detail";
                                }
                                String str8 = "https://app.cloud-mb.xyz/api/" + str + "/" + strH + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                                okhttp3.a0 a0Var3 = new okhttp3.a0();
                                a0Var3.d(str8);
                                a0Var3.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                                a0Var3.b("x-request-x", "com.movieblast");
                                okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                okhttp3.y yVar3 = this.this$0.client;
                                yVar3.getClass();
                                g0VarE = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                if (!g0VarE.N) {
                                    return wVar;
                                }
                                com.google.gson.e eVar3 = this.this$0.gson;
                                j0Var = g0VarE.D;
                                if (j0Var != null) {
                                    strA = j0Var.A();
                                } else {
                                    strA = null;
                                }
                                jVar = (com.google.gson.j) eVar3.d(com.google.gson.j.class, strA);
                                if (jVar == null) {
                                    return wVar;
                                }
                                if (z2) {
                                    fVarM2 = jVar.m("videos");
                                    if (fVarM2 == null) {
                                        return wVar;
                                    }
                                } else {
                                    if (this.$season == null) {
                                        return wVar;
                                    }
                                    it2 = fVarM3.e.iterator();
                                    it2.getClass();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            jVarE2 = null;
                                            break;
                                        }
                                        com.google.gson.g gVar3 = (com.google.gson.g) it2.next();
                                        gVarL4 = gVar3.e().l("season_number");
                                        if (gVarL4 == null) {
                                        }
                                    }
                                    if (jVarE2 == null) {
                                        return wVar;
                                    }
                                    it3 = fVarM4.e.iterator();
                                    it3.getClass();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            jVarE3 = null;
                                            break;
                                        }
                                        com.google.gson.g gVar4 = (com.google.gson.g) it3.next();
                                        gVarL3 = gVar4.e().l("episode_number");
                                        if (gVarL3 == null) {
                                        }
                                    }
                                    if (jVarE3 == null) {
                                        return wVar;
                                    }
                                    fVarM2 = jVarE3.m("videos");
                                    if (fVarM2 == null) {
                                        return wVar;
                                    }
                                }
                                o0 o0Var2 = this.this$0;
                                arrayList = new ArrayList();
                                it = fVarM2.e.iterator();
                                while (it.hasNext()) {
                                    com.google.gson.j jVarE5 = ((com.google.gson.g) it.next()).e();
                                    gVarL2 = jVarE5.l("link");
                                    chqStream = gVarL2 == null ? null : null;
                                    if (chqStream != null) {
                                        arrayList.add(chqStream);
                                    }
                                }
                                return arrayList;
                            }
                            z = true;
                            z2 = z;
                            if (z2) {
                                str = "series/show";
                            } else {
                                str = "media/detail";
                            }
                            String str9 = "https://app.cloud-mb.xyz/api/" + str + "/" + strH + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                            okhttp3.a0 a0Var4 = new okhttp3.a0();
                            a0Var4.d(str9);
                            a0Var4.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                            a0Var4.b("x-request-x", "com.movieblast");
                            okhttp3.b0 b0Var4 = new okhttp3.b0(a0Var4);
                            okhttp3.y yVar4 = this.this$0.client;
                            yVar4.getClass();
                            g0VarE = new okhttp3.internal.connection.m(yVar4, b0Var4, false).e();
                            if (!g0VarE.N) {
                                return wVar;
                            }
                            com.google.gson.e eVar4 = this.this$0.gson;
                            j0Var = g0VarE.D;
                            if (j0Var != null) {
                                strA = j0Var.A();
                            } else {
                                strA = null;
                            }
                            jVar = (com.google.gson.j) eVar4.d(com.google.gson.j.class, strA);
                            if (jVar == null) {
                                return wVar;
                            }
                            if (z2) {
                                fVarM2 = jVar.m("videos");
                                if (fVarM2 == null) {
                                    return wVar;
                                }
                            } else {
                                if (this.$season == null) {
                                    return wVar;
                                }
                                it2 = fVarM3.e.iterator();
                                it2.getClass();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        jVarE2 = null;
                                        break;
                                    }
                                    com.google.gson.g gVar5 = (com.google.gson.g) it2.next();
                                    gVarL4 = gVar5.e().l("season_number");
                                    if (gVarL4 == null) {
                                    }
                                }
                                if (jVarE2 == null) {
                                    return wVar;
                                }
                                it3 = fVarM4.e.iterator();
                                it3.getClass();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        jVarE3 = null;
                                        break;
                                    }
                                    com.google.gson.g gVar6 = (com.google.gson.g) it3.next();
                                    gVarL3 = gVar6.e().l("episode_number");
                                    if (gVarL3 == null) {
                                    }
                                }
                                if (jVarE3 == null) {
                                    return wVar;
                                }
                                fVarM2 = jVarE3.m("videos");
                                if (fVarM2 == null) {
                                    return wVar;
                                }
                            }
                            o0 o0Var3 = this.this$0;
                            arrayList = new ArrayList();
                            it = fVarM2.e.iterator();
                            while (it.hasNext()) {
                                com.google.gson.j jVarE6 = ((com.google.gson.g) it.next()).e();
                                gVarL2 = jVarE6.l("link");
                                if (gVarL2 == null) {
                                }
                                if (chqStream != null) {
                                    arrayList.add(chqStream);
                                }
                            }
                            return arrayList;
                        }
                        return wVar;
                    }
                    Context context = com.app.mlounge.util.a.a;
                    androidx.room.b0.h("Error: ", e.getMessage(), "E", "MovieBlast");
                    return wVar;
                }
            } catch (Exception e2) {
                e = e2;
                wVar = wVar2;
            }
        }
        return wVar2;
    }
}
