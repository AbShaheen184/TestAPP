package androidx.media3.exoplayer.video;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.a1;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final Context a;
    public final q b;
    public final SparseArray c;
    public final boolean d;
    public final c e;
    public final androidx.media3.common.util.d0 f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final x i;
    public androidx.compose.ui.text.android.selection.e j = new androidx.compose.ui.text.android.selection.e();
    public androidx.media3.common.util.f0 k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public boolean p;
    public int q;

    public s(n nVar) {
        this.a = nVar.a;
        q qVar = nVar.c;
        qVar.getClass();
        this.b = qVar;
        this.c = new SparseArray();
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        a1 a1Var = a1.B;
        this.d = nVar.d;
        androidx.media3.common.util.d0 d0Var = nVar.e;
        this.f = d0Var;
        long j = nVar.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        x xVar = nVar.h;
        this.i = xVar;
        this.e = new c(nVar.b, xVar, d0Var);
        this.g = new CopyOnWriteArraySet();
        new androidx.media3.common.q().a();
        this.o = -9223372036854775807L;
        this.q = -1;
        this.n = 0;
    }
}
