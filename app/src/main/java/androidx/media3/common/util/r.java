package androidx.media3.common.util;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ t c;

    public r(t tVar, androidx.media3.exoplayer.upstream.e eVar, Executor executor) {
        this.c = tVar;
        this.a = new WeakReference(eVar);
        this.b = executor;
    }
}
