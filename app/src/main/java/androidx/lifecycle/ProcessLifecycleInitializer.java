package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return kotlin.collections.w.e;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        context.getClass();
        androidx.startup.a aVarC = androidx.startup.a.c(context);
        aVarC.getClass();
        if (!aVarC.b.contains(ProcessLifecycleInitializer.class)) {
            kotlinx.coroutines.future.a.u("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!s.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        f0 f0Var = f0.F;
        f0Var.getClass();
        f0Var.B = new Handler();
        f0Var.C.e(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new e0(f0Var));
        return f0Var;
    }
}
