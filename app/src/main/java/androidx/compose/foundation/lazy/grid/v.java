package androidx.compose.foundation.lazy.grid;

import android.content.Context;
import android.media.audiofx.Visualizer;
import androidx.compose.foundation.lazy.layout.k0;
import androidx.compose.runtime.j0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ v(x xVar, int i) {
        this.e = 0;
        this.z = xVar;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        Visualizer visualizer = null;
        switch (this.e) {
            case 0:
                x xVar = (x) this.z;
                int i = this.y;
                k0 k0Var = (k0) obj;
                androidx.compose.foundation.lazy.a aVar = xVar.a;
                androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
                androidx.compose.runtime.snapshots.r.k(fVarE, androidx.compose.runtime.snapshots.r.h(fVarE), fVarE != null ? fVarE.e() : null);
                aVar.getClass();
                int i2 = k0Var.a;
                int i3 = i2 != -1 ? i2 : 2;
                for (int i4 = 0; i4 < i3; i4++) {
                    k0Var.a(i + i4);
                }
                return kotlin.y.a;
            case 1:
                return Boolean.valueOf(((List) obj).addAll(this.y, (Collection) this.z));
            default:
                int i5 = this.y;
                androidx.compose.runtime.snapshots.q qVar = (androidx.compose.runtime.snapshots.q) this.z;
                ((j0) obj).getClass();
                try {
                    Visualizer visualizer2 = new Visualizer(i5);
                    visualizer2.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    visualizer2.setDataCaptureListener(new com.app.mlounge.ui.components.m(qVar), Visualizer.getMaxCaptureRate() / 2, false, true);
                    visualizer2.setEnabled(true);
                    visualizer = visualizer2;
                } catch (Exception e) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("AudioVisualizer", "Visualizer init failed", e);
                }
                return new androidx.activity.compose.d(visualizer, 12);
        }
    }

    public /* synthetic */ v(int i, Collection collection, int i2) {
        this.e = i2;
        this.y = i;
        this.z = collection;
    }
}
