package com.google.android.material.internal;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public float c;
    public final WeakReference e;
    public com.google.android.material.resources.d f;
    public final TextPaint a = new TextPaint(1);
    public final com.google.android.material.chip.b b = new com.google.android.material.chip.b(this, 1);
    public boolean d = true;

    public g(com.google.android.material.chip.e eVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
