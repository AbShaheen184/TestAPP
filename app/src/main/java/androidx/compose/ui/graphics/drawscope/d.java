package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.widget.c2;
import androidx.compose.ui.graphics.j;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.p;
import androidx.compose.ui.node.h0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public interface d extends androidx.compose.ui.unit.c {
    static /* synthetic */ void C(d dVar, j jVar, p pVar, float f, h hVar, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        e eVar = hVar;
        if ((i & 8) != 0) {
            eVar = g.a;
        }
        dVar.e(jVar, pVar, f2, eVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void G(d dVar, long j, long j2, long j3, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        dVar.u0(j, j4, (i & 4) != 0 ? Q(dVar.d(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 64) != 0 ? 3 : 0);
    }

    static long Q(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void S(d dVar, long j, float f, long j2, e eVar, int i) {
        if ((i & 4) != 0) {
            j2 = dVar.k0();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            eVar = g.a;
        }
        dVar.A(j, f, j3, eVar);
    }

    static void Z(h0 h0Var, p pVar, long j, long j2, float f, e eVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = Q(h0Var.e.d(), j3);
        }
        h0Var.f(pVar, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? g.a : eVar);
    }

    static void w(d dVar, androidx.compose.ui.graphics.g gVar, long j, long j2, float f, m mVar, int i, int i2) {
        dVar.h(gVar, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, mVar, (i2 & 512) != 0 ? 1 : i);
    }

    static /* synthetic */ void z(d dVar, p pVar, long j, long j2, long j3, e eVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        dVar.z0(pVar, j4, (i & 4) != 0 ? Q(dVar.d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? g.a : eVar);
    }

    void A(long j, float f, long j2, e eVar);

    c2 c0();

    default long d() {
        return c0().G();
    }

    void e(j jVar, p pVar, float f, e eVar, int i);

    void e0(j jVar, long j, e eVar);

    androidx.compose.ui.unit.m getLayoutDirection();

    void h(androidx.compose.ui.graphics.g gVar, long j, long j2, long j3, float f, m mVar, int i);

    default long k0() {
        return _COROUTINE.b.r(c0().G());
    }

    void r(long j, long j2, long j3, long j4, e eVar);

    void s0(long j, float f, float f2, long j2, long j3, e eVar);

    void u0(long j, long j2, long j3, float f, int i);

    void y(long j, long j2, long j3, float f, int i);

    void z0(p pVar, long j, long j2, long j3, float f, e eVar);
}
