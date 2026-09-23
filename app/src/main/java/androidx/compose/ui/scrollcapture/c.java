package androidx.compose.ui.scrollcapture;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.activity.compose.p;
import androidx.compose.foundation.text.input.internal.m;
import androidx.compose.material3.d3;
import androidx.compose.runtime.j1;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.platform.u;
import androidx.compose.ui.semantics.s;
import androidx.compose.ui.unit.k;
import java.util.function.Consumer;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {
    public final s a;
    public final k b;
    public final h c;
    public final u d;
    public final CoroutineScope e;
    public final f f;

    public c(s sVar, k kVar, CoroutineScope coroutineScope, h hVar, u uVar) {
        this.a = sVar;
        this.b = kVar;
        this.c = hVar;
        this.d = uVar;
        this.e = CoroutineScopeKt.plus(coroutineScope, d.e);
        this.f = new f(kVar.b(), new d3(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r10 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.scrollcapture.c r12, android.view.ScrollCaptureSession r13, androidx.compose.ui.unit.k r14, kotlin.coroutines.jvm.internal.c r15) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.c.a(androidx.compose.ui.scrollcapture.c, android.view.ScrollCaptureSession, androidx.compose.ui.unit.k, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        BuildersKt__Builders_commonKt.launch$default(this.e, NonCancellable.INSTANCE, null, new p(this, runnable, null, 21), 2, null);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new androidx.compose.animation.core.f(this, scrollCaptureSession, rect, consumer, null, 4), 3, null);
        jobLaunch$default.invokeOnCompletion(new androidx.compose.animation.e(cancellationSignal, 20));
        cancellationSignal.setOnCancelListener(new m(jobLaunch$default, 1));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(a0.w(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((j1) this.c.b).setValue(Boolean.TRUE);
        runnable.run();
    }
}
