package com.google.gson.internal.bind;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class a implements com.google.gson.n {
    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Type typeB = aVar.b();
        boolean z = typeB instanceof GenericArrayType;
        if (!z && (!(typeB instanceof Class) || !((Class) typeB).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) typeB).getGenericComponentType() : ((Class) typeB).getComponentType();
        return new b(eVar, eVar.e(new com.google.gson.reflect.a(genericComponentType)), com.google.gson.internal.h.g(genericComponentType));
    }
}
