package com.app.mlounge.ui.components;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ androidx.compose.ui.r B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ List z;

    public /* synthetic */ k0(String str, List list, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, int i) {
        this.y = str;
        this.z = list;
        this.A = lVar;
        this.B = rVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                b0.a(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj, this.B, this.y, this.z, this.A);
                break;
            default:
                ((Integer) obj2).getClass();
                b0.o(androidx.compose.runtime.t.A(1), (androidx.compose.runtime.s) obj, this.B, this.y, this.z, this.A);
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ k0(List list, String str, kotlin.jvm.functions.l lVar, androidx.compose.ui.r rVar, int i) {
        this.z = list;
        this.y = str;
        this.A = lVar;
        this.B = rVar;
    }
}
