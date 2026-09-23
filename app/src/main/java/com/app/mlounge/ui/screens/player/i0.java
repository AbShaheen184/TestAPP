package com.app.mlounge.ui.screens.player;

import android.view.KeyEvent;
import androidx.compose.runtime.f1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ long A;
    public final /* synthetic */ kotlin.jvm.functions.l B;
    public final /* synthetic */ androidx.compose.runtime.a1 C;
    public final /* synthetic */ f1 D;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ float z;

    public i0(boolean z, kotlin.jvm.functions.a aVar, float f, long j, kotlin.jvm.functions.l lVar, androidx.compose.runtime.a1 a1Var, f1 f1Var) {
        this.e = z;
        this.y = aVar;
        this.z = f;
        this.A = j;
        this.B = lVar;
        this.C = a1Var;
        this.D = f1Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        long j;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (androidx.compose.ui.input.key.c.c(keyEvent) == 2 && this.e) {
            int keyCode = keyEvent.getKeyCode();
            kotlin.jvm.functions.a aVar = this.y;
            f1 f1Var = this.D;
            androidx.compose.runtime.a1 a1Var = this.C;
            if (keyCode != 66) {
                float fG = this.z;
                switch (keyCode) {
                    case 21:
                        aVar.invoke();
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            fG = f1Var.g();
                        }
                        f1Var.h(fG - 0.02f);
                        a1Var.setValue(Boolean.TRUE);
                        break;
                    case 22:
                        aVar.invoke();
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            fG = f1Var.g();
                        }
                        f1Var.h(fG + 0.02f);
                        a1Var.setValue(Boolean.TRUE);
                        break;
                    case 23:
                        if (((Boolean) a1Var.getValue()).booleanValue()) {
                            j = this.A;
                            if (j > 0) {
                                this.B.invoke(Long.valueOf((long) (f1Var.g() * j)));
                                a1Var.setValue(Boolean.FALSE);
                            }
                        }
                        aVar.invoke();
                        break;
                }
                z = true;
            } else {
                if (((Boolean) a1Var.getValue()).booleanValue()) {
                    j = this.A;
                    if (j > 0) {
                        this.B.invoke(Long.valueOf((long) (f1Var.g() * j)));
                        a1Var.setValue(Boolean.FALSE);
                    }
                }
                aVar.invoke();
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
