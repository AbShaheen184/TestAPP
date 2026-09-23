package com.google.gson.internal.bind;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class h implements com.google.gson.n {
    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Class clsA = aVar.a();
        if (!Enum.class.isAssignableFrom(clsA) || clsA == Enum.class) {
            return null;
        }
        if (!clsA.isEnum()) {
            clsA = clsA.getSuperclass();
        }
        return new i(clsA);
    }
}
