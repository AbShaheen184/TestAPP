package com.app.mlounge.data.providers;

import android.content.Context;
import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, Integer num, Integer num2, n nVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        m mVar = new m(this.$tmdbId, this.$mediaType, this.$season, this.$episode, this.this$0, dVar);
        mVar.L$0 = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x051b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0704 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x006d, B:41:0x0156, B:43:0x015c, B:46:0x0165, B:48:0x016c, B:50:0x0188, B:52:0x018e, B:55:0x01a2, B:57:0x01a6, B:59:0x01aa, B:62:0x01f6, B:66:0x02a9, B:70:0x02b4, B:73:0x02c6, B:76:0x02cf, B:78:0x02d5, B:82:0x02ec, B:84:0x02fd, B:86:0x0303, B:88:0x0313, B:90:0x0319, B:92:0x0344, B:94:0x034a, B:96:0x0356, B:98:0x0369, B:100:0x0376, B:102:0x037c, B:103:0x0385, B:105:0x0399, B:107:0x03a1, B:109:0x03a8, B:111:0x03bb, B:113:0x03c1, B:115:0x03c9, B:117:0x03d0, B:119:0x03e3, B:121:0x03e9, B:123:0x03f1, B:125:0x03fe, B:127:0x0411, B:129:0x0417, B:130:0x046b, B:132:0x0471, B:134:0x0483, B:141:0x049a, B:209:0x0704, B:137:0x048b, B:139:0x0493, B:144:0x04ad, B:146:0x04b5, B:148:0x04bb, B:150:0x04c7, B:152:0x04cf, B:153:0x04e6, B:155:0x04ee, B:158:0x04f5, B:160:0x0508, B:163:0x0525, B:165:0x052d, B:168:0x053d, B:170:0x0545, B:173:0x0555, B:175:0x055d, B:180:0x0569, B:182:0x0571, B:184:0x057a, B:186:0x0582, B:189:0x0589, B:191:0x05c9, B:192:0x05f0, B:194:0x061b, B:196:0x062a, B:199:0x0635, B:201:0x068b, B:203:0x069c, B:204:0x06d9, B:206:0x06e3, B:207:0x06eb, B:212:0x0717, B:61:0x01e4, B:37:0x013a), top: B:218:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:210:0x070a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objFirst;
        String str;
        Object objFirst2;
        String str2;
        Object objC;
        String str3;
        String str4;
        com.google.gson.g gVarL;
        String upperCase;
        String strH;
        boolean z;
        ChqStream chqStream;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        String lowerCase;
        String str5;
        String str6;
        String strH6;
        ArrayList arrayList;
        String strH7;
        String strH8;
        Integer num;
        String str7 = "Authorization";
        kotlin.collections.w wVar = kotlin.collections.w.e;
        String str8 = "Response not successful, body: ";
        String str9 = "HTTP ";
        String str10 = "Search URL: ";
        String str11 = "/";
        String str12 = "https://members.easynews.com/2.0/search/solr-search/advanced?st=adv&sb=1&fex=m4v,3gp,mov,divx,xvid,wmv,avi,mpg,mpeg,mp4,mkv,avc,flv,webm&fty[]=VIDEO&spamf=1&u=1&gx=1&pno=1&sS=3&s1=dsize&s1d=-&s2=relevance&s2d=-&s3=dtime&s3d=-&pby=50&safeO=0&gps=";
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        String strH0 = null;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                Context context = com.app.mlounge.util.a.a;
                String str13 = this.$tmdbId;
                String str14 = this.$mediaType;
                Integer num2 = this.$season;
                Integer num3 = this.$episode;
                StringBuilder sbQ = androidx.compose.runtime.j.q("getStreams called: tmdbId=", str13, " mediaType=", str14, " season=");
                sbQ.append(num2);
                sbQ.append(" episode=");
                sbQ.append(num3);
                com.app.mlounge.util.a.b("EasyNews", sbQ.toString());
                Flow flow = this.this$0.prefs.p;
                this.L$0 = coroutineScope;
                this.label = 1;
                objFirst = FlowKt.first(flow, this);
                if (objFirst != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                kotlin.a.e(obj);
                objFirst = obj;
            } else {
                if (i == 2) {
                    String str15 = (String) this.L$1;
                    kotlin.a.e(obj);
                    str8 = "Response not successful, body: ";
                    str9 = "HTTP ";
                    str7 = "Authorization";
                    str12 = "https://members.easynews.com/2.0/search/solr-search/advanced?st=adv&sb=1&fex=m4v,3gp,mov,divx,xvid,wmv,avi,mpg,mpeg,mp4,mkv,avc,flv,webm&fty[]=VIDEO&spamf=1&u=1&gx=1&pno=1&sS=3&s1=dsize&s1d=-&s2=relevance&s2d=-&s3=dtime&s3d=-&pby=50&safeO=0&gps=";
                    str10 = "Search URL: ";
                    str = str15;
                    objFirst2 = obj;
                    str2 = (String) objFirst2;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!kotlin.text.k.J(str) || kotlin.text.k.J(str2)) {
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.b("EasyNews", "Credentials blank or missing");
                        return wVar;
                    }
                    Context context3 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("EasyNews", "Credentials present (user=" + str + ")");
                    m1 m1Var = this.this$0.tmdbHelper;
                    String str16 = this.$tmdbId;
                    String str17 = this.$mediaType;
                    this.L$0 = coroutineScope;
                    this.L$1 = str;
                    this.L$2 = str2;
                    this.label = 3;
                    objC = m1Var.c(str16, str17, this);
                    if (objC != aVar) {
                        str3 = str;
                        str4 = str2;
                    }
                    return aVar;
                }
                if (i != 3) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = (String) this.L$2;
                str3 = (String) this.L$1;
                kotlin.a.e(obj);
                str8 = "Response not successful, body: ";
                str9 = "HTTP ";
                str7 = "Authorization";
                str12 = "https://members.easynews.com/2.0/search/solr-search/advanced?st=adv&sb=1&fex=m4v,3gp,mov,divx,xvid,wmv,avi,mpg,mpeg,mp4,mkv,avc,flv,webm&fty[]=VIDEO&spamf=1&u=1&gx=1&pno=1&sS=3&s1=dsize&s1d=-&s2=relevance&s2d=-&s3=dtime&s3d=-&pby=50&safeO=0&gps=";
                str10 = "Search URL: ";
                objC = obj;
            }
            j1 j1Var = (j1) objC;
            Context context4 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b("EasyNews", "TMDB details: " + (j1Var != null ? j1Var.a() : null) + " (" + (j1Var != null ? j1Var.b() : null) + ")");
            if (j1Var == null) {
                com.app.mlounge.util.a.b("EasyNews", "TMDB details returned null");
                return wVar;
            }
            String strA = j1Var.a();
            Integer numB = j1Var.b();
            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && (num = this.$season) != null && this.$episode != null) {
                strA = strA + " S" + kotlin.text.k.N(2, String.valueOf(num.intValue())) + "E" + kotlin.text.k.N(2, String.valueOf(this.$episode.intValue()));
            } else if (numB != null) {
                strA = strA + " " + numB;
            }
            com.app.mlounge.util.a.b("EasyNews", "Search query: \"" + strA + "\"");
            byte[] bytes = (str3 + ":" + str4).getBytes(kotlin.text.a.a);
            bytes.getClass();
            String str18 = "Basic " + Base64.encodeToString(bytes, 2);
            String str19 = str12 + URLEncoder.encode(strA, "UTF-8");
            com.app.mlounge.util.a.b("EasyNews", str10.concat(str19));
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str19);
            String str20 = str7;
            a0Var.b(str20, str18);
            a0Var.b("Accept", "application/json");
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            com.app.mlounge.util.a.b("EasyNews", str9 + g0VarE.A + " " + g0VarE.z);
            boolean z2 = g0VarE.N;
            okhttp3.j0 j0Var = g0VarE.D;
            if (!z2) {
                strH0 = j0Var != null ? j0Var.A() : null;
                com.app.mlounge.util.a.b("EasyNews", str8.concat(kotlin.text.k.e0(500, strH0 == null ? "" : strH0)));
                return wVar;
            }
            String strA2 = j0Var != null ? j0Var.A() : null;
            com.app.mlounge.util.a.b("EasyNews", "Response body length: " + (strA2 != null ? strA2.length() : 0));
            com.app.mlounge.util.a.b("EasyNews", "Response body (first 1000): ".concat(kotlin.text.k.e0(1000, strA2 == null ? "" : strA2)));
            if (strA2 == null) {
                com.app.mlounge.util.a.b("EasyNews", "Response body is null");
                return wVar;
            }
            com.google.gson.j jVar = (com.google.gson.j) this.this$0.gson.d(com.google.gson.j.class, strA2);
            if (jVar == null) {
                com.app.mlounge.util.a.b("EasyNews", "JSON parsing returned null — response is not valid JSON");
                return wVar;
            }
            com.app.mlounge.util.a.b("EasyNews", "JSON root keys: ".concat(kotlin.collections.p.I((com.google.gson.internal.l) jVar.e.keySet(), null, null, null, null, 63)));
            com.google.gson.g gVarL2 = jVar.l("downURL");
            String strH1 = (gVarL2 == null || (strH8 = gVarL2.h()) == null) ? null : kotlin.text.k.h0(strH8, '/');
            com.app.mlounge.util.a.b("EasyNews", "downURL: " + strH1);
            if (strH1 == null) {
                com.app.mlounge.util.a.b("EasyNews", "downURL is null — trying dlUrl field");
                com.google.gson.g gVarL3 = jVar.l("dlUrl");
                if (gVarL3 != null && (strH7 = gVarL3.h()) != null) {
                    strH0 = kotlin.text.k.h0(strH7, '/');
                }
                com.app.mlounge.util.a.b("EasyNews", "dlUrl: " + strH0);
                return wVar;
            }
            com.google.gson.g gVarL4 = jVar.l("dlFarm");
            String strH9 = gVarL4 != null ? gVarL4.h() : null;
            com.app.mlounge.util.a.b("EasyNews", "dlFarm: " + strH9);
            if (strH9 == null) {
                com.app.mlounge.util.a.b("EasyNews", "dlFarm is null");
                return wVar;
            }
            com.google.gson.g gVarL5 = jVar.l("dlPort");
            String strH10 = gVarL5 != null ? gVarL5.h() : null;
            com.app.mlounge.util.a.b("EasyNews", "dlPort: " + strH10);
            if (strH10 == null) {
                com.app.mlounge.util.a.b("EasyNews", "dlPort is null");
                return wVar;
            }
            com.google.gson.f fVarM = jVar.m("data");
            com.app.mlounge.util.a.b("EasyNews", "data array size: " + (fVarM != null ? kotlin.coroutines.jvm.internal.f.b(fVarM.e.size()) : "null"));
            if (fVarM == null) {
                com.app.mlounge.util.a.b("EasyNews", "data array is null — trying 'results' field");
                return wVar;
            }
            String lowerCase2 = strA.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Pattern patternCompile = Pattern.compile("[.\\-_]+");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(lowerCase2).replaceAll(" ");
            strReplaceAll.getClass();
            Pattern patternCompile2 = Pattern.compile("[^\\w\\s]");
            patternCompile2.getClass();
            String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
            strReplaceAll2.getClass();
            String string = kotlin.text.k.g0(strReplaceAll2).toString();
            com.app.mlounge.util.a.b("EasyNews", "Sanitized query: \"" + string + "\"");
            ArrayList arrayList2 = new ArrayList();
            Iterator it = fVarM.iterator();
            while (it.hasNext()) {
                com.google.gson.j jVarE = ((com.google.gson.g) it.next()).e();
                com.google.gson.g gVarL6 = jVarE.l("passwd");
                if ((gVarL6 == null || !gVarL6.b()) && ((gVarL = jVarE.l("virus")) == null || !gVarL.b())) {
                    com.google.gson.g gVarL7 = jVarE.l("type");
                    if (gVarL7 == null || (strH6 = gVarL7.h()) == null) {
                        upperCase = null;
                    } else {
                        upperCase = strH6.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    if (kotlin.jvm.internal.l.a(upperCase, "VIDEO")) {
                        com.google.gson.g gVarL8 = jVarE.l("14");
                        if (gVarL8 == null || (strH = gVarL8.h()) == null) {
                            strH = "";
                        }
                        Pattern patternCompile3 = Pattern.compile("^\\d+s$");
                        patternCompile3.getClass();
                        if (patternCompile3.matcher(strH).matches()) {
                            z = false;
                            Context context5 = com.app.mlounge.util.a.a;
                            com.app.mlounge.util.a.b("EasyNews", "Skipping short duration: " + strH);
                            chqStream = null;
                        } else {
                            Pattern patternCompile4 = Pattern.compile("^[0-5]m$");
                            patternCompile4.getClass();
                            if (patternCompile4.matcher(strH).matches()) {
                                z = false;
                                Context context6 = com.app.mlounge.util.a.a;
                                com.app.mlounge.util.a.b("EasyNews", "Skipping short duration: " + strH);
                            } else {
                                com.google.gson.g gVarL9 = jVarE.l("0");
                                if (gVarL9 == null || (strH2 = gVarL9.h()) == null) {
                                    z = false;
                                    Context context7 = com.app.mlounge.util.a.a;
                                    com.app.mlounge.util.a.b("EasyNews", "Post hash (field 0) is null, skipping");
                                } else {
                                    com.google.gson.g gVarL10 = jVarE.l("10");
                                    if (gVarL10 == null || (strH3 = gVarL10.h()) == null) {
                                        z = false;
                                        Context context8 = com.app.mlounge.util.a.a;
                                        com.app.mlounge.util.a.b("EasyNews", "Post title (field 10) is null, skipping");
                                    } else {
                                        com.google.gson.g gVarL11 = jVarE.l("11");
                                        if (gVarL11 == null || (strH4 = gVarL11.h()) == null) {
                                            strH4 = "";
                                        }
                                        it = it;
                                        com.google.gson.g gVarL12 = jVarE.l("4");
                                        String strH11 = gVarL12 != null ? gVarL12.h() : null;
                                        com.google.gson.g gVarL13 = jVarE.l("fullres");
                                        if (gVarL13 == null || (strH5 = gVarL13.h()) == null) {
                                            strH5 = "";
                                        }
                                        Locale locale = Locale.ROOT;
                                        arrayList2 = arrayList2;
                                        String lowerCase3 = strH3.toLowerCase(locale);
                                        lowerCase3.getClass();
                                        String str21 = str18;
                                        Pattern patternCompile5 = Pattern.compile("[.\\-_]+");
                                        patternCompile5.getClass();
                                        String strReplaceAll3 = patternCompile5.matcher(lowerCase3).replaceAll(" ");
                                        strReplaceAll3.getClass();
                                        Pattern patternCompile6 = Pattern.compile("[^\\w\\s]");
                                        patternCompile6.getClass();
                                        String strReplaceAll4 = patternCompile6.matcher(strReplaceAll3).replaceAll("");
                                        strReplaceAll4.getClass();
                                        String string2 = kotlin.text.k.g0(strReplaceAll4).toString();
                                        if (kotlin.text.k.z(string2, string, true)) {
                                            Pattern patternCompile7 = Pattern.compile("(4320p|2160p|1080p|1080i|720p|720i|576p|576i|480p|480i|360p)", 66);
                                            patternCompile7.getClass();
                                            String str22 = strH3 + " " + strH5;
                                            Matcher matcher = patternCompile7.matcher(str22);
                                            matcher.getClass();
                                            z = false;
                                            kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str22);
                                            if (gVarA == null || (str6 = (String) ((kotlin.collections.d0) gVarA.a()).get(1)) == null) {
                                                lowerCase = null;
                                            } else {
                                                lowerCase = str6.toLowerCase(locale);
                                                lowerCase.getClass();
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(strH1);
                                            str11 = str11;
                                            sb.append(str11);
                                            sb.append(strH9);
                                            sb.append(str11);
                                            sb.append(strH10);
                                            sb.append(str11);
                                            sb.append(strH2);
                                            sb.append(strH4);
                                            sb.append(str11);
                                            sb.append(strH3);
                                            sb.append(strH4);
                                            String string3 = sb.toString();
                                            Context context9 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.b("EasyNews", "Matched: title=\"" + strH3 + "\" quality=" + lowerCase + " url=" + string3);
                                            if (lowerCase != null) {
                                                str5 = " " + lowerCase;
                                            } else {
                                                str5 = "";
                                            }
                                            String str23 = "EasyNews" + str5;
                                            str18 = str21;
                                            kotlin.k kVar = new kotlin.k(str20, str18);
                                            Map mapSingletonMap = Collections.singletonMap(kVar.e, kVar.y);
                                            mapSingletonMap.getClass();
                                            chqStream = new ChqStream(str23, string3, lowerCase, "direct", "direct", strH11, mapSingletonMap, null, null, null, null, null, null, 8064);
                                        } else {
                                            Context context10 = com.app.mlounge.util.a.a;
                                            com.app.mlounge.util.a.b("EasyNews", "Title mismatch: post=\"" + string2 + "\" does not contain query=\"" + string + "\"");
                                            str18 = str21;
                                            chqStream = null;
                                            z = false;
                                        }
                                    }
                                }
                            }
                            chqStream = null;
                        }
                    } else {
                        Context context11 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.b("EasyNews", "Skipping non-video type: " + upperCase);
                    }
                    if (chqStream != null) {
                        arrayList = arrayList2;
                        arrayList.add(chqStream);
                    } else {
                        arrayList = arrayList2;
                    }
                    str11 = str11;
                    it = it;
                    arrayList2 = arrayList;
                    str18 = str18;
                } else {
                    Context context12 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.b("EasyNews", "Skipping password/virus protected item");
                }
                str18 = str18;
                it = it;
                arrayList2 = arrayList2;
                chqStream = null;
                z = false;
                if (chqStream != null) {
                    arrayList = arrayList2;
                    arrayList.add(chqStream);
                } else {
                    arrayList = arrayList2;
                }
                str11 = str11;
                it = it;
                arrayList2 = arrayList;
                str18 = str18;
            }
            List listX = kotlin.collections.p.X(15, arrayList2);
            Context context13 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.b("EasyNews", "Returning " + listX.size() + " streams");
            return listX;
            str = (String) objFirst;
            if (str == null) {
                str = "";
            }
            Flow flow2 = this.this$0.prefs.q;
            this.L$0 = coroutineScope;
            this.L$1 = str;
            this.label = 2;
            objFirst2 = FlowKt.first(flow2, this);
            if (objFirst2 != aVar) {
                str2 = (String) objFirst2;
                if (str2 == null) {
                    str2 = "";
                }
                if (kotlin.text.k.J(str)) {
                }
                Context context14 = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.b("EasyNews", "Credentials blank or missing");
                return wVar;
            }
            return aVar;
        } catch (Exception e) {
            Context context15 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.c("EasyNews", "Error: " + e.getMessage());
            return wVar;
        }
    }
}
