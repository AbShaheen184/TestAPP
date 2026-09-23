package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                l lVar = (l) this.b;
                lVar.c.setAlpha(iFloatValue);
                lVar.d.setAlpha(iFloatValue);
                lVar.s.invalidate();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.material.shape.i iVar = ((BottomSheetBehavior) this.b).i;
                if (iVar != null) {
                    com.google.android.material.shape.g gVar = iVar.y;
                    if (gVar.j != fFloatValue) {
                        gVar.j = fFloatValue;
                        iVar.C = true;
                        iVar.D = true;
                        iVar.invalidateSelf();
                    }
                }
                break;
            default:
                ((TextInputLayout) this.b).T0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
