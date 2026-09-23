package com.google.gson;

import com.google.gson.internal.bind.b0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class d extends b0 {
    public m a = null;

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.b(aVar);
        }
        kotlinx.coroutines.future.a.u("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        m mVar = this.a;
        if (mVar != null) {
            mVar.c(bVar, obj);
        } else {
            kotlinx.coroutines.future.a.u("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.internal.bind.b0
    public final m d() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar;
        }
        kotlinx.coroutines.future.a.u("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
