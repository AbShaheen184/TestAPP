package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class bc extends ec {
    public volatile double B;

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return Double.valueOf(-3.0d);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (Double) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return Double.valueOf(this.B);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Double) obj).doubleValue();
    }
}
