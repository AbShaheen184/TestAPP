package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends ec {
    public volatile long B;
    public final long C;

    public cc(String str, com.appsalt.internal.r0 r0Var, long j) {
        super(str, r0Var);
        this.C = j;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.C);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.B);
    }

    @Override // com.google.android.gms.internal.measurement.ec
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Long) obj).longValue();
    }
}
