package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements com.google.gson.n {
    public final /* synthetic */ int e;

    public t(int i) {
        this.e = i;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        if (aVar.a() == Object.class) {
            return new u(eVar, this.e);
        }
        return null;
    }
}
