package com.caverock.androidsvg;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class t1 extends _COROUTINE.b {
    public float G;
    public float H;
    public final /* synthetic */ x1 I;

    public t1(x1 x1Var, float f, float f2) {
        this.I = x1Var;
        this.G = f;
        this.H = f2;
    }

    @Override // _COROUTINE.b
    public void F(String str) {
        x1 x1Var = this.I;
        Canvas canvas = (Canvas) x1Var.a;
        if (x1Var.w0()) {
            v1 v1Var = (v1) x1Var.c;
            if (v1Var.b) {
                canvas.drawText(str, this.G, this.H, v1Var.d);
            }
            v1 v1Var2 = (v1) x1Var.c;
            if (v1Var2.c) {
                canvas.drawText(str, this.G, this.H, v1Var2.e);
            }
        }
        this.G = ((v1) x1Var.c).d.measureText(str) + this.G;
    }
}
