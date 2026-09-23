package kotlin.coroutines;

import androidx.appcompat.widget.o;
import androidx.room.b0;
import com.app.mlounge.emulator.LibretroCore;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import kotlin.collections.g0;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final kotlin.text.g a(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new kotlin.text.g(matcher, charSequence);
        }
        return null;
    }

    public static void b(com.google.android.material.internal.k kVar, String str, String str2) {
        kVar.G(str, "videoId");
        if (str2 != null) {
            kVar.G(str2, "cpn");
        }
        kVar.H("contentCheckOk", true);
        kVar.H("racyCheckOk", true);
    }

    public static int c(long j) {
        if (j <= 63) {
            return 1;
        }
        if (j <= 16383) {
            return 2;
        }
        return j <= LockFreeTaskQueueCore.HEAD_MASK ? 4 : 8;
    }

    public static int d(long j, ByteBuffer byteBuffer) {
        if (j <= 2147483647L) {
            return e(byteBuffer, (int) j);
        }
        if (j > 4611686018427387903L) {
            kotlinx.coroutines.future.a.q("value cannot be encoded in variable-length integer");
            return 0;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.putLong(j);
        byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-64)));
        return 8;
    }

    public static int e(ByteBuffer byteBuffer, int i) {
        if (i <= 63) {
            byteBuffer.put((byte) i);
            return 1;
        }
        if (i <= 16383) {
            byteBuffer.put((byte) ((i / LibretroCore.SCREEN_WIDTH) | 64));
            byteBuffer.put((byte) (i % LibretroCore.SCREEN_WIDTH));
            return 2;
        }
        if (i <= 1073741823) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(i);
            byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-128)));
            return 4;
        }
        int iPosition2 = byteBuffer.position();
        byteBuffer.putLong(i);
        byteBuffer.put(iPosition2, (byte) (byteBuffer.get(iPosition2) | (-64)));
        return 8;
    }

    public static Object f(h hVar, Object obj, p pVar) {
        pVar.getClass();
        return pVar.invoke(obj, hVar);
    }

    public static h g(h hVar, i iVar) {
        iVar.getClass();
        if (kotlin.jvm.internal.l.a(hVar.getKey(), iVar)) {
            return hVar;
        }
        return null;
    }

    public static Map h(String str) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        List listR = androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{"2"}[0];
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("User-Agent", listR), new AbstractMap.SimpleEntry("X-Goog-Api-Format-Version", androidx.compose.runtime.j.r(obj2, arrayList2, obj2, arrayList2))};
        HashMap map = new HashMap(2);
        for (int i = 0; i < 2; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                kotlinx.coroutines.future.a.q(androidx.compose.runtime.j.f(key, "duplicate key: "));
                return null;
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static com.grack.nanojson.c i(org.schabi.newpipe.extractor.localization.a aVar, org.schabi.newpipe.extractor.localization.c cVar, String str, String str2) {
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j("VISIONOS", "1.02");
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(26, jVar, new o(-1, "MOBILE", "Apple", "RealityDevice14,1", "visionOS", "25.6.0.23O471"));
        String str3 = org.schabi.newpipe.extractor.services.youtube.i.a;
        Map mapH = h("com.google.visionos.youtube/1.02(RealityDevice14,1; U; CPU visionOS 25_6_0 like Mac OS X; " + cVar.a() + ")");
        jVar.A = org.schabi.newpipe.extractor.services.youtube.i.t(kVar, cVar, aVar, mapH, "https://www.youtube.com/youtubei/v1/");
        com.google.android.material.internal.k kVarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVar, aVar, kVar);
        b(kVarA, str, str2);
        return org.schabi.newpipe.extractor.utils.b.m(org.schabi.newpipe.extractor.services.youtube.i.s(g0.a.x(b0.e("https://youtubei.googleapis.com/youtubei/v1/player?prettyPrint=false&t=", org.schabi.newpipe.extractor.utils.b.d(12, org.schabi.newpipe.extractor.services.youtube.i.g), "&id=", str), mapH, okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarA.z).getBytes(StandardCharsets.UTF_8), cVar)));
    }

    public static com.grack.nanojson.c j(org.schabi.newpipe.extractor.localization.c cVar, org.schabi.newpipe.extractor.localization.a aVar, String str) {
        com.google.android.datatransport.runtime.j jVar = new com.google.android.datatransport.runtime.j("WEB", "2.20260120.01.00");
        com.google.android.material.internal.k kVar = new com.google.android.material.internal.k(26, jVar, new o(-1, "DESKTOP", null, null, null, null));
        jVar.z = org.schabi.newpipe.extractor.services.youtube.i.g();
        HashMap mapU = org.schabi.newpipe.extractor.services.youtube.i.u();
        jVar.A = org.schabi.newpipe.extractor.services.youtube.i.t(kVar, cVar, aVar, mapU, "https://www.youtube.com/youtubei/v1/");
        com.google.android.material.internal.k kVarA = org.schabi.newpipe.extractor.services.youtube.i.A(cVar, aVar, kVar);
        b(kVarA, str, null);
        return org.schabi.newpipe.extractor.utils.b.m(org.schabi.newpipe.extractor.services.youtube.i.s(g0.a.x("https://www.youtube.com/youtubei/v1/player?prettyPrint=false&$fields=microformat,videoDetails.thumbnail.thumbnails,videoDetails.videoId", mapU, okhttp3.internal.platform.android.g.z((com.grack.nanojson.c) kVarA.z).getBytes(StandardCharsets.UTF_8), cVar)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    public static boolean k(okhttp3.g0 g0Var, okhttp3.b0 b0Var) {
        b0Var.getClass();
        int i = g0Var.A;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                if (okhttp3.g0.g("Expires", g0Var) == null && g0Var.a().c == -1 && !g0Var.a().f && !g0Var.a().e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (okhttp3.g0.g("Expires", g0Var) == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (g0Var.a().b) {
            return false;
        }
        okhttp3.g gVarF = b0Var.f;
        if (gVarF == null) {
            int i2 = okhttp3.g.n;
            gVarF = dagger.hilt.android.internal.a.f(b0Var.c);
            b0Var.f = gVarF;
        }
        return !gVarF.b;
    }

    public static j l(h hVar, i iVar) {
        iVar.getClass();
        return kotlin.jvm.internal.l.a(hVar.getKey(), iVar) ? k.e : hVar;
    }

    public static int m(ByteBuffer byteBuffer) {
        long jN = n(byteBuffer);
        if (jN <= 2147483647L) {
            return (int) jN;
        }
        kotlinx.coroutines.future.a.q("value to large for Java int");
        return 0;
    }

    public static long n(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 1) {
            throw new net.luminis.quic.generic.a();
        }
        byte b = byteBuffer.get();
        int i = (b & 192) >> 6;
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            if (byteBuffer.remaining() < 1) {
                throw new net.luminis.quic.generic.a();
            }
            return byteBuffer.getShort() & 16383;
        }
        if (i == 2) {
            if (byteBuffer.remaining() < 3) {
                throw new net.luminis.quic.generic.a();
            }
            return byteBuffer.getInt() & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        }
        if (i != 3) {
            kotlinx.coroutines.future.a.a();
            return 0L;
        }
        if (byteBuffer.remaining() < 7) {
            throw new net.luminis.quic.generic.a();
        }
        return byteBuffer.getLong() & 4611686018427387903L;
    }

    public static j o(j jVar, h hVar) {
        jVar.getClass();
        return jVar == k.e ? hVar : (j) jVar.fold(hVar, new com.app.mlounge.ui.screens.sources.b(7));
    }
}
