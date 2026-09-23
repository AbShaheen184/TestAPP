package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends View {
    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        eVar.a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        eVar.b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f) {
        e eVar = (e) getLayoutParams();
        eVar.c = f;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
