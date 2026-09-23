package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final w a;
    public final HashMap b;
    public final /* synthetic */ d c;

    public c(d dVar, w wVar) {
        this.c = dVar;
        this.a = wVar;
        HashMap map = new HashMap();
        p1 it = k0.l(wVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) wVar.b.get(str);
            uri.getClass();
            map.put(uri, new b(this.c, uri, str));
        }
        this.b = map;
    }

    public static m a(c cVar, Uri uri) {
        b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri, uri);
        bVar.getClass();
        return bVar.B;
    }

    public static void b(c cVar, Uri uri, boolean z) {
        b bVar = (b) androidx.compose.runtime.j.c(cVar.b, uri, uri);
        bVar.getClass();
        bVar.c(z ? bVar.a() : bVar.e);
    }

    public static boolean c(c cVar, Uri uri, long j) {
        HashMap map = cVar.b;
        b bVar = (b) androidx.compose.runtime.j.c(map, uri, uri);
        bVar.getClass();
        bVar.F = SystemClock.elapsedRealtime() + j;
        d dVar = cVar.c;
        w wVar = cVar.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (b bVar2 : map.values()) {
            if (!bVar2.y.equals(wVar.d) && jElapsedRealtime > bVar2.F) {
                Uri uriC = wVar.c();
                String str = bVar2.y;
                _COROUTINE.a.A(wVar.b.containsKey(str));
                wVar.d = str;
                if (uriC.equals(dVar.M)) {
                    dVar.h(bVar2.e);
                }
                b bVar3 = (b) map.get(uriC);
                bVar3.getClass();
                bVar2.I = bVar3.I;
                bVar3.I = false;
                return true;
            }
        }
        Uri uri2 = dVar.M;
        if (uri2 == null || uri.equals(uri2)) {
            h0 h0Var = dVar.I;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z = false;
            for (int i = 0; i < h0Var.size(); i++) {
                Uri uriC2 = ((w) h0Var.get(i)).c();
                c cVar2 = (c) dVar.A.get(uriC2);
                cVar2.getClass();
                HashMap map2 = cVar2.b;
                b bVar4 = (b) androidx.compose.runtime.j.c(map2, uriC2, uriC2);
                bVar4.getClass();
                if (jElapsedRealtime2 > bVar4.F) {
                    dVar.M = uriC2;
                    Uri uriD = dVar.d(uriC2);
                    b bVar5 = (b) androidx.compose.runtime.j.c(map2, uriC2, uriC2);
                    bVar5.getClass();
                    bVar5.c(uriD);
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
