package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.f1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final Handler a;
    public final androidx.media3.exoplayer.x b;

    public t(Handler handler, androidx.media3.exoplayer.x xVar, int i) {
        switch (i) {
            case 1:
                if (xVar != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.a = handler;
                this.b = xVar;
                break;
            default:
                this.a = handler;
                this.b = xVar;
                break;
        }
    }

    public void a(androidx.media3.exoplayer.c cVar) {
        synchronized (cVar) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(15, this, cVar));
        }
    }

    public void b(f1 f1Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new androidx.activity.c(27, this, f1Var));
        }
    }
}
