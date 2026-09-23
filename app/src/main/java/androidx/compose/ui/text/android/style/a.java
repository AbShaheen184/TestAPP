package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {
    public final /* synthetic */ int e;
    public final float y;

    public /* synthetic */ a(int i, float f) {
        this.e = i;
        this.y = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.y);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.y);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.e) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.y);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.y);
                break;
        }
    }
}
