package androidx.media3.common.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.lazy.layout.b1;
import androidx.media3.common.util.f0;
import androidx.media3.exoplayer.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {
    public final x a;
    public final f0 b;
    public final /* synthetic */ b1 c;

    public a(b1 b1Var, f0 f0Var, x xVar) {
        this.c = b1Var;
        this.b = f0Var;
        this.a = xVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new androidx.activity.l(this, 11));
        }
    }
}
