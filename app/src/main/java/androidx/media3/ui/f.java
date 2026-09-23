package androidx.media3.ui;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                gVar.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gVar.invalidate(gVar.e);
                break;
            default:
                com.google.android.material.textfield.k kVar = (com.google.android.material.textfield.k) this.b;
                kVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
