package com.app.mlounge.ui.screens.settings;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ w(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = pVar;
        this.z = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                e0.f(this.y, this.z, sVar, androidx.compose.runtime.t.A(49));
                break;
            default:
                e0.g(this.y, this.z, sVar, androidx.compose.runtime.t.A(49));
                break;
        }
        return kotlin.y.a;
    }
}
