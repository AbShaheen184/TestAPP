package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {
    public final n e;

    public /* synthetic */ r(n nVar) {
        super(null, null, false);
        this.e = nVar;
    }

    @Override // com.google.android.gms.common.s
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            kotlinx.coroutines.future.a.l(e);
            return null;
        }
    }
}
