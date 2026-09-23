package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.appcompat.view.menu.a y;

    public /* synthetic */ c1(androidx.appcompat.view.menu.a aVar, int i) {
        this.e = i;
        this.y = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ViewParent parent = this.y.A.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                androidx.appcompat.view.menu.a aVar = this.y;
                aVar.a();
                View view = aVar.A;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.D = true;
                    break;
                }
                break;
        }
    }
}
