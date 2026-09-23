package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.a1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ l2 e;
    public final /* synthetic */ androidx.compose.ui.focus.y y;
    public final /* synthetic */ androidx.compose.ui.focus.y z;

    public a0(l2 l2Var, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, a1 a1Var) {
        this.e = l2Var;
        this.y = yVar;
        this.z = yVar2;
        this.A = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            return Boolean.FALSE;
        }
        a1 a1Var = this.A;
        boolean z = true;
        if (((Boolean) a1Var.getValue()).booleanValue() || !(keyCode == 23 || keyCode == 66)) {
            boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            l2 l2Var = this.e;
            if (zBooleanValue && (keyCode == 4 || keyCode == 97)) {
                a1Var.setValue(Boolean.FALSE);
                if (l2Var != null) {
                    ((m1) l2Var).a();
                }
            } else {
                boolean zBooleanValue2 = ((Boolean) a1Var.getValue()).booleanValue();
                androidx.compose.ui.focus.y yVar = this.y;
                if (zBooleanValue2 && keyCode == 19) {
                    a1Var.setValue(Boolean.FALSE);
                    if (l2Var != null) {
                        ((m1) l2Var).a();
                    }
                    androidx.compose.ui.focus.y.a(yVar);
                } else {
                    boolean zBooleanValue3 = ((Boolean) a1Var.getValue()).booleanValue();
                    androidx.compose.ui.focus.y yVar2 = this.z;
                    if (zBooleanValue3 && keyCode == 20) {
                        a1Var.setValue(Boolean.FALSE);
                        if (l2Var != null) {
                            ((m1) l2Var).a();
                        }
                        androidx.compose.ui.focus.y.a(yVar2);
                    } else if (!((Boolean) a1Var.getValue()).booleanValue() && keyCode == 19) {
                        androidx.compose.ui.focus.y.a(yVar);
                    } else if (!((Boolean) a1Var.getValue()).booleanValue() && keyCode == 20) {
                        androidx.compose.ui.focus.y.a(yVar2);
                    } else if (((Boolean) a1Var.getValue()).booleanValue() || (keyCode != 21 && keyCode != 22)) {
                        z = false;
                    }
                }
            }
        } else {
            a1Var.setValue(Boolean.TRUE);
        }
        return Boolean.valueOf(z);
    }
}
