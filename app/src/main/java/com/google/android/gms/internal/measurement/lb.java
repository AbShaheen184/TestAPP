package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class lb extends c4 {
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(String str, int i) {
        super(str);
        this.z = i;
    }

    @Override // com.google.android.gms.internal.measurement.c4
    public final d5 a(b7 b7Var, List list) {
        switch (this.z) {
            case 0:
                return d5.m;
            case 1:
            case 2:
                return this;
            case 3:
                return new j3(Double.valueOf(0.0d));
            default:
                return d5.m;
        }
    }
}
