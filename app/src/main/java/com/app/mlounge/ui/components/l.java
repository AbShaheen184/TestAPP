package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l(boolean z, kotlin.jvm.functions.p pVar, int i) {
        this.e = 2;
        this.A = z;
        this.z = pVar;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = androidx.compose.runtime.t.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.z, 48, this.A, (androidx.compose.runtime.s) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = androidx.compose.runtime.t.A(49);
                b0.d(this.y, (androidx.compose.ui.r) this.z, 48, this.A, (androidx.compose.runtime.s) obj, iA2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA3 = androidx.compose.runtime.t.A(this.y | 1);
                androidx.room.t.b(this.A, (kotlin.jvm.functions.p) this.z, (androidx.compose.runtime.s) obj, iA3);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ l(int i, int i2, int i3, androidx.compose.ui.r rVar, boolean z) {
        this.e = i3;
        this.y = i;
        this.z = rVar;
        this.A = z;
    }
}
