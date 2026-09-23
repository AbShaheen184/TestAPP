package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends u {
    public final s c;
    public final float d;
    public final float e;

    public q(s sVar, float f, float f2) {
        this.c = sVar;
        this.d = f;
        this.e = f2;
    }

    @Override // com.google.android.material.shape.u
    public final void a(Matrix matrix, com.google.android.material.shadow.a aVar, int i, Canvas canvas) {
        s sVar = this.c;
        float f = sVar.c;
        float f2 = this.e;
        float f3 = sVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = aVar.f;
        int[] iArr = com.google.android.material.shadow.a.i;
        iArr[0] = i2;
        iArr[1] = aVar.e;
        iArr[2] = aVar.d;
        Paint paint = aVar.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, com.google.android.material.shadow.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        s sVar = this.c;
        return (float) Math.toDegrees(Math.atan((sVar.c - this.e) / (sVar.b - this.d)));
    }
}
