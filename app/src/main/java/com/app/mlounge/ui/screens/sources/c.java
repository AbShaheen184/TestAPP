package com.app.mlounge.ui.screens.sources;

import com.app.mlounge.ui.viewmodel.m;
import com.app.mlounge.ui.viewmodel.w1;
import okhttp3.internal.g;
import okhttp3.x;
import okhttp3.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ w1 y;

    public /* synthetic */ c(w1 w1Var, int i) {
        this.e = i;
        this.y = w1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.n.setValue(new m(null, null, null, null, 63));
                break;
            case 1:
                this.y.n.setValue(new m(null, null, null, null, 63));
                break;
            case 2:
                this.y.m();
                break;
            default:
                x xVarA = this.y.f.a();
                xVarA.a(8L);
                xVarA.c(8L);
                xVarA.x = g.b("timeout", 10L);
                return new y(xVarA);
        }
        return kotlin.y.a;
    }
}
