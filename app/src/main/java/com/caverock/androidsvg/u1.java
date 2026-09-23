package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends _COROUTINE.b {
    public final /* synthetic */ int G;
    public float H;
    public final float I;
    public final /* synthetic */ x1 J;
    public final Object K;

    public u1(x1 x1Var, float f, float f2) {
        this.G = 1;
        this.J = x1Var;
        this.K = new RectF();
        this.H = f;
        this.I = f2;
    }

    @Override // _COROUTINE.b
    public final void F(String str) {
        String str2;
        switch (this.G) {
            case 0:
                x1 x1Var = this.J;
                if (x1Var.w0()) {
                    Path path = new Path();
                    str2 = str;
                    ((v1) x1Var.c).d.getTextPath(str2, 0, str.length(), this.H, this.I, path);
                    ((Path) this.K).addPath(path);
                } else {
                    str2 = str;
                }
                this.H = ((v1) x1Var.c).d.measureText(str2) + this.H;
                break;
            default:
                x1 x1Var2 = this.J;
                if (x1Var2.w0()) {
                    Rect rect = new Rect();
                    ((v1) x1Var2.c).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.H, this.I);
                    ((RectF) this.K).union(rectF);
                }
                this.H = ((v1) x1Var2.c).d.measureText(str) + this.H;
                break;
        }
    }

    @Override // _COROUTINE.b
    public final boolean n(j1 j1Var) {
        switch (this.G) {
            case 0:
                if (!(j1Var instanceof k1)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(j1Var instanceof k1)) {
                    return true;
                }
                k1 k1Var = (k1) j1Var;
                w0 w0VarW = j1Var.a.W(k1Var.n);
                if (w0VarW == null) {
                    x1.z("TextPath path reference '%s' not found", k1Var.n);
                } else {
                    i0 i0Var = (i0) w0VarW;
                    r1 r1Var = new r1(i0Var.o);
                    Matrix matrix = i0Var.n;
                    Path path = r1Var.a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.K).union(rectF);
                }
                return false;
        }
    }

    public u1(x1 x1Var, float f, float f2, Path path) {
        this.G = 0;
        this.J = x1Var;
        this.H = f;
        this.I = f2;
        this.K = path;
    }
}
