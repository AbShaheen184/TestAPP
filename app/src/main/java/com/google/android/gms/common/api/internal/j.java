package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c {
    public final /* synthetic */ e a;

    public j(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final void a(boolean z) {
        com.google.android.gms.internal.base.g gVar = this.a.J;
        gVar.sendMessage(gVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
