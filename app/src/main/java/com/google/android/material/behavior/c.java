package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.dynamite.g;
import com.google.android.gms.tasks.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {
    public int m;
    public int n = -1;
    public final /* synthetic */ SwipeDismissBehavior o;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.o = swipeDismissBehavior;
    }

    @Override // com.google.android.gms.dynamite.g
    public final void I(View view, int i) {
        this.n = i;
        this.m = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.o;
            swipeDismissBehavior.c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.c = false;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final void K(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.o;
        float f = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f;
        float fAbs = Math.abs(i - this.m);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // com.google.android.gms.dynamite.g
    public final void L(View view, float f, float f2) {
        int i;
        int left;
        int i2;
        this.n = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.o;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i3 = swipeDismissBehavior.d;
            if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.m;
            } else {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.m;
                    if (left < i2) {
                        i = this.m - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.m - width;
                }
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.m) >= Math.round(view.getWidth() * 0.5f)) {
                if (f >= 0.0f) {
                    left = view.getLeft();
                    i2 = this.m;
                    if (left < i2) {
                        i = this.m - width;
                    } else {
                        i = i2 + width;
                    }
                } else {
                    i = this.m - width;
                }
                z = true;
            } else {
                i = this.m;
            }
        }
        if (swipeDismissBehavior.a.o(i, view.getTop())) {
            view.postOnAnimation(new o(swipeDismissBehavior, view, z));
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final boolean R(View view, int i) {
        int i2 = this.n;
        return (i2 == -1 || i2 == i) && this.o.r(view);
    }

    @Override // com.google.android.gms.dynamite.g
    public final int j(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.o.d;
        if (i2 == 0) {
            width = this.m;
            if (z) {
                width -= view.getWidth();
                width2 = this.m;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.m;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = view.getWidth() + this.m;
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.m;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.google.android.gms.dynamite.g
    public final int k(View view, int i) {
        return view.getTop();
    }

    @Override // com.google.android.gms.dynamite.g
    public final int z(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.dynamite.g
    public final void J(int i) {
    }
}
