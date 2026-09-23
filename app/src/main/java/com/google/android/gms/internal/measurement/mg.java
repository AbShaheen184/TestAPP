package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class mg extends og {
    public final /* synthetic */ og c;
    public final /* synthetic */ og d;

    public mg(og ogVar, og ogVar2) {
        this.c = ogVar;
        this.d = ogVar2;
    }

    @Override // com.google.android.gms.internal.measurement.og
    public final void a() {
        og ogVar = this.d;
        try {
            this.c.a();
        } finally {
            ogVar.a();
        }
    }
}
