package com.google.accompanist.drawablepainter;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.t;
import androidx.compose.ui.geometry.e;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.node.h0;
import androidx.navigation.internal.h;
import coil3.g;
import kotlin.collections.i0;
import kotlin.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.compose.ui.graphics.painter.b implements b2 {
    public final Drawable C;
    public final j1 D;
    public final j1 E;
    public final o F;

    public b(Drawable drawable) {
        drawable.getClass();
        this.C = drawable;
        this.D = t.r(0);
        this.E = t.r(new e(c.a(drawable)));
        this.F = new o(new h(this, 24));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // androidx.compose.runtime.b2
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.b2
    public final void b() {
        Drawable drawable = this.C;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.b2
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.F.getValue();
        Drawable drawable = this.C;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean d(float f) {
        this.C.setAlpha(i0.d(kotlin.math.a.H(f * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final boolean e(m mVar) {
        this.C.setColorFilter(mVar != null ? mVar.a : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void f(androidx.compose.ui.unit.m mVar) {
        int i;
        mVar.getClass();
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                g.a();
                return;
            }
        } else {
            i = 0;
        }
        this.C.setLayoutDirection(i);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return ((e) this.E.getValue()).a;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        r rVarV = bVar.y.v();
        ((Number) this.D.getValue()).intValue();
        try {
            rVarV.f();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.C;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, kotlin.math.a.H(e.d(bVar.d())), kotlin.math.a.H(e.b(bVar.d())));
            } else {
                rVarV.b(e.d(bVar.d()) / e.d(h()), e.b(bVar.d()) / e.b(h()));
            }
            Canvas canvas = d.a;
            drawable.draw(((androidx.compose.ui.graphics.c) rVarV).a);
        } finally {
            rVarV.q();
        }
    }
}
