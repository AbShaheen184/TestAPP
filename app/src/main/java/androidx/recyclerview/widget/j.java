package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ l b;

    public j(l lVar) {
        this.b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        l lVar = this.b;
        if (((Float) lVar.z.getAnimatedValue()).floatValue() == 0.0f) {
            lVar.A = 0;
            lVar.f(0);
        } else {
            lVar.A = 2;
            lVar.s.invalidate();
        }
    }
}
