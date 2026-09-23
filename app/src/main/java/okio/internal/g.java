package okio.internal;

import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.w;
import java.util.List;
import kotlin.text.r;
import okio.x;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements w {
    public static final /* synthetic */ g e = new g();

    public static final boolean b(x xVar) {
        x xVar2 = h.C;
        return !r.n(xVar.d(), ".class", true);
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        List list = f0.a;
        e3.y.get();
        return Integer.valueOf((int) ((Long) f3.a.g(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
    }
}
