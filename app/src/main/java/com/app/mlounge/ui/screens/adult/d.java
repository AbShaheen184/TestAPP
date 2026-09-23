package com.app.mlounge.ui.screens.adult;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.ui.screens.services.n;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ d(String str, boolean z, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = z;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        s sVar = (s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h.c(this.y, this.z, this.A, sVar, t.A(1));
                break;
            default:
                n.k(this.y, this.z, this.A, sVar, t.A(7));
                break;
        }
        return y.a;
    }
}
