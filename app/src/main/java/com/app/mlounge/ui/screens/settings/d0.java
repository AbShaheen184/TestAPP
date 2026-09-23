package com.app.mlounge.ui.screens.settings;

import android.view.KeyEvent;
import androidx.compose.runtime.a1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String y;
    public final /* synthetic */ a1 z;

    public d0(boolean z, String str, a1 a1Var) {
        this.e = z;
        this.y = str;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && !this.e && (keyEvent.getKeyCode() == 96 || keyEvent.getKeyCode() == 23 || keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160)) {
            this.z.setValue(this.y);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
