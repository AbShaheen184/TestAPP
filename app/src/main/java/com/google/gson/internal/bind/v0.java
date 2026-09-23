package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements com.google.gson.n {
    public final /* synthetic */ int e;
    public final /* synthetic */ Class y;
    public final /* synthetic */ com.google.gson.m z;

    public /* synthetic */ v0(Class cls, com.google.gson.m mVar, int i) {
        this.e = i;
        this.y = cls;
        this.z = mVar;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        switch (this.e) {
            case 0:
                if (aVar.a() == this.y) {
                    return this.z;
                }
                return null;
            default:
                Class<?> clsA = aVar.a();
                if (this.y.isAssignableFrom(clsA)) {
                    return new c(this, clsA);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "Factory[type=" + this.y.getName() + ",adapter=" + this.z + "]";
            default:
                return "Factory[typeHierarchy=" + this.y.getName() + ",adapter=" + this.z + "]";
        }
    }
}
