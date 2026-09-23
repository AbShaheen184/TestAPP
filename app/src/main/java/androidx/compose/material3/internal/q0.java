package androidx.compose.material3.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ androidx.compose.ui.text.m0 z;

    public /* synthetic */ q0(long j, androidx.compose.ui.text.m0 m0Var, kotlin.jvm.functions.p pVar, int i, int i2) {
        this.e = i2;
        this.y = j;
        this.z = m0Var;
        this.A = pVar;
        this.B = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                i.b(this.y, this.z, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a1.b(this.y, this.z, this.A, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.A(this.B | 1));
                break;
        }
        return kotlin.y.a;
    }
}
