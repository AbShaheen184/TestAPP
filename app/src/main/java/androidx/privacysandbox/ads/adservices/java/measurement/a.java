package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.support.v4.media.session.b;
import android.view.InputEvent;
import androidx.activity.compose.p;
import androidx.compose.animation.b0;
import androidx.compose.animation.core.c1;
import androidx.privacysandbox.ads.adservices.measurement.d;
import androidx.privacysandbox.ads.adservices.measurement.e;
import androidx.privacysandbox.ads.adservices.measurement.f;
import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public ListenableFuture a(androidx.privacysandbox.ads.adservices.measurement.a aVar) {
        throw null;
    }

    public ListenableFuture b() {
        return _COROUTINE.b.f(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new c1(this, null, 16), 3, null));
    }

    public ListenableFuture c(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return _COROUTINE.b.f(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new b0(this, uri, inputEvent, null, 27), 3, null));
    }

    public ListenableFuture d(d dVar) {
        throw null;
    }

    public ListenableFuture e(Uri uri) {
        uri.getClass();
        return _COROUTINE.b.f(BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new p(this, uri, null, 29), 3, null));
    }

    public ListenableFuture f(e eVar) {
        throw null;
    }

    public ListenableFuture g(f fVar) {
        throw null;
    }
}
