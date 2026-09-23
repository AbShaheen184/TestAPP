package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.compose.ui.graphics.n0 {
    public static final y0 b = new y0(0);
    public static final y0 c = new y0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.graphics.n0
    public final androidx.compose.ui.graphics.a0 a(long j, androidx.compose.ui.unit.m mVar, androidx.compose.ui.unit.c cVar) {
        switch (this.a) {
            case 0:
                float fI0 = cVar.i0(g0.a);
                return new androidx.compose.ui.graphics.h0(new androidx.compose.ui.geometry.c(0.0f, -fI0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fI0));
            default:
                float fI1 = cVar.i0(g0.a);
                return new androidx.compose.ui.graphics.h0(new androidx.compose.ui.geometry.c(-fI1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fI1, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
