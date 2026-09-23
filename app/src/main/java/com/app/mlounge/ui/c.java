package com.app.mlounge.ui;

import androidx.compose.runtime.a1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ c(androidx.navigation.y yVar, a1 a1Var, int i) {
        this.e = i;
        this.y = yVar;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.e) {
            case 0:
                str.getClass();
                str2.getClass();
                a1 a1Var = this.z;
                if (!f0.b(a1Var)) {
                    a1Var.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.navigation.f.g.getClass();
                    androidx.navigation.y.b(this.y, "game_detail/" + str + "/" + str2);
                }
                break;
            default:
                str.getClass();
                str2.getClass();
                a1 a1Var2 = this.z;
                if (!f0.b(a1Var2)) {
                    a1Var2.setValue(Boolean.TRUE);
                    com.app.mlounge.ui.navigation.f.g.getClass();
                    androidx.navigation.y.b(this.y, "game_detail/" + str + "/" + str2);
                }
                break;
        }
        return kotlin.y.a;
    }
}
