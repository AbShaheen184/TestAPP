package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.core.view.z1;
import com.app.mlounge.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {
    public static final WeakHashMap w = new WeakHashMap();
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final r1 j;
    public final androidx.compose.runtime.j1 k;
    public final m1 l;
    public final r1 m;
    public final r1 n;
    public final r1 o;
    public final r1 p;
    public final r1 q;
    public final r1 r;
    public final r1 s;
    public final boolean t;
    public int u;
    public final l0 v;

    public v1(View view) {
        a aVarB = t.b(4, "captionBar");
        this.a = aVarB;
        a aVarB2 = t.b(128, "displayCutout");
        this.b = aVarB2;
        a aVarB3 = t.b(8, "ime");
        this.c = aVarB3;
        a aVarB4 = t.b(32, "mandatorySystemGestures");
        this.d = aVarB4;
        a aVarB5 = t.b(2, "navigationBars");
        this.e = aVarB5;
        a aVarB6 = t.b(1, "statusBars");
        this.f = aVarB6;
        a aVarB7 = t.b(519, "systemBars");
        this.g = aVarB7;
        a aVarB8 = t.b(16, "systemGestures");
        this.h = aVarB8;
        a aVarB9 = t.b(64, "tappableElement");
        this.i = aVarB9;
        r1 r1Var = new r1(new p0(0, 0, 0, 0), "waterfall");
        this.j = r1Var;
        this.k = androidx.compose.runtime.t.r(null);
        this.l = new m1(new m1(aVarB7, aVarB3), aVarB2);
        new m1(new m1(new m1(aVarB9, aVarB4), aVarB8), r1Var);
        this.m = t.d(4, "captionBarIgnoringVisibility");
        this.n = t.d(2, "navigationBarsIgnoringVisibility");
        this.o = t.d(1, "statusBarsIgnoringVisibility");
        this.p = t.d(519, "systemBarsIgnoringVisibility");
        this.q = t.d(64, "tappableElementIgnoringVisibility");
        this.r = new r1(new p0(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new r1(new p0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new l0(this);
        Field field = androidx.core.view.s0.a;
        z1 z1VarA = androidx.core.view.l0.a(view);
        if (z1VarA != null) {
            androidx.core.view.w1 w1Var = z1VarA.a;
            aVarB.f(w1Var.u(4));
            aVarB2.f(w1Var.u(128));
            aVarB3.f(w1Var.u(8));
            aVarB4.f(w1Var.u(32));
            aVarB5.f(w1Var.u(2));
            aVarB6.f(w1Var.u(1));
            aVarB7.f(w1Var.u(519));
            aVarB8.f(w1Var.u(16));
            aVarB9.f(w1Var.u(64));
        }
    }

    public static void b(v1 v1Var, z1 z1Var) {
        boolean z = false;
        v1Var.a.g(z1Var, 0);
        v1Var.c.g(z1Var, 0);
        v1Var.b.g(z1Var, 0);
        v1Var.e.g(z1Var, 0);
        v1Var.f.g(z1Var, 0);
        v1Var.g.g(z1Var, 0);
        v1Var.h.g(z1Var, 0);
        v1Var.i.g(z1Var, 0);
        v1Var.d.g(z1Var, 0);
        v1Var.m.f(b.v(z1Var.a.j(4)));
        v1Var.n.f(b.v(z1Var.a.j(2)));
        v1Var.o.f(b.v(z1Var.a.j(1)));
        v1Var.p.f(b.v(z1Var.a.j(519)));
        v1Var.q.f(b.v(z1Var.a.j(64)));
        androidx.core.view.h hVarH = z1Var.a.h();
        v1Var.j.f(b.v(hVarH != null ? hVarH.a() : androidx.core.graphics.c.e));
        androidx.compose.ui.graphics.j jVar = null;
        if (hVarH != null) {
            Path pathF = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.contentcapture.b.f(hVarH.a) : null;
            if (pathF != null) {
                jVar = new androidx.compose.ui.graphics.j(pathF);
            }
        }
        v1Var.k.setValue(jVar);
        synchronized (androidx.compose.runtime.snapshots.n.c) {
            androidx.collection.p0 p0Var = androidx.compose.runtime.snapshots.n.j.h;
            if (p0Var != null && p0Var.h()) {
                z = true;
            }
        }
        if (z) {
            androidx.compose.runtime.snapshots.n.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            Field field = androidx.core.view.s0.a;
            l0 l0Var = this.v;
            androidx.core.view.k0.c(view, l0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(l0Var);
            androidx.core.view.s0.o(view, l0Var);
        }
        this.u++;
    }
}
