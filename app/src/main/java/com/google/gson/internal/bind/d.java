package com.google.gson.internal.bind;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.google.gson.n {
    public final /* synthetic */ int e;
    public final com.google.android.gms.measurement.internal.z y;

    public /* synthetic */ d(com.google.android.gms.measurement.internal.z zVar, int i) {
        this.e = i;
        this.y = zVar;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Type[] actualTypeArguments;
        int i = this.e;
        com.google.android.gms.measurement.internal.z zVar = this.y;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type typeB = aVar.b();
                Class clsA = aVar.a();
                if (!Collection.class.isAssignableFrom(clsA)) {
                    return null;
                }
                Type typeH = com.google.gson.internal.h.h(typeB, clsA, Collection.class);
                type = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new c(new q(eVar, eVar.e(new com.google.gson.reflect.a(type)), type), zVar.k(aVar, false));
            default:
                Type typeB2 = aVar.b();
                Class clsA2 = aVar.a();
                if (!Map.class.isAssignableFrom(clsA2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(clsA2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeH2 = com.google.gson.internal.h.h(typeB2, clsA2, Map.class);
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type2 = actualTypeArguments[0];
                Type type3 = actualTypeArguments[1];
                return new q(this, new q(eVar, (type2 == Boolean.TYPE || type2 == Boolean.class) ? f1.c : eVar.e(new com.google.gson.reflect.a(type2)), type2), new q(eVar, eVar.e(new com.google.gson.reflect.a(type3)), type3), zVar.k(aVar, false));
        }
    }
}
