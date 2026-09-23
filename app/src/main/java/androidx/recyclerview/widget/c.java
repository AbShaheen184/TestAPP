package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ h e;

    public c(h hVar, p0 p0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = hVar;
        this.b = p0Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                h hVar = this.e;
                p0 p0Var = this.b;
                hVar.c(p0Var);
                hVar.q.remove(p0Var);
                hVar.i();
                break;
            default:
                this.d.setListener(null);
                h hVar2 = this.e;
                p0 p0Var2 = this.b;
                hVar2.c(p0Var2);
                hVar2.o.remove(p0Var2);
                hVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public c(h hVar, p0 p0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = hVar;
        this.b = p0Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
