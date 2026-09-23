package com.app.mlounge.ui.screens.music;

import androidx.compose.runtime.i0;
import com.app.mlounge.ui.viewmodel.j0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ g(j0 j0Var, int i) {
        this.a = i;
        this.b = j0Var;
    }

    @Override // androidx.compose.runtime.i0
    public final void dispose() {
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                j0Var.x.setValue(null);
                j0Var.z.setValue(null);
                break;
            default:
                j0 j0Var2 = this.b;
                j0Var2.x.setValue(null);
                j0Var2.z.setValue(null);
                break;
        }
    }
}
