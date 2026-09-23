package androidx.media3.common.util;

import android.os.SystemClock;
import androidx.compose.ui.node.a1;
import androidx.media3.common.t0;
import androidx.media3.common.v0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ a1 h;

    public z(a1 a1Var, int i) {
        this.h = a1Var;
        this.a = i;
    }

    public final void a() {
        a1 a1Var = this.h;
        f0 f0Var = (f0) a1Var.g;
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) a1Var.b;
        if (!c0Var.w()) {
            if (this.f) {
                f0Var.e(2);
            }
            this.f = false;
            return;
        }
        v0 v0VarL = c0Var.l();
        Object objL = v0VarL.p() ? null : v0VarL.l(c0Var.i());
        int iF = c0Var.f();
        int iG = c0Var.g();
        long j = c0Var.j();
        if (objL != null && iF == -1) {
            j -= i0.d0(v0VarL.g(objL, (t0) a1Var.f).e);
        }
        ((d0) a1Var.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iF == this.c && iG == this.d && j == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((androidx.media3.exoplayer.x) a1Var.d).e.Q(new androidx.media3.exoplayer.j(2, new c0(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iF;
        this.d = iG;
        this.e = j;
        f0Var.e(2);
        f0Var.a.sendEmptyMessageDelayed(2, i);
    }
}
