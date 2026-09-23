package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.activity.w;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.t;
import androidx.compose.ui.geometry.e;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.text.platform.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final l0 e;
    public final float y;
    public final j1 z = t.r(new e(9205357640488583168L));
    public final g0 A = t.k(new w(this, 24));

    public b(l0 l0Var, float f) {
        this.e = l0Var;
        this.y = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.c(textPaint, this.y);
        textPaint.setShader((Shader) this.A.getValue());
    }
}
