package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements l0 {
    public static final int $stable = 8;
    private static final String VIDNEST_ALPHABET = "RB0fpH8ZEyVLkv7c2i6MAJ5u3IKFDxlS1NTsnGaqmXYdUrtzjwObCgQP94hoeW+/=";
    private final okhttp3.y client;
    private final com.google.gson.e gson;
    private final String name;
    public static final w1 Companion = new w1();
    private static final List<String> BACKENDS = kotlin.collections.q.k("moviesapi", "hollymoviehd", "allmovies", "vidlink", "klikxxi", "movies4f", "moviebox", "videasy", "movies5f");

    public a2(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.name = "VidNest";
        this.gson = new com.google.gson.e();
    }

    public static final com.google.gson.j b(a2 a2Var, String str) {
        String strSubstring;
        a2Var.getClass();
        try {
            ArrayList arrayList = new ArrayList(65);
            int i = 0;
            int i2 = 0;
            while (i < 65) {
                arrayList.add(new kotlin.k(Character.valueOf(VIDNEST_ALPHABET.charAt(i)), Integer.valueOf(i2)));
                i++;
                i2++;
            }
            Map mapN = kotlin.collections.c0.n(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < str.length()) {
                int i4 = i3 + 4;
                if (i4 <= str.length()) {
                    strSubstring = str.substring(i3, i4);
                } else {
                    strSubstring = str.substring(i3) + kotlin.text.r.r(4 - (str.length() - i3), "=");
                }
                ArrayList arrayList3 = new ArrayList(strSubstring.length());
                int i5 = 0;
                while (true) {
                    int iIntValue = 64;
                    if (i5 >= strSubstring.length()) {
                        break;
                    }
                    Integer num = (Integer) mapN.get(Character.valueOf(strSubstring.charAt(i5)));
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    arrayList3.add(Integer.valueOf(iIntValue));
                    i5++;
                }
                if (arrayList3.size() >= 4) {
                    arrayList2.add(Byte.valueOf((byte) ((((Number) arrayList3.get(0)).intValue() << 2) | (((Number) arrayList3.get(1)).intValue() >> 4))));
                    if (((Number) arrayList3.get(2)).intValue() != 64) {
                        arrayList2.add(Byte.valueOf((byte) (((((Number) arrayList3.get(1)).intValue() & 15) << 4) | (((Number) arrayList3.get(2)).intValue() >> 2))));
                    }
                    if (((Number) arrayList3.get(3)).intValue() != 64) {
                        arrayList2.add(Byte.valueOf((byte) (((Number) arrayList3.get(3)).intValue() | ((((Number) arrayList3.get(2)).intValue() & 3) << 6))));
                    }
                }
                i3 = i4;
            }
            String str2 = new String(kotlin.collections.p.Y(arrayList2), kotlin.text.a.a);
            try {
                return (com.google.gson.j) a2Var.gson.d(com.google.gson.j.class, str2);
            } catch (Exception unused) {
                Pattern patternCompile = Pattern.compile("\\{.*}", 32);
                patternCompile.getClass();
                Matcher matcher = patternCompile.matcher(str2);
                matcher.getClass();
                kotlin.text.g gVarA = kotlin.coroutines.g.a(matcher, 0, str2);
                if (gVarA == null) {
                    return null;
                }
                com.google.gson.e eVar = a2Var.gson;
                String strGroup = gVarA.a.group();
                strGroup.getClass();
                return (com.google.gson.j) eVar.d(com.google.gson.j.class, strGroup);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0197  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:165:0x023a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0157  */
    public static final kotlin.k c(a2 a2Var, com.google.gson.j jVar) {
        com.google.gson.j jVarE;
        com.google.gson.f fVarD;
        String strConcat;
        String strH;
        String strH2;
        Integer numW;
        com.google.gson.j jVarE2;
        com.google.gson.f fVarD2;
        int iC;
        String strH3;
        String strH4;
        com.google.gson.f fVarD3;
        com.google.gson.j jVarE3;
        String strH5;
        a2Var.getClass();
        Iterator it = kotlin.collections.q.k("sources", "streams").iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                com.google.gson.g gVarL = jVar.l("data");
                if (gVarL == null) {
                    jVarE = null;
                } else {
                    if (!(gVarL instanceof com.google.gson.j)) {
                        gVarL = null;
                    }
                    if (gVarL != null) {
                        jVarE = gVarL.e();
                    } else {
                        jVarE = null;
                    }
                }
                if (jVarE != null) {
                    com.google.gson.g gVarL2 = jVarE.l("stream");
                    if (gVarL2 == null) {
                        jVarE2 = null;
                    } else {
                        if (!(gVarL2 instanceof com.google.gson.j)) {
                            gVarL2 = null;
                        }
                        if (gVarL2 != null) {
                            jVarE2 = gVarL2.e();
                        } else {
                            jVarE2 = null;
                        }
                    }
                    if (jVarE2 != null) {
                        com.google.gson.g gVarL3 = jVarE2.l("url");
                        if (gVarL3 == null || (strH4 = gVarL3.h()) == null) {
                            com.google.gson.g gVarL4 = jVarE2.l("playlist");
                            strH4 = gVarL4 != null ? gVarL4.h() : null;
                            if (strH4 == null) {
                                com.google.gson.g gVarL5 = jVarE2.l("file");
                                strH4 = gVarL5 != null ? gVarL5.h() : null;
                            }
                        }
                        if (strH4 != null) {
                            if (kotlin.text.r.u(strH4, "//", false)) {
                                strH4 = "https:".concat(strH4);
                            }
                            return new kotlin.k(strH4, g(jVarE2.o("headers")));
                        }
                    }
                    com.google.gson.g gVarL6 = jVarE.l("downloads");
                    if (gVarL6 == null) {
                        fVarD2 = null;
                    } else {
                        if (!(gVarL6 instanceof com.google.gson.f)) {
                            gVarL6 = null;
                        }
                        if (gVarL6 != null) {
                            fVarD2 = gVarL6.d();
                        } else {
                            fVarD2 = null;
                        }
                    }
                    if (fVarD2 != null) {
                        Iterator it2 = fVarD2.e.iterator();
                        it2.getClass();
                        int i = 0;
                        String strConcat2 = null;
                        while (it2.hasNext()) {
                            com.google.gson.g gVar = (com.google.gson.g) it2.next();
                            gVar.getClass();
                            if (gVar instanceof com.google.gson.j) {
                                com.google.gson.j jVarE4 = gVar.e();
                                com.google.gson.g gVarL7 = jVarE4.l("resolution");
                                if (gVarL7 == null) {
                                    iC = 0;
                                } else {
                                    if (!(gVarL7 instanceof com.google.gson.k)) {
                                        gVarL7 = null;
                                    }
                                    if (gVarL7 != null) {
                                        iC = gVarL7.c();
                                    } else {
                                        iC = 0;
                                    }
                                }
                                com.google.gson.g gVarL8 = jVarE4.l("url");
                                if (gVarL8 != null && (strH3 = gVarL8.h()) != null && iC > i) {
                                    strConcat2 = strH3;
                                    i = iC;
                                }
                            }
                        }
                        if (strConcat2 != null) {
                            if (kotlin.text.r.u(strConcat2, "//", false)) {
                                strConcat2 = "https:".concat(strConcat2);
                            }
                            return new kotlin.k(strConcat2, g(jVarE.o("headers")));
                        }
                    }
                }
                com.google.gson.g gVarL9 = jVar.l("url");
                if (gVarL9 == null) {
                    fVarD = null;
                } else {
                    if (!(gVarL9 instanceof com.google.gson.f)) {
                        gVarL9 = null;
                    }
                    if (gVarL9 != null) {
                        fVarD = gVarL9.d();
                    } else {
                        fVarD = null;
                    }
                }
                if (fVarD != null) {
                    Iterator it3 = fVarD.e.iterator();
                    it3.getClass();
                    int i2 = 0;
                    String strConcat3 = null;
                    while (it3.hasNext()) {
                        com.google.gson.g gVar2 = (com.google.gson.g) it3.next();
                        gVar2.getClass();
                        if (gVar2 instanceof com.google.gson.j) {
                            com.google.gson.j jVarE5 = gVar2.e();
                            com.google.gson.g gVarL10 = jVarE5.l("link");
                            if (gVarL10 == null || (strH = gVarL10.h()) == null) {
                                com.google.gson.g gVarL11 = jVarE5.l("url");
                                strH = gVarL11 != null ? gVarL11.h() : null;
                                if (strH == null) {
                                }
                            }
                            com.google.gson.g gVarL12 = jVarE5.l("resolution");
                            if (gVarL12 == null || (strH2 = gVarL12.h()) == null) {
                                strH2 = "";
                            }
                            kotlin.text.g gVarS = androidx.compose.runtime.j.s("(\\d+)", 0, strH2, strH2);
                            int iIntValue = (gVarS == null || (numW = kotlin.text.r.w((String) ((kotlin.collections.d0) gVarS.a()).get(1))) == null) ? 0 : numW.intValue();
                            if (iIntValue > i2 || strConcat3 == null) {
                                i2 = iIntValue;
                                strConcat3 = strH;
                            }
                        }
                    }
                    if (strConcat3 != null) {
                        if (kotlin.text.r.u(strConcat3, "//", false)) {
                            strConcat3 = "https:".concat(strConcat3);
                        }
                        return new kotlin.k(strConcat3, g(jVar.o("headers")));
                    }
                }
                com.google.gson.g gVarL13 = jVar.l("url");
                if (gVarL13 == null) {
                    strConcat = null;
                } else {
                    if (!(gVarL13 instanceof com.google.gson.k)) {
                        gVarL13 = null;
                    }
                    if (gVarL13 != null) {
                        strConcat = gVarL13.h();
                    } else {
                        strConcat = null;
                    }
                }
                if (strConcat == null) {
                    return null;
                }
                if (kotlin.text.r.u(strConcat, "//", false)) {
                    strConcat = "https:".concat(strConcat);
                }
                return new kotlin.k(strConcat, g(jVar.o("headers")));
            }
            com.google.gson.g gVarL14 = jVar.l((String) it.next());
            if (gVarL14 == null) {
                fVarD3 = null;
            } else {
                if (!(gVarL14 instanceof com.google.gson.f)) {
                    gVarL14 = null;
                }
                if (gVarL14 != null) {
                    fVarD3 = gVarL14.d();
                } else {
                    fVarD3 = null;
                }
            }
            if (fVarD3 != null) {
                Iterator it4 = fVarD3.e.iterator();
                it4.getClass();
                while (it4.hasNext()) {
                    com.google.gson.g gVar3 = (com.google.gson.g) it4.next();
                    gVar3.getClass();
                    if (gVar3 instanceof com.google.gson.j) {
                        jVarE3 = gVar3.e();
                        com.google.gson.g gVarL15 = jVarE3.l("url");
                        if (gVarL15 != null && (strH5 = gVarL15.h()) != null) {
                            break loop0;
                        }
                        com.google.gson.g gVarL16 = jVarE3.l("link");
                        strH5 = gVarL16 != null ? gVarL16.h() : null;
                        if (strH5 != null) {
                            break loop0;
                        }
                    }
                }
            }
        }
        if (kotlin.text.r.u(strH5, "//", false)) {
            strH5 = "https:".concat(strH5);
        }
        return new kotlin.k(strH5, g(jVarE3.o("headers")));
    }

    public static LinkedHashMap g(com.google.gson.j jVar) {
        if (jVar == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (com.google.gson.internal.l) jVar.e.entrySet()) {
            entry.getClass();
            String str = (String) entry.getKey();
            com.google.gson.g gVar = (com.google.gson.g) entry.getValue();
            gVar.getClass();
            if (gVar instanceof com.google.gson.k) {
                linkedHashMap.put(str, gVar.h());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new z1(this, num, num2, str2, str, null), iVar);
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }
}
