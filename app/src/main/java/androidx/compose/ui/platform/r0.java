package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ s0 e;

    public r0(s0 s0Var) {
        this.e = s0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.y.removeCallbacks(this);
        s0.a(this.e);
        s0 s0Var = this.e;
        synchronized (s0Var.z) {
            if (s0Var.E) {
                s0Var.E = false;
                ArrayList arrayList = s0Var.B;
                s0Var.B = s0Var.C;
                s0Var.C = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        s0.a(this.e);
        s0 s0Var = this.e;
        synchronized (s0Var.z) {
            if (s0Var.B.isEmpty()) {
                s0Var.e.removeFrameCallback(this);
                s0Var.E = false;
            }
        }
    }
}
