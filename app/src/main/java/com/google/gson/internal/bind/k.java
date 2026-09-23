package com.google.gson.internal.bind;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.gson.n {
    public static final j z;
    public final com.google.android.gms.measurement.internal.z e;
    public final ConcurrentHashMap y = new ConcurrentHashMap();

    static {
        int i = 0;
        z = new j(i);
        new j(i);
    }

    public k(com.google.android.gms.measurement.internal.z zVar) {
        this.e = zVar;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        com.google.gson.annotations.a aVar2 = (com.google.gson.annotations.a) aVar.a().getAnnotation(com.google.gson.annotations.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.e, eVar, aVar, aVar2, true);
    }

    public final com.google.gson.m b(com.google.android.gms.measurement.internal.z zVar, com.google.gson.e eVar, com.google.gson.reflect.a aVar, com.google.gson.annotations.a aVar2, boolean z2) {
        com.google.gson.m mVarA;
        Object objA = zVar.k(new com.google.gson.reflect.a(aVar2.value()), true).a();
        boolean zNullSafe = aVar2.nullSafe();
        if (objA instanceof com.google.gson.m) {
            mVarA = (com.google.gson.m) objA;
        } else {
            if (!(objA instanceof com.google.gson.n)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            com.google.gson.n nVar = (com.google.gson.n) objA;
            if (z2) {
                com.google.gson.n nVar2 = (com.google.gson.n) this.y.putIfAbsent(aVar.a(), nVar);
                if (nVar2 != null) {
                    nVar = nVar2;
                }
            }
            mVarA = nVar.a(eVar, aVar);
        }
        return (mVarA == null || !zNullSafe) ? mVarA : mVarA.a();
    }
}
