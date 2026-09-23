package com.app.mlounge.ui.screens.services;

import androidx.compose.runtime.a1;
import java.io.File;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.l y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ l(kotlin.jvm.functions.l lVar, a1 a1Var, int i) {
        this.e = i;
        this.y = lVar;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(kotlin.text.k.g0((String) this.z.getValue()).toString());
                break;
            default:
                String absolutePath = ((File) this.z.getValue()).getAbsolutePath();
                absolutePath.getClass();
                this.y.invoke(absolutePath);
                break;
        }
        return y.a;
    }
}
