package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends h {
    final /* synthetic */ f0 this$0;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static final class a extends h {
        final /* synthetic */ f0 this$0;

        public a(f0 f0Var) {
            this.this$0 = f0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            f0 f0Var = this.this$0;
            int i = f0Var.e + 1;
            f0Var.e = i;
            if (i == 1 && f0Var.A) {
                f0Var.C.e(n.ON_START);
                f0Var.A = false;
            }
        }
    }

    public e0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = i0.y;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((i0) fragmentFindFragmentByTag).e = this.this$0.E;
        }
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        f0 f0Var = this.this$0;
        int i = f0Var.y - 1;
        f0Var.y = i;
        if (i == 0) {
            Handler handler = f0Var.B;
            handler.getClass();
            handler.postDelayed(f0Var.D, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        d0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        f0 f0Var = this.this$0;
        int i = f0Var.e - 1;
        f0Var.e = i;
        if (i == 0 && f0Var.z) {
            f0Var.C.e(n.ON_STOP);
            f0Var.A = true;
        }
    }
}
