package androidx.media3.exoplayer.analytics;

import androidx.media3.common.r;
import androidx.media3.common.util.l;
import androidx.media3.common.util.v;
import androidx.media3.extractor.text.m;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l, androidx.media3.common.util.h {
    public final /* synthetic */ long e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(a aVar, int i, long j, long j2) {
        this.z = aVar;
        this.y = i;
        this.e = j;
    }

    @Override // androidx.media3.common.util.h
    public void accept(Object obj) {
        m mVar = (m) this.z;
        androidx.media3.extractor.text.a aVar = (androidx.media3.extractor.text.a) obj;
        mVar.h.getClass();
        byte[] bArrC = com.google.firebase.heartbeatinfo.e.c(aVar.a, aVar.c);
        v vVar = mVar.c;
        vVar.getClass();
        vVar.K(bArrC, bArrC.length);
        mVar.a.f(bArrC.length, vVar);
        long j = aVar.b;
        r rVar = mVar.h;
        long j2 = this.e;
        if (j == -9223372036854775807L) {
            _COROUTINE.a.A(rVar.t == Long.MAX_VALUE);
        } else {
            long j3 = rVar.t;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        mVar.a.g(j2, this.y | 1, bArrC.length, 0, null);
    }

    @Override // androidx.media3.common.util.l
    public void invoke(Object obj) {
        a aVar = (a) this.z;
        j jVar = (j) ((b) obj);
        HashMap map = jVar.h;
        HashMap map2 = jVar.i;
        androidx.media3.exoplayer.source.v vVar = aVar.d;
        if (vVar != null) {
            String strC = jVar.c.c(aVar.b, vVar);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.e));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.y)));
        }
    }

    public /* synthetic */ f(m mVar, long j, int i) {
        this.z = mVar;
        this.e = j;
        this.y = i;
    }
}
