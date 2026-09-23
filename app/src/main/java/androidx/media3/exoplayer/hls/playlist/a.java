package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import com.google.common.collect.e0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u {
    public final /* synthetic */ d e;

    public a(d dVar) {
        this.e = dVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public final void a() {
        this.e.B.remove(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public final boolean b(Uri uri, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        c cVar;
        d dVar = this.e;
        HashMap map = dVar.A;
        if (dVar.N == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) map.get(uri);
            cVar2.getClass();
            w wVar = cVar2.a;
            int size = wVar.b.size();
            p1 it = k0.l(wVar.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) map.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) androidx.compose.runtime.j.c(cVar3.b, uri2, uri2);
                    bVar.getClass();
                    if (jElapsedRealtime <= bVar.F) {
                        i++;
                    }
                }
            }
            int size2 = dVar.I.size();
            e0 e0VarListIterator = dVar.I.listIterator(0);
            int i2 = 0;
            while (e0VarListIterator.hasNext()) {
                if (dVar.e((w) e0VarListIterator.next(), jElapsedRealtime)) {
                    i2++;
                }
            }
            androidx.media3.exoplayer.upstream.g gVar = new androidx.media3.exoplayer.upstream.g(size, i, size2, i2);
            dVar.z.getClass();
            androidx.media3.exoplayer.upstream.h hVarE = t2.e(gVar, lVar);
            if (hVarE != null && (cVar = (c) map.get(uri)) != null) {
                return c.c(cVar, uri, hVarE.b);
            }
        }
        return false;
    }
}
