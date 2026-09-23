package coil3.compose;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.node.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.compose.ui.graphics.painter.b {
    public final coil3.j C;

    public q(coil3.j jVar) {
        this.C = jVar;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        coil3.j jVar = this.C;
        int iB = jVar.b();
        float f = iB > 0 ? iB : Float.NaN;
        int iA = jVar.a();
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(iA > 0 ? iA : Float.NaN)) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(h0 h0Var) {
        androidx.compose.ui.graphics.drawscope.b bVar = h0Var.e;
        coil3.j jVar = this.C;
        int iB = jVar.b();
        float fIntBitsToFloat = iB > 0 ? Float.intBitsToFloat((int) (bVar.d() >> 32)) / iB : 1.0f;
        int iA = jVar.a();
        float fIntBitsToFloat2 = iA > 0 ? Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) / iA : 1.0f;
        c2 c2Var = bVar.y;
        long jG = c2Var.G();
        c2Var.v().f();
        try {
            ((com.google.firebase.platforminfo.d) c2Var.y).n(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            jVar.d(androidx.compose.ui.graphics.d.a(bVar.y.v()));
        } finally {
            androidx.privacysandbox.ads.adservices.java.internal.a.B(c2Var, jG);
        }
    }
}
