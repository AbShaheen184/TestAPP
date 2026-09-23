package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements com.google.gson.n {
    public final /* synthetic */ Class e;
    public final /* synthetic */ Class y;
    public final /* synthetic */ com.google.gson.m z;

    public x0(Class cls, Class cls2, com.google.gson.m mVar) {
        this.e = cls;
        this.y = cls2;
        this.z = mVar;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        if (clsA == this.e || clsA == this.y) {
            return this.z;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.y.getName() + "+" + this.e.getName() + ",adapter=" + this.z + "]";
    }
}
