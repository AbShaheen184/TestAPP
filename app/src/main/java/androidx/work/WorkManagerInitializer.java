package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements androidx.startup.b {
    public static final String a = y.g("WrkMgrInitializer");

    @Override // androidx.startup.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        y.e().a(a, "Initializing WorkManager with default configuration.");
        b bVar = new b(new a0());
        context.getClass();
        synchronized (androidx.work.impl.t.n) {
            try {
                androidx.work.impl.t tVar = androidx.work.impl.t.l;
                if (tVar != null && androidx.work.impl.t.m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (tVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (androidx.work.impl.t.m == null) {
                        androidx.work.impl.t.m = androidx.work.impl.v.j(applicationContext, bVar);
                    }
                    androidx.work.impl.t.l = androidx.work.impl.t.m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return androidx.work.impl.t.b(context);
    }
}
