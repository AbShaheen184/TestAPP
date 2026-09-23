package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.f1;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ f1 B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Context y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ b(Context context, a1 a1Var, a1 a1Var2, f1 f1Var) {
        this.y = context;
        this.z = a1Var;
        this.A = a1Var2;
        this.B = f1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Boolean bool = Boolean.TRUE;
                final a1 a1Var = this.z;
                a1Var.setValue(bool);
                final int i = 1;
                final f1 f1Var = this.B;
                kotlin.jvm.functions.l lVar = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.c
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        int i2 = i;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i2) {
                            case 0:
                                f1Var.h(fFloatValue);
                                break;
                            default:
                                f1Var.h(fFloatValue);
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                final Context context = this.y;
                new Thread(new androidx.work.impl.h(context, lVar, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.d
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        File file = (File) obj;
                        switch (i) {
                            case 0:
                                file.getClass();
                                a1Var.setValue(Boolean.FALSE);
                                b0.t(context, file);
                                break;
                            default:
                                file.getClass();
                                a1Var.setValue(Boolean.FALSE);
                                b0.t(context, file);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }, new e(a1Var, this.A, 1), 1)).start();
                break;
            default:
                a1 a1Var2 = this.z;
                a1Var2.setValue(null);
                Boolean bool2 = Boolean.TRUE;
                final a1 a1Var3 = this.A;
                a1Var3.setValue(bool2);
                final int i2 = 0;
                final f1 f1Var2 = this.B;
                kotlin.jvm.functions.l lVar2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.c
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i3) {
                            case 0:
                                f1Var2.h(fFloatValue);
                                break;
                            default:
                                f1Var2.h(fFloatValue);
                                break;
                        }
                        return kotlin.y.a;
                    }
                };
                final Context context2 = this.y;
                new Thread(new androidx.work.impl.h(context2, lVar2, new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.components.d
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        File file = (File) obj;
                        switch (i2) {
                            case 0:
                                file.getClass();
                                a1Var3.setValue(Boolean.FALSE);
                                b0.t(context2, file);
                                break;
                            default:
                                file.getClass();
                                a1Var3.setValue(Boolean.FALSE);
                                b0.t(context2, file);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }, new e(a1Var3, a1Var2, 0), 1)).start();
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ b(Context context, a1 a1Var, f1 f1Var, a1 a1Var2) {
        this.y = context;
        this.z = a1Var;
        this.B = f1Var;
        this.A = a1Var2;
    }
}
