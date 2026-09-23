package com.app.mlounge.ui.viewmodel;

import android.util.Log;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.NtvChannel;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.appsalt.internal.g4;
import com.appsalt.internal.n4;
import com.appsalt.lib.longevity.RewardService;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;

    public /* synthetic */ q0(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws UnsupportedEncodingException {
        String string;
        String strE;
        String strE2;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                NtvChannel ntvChannel = (NtvChannel) obj;
                ntvChannel.getClass();
                String strF = ntvChannel.f();
                String str = strF == null ? "cdnlive" : strF;
                if (str.equals("cdnlive")) {
                    return null;
                }
                if (str.equals("hesgoales") && ((strE2 = ntvChannel.e()) == null || !kotlin.text.k.z(strE2, "livelive24.com", false))) {
                    return null;
                }
                if (str.equals("hesgoales") || ((strE = ntvChannel.e()) != null && kotlin.text.k.z(strE, "livelive24.com", false))) {
                    String strE3 = ntvChannel.e();
                    if (strE3 == null) {
                        strE3 = "";
                    }
                    String strEncode = URLEncoder.encode(strE3, "UTF-8");
                    String strD = ntvChannel.d();
                    if (strD == null) {
                        strD = "Unknown";
                    }
                    String strA = ntvChannel.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strB = ntvChannel.b();
                    String str2 = strB != null ? strB : "";
                    StringBuilder sbQ = androidx.compose.runtime.j.q("ntv://", strD, "|", strA, "|");
                    androidx.room.b0.i(sbQ, str, "|", str2, "|");
                    sbQ.append(strEncode);
                    string = sbQ.toString();
                } else {
                    String strD2 = ntvChannel.d();
                    if (strD2 == null) {
                        strD2 = "Unknown";
                    }
                    String strA2 = ntvChannel.a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    String strB2 = ntvChannel.b();
                    string = androidx.compose.runtime.j.m(androidx.compose.runtime.j.q("ntv://", strD2, "|", strA2, "|"), str, "|", strB2 != null ? strB2 : "");
                }
                String str3 = string;
                String strD3 = ntvChannel.d();
                return new IptvChannel(strD3 == null ? "Unknown" : strD3, str3, ntvChannel.c(), str, "ntv", ntvChannel.b());
            case 1:
                return Integer.valueOf(((TmdbTvShow) obj).b());
            case 2:
                return (Comparable) ((kotlin.k) obj).e;
            case 3:
                return (Comparable) ((kotlin.k) obj).y;
            case 4:
                return yVar;
            case 5:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 6:
                int iByteValue = ((Byte) obj).byteValue() & 255;
                kotlin.comparisons.a.c(16);
                String string2 = Integer.toString(iByteValue, 16);
                string2.getClass();
                return kotlin.text.k.N(2, string2);
            case 7:
                String strJ0 = kotlin.text.k.j0((String) obj, '0');
                return kotlin.text.k.J(strJ0) ? "0" : strJ0;
            case 8:
                return new n4((g4) obj, new com.appsalt.internal.w(1));
            case 9:
                ((Boolean) obj).getClass();
                boolean z = RewardService.C;
                return yVar;
            case 10:
                boolean z2 = RewardService.C;
                return yVar;
            case 11:
                androidx.datastore.core.b bVar = (androidx.datastore.core.b) obj;
                bVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", bVar);
                return com.google.firebase.sessions.settings.h.b;
            case 12:
                return Boolean.valueOf(obj == null);
            case 13:
                return CoroutineDispatcher.Key._init_$lambda$0((kotlin.coroutines.h) obj);
            case 14:
                return ExecutorCoroutineDispatcher.Key._init_$lambda$0((kotlin.coroutines.h) obj);
            case 15:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case 16:
                kotlinx.serialization.descriptors.a aVar = (kotlinx.serialization.descriptors.a) obj;
                aVar.getClass();
                kotlinx.serialization.descriptors.a.a(aVar, "JsonPrimitive", new kotlinx.serialization.json.l(new com.app.mlounge.ui.theme.f(6)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonNull", new kotlinx.serialization.json.l(new com.app.mlounge.ui.theme.f(7)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonLiteral", new kotlinx.serialization.json.l(new com.app.mlounge.ui.theme.f(8)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonObject", new kotlinx.serialization.json.l(new com.app.mlounge.ui.theme.f(9)));
                kotlinx.serialization.descriptors.a.a(aVar, "JsonArray", new kotlinx.serialization.json.l(new com.app.mlounge.ui.theme.f(10)));
                return yVar;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str4 = (String) entry.getKey();
                kotlinx.serialization.json.i iVar = (kotlinx.serialization.json.i) entry.getValue();
                StringBuilder sb = new StringBuilder();
                kotlinx.serialization.json.internal.p.a(str4, sb);
                sb.append(':');
                sb.append(iVar);
                return sb.toString();
            case 18:
                okhttp3.internal.b bVar2 = (okhttp3.internal.b) obj;
                bVar2.getClass();
                kotlin.collections.g0 g0Var = bVar2.f;
                if (g0Var instanceof okhttp3.internal.b) {
                    return (okhttp3.internal.b) g0Var;
                }
                return null;
            case 19:
                okhttp3.internal.b bVar3 = (okhttp3.internal.b) obj;
                bVar3.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bVar3.d);
                sb2.append('=');
                sb2.append(bVar3.e);
                return sb2.toString();
            case 20:
                okio.internal.j jVar = (okio.internal.j) obj;
                jVar.getClass();
                okio.x xVar = okio.internal.h.C;
                return Boolean.valueOf(okio.internal.g.b(jVar.a));
            default:
                ((okio.internal.j) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
