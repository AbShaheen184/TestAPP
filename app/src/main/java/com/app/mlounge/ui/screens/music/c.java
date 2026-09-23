package com.app.mlounge.ui.screens.music;

import com.app.mlounge.ui.viewmodel.j0;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ j0 y;

    public /* synthetic */ c(j0 j0Var, int i) {
        this.e = i;
        this.y = j0Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.runtime.j0 j0Var = (androidx.compose.runtime.j0) obj;
        switch (this.e) {
            case 0:
                j0Var.getClass();
                return new g(this.y, 0);
            default:
                j0Var.getClass();
                return new g(this.y, 1);
        }
    }
}
