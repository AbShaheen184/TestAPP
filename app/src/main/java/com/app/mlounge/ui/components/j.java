package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ j(int i, int i2, int i3, androidx.compose.ui.r rVar, boolean z) {
        this.y = i;
        this.B = rVar;
        this.z = i2;
        this.A = z;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(this.y | 1);
                b0.b(this.A, (kotlin.jvm.functions.a) this.B, (androidx.compose.runtime.s) obj, iA, this.z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.t.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.B, this.z, this.A, (androidx.compose.runtime.s) obj, iA2);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j(boolean z, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.A = z;
        this.B = aVar;
        this.y = i;
        this.z = i2;
    }
}
