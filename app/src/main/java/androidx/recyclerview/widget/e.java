package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ h e;

    public /* synthetic */ e(h hVar, f fVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = hVar;
        this.b = fVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                f fVar = this.b;
                p0 p0Var = fVar.a;
                h hVar = this.e;
                hVar.c(p0Var);
                hVar.r.remove(fVar.a);
                hVar.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                f fVar2 = this.b;
                p0 p0Var2 = fVar2.b;
                h hVar2 = this.e;
                hVar2.c(p0Var2);
                hVar2.r.remove(fVar2.b);
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
}
