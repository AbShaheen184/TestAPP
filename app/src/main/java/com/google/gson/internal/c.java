package com.google.gson.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends com.google.gson.m {
    public volatile com.google.gson.m a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ com.google.gson.e d;
    public final /* synthetic */ com.google.gson.reflect.a e;
    public final /* synthetic */ d f;

    public c(d dVar, boolean z, boolean z2, com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        this.f = dVar;
        this.b = z;
        this.c = z2;
        this.d = eVar;
        this.e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (this.b) {
            aVar.t0();
            return null;
        }
        com.google.gson.m mVarE = this.a;
        if (mVarE == null) {
            com.google.gson.e eVar = this.d;
            com.google.gson.n nVar = this.f;
            com.google.gson.reflect.a aVar2 = this.e;
            com.google.gson.internal.bind.k kVar = eVar.d;
            kVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.y;
            if (nVar == com.google.gson.internal.bind.k.z) {
                nVar = kVar;
            } else {
                Class clsA = aVar2.a();
                com.google.gson.n nVar2 = (com.google.gson.n) concurrentHashMap.get(clsA);
                if (nVar2 == null) {
                    com.google.gson.annotations.a aVar3 = (com.google.gson.annotations.a) clsA.getAnnotation(com.google.gson.annotations.a.class);
                    if (aVar3 != null) {
                        Class clsValue = aVar3.value();
                        if (com.google.gson.n.class.isAssignableFrom(clsValue)) {
                            com.google.gson.n nVar3 = (com.google.gson.n) kVar.e.k(new com.google.gson.reflect.a(clsValue), true).a();
                            com.google.gson.n nVar4 = (com.google.gson.n) concurrentHashMap.putIfAbsent(clsA, nVar3);
                            if (nVar4 != null) {
                                nVar3 = nVar4;
                            }
                            if (nVar3 == nVar) {
                                nVar = kVar;
                            }
                        }
                    }
                } else if (nVar2 == nVar) {
                    nVar = kVar;
                }
            }
            Iterator it = eVar.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        mVarE = eVar.e(aVar2);
                        break;
                    }
                    com.google.firebase.platforminfo.b.f(aVar2, "GSON cannot serialize or deserialize ");
                    return null;
                }
                com.google.gson.n nVar5 = (com.google.gson.n) it.next();
                if (z) {
                    com.google.gson.m mVarA = nVar5.a(eVar, aVar2);
                    if (mVarA != null) {
                        mVarE = mVarA;
                        break;
                    }
                } else if (nVar5 == nVar) {
                    z = true;
                }
            }
            this.a = mVarE;
        }
        return mVarE.b(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        if (this.c) {
            bVar.Y();
            return;
        }
        com.google.gson.m mVarE = this.a;
        if (mVarE == null) {
            com.google.gson.e eVar = this.d;
            com.google.gson.n nVar = this.f;
            com.google.gson.reflect.a aVar = this.e;
            com.google.gson.internal.bind.k kVar = eVar.d;
            kVar.getClass();
            ConcurrentHashMap concurrentHashMap = kVar.y;
            if (nVar == com.google.gson.internal.bind.k.z) {
                nVar = kVar;
            } else {
                Class clsA = aVar.a();
                com.google.gson.n nVar2 = (com.google.gson.n) concurrentHashMap.get(clsA);
                if (nVar2 == null) {
                    com.google.gson.annotations.a aVar2 = (com.google.gson.annotations.a) clsA.getAnnotation(com.google.gson.annotations.a.class);
                    if (aVar2 != null) {
                        Class clsValue = aVar2.value();
                        if (com.google.gson.n.class.isAssignableFrom(clsValue)) {
                            com.google.gson.n nVar3 = (com.google.gson.n) kVar.e.k(new com.google.gson.reflect.a(clsValue), true).a();
                            com.google.gson.n nVar4 = (com.google.gson.n) concurrentHashMap.putIfAbsent(clsA, nVar3);
                            if (nVar4 != null) {
                                nVar3 = nVar4;
                            }
                            if (nVar3 == nVar) {
                                nVar = kVar;
                            }
                        }
                    }
                } else if (nVar2 == nVar) {
                    nVar = kVar;
                }
            }
            Iterator it = eVar.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        mVarE = eVar.e(aVar);
                        break;
                    } else {
                        com.google.firebase.platforminfo.b.f(aVar, "GSON cannot serialize or deserialize ");
                        return;
                    }
                }
                com.google.gson.n nVar5 = (com.google.gson.n) it.next();
                if (z) {
                    com.google.gson.m mVarA = nVar5.a(eVar, aVar);
                    if (mVarA != null) {
                        mVarE = mVarA;
                        break;
                    }
                } else if (nVar5 == nVar) {
                    z = true;
                }
            }
            this.a = mVarE;
        }
        mVarE.c(bVar, obj);
    }
}
