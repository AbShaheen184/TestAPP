package com.google.gson.internal.bind;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w {
    public final com.google.gson.internal.o b;

    public x(com.google.gson.internal.o oVar, y yVar) {
        super(yVar);
        this.b = oVar;
    }

    @Override // com.google.gson.internal.bind.w
    public final Object d() {
        return this.b.a();
    }

    @Override // com.google.gson.internal.bind.w
    public final void f(Object obj, com.google.gson.stream.a aVar, v vVar) throws IllegalAccessException {
        Field field = vVar.b;
        Object objB = vVar.f.b(aVar);
        if (objB == null && vVar.g) {
            return;
        }
        if (vVar.h) {
            throw new com.google.gson.h("Cannot set value of 'static final' ".concat(com.google.gson.internal.reflect.c.d(field, false)), 8);
        }
        field.set(obj, objB);
    }

    @Override // com.google.gson.internal.bind.w
    public final Object e(Object obj) {
        return obj;
    }
}
