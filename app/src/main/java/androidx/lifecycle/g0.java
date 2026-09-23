package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, n nVar) {
        nVar.getClass();
        if (activity instanceof v) {
            p lifecycle = ((v) activity).getLifecycle();
            if (lifecycle instanceof x) {
                ((x) lifecycle).e(nVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.Companion.getClass();
            h0.a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new i0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
