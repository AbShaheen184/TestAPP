package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.compose.ui.node.k implements androidx.compose.ui.node.n {
    public final n N;
    public final q0 O;
    public final androidx.compose.foundation.layout.z0 P;

    public x0(androidx.compose.ui.input.pointer.l0 l0Var, n nVar, q0 q0Var, androidx.compose.foundation.layout.z0 z0Var) {
        this.N = nVar;
        this.O = q0Var;
        this.P = z0Var;
        M0(l0Var);
    }

    public static boolean P0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        boolean zP0;
        char c;
        long j;
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jD = bVar.d();
        n nVar = this.N;
        nVar.i(jD);
        if (androidx.compose.ui.geometry.e.e(bVar.d())) {
            h0Var.b();
            return;
        }
        h0Var.b();
        nVar.d.getValue();
        Canvas canvasA = androidx.compose.ui.graphics.d.a(bVar.y.v());
        q0 q0Var = this.O;
        boolean zF = q0.f(q0Var.f);
        androidx.compose.foundation.layout.z0 z0Var = this.P;
        if (zF) {
            zP0 = P0(270.0f, (((long) Float.floatToRawIntBits(h0Var.W(z0Var.a(h0Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) << 32), q0Var.c(), canvasA);
        } else {
            zP0 = false;
        }
        if (q0.f(q0Var.d)) {
            c = ' ';
            j = 4294967295L;
            zP0 = P0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(h0Var.W(z0Var.b))) & 4294967295L), q0Var.e(), canvasA) || zP0;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (q0.f(q0Var.g)) {
            zP0 = P0(90.0f, (((long) Float.floatToRawIntBits(h0Var.W(z0Var.b(h0Var.getLayoutDirection())) + (-((float) kotlin.math.a.H(Float.intBitsToFloat((int) (bVar.d() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), q0Var.d(), canvasA) || zP0;
        }
        if (q0.f(q0Var.e)) {
            EdgeEffect edgeEffectB = q0Var.b();
            zP0 = P0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (bVar.d() & j))) + h0Var.W(z0Var.d))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (bVar.d() >> c)))) << c), edgeEffectB, canvasA) || zP0;
        }
        if (zP0) {
            nVar.d();
        }
    }
}
