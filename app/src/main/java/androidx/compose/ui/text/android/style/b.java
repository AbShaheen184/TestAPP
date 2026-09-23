package androidx.compose.ui.text.android.style;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ b(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.y);
                break;
            default:
                textPaint.setTypeface((Typeface) this.y);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.e) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.y);
                break;
            default:
                textPaint.setTypeface((Typeface) this.y);
                break;
        }
    }
}
