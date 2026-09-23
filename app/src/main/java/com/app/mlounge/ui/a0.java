package com.app.mlounge.ui;

import androidx.compose.runtime.a1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ a0(a1 a1Var, a1 a1Var2, int i) {
        this.e = i;
        this.y = a1Var;
        this.z = a1Var2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Job job = (Job) this.y.getValue();
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.z.setValue(Boolean.FALSE);
                break;
            case 1:
                this.y.setValue(null);
                this.z.setValue(Boolean.FALSE);
                break;
            case 2:
                this.y.setValue(Boolean.FALSE);
                this.z.setValue(Boolean.TRUE);
                break;
            default:
                com.app.mlounge.ui.screens.settings.e0.a(this.y, this.z);
                break;
        }
        return kotlin.y.a;
    }
}
