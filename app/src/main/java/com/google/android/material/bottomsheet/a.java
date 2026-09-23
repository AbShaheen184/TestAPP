package com.google.android.material.bottomsheet;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.j;
import androidx.room.t;
import com.google.android.gms.dynamite.g;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public final /* synthetic */ int m;
    public final /* synthetic */ androidx.coordinatorlayout.widget.a n;

    public /* synthetic */ a(androidx.coordinatorlayout.widget.a aVar, int i) {
        this.m = i;
        this.n = aVar;
    }

    @Override // com.google.android.gms.dynamite.g
    public int A() {
        switch (this.m) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.n;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.A();
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final void J(int i) {
        switch (this.m) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.n;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final void K(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.m) {
            case 0:
                ((BottomSheetBehavior) this.n).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.Z(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw j.b(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    @Override // com.google.android.gms.dynamite.g
    public final void L(View view, float f, float f2) {
        int i;
        switch (this.m) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.n;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        if (top <= bottomSheetBehavior.E) {
                            i2 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.D(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.x() + bottomSheetBehavior.V) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.x()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i3 = bottomSheetBehavior.E;
                        if (top2 < i3) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i2 = 3;
                            }
                        } else if (Math.abs(top2 - i3) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i2 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else if (bottomSheetBehavior.b) {
                    i2 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                        i2 = 4;
                    }
                }
                bottomSheetBehavior.E(view, i2, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                if (!sideSheetBehavior.a.I(f)) {
                    if (!sideSheetBehavior.a.V(view, f)) {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            i = Math.abs(left - sideSheetBehavior.a.A()) < Math.abs(left - sideSheetBehavior.a.B()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.a.K(f, f2) || sideSheetBehavior.a.J(view)) {
                    }
                }
                sideSheetBehavior.t(view, i, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0048  */
    @Override // com.google.android.gms.dynamite.g
    public final boolean R(View view, int i) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.m) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.n;
                int i2 = bottomSheetBehavior.N;
                if (i2 != 1 && !bottomSheetBehavior.c0) {
                    if (i2 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference = bottomSheetBehavior.W;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference = bottomSheetBehavior.W;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                return (sideSheetBehavior.h == 1 || (weakReference2 = sideSheetBehavior.p) == null || weakReference2.get() != view) ? false : true;
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final int j(View view, int i) {
        switch (this.m) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                return t.h(i, sideSheetBehavior.a.D(), sideSheetBehavior.a.C());
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public final int k(View view, int i) {
        switch (this.m) {
            case 0:
                return t.h(i, ((BottomSheetBehavior) this.n).x(), A());
            default:
                return view.getTop();
        }
    }

    @Override // com.google.android.gms.dynamite.g
    public int z(View view) {
        switch (this.m) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.n;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.z(view);
        }
    }
}
