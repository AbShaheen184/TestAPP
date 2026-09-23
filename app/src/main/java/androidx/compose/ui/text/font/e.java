package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.collection.u;
import androidx.compose.runtime.s2;
import kotlin.collections.i0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final com.google.firebase.heartbeatinfo.e a;
    public final a b;
    public final androidx.compose.foundation.text.input.internal.o c;
    public final h d;
    public final com.google.firebase.platforminfo.d e;

    public e(com.google.firebase.heartbeatinfo.e eVar, a aVar) {
        androidx.compose.foundation.text.input.internal.o oVar = f.a;
        androidx.compose.foundation.text.input.internal.o oVar2 = f.a;
        h hVar = new h();
        kotlin.coroutines.j jVarPlus = h.b.plus(androidx.compose.ui.text.platform.i.a).plus(kotlin.coroutines.k.e);
        Job.Key.getClass();
        hVar.a = CoroutineScopeKt.CoroutineScope(jVarPlus.plus(SupervisorKt.SupervisorJob((Job) null)));
        com.google.firebase.platforminfo.d dVar = new com.google.firebase.platforminfo.d(17);
        this.a = eVar;
        this.b = aVar;
        this.c = oVar;
        this.d = hVar;
        this.e = dVar;
        new s2(this, 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079 A[Catch: Exception -> 0x0081, TRY_ENTER, TryCatch #2 {Exception -> 0x0081, blocks: (B:15:0x0027, B:17:0x003a, B:20:0x003f, B:22:0x0043, B:25:0x0050, B:42:0x0079, B:43:0x0080, B:24:0x004c), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final t a(s sVar) {
        Typeface typefaceH;
        t tVar;
        androidx.compose.foundation.text.input.internal.o oVar = this.c;
        synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
            t tVar2 = (t) ((u) oVar.z).h(sVar);
            if (tVar2 != null) {
                if (tVar2.y) {
                    return tVar2;
                }
            }
            try {
                this.d.getClass();
                r rVar = sVar.a;
                p pVar = (p) this.e.e;
                int i = sVar.c;
                k kVar = sVar.b;
                if (rVar != null && !(rVar instanceof b)) {
                    if (rVar instanceof m) {
                        typefaceH = pVar.b((m) rVar, kVar, i);
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        throw new IllegalStateException("Could not load font");
                    }
                    synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
                        if (((u) oVar.z).h(sVar) == null && tVar.y) {
                            ((u) oVar.z).l(sVar, tVar);
                        }
                    }
                    return tVar;
                }
                typefaceH = pVar.h(kVar, i);
                tVar = new t(typefaceH);
                if (tVar != null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((com.google.firebase.heartbeatinfo.e) oVar.y)) {
                    if (((u) oVar.z).h(sVar) == null) {
                        ((u) oVar.z).l(sVar, tVar);
                    }
                    return tVar;
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final t b(r rVar, k kVar, int i, int i2) {
        a aVar = this.b;
        aVar.getClass();
        int i3 = aVar.e;
        k kVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? kVar : new k(i0.d(kVar.e + i3, 1, 1000));
        this.a.getClass();
        return a(new s(rVar, kVar2, i, i2, null));
    }
}
