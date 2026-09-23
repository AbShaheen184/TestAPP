package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {
    @Override // com.google.android.material.shape.i
    public final void f(Canvas canvas) {
        if (this.d0.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        e eVar = this.d0;
        if (i >= 26) {
            canvas.clipOutRect(eVar.r);
        } else {
            canvas.clipRect(eVar.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
