package com.app.mlounge.ui;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.navigation.y y;

    public /* synthetic */ l(androidx.navigation.y yVar, int i) {
        this.e = i;
        this.y = yVar;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.navigation.c0 c0Var = (androidx.navigation.c0) obj;
                c0Var.getClass();
                String str = (String) this.y.b.h().C.C;
                if (str != null) {
                    c0Var.a(str);
                    c0Var.d = -1;
                    c0Var.f = false;
                    c0Var.g = false;
                }
                return kotlin.y.a;
            case 1:
                androidx.navigation.c0 c0Var2 = (androidx.navigation.c0) obj;
                c0Var2.getClass();
                String str2 = (String) this.y.b.h().C.C;
                if (str2 != null) {
                    c0Var2.a(str2);
                    c0Var2.d = -1;
                    c0Var2.f = false;
                    c0Var2.g = true;
                    c0Var2.b = true;
                    c0Var2.c = true;
                }
                return kotlin.y.a;
            case 2:
                androidx.navigation.y.b(this.y, com.app.mlounge.ui.navigation.j.g.a(((Integer) obj).intValue()));
                break;
            default:
                androidx.navigation.y.b(this.y, com.app.mlounge.ui.navigation.t.g.a(((Integer) obj).intValue()));
                break;
        }
        return kotlin.y.a;
    }
}
