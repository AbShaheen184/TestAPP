package androidx.compose.foundation;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends androidx.compose.ui.node.k implements androidx.compose.ui.node.n {
    public final n N;
    public final q0 O;
    public RenderNode P;

    public h2(androidx.compose.ui.input.pointer.l0 l0Var, n nVar, q0 q0Var) {
        this.N = nVar;
        this.O = q0Var;
        M0(l0Var);
    }

    public static boolean P0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode Q0() {
        RenderNode renderNode = this.P;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeB = g2.b();
        this.P = renderNodeB;
        return renderNodeB;
    }

    @Override // androidx.compose.ui.node.n
    public final void X(androidx.compose.ui.node.h0 h0Var) {
        boolean z;
        boolean zP0;
        RecordingCanvas recordingCanvas;
        char c;
        float f;
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        long jD = bVar.d();
        n nVar = this.N;
        nVar.i(jD);
        Canvas canvasA = androidx.compose.ui.graphics.d.a(bVar.y.v());
        nVar.d.getValue();
        if (androidx.compose.ui.geometry.e.e(bVar.d())) {
            h0Var.b();
            return;
        }
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        q0 q0Var = this.O;
        if (!zIsHardwareAccelerated) {
            EdgeEffect edgeEffect = q0Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = q0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = q0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = q0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = q0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = q0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = q0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = q0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            h0Var.b();
            return;
        }
        float fW = h0Var.W(g0.a);
        boolean z2 = q0.f(q0Var.d) || q0.g(q0Var.h) || q0.f(q0Var.e) || q0.g(q0Var.i);
        boolean z3 = q0.f(q0Var.f) || q0.g(q0Var.j) || q0.f(q0Var.g) || q0.g(q0Var.k);
        if (z2 && z3) {
            Q0().setPosition(0, 0, canvasA.getWidth(), canvasA.getHeight());
        } else if (z2) {
            Q0().setPosition(0, 0, (kotlin.math.a.H(fW) * 2) + canvasA.getWidth(), canvasA.getHeight());
        } else {
            if (!z3) {
                h0Var.b();
                return;
            }
            Q0().setPosition(0, 0, canvasA.getWidth(), (kotlin.math.a.H(fW) * 2) + canvasA.getHeight());
        }
        RecordingCanvas recordingCanvasBeginRecording = Q0().beginRecording();
        boolean zG = q0.g(q0Var.j);
        androidx.compose.foundation.gestures.o1 o1Var = androidx.compose.foundation.gestures.o1.y;
        if (zG) {
            EdgeEffect edgeEffectA = q0Var.j;
            if (edgeEffectA == null) {
                edgeEffectA = q0Var.a(o1Var);
                q0Var.j = edgeEffectA;
            }
            P0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
            edgeEffectA.finish();
        }
        if (q0.f(q0Var.f)) {
            EdgeEffect edgeEffectC = q0Var.c();
            zP0 = P0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
            if (q0.g(q0Var.f)) {
                z = z3;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (nVar.c() & 4294967295L));
                EdgeEffect edgeEffectA2 = q0Var.j;
                if (edgeEffectA2 == null) {
                    edgeEffectA2 = q0Var.a(o1Var);
                    q0Var.j = edgeEffectA2;
                }
                int i = Build.VERSION.SDK_INT;
                float fB = i >= 31 ? q.b(edgeEffectC) : 0.0f;
                float f2 = 1 - fIntBitsToFloat;
                if (i >= 31) {
                    q.c(edgeEffectA2, fB, f2);
                } else {
                    edgeEffectA2.onPull(fB, f2);
                }
            } else {
                z = z3;
            }
        } else {
            z = z3;
            zP0 = false;
        }
        boolean zG2 = q0.g(q0Var.h);
        androidx.compose.foundation.gestures.o1 o1Var2 = androidx.compose.foundation.gestures.o1.e;
        if (zG2) {
            EdgeEffect edgeEffectA3 = q0Var.h;
            if (edgeEffectA3 == null) {
                edgeEffectA3 = q0Var.a(o1Var2);
                q0Var.h = edgeEffectA3;
            }
            P0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
            edgeEffectA3.finish();
        }
        if (q0.f(q0Var.d)) {
            EdgeEffect edgeEffectE = q0Var.e();
            boolean z4 = P0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zP0;
            if (q0.g(q0Var.d)) {
                recordingCanvas = recordingCanvasBeginRecording;
                c = ' ';
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (nVar.c() >> 32));
                EdgeEffect edgeEffectA4 = q0Var.h;
                if (edgeEffectA4 == null) {
                    edgeEffectA4 = q0Var.a(o1Var2);
                    q0Var.h = edgeEffectA4;
                }
                int i2 = Build.VERSION.SDK_INT;
                float fB2 = i2 >= 31 ? q.b(edgeEffectE) : 0.0f;
                if (i2 >= 31) {
                    q.c(edgeEffectA4, fB2, fIntBitsToFloat2);
                } else {
                    edgeEffectA4.onPull(fB2, fIntBitsToFloat2);
                }
            } else {
                fW = fW;
                recordingCanvas = recordingCanvasBeginRecording;
                c = ' ';
            }
            zP0 = z4;
        } else {
            fW = fW;
            recordingCanvas = recordingCanvasBeginRecording;
            c = ' ';
        }
        if (q0.g(q0Var.k)) {
            EdgeEffect edgeEffectA5 = q0Var.k;
            if (edgeEffectA5 == null) {
                edgeEffectA5 = q0Var.a(o1Var);
                q0Var.k = edgeEffectA5;
            }
            P0(270.0f, edgeEffectA5, recordingCanvas);
            edgeEffectA5.finish();
        }
        if (q0.f(q0Var.g)) {
            EdgeEffect edgeEffectD = q0Var.d();
            boolean z5 = P0(90.0f, edgeEffectD, recordingCanvas) || zP0;
            if (q0.g(q0Var.g)) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (nVar.c() & 4294967295L));
                EdgeEffect edgeEffectA6 = q0Var.k;
                if (edgeEffectA6 == null) {
                    edgeEffectA6 = q0Var.a(o1Var);
                    q0Var.k = edgeEffectA6;
                }
                int i3 = Build.VERSION.SDK_INT;
                float fB3 = i3 >= 31 ? q.b(edgeEffectD) : 0.0f;
                if (i3 >= 31) {
                    q.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                } else {
                    edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                }
            }
            zP0 = z5;
        }
        if (q0.g(q0Var.i)) {
            EdgeEffect edgeEffectA7 = q0Var.i;
            if (edgeEffectA7 == null) {
                edgeEffectA7 = q0Var.a(o1Var2);
                q0Var.i = edgeEffectA7;
            }
            f = 0.0f;
            P0(0.0f, edgeEffectA7, recordingCanvas);
            edgeEffectA7.finish();
        } else {
            f = 0.0f;
        }
        if (q0.f(q0Var.e)) {
            EdgeEffect edgeEffectB = q0Var.b();
            boolean z6 = P0(180.0f, edgeEffectB, recordingCanvas) || zP0;
            if (q0.g(q0Var.e)) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (nVar.c() >> c));
                EdgeEffect edgeEffectA8 = q0Var.i;
                if (edgeEffectA8 == null) {
                    edgeEffectA8 = q0Var.a(o1Var2);
                    q0Var.i = edgeEffectA8;
                }
                int i4 = Build.VERSION.SDK_INT;
                float fB4 = i4 >= 31 ? q.b(edgeEffectB) : f;
                float f3 = 1 - fIntBitsToFloat4;
                if (i4 >= 31) {
                    q.c(edgeEffectA8, fB4, f3);
                } else {
                    edgeEffectA8.onPull(fB4, f3);
                }
            }
            zP0 = z6;
        }
        if (zP0) {
            nVar.d();
        }
        float f4 = z ? f : fW;
        if (!z2) {
            f = fW;
        }
        androidx.compose.ui.unit.m layoutDirection = h0Var.getLayoutDirection();
        androidx.compose.ui.graphics.c cVar = new androidx.compose.ui.graphics.c();
        cVar.a = recordingCanvas;
        long jD2 = bVar.d();
        androidx.appcompat.widget.c2 c2Var = bVar.y;
        androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
        androidx.compose.ui.unit.c cVar2 = aVar.a;
        androidx.compose.ui.unit.m mVar = aVar.b;
        androidx.compose.ui.graphics.r rVarV = c2Var.v();
        long jG = bVar.y.G();
        androidx.appcompat.widget.c2 c2Var2 = bVar.y;
        androidx.compose.ui.graphics.layer.b bVar2 = (androidx.compose.ui.graphics.layer.b) c2Var2.z;
        c2Var2.Z(h0Var);
        c2Var2.a0(layoutDirection);
        c2Var2.Y(cVar);
        c2Var2.b0(jD2);
        c2Var2.z = null;
        cVar.f();
        try {
            ((com.google.firebase.platforminfo.d) bVar.y.y).r(f4, f);
            try {
                h0Var.b();
                float f5 = -f4;
                float f6 = -f;
                ((com.google.firebase.platforminfo.d) bVar.y.y).r(f5, f6);
                cVar.q();
                androidx.appcompat.widget.c2 c2Var3 = bVar.y;
                c2Var3.Z(cVar2);
                c2Var3.a0(mVar);
                c2Var3.Y(rVarV);
                c2Var3.b0(jG);
                c2Var3.z = bVar2;
                Q0().endRecording();
                int iSave = canvasA.save();
                canvasA.translate(f5, f6);
                canvasA.drawRenderNode(Q0());
                canvasA.restoreToCount(iSave);
            } catch (Throwable th) {
                ((com.google.firebase.platforminfo.d) bVar.y.y).r(-f4, -f);
                throw th;
            }
        } catch (Throwable th2) {
            cVar.q();
            androidx.appcompat.widget.c2 c2Var4 = bVar.y;
            c2Var4.Z(cVar2);
            c2Var4.a0(mVar);
            c2Var4.Y(rVarV);
            c2Var4.b0(jG);
            c2Var4.z = bVar2;
            throw th2;
        }
    }
}
