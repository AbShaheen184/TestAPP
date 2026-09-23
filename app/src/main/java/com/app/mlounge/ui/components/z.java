package com.app.mlounge.ui.components;

import android.view.KeyEvent;
import androidx.compose.runtime.a1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements kotlin.jvm.functions.l {
    public final /* synthetic */ androidx.compose.ui.focus.y A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ l2 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.ui.focus.y z;

    public z(l2 l2Var, boolean z, androidx.compose.ui.focus.y yVar, androidx.compose.ui.focus.y yVar2, a1 a1Var) {
        this.e = l2Var;
        this.y = z;
        this.z = yVar;
        this.A = yVar2;
        this.B = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            return Boolean.FALSE;
        }
        a1 a1Var = this.B;
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
                androidx.compose.ui.focus.y yVar = this.A;
                androidx.compose.ui.focus.y yVar2 = this.z;
                boolean z2 = this.y;
                if (zBooleanValue2 && keyCode == 20) {
                    a1Var.setValue(Boolean.FALSE);
                    if (l2Var != null) {
                        ((m1) l2Var).a();
                    }
                    if (z2) {
                        androidx.compose.ui.focus.y.a(yVar);
                    } else {
                        androidx.compose.ui.focus.y.a(yVar2);
                    }
                } else if (((Boolean) a1Var.getValue()).booleanValue() && keyCode == 19) {
                    a1Var.setValue(Boolean.FALSE);
                    if (l2Var != null) {
                        ((m1) l2Var).a();
                    }
                } else if (((Boolean) a1Var.getValue()).booleanValue() || keyCode != 20) {
                    if (((Boolean) a1Var.getValue()).booleanValue() || (keyCode != 19 && keyCode != 21 && keyCode != 22)) {
                        z = false;
                    }
                } else if (z2) {
                    androidx.compose.ui.focus.y.a(yVar);
                } else {
                    androidx.compose.ui.focus.y.a(yVar2);
                }
            }
        } else {
            a1Var.setValue(Boolean.TRUE);
        }
        return Boolean.valueOf(z);
    }
}
