package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends _COROUTINE.b {
    public final CharSequence G;
    public final TextPaint H;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.G = charSequence;
        this.H = textPaint;
    }

    @Override // _COROUTINE.b
    public final int C(int i) {
        CharSequence charSequence = this.G;
        return this.H.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // _COROUTINE.b
    public final int E(int i) {
        CharSequence charSequence = this.G;
        return this.H.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
