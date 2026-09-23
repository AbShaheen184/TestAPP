package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.collections.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return w.e;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        context.getClass();
        e eVar = e.a;
        Object obj = e.a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.a;
    }
}
