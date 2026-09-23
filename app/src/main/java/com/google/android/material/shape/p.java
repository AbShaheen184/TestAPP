package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends u {
    public final r c;

    public p(r rVar) {
        this.c = rVar;
    }

    @Override // com.google.android.material.shape.u
    public final void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
        r rVar = this.c;
        float f = rVar.f;
        float f2 = rVar.g;
        RectF rectF = new RectF(rVar.b, rVar.c, rVar.d, rVar.e);
        Paint paint = aVar.b;
        boolean z = f2 < 0.0f;
        Path path = aVar.g;
        int[] iArr = com.google.android.material.shadow.a.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar.f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = com.google.android.material.shadow.a.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
