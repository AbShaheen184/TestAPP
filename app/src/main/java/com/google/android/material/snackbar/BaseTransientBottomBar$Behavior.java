package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final a0 h;

    public BaseTransientBottomBar$Behavior() {
        a0 a0Var = new a0(21);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = a0Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.b == null) {
                    e.b = new e(3);
                }
                synchronized (e.b.a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.b == null) {
                e.b = new e(3);
            }
            synchronized (e.b.a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof c;
    }
}
