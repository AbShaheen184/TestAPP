package com.app.mlounge.ui.components;

import androidx.compose.runtime.a1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ e(a1 a1Var, a1 a1Var2, int i) {
        this.e = i;
        this.y = a1Var;
        this.z = a1Var2;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        switch (this.e) {
            case 0:
                str.getClass();
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(str);
                break;
            case 1:
                str.getClass();
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(str);
                break;
            case 2:
                str.getClass();
                if (str.length() <= 4) {
                    for (int i = 0; i < str.length(); i++) {
                        if (Character.isDigit(str.charAt(i))) {
                        }
                    }
                    this.y.setValue(str);
                    this.z.setValue(null);
                }
                return kotlin.y.a;
            default:
                str.getClass();
                if (str.length() <= 4) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (Character.isDigit(str.charAt(i2))) {
                        }
                    }
                    this.y.setValue(str);
                    this.z.setValue(null);
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }
}
