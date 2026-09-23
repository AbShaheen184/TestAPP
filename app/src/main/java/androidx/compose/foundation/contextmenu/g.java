package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.s;
import androidx.compose.runtime.s1;
import androidx.compose.runtime.snapshots.q;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final q a = new q();

    public static void b(g gVar, p pVar, androidx.compose.runtime.internal.f fVar, kotlin.jvm.functions.a aVar, int i) {
        if ((i & 8) != 0) {
            fVar = null;
        }
        gVar.a.add(new androidx.compose.runtime.internal.f(true, -1789283891, new e(pVar, gVar, fVar, aVar)));
    }

    public final void a(d dVar, s sVar, int i) {
        sVar.c0(-798501095);
        int i2 = (sVar.f(dVar) ? 4 : 2) | i | (sVar.f(this) ? 32 : 16);
        if (sVar.T(i2 & 1, (i2 & 19) != 18)) {
            q qVar = this.a;
            int size = qVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((kotlin.jvm.functions.q) qVar.get(i3)).invoke(dVar, sVar, Integer.valueOf(i2 & 14));
            }
        } else {
            sVar.W();
        }
        s1 s1VarT = sVar.t();
        if (s1VarT != null) {
            s1VarT.d = new f(this, dVar, i, 0);
        }
    }
}
