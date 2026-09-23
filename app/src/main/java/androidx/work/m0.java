package androidx.work;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public final x a(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(x.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                x xVar = (x) objNewInstance;
                if (!xVar.isUsed()) {
                    return xVar;
                }
                androidx.transition.k.n("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
                return null;
            } catch (Throwable th) {
                y.e().d(n0.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            y.e().d(n0.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }
}
