package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends ec {
    public volatile boolean B;
    public final boolean C;

    public ac(String str, com.appsalt.internal.r0 r0Var, boolean z) {
        super(str, r0Var);
        this.C = z;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.C);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.B);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Boolean) obj).booleanValue();
    }
}
