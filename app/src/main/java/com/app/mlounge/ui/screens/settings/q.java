package com.app.mlounge.ui.screens.settings;

import androidx.compose.runtime.a1;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ q(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.setValue(Boolean.FALSE);
                break;
            case 1:
                this.y.setValue(Boolean.FALSE);
                break;
            case 2:
                this.y.setValue(Boolean.FALSE);
                break;
            case 3:
                this.y.setValue(Boolean.FALSE);
                break;
            case 4:
                this.y.setValue(Boolean.FALSE);
                break;
            case 5:
                this.y.setValue(Boolean.FALSE);
                break;
            case 6:
                a1 a1Var = this.y;
                File parentFile = ((File) a1Var.getValue()).getParentFile();
                if (parentFile != null) {
                    a1Var.setValue(parentFile);
                }
                return kotlin.y.a;
            case 7:
                this.y.setValue(Boolean.TRUE);
                break;
            case 8:
                this.y.setValue(Boolean.TRUE);
                break;
            case 9:
                a1 a1Var2 = this.y;
                a1Var2.setValue(Boolean.valueOf(!((Boolean) a1Var2.getValue()).booleanValue()));
                break;
            case 10:
                this.y.setValue(Boolean.TRUE);
                break;
            case 11:
                this.y.setValue(Boolean.FALSE);
                break;
            case 12:
                this.y.setValue(Boolean.TRUE);
                break;
            case 13:
                this.y.setValue(Boolean.TRUE);
                break;
            case 14:
                this.y.setValue(Boolean.TRUE);
                break;
            case 15:
                this.y.setValue(Boolean.FALSE);
                break;
            case 16:
                this.y.setValue(Boolean.FALSE);
                break;
            case 17:
                this.y.setValue(null);
                break;
            case 18:
                this.y.setValue(Boolean.FALSE);
                break;
            case 19:
                this.y.setValue(Boolean.FALSE);
                break;
            case 20:
                this.y.setValue(Boolean.TRUE);
                break;
            default:
                this.y.setValue(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
