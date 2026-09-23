package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.firebase.b {
    public final /* synthetic */ int k;
    public final SideSheetBehavior l;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.k = i;
        this.l = sideSheetBehavior;
    }

    @Override // com.google.firebase.b
    public final int A() {
        switch (this.k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.l;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.l;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // com.google.firebase.b
    public final int B() {
        switch (this.k) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.l;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.l.m;
        }
    }

    @Override // com.google.firebase.b
    public final int C() {
        switch (this.k) {
            case 0:
                return this.l.o;
            default:
                return this.l.m;
        }
    }

    @Override // com.google.firebase.b
    public final int D() {
        switch (this.k) {
            case 0:
                return -this.l.l;
            default:
                return A();
        }
    }

    @Override // com.google.firebase.b
    public final int E(View view) {
        switch (this.k) {
            case 0:
                return view.getRight() + this.l.o;
            default:
                return view.getLeft() - this.l.o;
        }
    }

    @Override // com.google.firebase.b
    public final int F(CoordinatorLayout coordinatorLayout) {
        switch (this.k) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.google.firebase.b
    public final int G() {
        switch (this.k) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.google.firebase.b
    public final boolean I(float f) {
        switch (this.k) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // com.google.firebase.b
    public final boolean J(View view) {
        switch (this.k) {
            case 0:
                return view.getRight() < (A() - B()) / 2;
            default:
                return view.getLeft() > (A() + this.l.m) / 2;
        }
    }

    @Override // com.google.firebase.b
    public final boolean K(float f, float f2) {
        switch (this.k) {
            case 0:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
        }
    }

    @Override // com.google.firebase.b
    public final boolean V(View view, float f) {
        switch (this.k) {
            case 0:
                return Math.abs((f * this.l.k) + ((float) view.getLeft())) > 0.5f;
            default:
                return Math.abs((f * this.l.k) + ((float) view.getRight())) > 0.5f;
        }
    }

    @Override // com.google.firebase.b
    public final void Z(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.k) {
            case 0:
                if (i <= this.l.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.l.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // com.google.firebase.b
    public final int e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.k) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.google.firebase.b
    public final float f(int i) {
        switch (this.k) {
            case 0:
                float fB = B();
                return (i - fB) / (A() - fB);
            default:
                float f = this.l.m;
                return (f - i) / (f - A());
        }
    }
}
