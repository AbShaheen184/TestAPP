package androidx.compose.ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ u1 e;

    public t1(u1 u1Var) {
        this.e = u1Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        u1 u1Var = this.e;
        p pVar = (p) u1Var.d;
        if (!u1Var.b) {
            int i = u1Var.c;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((androidx.compose.ui.focus.p) pVar.z.getFocusOwner()).g(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((androidx.compose.ui.focus.p) pVar.z.getFocusOwner()).g(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
