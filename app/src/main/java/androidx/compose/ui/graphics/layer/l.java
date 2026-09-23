package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.compose.material3.r2;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.graphics.s;
import androidx.compose.ui.unit.m;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends View {
    public static final r2 H = new r2(1);
    public boolean A;
    public Outline B;
    public boolean C;
    public androidx.compose.ui.unit.c D;
    public m E;
    public kotlin.jvm.functions.l F;
    public b G;
    public final androidx.compose.ui.graphics.layer.view.a e;
    public final s y;
    public final androidx.compose.ui.graphics.drawscope.b z;

    public l(androidx.compose.ui.graphics.layer.view.a aVar, s sVar, androidx.compose.ui.graphics.drawscope.b bVar) {
        super(aVar.getContext());
        this.e = aVar;
        this.y = sVar;
        this.z = bVar;
        setOutlineProvider(H);
        this.C = true;
        this.D = androidx.compose.ui.graphics.drawscope.c.a;
        this.E = m.e;
        d.a.getClass();
        this.F = a.A;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s sVar = this.y;
        androidx.compose.ui.graphics.c cVar = sVar.a;
        Canvas canvas2 = cVar.a;
        cVar.a = canvas;
        androidx.compose.ui.unit.c cVar2 = this.D;
        m mVar = this.E;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.G;
        kotlin.jvm.functions.l lVar = this.F;
        androidx.compose.ui.graphics.drawscope.b bVar2 = this.z;
        c2 c2Var = bVar2.y;
        androidx.compose.ui.graphics.drawscope.a aVar = ((androidx.compose.ui.graphics.drawscope.b) c2Var.A).e;
        androidx.compose.ui.unit.c cVar3 = aVar.a;
        m mVar2 = aVar.b;
        r rVarV = c2Var.v();
        c2 c2Var2 = bVar2.y;
        long jG = c2Var2.G();
        b bVar3 = (b) c2Var2.z;
        c2Var2.Z(cVar2);
        c2Var2.a0(mVar);
        c2Var2.Y(cVar);
        c2Var2.b0(jFloatToRawIntBits);
        c2Var2.z = bVar;
        cVar.f();
        try {
            lVar.invoke(bVar2);
            cVar.q();
            c2Var2.Z(cVar3);
            c2Var2.a0(mVar2);
            c2Var2.Y(rVarV);
            c2Var2.b0(jG);
            c2Var2.z = bVar3;
            sVar.a.a = canvas2;
            this.A = false;
        } catch (Throwable th) {
            cVar.q();
            c2Var2.Z(cVar3);
            c2Var2.a0(mVar2);
            c2Var2.Y(rVarV);
            c2Var2.b0(jG);
            c2Var2.z = bVar3;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.C;
    }

    public final s getCanvasHolder() {
        return this.y;
    }

    public final View getOwnerView() {
        return this.e;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.C;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.A) {
            return;
        }
        this.A = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.C != z) {
            this.C = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.A = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
