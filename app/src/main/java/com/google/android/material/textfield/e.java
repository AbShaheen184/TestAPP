package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.material.shape.g {
    public final RectF r;

    public e(e eVar) {
        super(eVar);
        this.r = eVar.r;
    }

    @Override // com.google.android.material.shape.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(this);
        fVar.d0 = this;
        fVar.invalidateSelf();
        return fVar;
    }

    public e(com.google.android.material.shape.m mVar, RectF rectF) {
        super(mVar);
        this.r = rectF;
    }
}
