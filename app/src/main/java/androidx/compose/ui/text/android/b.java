package androidx.compose.ui.text.android;

import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;
import androidx.compose.animation.core.g0;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.ui.text.j0;
import androidx.compose.ui.text.n;
import kotlin.collections.i0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(CursorAnchorInfo.Builder builder, j0 j0Var, androidx.compose.ui.geometry.c cVar) {
        if (cVar.f()) {
            return;
        }
        n nVar = j0Var.b;
        int i = nVar.f - 1;
        if (i < 0) {
            i = 0;
        }
        int iD = i0.d(nVar.e(cVar.b), 0, i);
        int iD2 = i0.d(nVar.e(cVar.d), 0, i);
        if (iD > iD2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(j0Var.d(iD), nVar.f(iD), j0Var.e(iD), nVar.b(iD));
            if (iD == iD2) {
                return;
            } else {
                iD++;
            }
        }
    }

    public static JobScheduler b(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        jobSchedulerForNamespace.getClass();
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] g(l lVar, RectF rectF, int i, final g0 g0Var) {
        SegmentFinder graphemeClusterSegmentFinder;
        if (i == 1) {
            graphemeClusterSegmentFinder = new androidx.compose.ui.text.android.selection.a(new o(20, lVar.f.getText(), lVar.j()));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(lVar.f.getText(), lVar.a);
        }
        return lVar.f.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) g0Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static int h(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int i(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean k(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void l(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void n(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void o(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }
}
