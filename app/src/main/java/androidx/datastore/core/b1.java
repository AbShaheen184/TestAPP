package androidx.datastore.core;

import androidx.compose.runtime.s2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final CoroutineScope a;
    public final androidx.activity.compose.p b;
    public final Channel c;
    public final com.google.firebase.platforminfo.d d;

    public b1(CoroutineScope coroutineScope, s2 s2Var, androidx.compose.ui.text.x xVar, androidx.activity.compose.p pVar) {
        coroutineScope.getClass();
        this.a = coroutineScope;
        this.b = pVar;
        this.c = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new com.google.firebase.platforminfo.d(22);
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.invokeOnCompletion(new androidx.compose.animation.core.a(15, s2Var, this, xVar));
        }
    }
}
