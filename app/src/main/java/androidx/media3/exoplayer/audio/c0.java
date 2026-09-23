package androidx.media3.exoplayer.audio;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final Handler a;
    public final b0 b;
    public final /* synthetic */ d0 c;

    public c0(d0 d0Var) {
        this.c = d0Var;
        Handler handlerQ = androidx.media3.common.util.i0.q(null);
        this.a = handlerQ;
        b0 b0Var = new b0(this);
        this.b = b0Var;
        d0Var.a.registerStreamEventCallback(new androidx.compose.ui.text.input.b0(handlerQ, 2), b0Var);
    }

    public static void a(c0 c0Var) {
        c0Var.c.a.unregisterStreamEventCallback(c0Var.b);
        c0Var.a.removeCallbacksAndMessages(null);
    }
}
