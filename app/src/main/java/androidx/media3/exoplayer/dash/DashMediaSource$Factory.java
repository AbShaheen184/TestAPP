package androidx.media3.exoplayer.dash;

import androidx.appcompat.widget.x;
import androidx.compose.animation.core.t2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory {
    public final x a;
    public final androidx.media3.datasource.g b;
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e c;
    public final com.google.android.material.shape.f d;
    public t2 e;
    public final long f;
    public final long g;

    public DashMediaSource$Factory(androidx.media3.datasource.g gVar) {
        x xVar = new x(gVar);
        this.a = xVar;
        this.b = gVar;
        this.c = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e(1);
        this.e = new t2(-1);
        this.f = 30000L;
        this.g = 5000000L;
        this.d = new com.google.android.material.shape.f(11);
        ((androidx.core.text.f) xVar.A).a = true;
    }
}
