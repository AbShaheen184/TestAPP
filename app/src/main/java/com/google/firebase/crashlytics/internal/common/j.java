package com.google.firebase.crashlytics.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final com.google.android.gms.common.api.internal.m a;
    public final i b;

    public j(com.google.android.gms.common.api.internal.m mVar, com.google.firebase.crashlytics.internal.persistence.c cVar) {
        this.a = mVar;
        this.b = new i(cVar);
    }

    public final void a(String str) {
        i iVar = this.b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.b, str)) {
                i.a(iVar.a, str, iVar.c);
                iVar.b = str;
            }
        }
    }
}
