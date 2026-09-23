package androidx.compose.ui.graphics;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final PathMeasure a;

    public k(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, j jVar) {
        if (jVar == null) {
            com.google.firebase.platforminfo.b.n("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, jVar.a, true);
        }
    }
}
