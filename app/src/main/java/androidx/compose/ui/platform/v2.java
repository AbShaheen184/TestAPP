package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Job e;

    public v2(Job job) {
        this.e = job;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Job.DefaultImpls.cancel$default(this.e, (CancellationException) null, 1, (Object) null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
