package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.mlounge.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends androidx.coordinatorlayout.widget.a {
    public _COROUTINE.a a;
    public AccessibilityManager b;
    public a c;
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public ViewPropertyAnimator k;
    public final LinkedHashSet d = new LinkedHashSet();
    public int i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager != null && this.c == null) {
            a aVar = new a(this, view, 1);
            this.c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new androidx.appcompat.view.menu.d(this, 5));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((androidx.coordinatorlayout.widget.d) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            r(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            r((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.i = this.a.P(view, marginLayoutParams);
        this.e = android.support.v4.media.session.b.E(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = android.support.v4.media.session.b.E(view.getContext(), R.attr.motionDurationMedium4, Token.COMMENT);
        this.g = android.support.v4.media.session.b.F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.d);
        this.h = android.support.v4.media.session.b.F(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.d.iterator();
            if (it.hasNext()) {
                throw j.b(it);
            }
            this.k = this.a.V(view, this.i).setInterpolator(this.h).setDuration(this.f).setListener(new androidx.appcompat.widget.b(this, 3));
        }
    }

    @Override // androidx.coordinatorlayout.widget.a
    public final boolean o(View view, int i, int i2) {
        return i == 2;
    }

    public final void r(int i) {
        _COROUTINE.a aVar = this.a;
        if (aVar == null || aVar.U() != i) {
            if (i == 0) {
                this.a = new b(2);
                return;
            }
            if (i == 1) {
                this.a = new b(0);
            } else if (i == 2) {
                this.a = new b(1);
            } else {
                kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.q("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
            }
        }
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw j.b(it);
        }
        this.a.getClass();
        this.k = this.a.V(view, 0).setInterpolator(this.g).setDuration(this.e).setListener(new androidx.appcompat.widget.b(this, 3));
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
