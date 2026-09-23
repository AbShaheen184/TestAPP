package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends w6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ a7 C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(a7 a7Var, Exception exc) {
        super(a7Var, false);
        this.B = 3;
        this.D = exc;
        this.C = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        switch (this.B) {
            case 0:
                z5 z5Var = this.C.f;
                com.google.android.gms.common.internal.x.g(z5Var);
                z5Var.setUserProperty("fcm", "_ln", new com.google.android.gms.dynamic.b(this.D), true, this.e);
                break;
            case 1:
                z5 z5Var2 = this.C.f;
                com.google.android.gms.common.internal.x.g(z5Var2);
                z5Var2.setConditionalUserProperty((Bundle) this.D, this.e);
                break;
            case 2:
                z5 z5Var3 = this.C.f;
                com.google.android.gms.common.internal.x.g(z5Var3);
                z5Var3.retrieveAndUploadBatches(new r6(this, (com.google.common.util.concurrent.k0) this.D));
                break;
            case 3:
                z5 z5Var4 = this.C.f;
                com.google.android.gms.common.internal.x.g(z5Var4);
                z5Var4.logHealthData(5, "Error with data collection. Data lost.", new com.google.android.gms.dynamic.b((Exception) this.D), new com.google.android.gms.dynamic.b(null), new com.google.android.gms.dynamic.b(null));
                break;
            default:
                z5 z5Var5 = this.C.f;
                com.google.android.gms.common.internal.x.g(z5Var5);
                z5Var5.registerOnMeasurementEventListener((x6) this.D);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(a7 a7Var, Object obj, int i) {
        super(a7Var, true);
        this.B = i;
        this.D = obj;
        this.C = a7Var;
    }
}
