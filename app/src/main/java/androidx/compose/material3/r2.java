package androidx.compose.material3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                if (!(view instanceof androidx.compose.ui.graphics.layer.l) || (outline2 = ((androidx.compose.ui.graphics.layer.l) view).B) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 2:
                view.getClass();
                throw new ClassCastException();
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
