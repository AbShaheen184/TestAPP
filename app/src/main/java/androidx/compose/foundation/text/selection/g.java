package androidx.compose.foundation.text.selection;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    public /* synthetic */ g(androidx.compose.ui.r rVar, kotlin.jvm.functions.a aVar, boolean z, int i) {
        this.A = rVar;
        this.B = aVar;
        this.y = z;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(this.z | 1);
                kotlin.math.a.e((androidx.compose.ui.r) this.A, (kotlin.jvm.functions.a) this.B, this.y, (androidx.compose.runtime.s) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.t.A(this.z | 1);
                coil3.network.g.b(this.y, (androidx.compose.ui.text.style.j) this.A, (b1) this.B, (androidx.compose.runtime.s) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = androidx.compose.runtime.t.A(this.z | 1);
                com.app.mlounge.ui.screens.livetv.a.e((String) this.A, this.y, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.s) obj, iA3);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ g(String str, boolean z, kotlin.jvm.functions.a aVar, int i) {
        this.A = str;
        this.y = z;
        this.B = aVar;
        this.z = i;
    }

    public /* synthetic */ g(boolean z, androidx.compose.ui.text.style.j jVar, b1 b1Var, int i) {
        this.y = z;
        this.A = jVar;
        this.B = b1Var;
        this.z = i;
    }
}
