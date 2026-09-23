package com.caverock.androidsvg;

import android.graphics.Canvas;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends t1 {
    public final Path J;
    public final /* synthetic */ x1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(x1 x1Var, Path path, float f) {
        super(x1Var, f, 0.0f);
        this.K = x1Var;
        this.J = path;
    }

    @Override // com.caverock.androidsvg.t1, _COROUTINE.b
    public final void F(String str) {
        x1 x1Var = this.K;
        if (x1Var.w0()) {
            v1 v1Var = (v1) x1Var.c;
            if (v1Var.b) {
                ((Canvas) x1Var.a).drawTextOnPath(str, this.J, this.G, this.H, v1Var.d);
            }
            v1 v1Var2 = (v1) x1Var.c;
            if (v1Var2.c) {
                ((Canvas) x1Var.a).drawTextOnPath(str, this.J, this.G, this.H, v1Var2.e);
            }
        }
        this.G = ((v1) x1Var.c).d.measureText(str) + this.G;
    }
}
