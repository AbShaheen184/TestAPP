package com.app.mlounge.data.providers;

import android.content.Context;
import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l0 {
    public static final int $stable = 8;
    private static final String CASTLE_BASE = "https://api.hlowb.com";
    private static final String CASTLE_SUFFIX = "T!BgJB";
    private static final String CHANNEL = "IndiaA";
    private static final String CLIENT = "1";
    public static final d Companion = new d();
    private static final String LANG = "en-US";
    private static final String PKG = "com.external.castle";
    private final okhttp3.y client;
    private final com.google.gson.e gson;
    private final String name;
    private final m1 tmdbHelper;

    public f(okhttp3.y yVar, m1 m1Var) {
        yVar.getClass();
        m1Var.getClass();
        this.client = yVar;
        this.tmdbHelper = m1Var;
        this.name = "Castle";
        this.gson = new com.google.gson.e();
    }

    public static final String b(f fVar, String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        fVar.getClass();
        byte[] bArrDecode = Base64.decode(str2, 0);
        Charset charset = kotlin.text.a.a;
        byte[] bytes = CASTLE_SUFFIX.getBytes(charset);
        bytes.getClass();
        bArrDecode.getClass();
        byte[] bArrY = kotlin.collections.o.y(bArrDecode, bytes);
        byte[] bArrY2 = bArrY.length < 16 ? kotlin.collections.o.y(bArrY, new byte[16 - bArrY.length]) : Arrays.copyOf(bArrY, 16);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(bArrY2, "AES"), new IvParameterSpec(bArrY2));
        byte[] bArrDoFinal = cipher.doFinal(Base64.decode(str, 0));
        bArrDoFinal.getClass();
        return new String(bArrDoFinal, charset);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    public static final ArrayList e(f fVar, com.google.gson.j jVar, String str) {
        String strH;
        String strH2;
        String strH3;
        fVar.getClass();
        ArrayList arrayList = new ArrayList();
        com.google.gson.g gVarL = jVar.l("videoUrl");
        if (gVarL != null && (strH = gVarL.h()) != null) {
            com.google.gson.f fVarM = jVar.m("videos");
            if (fVarM != null) {
                ArrayList arrayList2 = fVarM.e;
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        com.google.gson.g gVar = (com.google.gson.g) it.next();
                        com.google.gson.g gVarL2 = gVar.e().l("url");
                        String str2 = (gVarL2 == null || (strH3 = gVarL2.h()) == null) ? strH : strH3;
                        com.google.gson.g gVarL3 = gVar.e().l("resolutionDescription");
                        if (gVarL3 == null || (strH2 = gVarL3.h()) == null) {
                            com.google.gson.g gVarL4 = gVar.e().l("resolution");
                            strH2 = gVarL4 != null ? gVarL4.h() : null;
                            if (strH2 == null) {
                                strH2 = "720p";
                            }
                        }
                        Pattern patternCompile = Pattern.compile("^(SD|HD|FHD)\\s+");
                        patternCompile.getClass();
                        String strReplaceAll = patternCompile.matcher(strH2).replaceAll("");
                        strReplaceAll.getClass();
                        String str3 = "hls";
                        if (!kotlin.text.k.z(str2, ".m3u8", false) && kotlin.text.k.z(str2, ".mp4", false)) {
                            str3 = "mp4";
                        }
                        String str4 = str3;
                        arrayList.add(new ChqStream(androidx.room.b0.e("Castle ", str, " - ", strReplaceAll), str2, strReplaceAll, str4, str4, null, null, null, null, null, null, null, null, 8064));
                    }
                } else {
                    arrayList.add(new ChqStream(androidx.room.b0.e("Castle ", str, " - ", "720p"), strH, "720p", "hls", "hls", null, null, null, null, null, null, null, null, 8064));
                }
            } else {
                arrayList.add(new ChqStream(androidx.room.b0.e("Castle ", str, " - ", "720p"), strH, "720p", "hls", "hls", null, null, null, null, null, null, null, null, 8064));
            }
        }
        return arrayList;
    }

    public static com.google.gson.j g(f fVar) {
        okhttp3.j0 j0Var;
        String strA;
        fVar.getClass();
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d("https://api.hlowb.com/v0.1/system/getSecurityKey/1?channel=IndiaA&clientType=1&lang=en-US");
            a0Var.b("User-Agent", "okhttp/4.9.3");
            a0Var.b("Accept", "application/json");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Connection", "Keep-Alive");
            a0Var.b("Referer", CASTLE_BASE);
            okhttp3.y yVar = fVar.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                com.google.gson.j jVar = (!g0VarE.N || (j0Var = g0VarE.D) == null || (strA = j0Var.A()) == null) ? null : (com.google.gson.j) fVar.gson.d(com.google.gson.j.class, strA);
                g0VarE.close();
                return jVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.mlounge.data.providers.l0
    public final Object a(String str, String str2, Integer num, Integer num2, kotlin.coroutines.jvm.internal.i iVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(this, str, str2, num, num2, null), iVar);
    }

    public final String f(String str, String str2) {
        okhttp3.j0 j0Var;
        String strA;
        String string;
        com.google.gson.j jVar;
        com.google.gson.g gVarL;
        String strH;
        String string2;
        okhttp3.u uVarS;
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str);
            a0Var.b("User-Agent", "okhttp/4.9.3");
            a0Var.b("Accept", "application/json");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Connection", "Keep-Alive");
            a0Var.b("Referer", CASTLE_BASE);
            if (str2 != null) {
                int i = okhttp3.e0.a;
                kotlin.text.i iVar = okhttp3.u.e;
                try {
                    uVarS = kotlin.collections.o.s("application/json");
                } catch (IllegalArgumentException unused) {
                    uVarS = null;
                }
                a0Var.c("POST", okhttp3.b.e(str2, uVarS));
            }
            okhttp3.y yVar = this.client;
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            try {
                if (!g0VarE.N || (j0Var = g0VarE.D) == null || (strA = j0Var.A()) == null || (string = kotlin.text.k.g0(strA).toString()) == null) {
                    string = null;
                } else {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "Castle", "fetchCipher raw(100)=".concat(kotlin.text.k.e0(100, string)));
                    try {
                        jVar = (com.google.gson.j) this.gson.d(com.google.gson.j.class, string);
                    } catch (Exception e) {
                        Context context2 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "Castle", "fetchCipher json parse error: " + e.getMessage());
                        jVar = null;
                    }
                    if (jVar != null && (gVarL = jVar.l("data")) != null && (strH = gVarL.h()) != null && (string2 = kotlin.text.k.g0(strH).toString()) != null) {
                        string = string2;
                    }
                    Context context3 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "Castle", "fetchCipher result(50)=".concat(kotlin.text.k.e0(50, string)));
                }
                g0VarE.close();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dagger.internal.d.b(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.app.mlounge.data.providers.l0
    public final String getName() {
        return this.name;
    }
}
