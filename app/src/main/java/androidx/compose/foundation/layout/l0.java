package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.z1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends androidx.core.view.w0 implements Runnable, androidx.core.view.s, View.OnAttachStateChangeListener {
    public final v1 A;
    public boolean B;
    public boolean C;
    public z1 D;

    public l0(v1 v1Var) {
        super(!v1Var.t ? 1 : 0);
        this.A = v1Var;
    }

    @Override // androidx.core.view.s
    public final z1 j(View view, z1 z1Var) {
        this.D = z1Var;
        v1 v1Var = this.A;
        r1 r1Var = v1Var.r;
        androidx.core.view.w1 w1Var = z1Var.a;
        r1Var.f(b.v(w1Var.i(8)));
        if (this.B) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.C) {
            v1Var.s.f(b.v(w1Var.i(8)));
            v1.b(v1Var, z1Var);
        }
        return v1Var.t ? z1.b : z1Var;
    }

    @Override // androidx.core.view.w0
    public final void n(androidx.core.view.f1 f1Var) {
        this.B = false;
        this.C = false;
        z1 z1Var = this.D;
        if (f1Var.a.b() > 0 && z1Var != null) {
            androidx.core.view.w1 w1Var = z1Var.a;
            v1 v1Var = this.A;
            v1Var.s.f(b.v(w1Var.i(8)));
            v1Var.r.f(b.v(w1Var.i(8)));
            v1.b(v1Var, z1Var);
        }
        this.D = null;
    }

    @Override // androidx.core.view.w0
    public final void o() {
        this.B = true;
        this.C = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // androidx.core.view.w0
    public final z1 p(z1 z1Var, List list) {
        v1 v1Var = this.A;
        v1.b(v1Var, z1Var);
        return v1Var.t ? z1.b : z1Var;
    }

    @Override // androidx.core.view.w0
    public final androidx.compose.foundation.text.input.internal.o q(androidx.core.view.f1 f1Var, androidx.compose.foundation.text.input.internal.o oVar) {
        this.B = false;
        return oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.B) {
            this.B = false;
            this.C = false;
            z1 z1Var = this.D;
            if (z1Var != null) {
                v1 v1Var = this.A;
                v1Var.s.f(b.v(z1Var.a.i(8)));
                v1.b(v1Var, z1Var);
                this.D = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
