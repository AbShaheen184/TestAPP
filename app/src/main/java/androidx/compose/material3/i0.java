package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ kotlin.d E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ androidx.compose.ui.r y;
    public final /* synthetic */ int z;

    public /* synthetic */ i0(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, g0 g0Var, h0 h0Var, androidx.compose.runtime.internal.f fVar, int i, int i2) {
        this.y = rVar;
        this.B = n0Var;
        this.C = g0Var;
        this.D = h0Var;
        this.E = fVar;
        this.z = i;
        this.A = i2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                q.c(this.y, (androidx.compose.ui.graphics.n0) this.B, (g0) this.C, (h0) this.D, (androidx.compose.runtime.internal.f) this.E, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1), this.A);
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.o((String) this.B, (String) this.C, (androidx.compose.ui.graphics.vector.f) this.D, this.y, (kotlin.jvm.functions.a) this.E, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.z | 1), this.A);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ i0(String str, String str2, androidx.compose.ui.graphics.vector.f fVar, androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.B = str;
        this.C = str2;
        this.D = fVar;
        this.y = rVar;
        this.E = aVar;
        this.z = i;
        this.A = i2;
    }
}
