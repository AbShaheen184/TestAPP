package androidx.media3.common.audio;

import android.content.Context;
import androidx.media3.common.util.l0;
import com.google.common.collect.a1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements com.google.common.base.q, androidx.sqlite.db.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;

    public /* synthetic */ c(Context context, int i) {
        this.e = i;
        this.y = context;
    }

    @Override // androidx.sqlite.db.a
    public androidx.sqlite.db.b d(l0 l0Var) {
        String str = (String) l0Var.e;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l) l0Var.f;
        lVar.getClass();
        if (str != null && str.length() != 0) {
            return new androidx.sqlite.db.framework.g(this.y, str, lVar, true, true);
        }
        kotlinx.coroutines.future.a.q("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // com.google.common.base.q
    public Object get() {
        androidx.media3.exoplayer.upstream.f fVar;
        switch (this.e) {
            case 0:
                return h.l(this.y);
            case 1:
                return new androidx.media3.exoplayer.trackselection.o(this.y);
            case 2:
                Context context = this.y;
                a1 a1Var = androidx.media3.exoplayer.upstream.f.p;
                synchronized (androidx.media3.exoplayer.upstream.f.class) {
                    try {
                        if (androidx.media3.exoplayer.upstream.f.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            androidx.media3.exoplayer.upstream.f.v = new androidx.media3.exoplayer.upstream.f(applicationContext, map);
                        }
                        fVar = androidx.media3.exoplayer.upstream.f.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return fVar;
            default:
                Context context2 = this.y;
                new androidx.media3.extractor.l();
                new androidx.localbroadcastmanager.content.b(4);
                context2.getApplicationContext();
                com.google.firebase.heartbeatinfo.e eVar = new com.google.firebase.heartbeatinfo.e(11);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                map2.clear();
                map3.clear();
                return eVar;
        }
    }
}
