package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.app.mlounge.R;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public androidx.compose.runtime.w A;
    public o2 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public WeakReference e;
    public IBinder y;
    public f3 z;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        n2 n2Var = new n2(this);
        coil3.network.g.s(this).a.add(n2Var);
        this.B = new o2(this, dVar, n2Var);
    }

    private final void setParentContext(androidx.compose.runtime.w wVar) {
        if (this.A != wVar) {
            this.A = wVar;
            if (wVar != null) {
                this.e = null;
            }
            f3 f3Var = this.z;
            if (f3Var != null) {
                f3Var.b();
                this.z = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.y != iBinder) {
            this.y = iBinder;
            this.e = null;
        }
    }

    public abstract void a(int i, androidx.compose.runtime.s sVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.D) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.A != null || isAttachedToWindow()) {
            e();
        } else {
            kotlinx.coroutines.future.a.u("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void d() {
        f3 f3Var = this.z;
        if (f3Var != null) {
            f3Var.b();
        }
        this.z = null;
        requestLayout();
    }

    public final void e() {
        if (this.z == null) {
            try {
                this.D = true;
                this.z = i3.a(this, h(), new androidx.compose.runtime.internal.f(true, -656146368, new androidx.compose.animation.f(this, 3)));
            } finally {
                this.D = false;
            }
        }
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        b1 b1Var = tag instanceof b1 ? (b1) tag : null;
        if (b1Var != null) {
            return b1Var.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.z != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.runtime.w h() {
        androidx.compose.runtime.y1 y1Var;
        kotlin.coroutines.j jVar;
        androidx.compose.runtime.e eVar;
        Object objP;
        androidx.compose.runtime.w wVarB = this.A;
        if (wVarB == null) {
            wVarB = c3.b(this);
            if (wVarB == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (wVarB != null || !(objP instanceof View)) {
                        objP = parent;
                        break;
                    }
                    objP = parent;
                    View view = (View) objP;
                    wVarB = c3.b(view);
                    objP = android.support.v4.media.session.b.p(view);
                }
            }
            boolean z = false;
            if (wVarB != null) {
                androidx.compose.runtime.w wVar = (!(wVarB instanceof androidx.compose.runtime.y1) || ((androidx.compose.runtime.u1) ((androidx.compose.runtime.y1) wVarB).u.getValue()).compareTo(androidx.compose.runtime.u1.y) > 0) ? wVarB : null;
                if (wVar != null) {
                    this.e = new WeakReference(wVar);
                }
            } else {
                wVarB = null;
            }
            if (wVarB == null) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (wVarB = (androidx.compose.runtime.w) weakReference.get()) == null || ((wVarB instanceof androidx.compose.runtime.y1) && ((androidx.compose.runtime.u1) ((androidx.compose.runtime.y1) wVarB).u.getValue()).compareTo(androidx.compose.runtime.u1.y) <= 0)) {
                    wVarB = null;
                }
                if (wVarB == null) {
                    if (!isAttachedToWindow()) {
                        androidx.compose.ui.internal.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    androidx.compose.runtime.w wVarB2 = c3.b(view2);
                    if (wVarB2 == null) {
                        ((u2) w2.a.get()).getClass();
                        kotlin.coroutines.j jVar2 = kotlin.coroutines.k.e;
                        kotlin.o oVar = s0.H;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            jVar = (kotlin.coroutines.j) s0.H.getValue();
                        } else {
                            jVar = (kotlin.coroutines.j) s0.I.get();
                            if (jVar == null) {
                                kotlinx.coroutines.future.a.u("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        kotlin.coroutines.j jVarPlus = jVar.plus(jVar2);
                        androidx.compose.runtime.e eVar2 = (androidx.compose.runtime.e) jVarPlus.get(androidx.compose.runtime.f.z);
                        if (eVar2 != null) {
                            eVar = new androidx.compose.runtime.e(eVar2);
                            androidx.compose.foundation.lazy.layout.b1 b1Var = (androidx.compose.foundation.lazy.layout.b1) eVar.z;
                            synchronized (b1Var.y) {
                                b1Var.e = false;
                            }
                        } else {
                            eVar = null;
                        }
                        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        kotlin.coroutines.j c2Var = (androidx.compose.ui.t) jVarPlus.get(androidx.compose.ui.c.M);
                        if (c2Var == null) {
                            c2Var = new c2();
                            zVar.e = c2Var;
                        }
                        if (eVar != null) {
                            jVar2 = eVar;
                        }
                        kotlin.coroutines.j jVarPlus2 = jVarPlus.plus(jVar2).plus(c2Var);
                        y1Var = new androidx.compose.runtime.y1(jVarPlus2);
                        synchronized (y1Var.c) {
                            y1Var.t = true;
                        }
                        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(jVarPlus2);
                        androidx.lifecycle.v vVarD = androidx.lifecycle.m0.d(view2);
                        androidx.lifecycle.p lifecycle = vVarD != null ? vVarD.getLifecycle() : null;
                        if (lifecycle == null) {
                            androidx.compose.ui.internal.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            com.google.firebase.platforminfo.b.b();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new x2(view2, y1Var));
                        lifecycle.a(new a3(CoroutineScope, eVar, y1Var, zVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, y1Var);
                        view2.addOnAttachStateChangeListener(new v2(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, HandlerDispatcherKt.from(view2.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new androidx.activity.compose.p(y1Var, view2, z ? 1 : 0, 19), 2, null)));
                    } else {
                        if (!(wVarB2 instanceof androidx.compose.runtime.y1)) {
                            kotlinx.coroutines.future.a.u("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        y1Var = (androidx.compose.runtime.y1) wVarB2;
                    }
                    androidx.compose.runtime.y1 y1Var2 = ((androidx.compose.runtime.u1) y1Var.u.getValue()).compareTo(androidx.compose.runtime.u1.y) > 0 ? y1Var : null;
                    if (y1Var2 != null) {
                        this.e = new WeakReference(y1Var2);
                    }
                    return y1Var;
                }
            }
        }
        return wVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.E || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new b1(i));
    }

    public final void setParentCompositionContext(androidx.compose.runtime.w wVar) {
        setParentContext(wVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.C = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((u) ((androidx.compose.ui.node.m1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.E = true;
    }

    public final void setViewCompositionStrategy(p2 p2Var) {
        o2 o2Var = this.B;
        if (o2Var != null) {
            o2Var.invoke();
        }
        ((i0) p2Var).getClass();
        androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(this, 3);
        addOnAttachStateChangeListener(dVar);
        n2 n2Var = new n2(this);
        coil3.network.g.s(this).a.add(n2Var);
        this.B = new o2(this, dVar, n2Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
