package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class uf extends w2 {
    public final /* synthetic */ int b;

    public /* synthetic */ uf(int i) {
        this.b = i;
    }

    @Override // com.google.android.gms.internal.measurement.w2
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new vf();
            case 1:
                return new xf();
            case 2:
                return new ng();
            default:
                return new pg();
        }
    }
}
