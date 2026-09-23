package com.app.mlounge.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.r y;

    public /* synthetic */ p(androidx.compose.ui.r rVar, int i, int i2) {
        this.e = i2;
        this.y = rVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f0.a(this.y, sVar, androidx.compose.runtime.t.A(7));
                break;
            default:
                com.app.mlounge.ui.components.b0.n(this.y, sVar, androidx.compose.runtime.t.A(1));
                break;
        }
        return kotlin.y.a;
    }
}
