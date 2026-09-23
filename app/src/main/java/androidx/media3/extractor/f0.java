package androidx.media3.extractor;

import androidx.compose.foundation.gestures.d3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends u {
    public final /* synthetic */ a0 b;
    public final /* synthetic */ d3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d3 d3Var, a0 a0Var, a0 a0Var2) {
        super(a0Var);
        this.c = d3Var;
        this.b = a0Var2;
    }

    @Override // androidx.media3.extractor.u, androidx.media3.extractor.a0
    public final z e(long j) {
        z zVarE = this.b.e(j);
        b0 b0Var = zVarE.a;
        long j2 = b0Var.a;
        long j3 = b0Var.b;
        long j4 = this.c.y;
        b0 b0Var2 = new b0(j2, j3 + j4);
        b0 b0Var3 = zVarE.b;
        return new z(b0Var2, new b0(b0Var3.a, b0Var3.b + j4));
    }
}
