package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;
    public final javax.inject.a b;

    public /* synthetic */ c(javax.inject.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        switch (this.a) {
            case 0:
                String packageName = ((Context) this.b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                com.google.firebase.platforminfo.b.h("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new i(Integer.valueOf(i.A).intValue(), (Context) this.b.get(), "com.google.android.datatransport.events");
        }
    }
}
