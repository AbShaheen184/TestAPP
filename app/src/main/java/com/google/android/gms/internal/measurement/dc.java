package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends ec {
    public volatile String B;
    public final String C;

    public dc(String str, com.appsalt.internal.r0 r0Var, String str2) {
        super(str, r0Var);
        this.C = str2;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return str;
    }
}
