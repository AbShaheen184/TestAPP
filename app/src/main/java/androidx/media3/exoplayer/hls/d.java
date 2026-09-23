package androidx.media3.exoplayer.hls;

import androidx.media3.common.i0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public androidx.work.impl.model.f a;
    public boolean b;
    public int c;

    public static void a(int i, ArrayList arrayList) {
        if (com.imsdk.a.t(d, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final androidx.media3.common.r b(androidx.media3.common.r rVar) {
        if (!this.b || !this.a.o(rVar)) {
            return rVar;
        }
        androidx.media3.common.q qVarA = rVar.a();
        String str = rVar.k;
        qVarA.n = i0.p("application/x-media3-cues");
        qVarA.L = this.a.e(rVar);
        StringBuilder sb = new StringBuilder();
        sb.append(rVar.o);
        sb.append(str != null ? " ".concat(str) : "");
        qVarA.j = sb.toString();
        qVarA.s = Long.MAX_VALUE;
        return new androidx.media3.common.r(qVarA);
    }
}
