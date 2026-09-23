package androidx.dynamicanimation.animation;

import android.view.View;
import com.google.android.material.shape.w;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends coil3.svg.internal.a {
    public final /* synthetic */ int k;

    public /* synthetic */ d(int i) {
        this.k = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.svg.internal.a
    public final void R(w wVar, float f) {
        switch (this.k) {
            case 0:
                ((View) wVar).setAlpha(f);
                break;
            case 1:
                ((View) wVar).setScaleX(f);
                break;
            case 2:
                ((View) wVar).setScaleY(f);
                break;
            case 3:
                ((View) wVar).setRotation(f);
                break;
            case 4:
                ((View) wVar).setRotationX(f);
                break;
            default:
                ((View) wVar).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.svg.internal.a
    public final float z(w wVar) {
        switch (this.k) {
            case 0:
                return ((View) wVar).getAlpha();
            case 1:
                return ((View) wVar).getScaleX();
            case 2:
                return ((View) wVar).getScaleY();
            case 3:
                return ((View) wVar).getRotation();
            case 4:
                return ((View) wVar).getRotationX();
            default:
                return ((View) wVar).getRotationY();
        }
    }
}
