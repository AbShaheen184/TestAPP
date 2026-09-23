package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.gson.m {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final com.google.gson.m c;
    public final Object d;

    public q(com.google.gson.e eVar, com.google.gson.m mVar, Type type) {
        this.b = eVar;
        this.c = mVar;
        this.d = type;
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                int iN0 = aVar.n0();
                if (iN0 == 9) {
                    aVar.j0();
                    return null;
                }
                Map map = (Map) ((com.google.gson.internal.o) this.d).a();
                if (iN0 == 1) {
                    aVar.a();
                    while (aVar.a0()) {
                        aVar.a();
                        Object objB = ((q) this.b).c.b(aVar);
                        if (map.put(objB, ((q) this.c).c.b(aVar)) != null) {
                            throw new com.google.gson.h(androidx.compose.runtime.j.f(objB, "duplicate key: "), 8);
                        }
                        aVar.A();
                    }
                    aVar.A();
                } else {
                    aVar.g();
                    while (aVar.a0()) {
                        com.google.android.gms.measurement.internal.a0.T.getClass();
                        if (aVar instanceof n) {
                            n nVar = (n) aVar;
                            nVar.w0(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) nVar.A0()).next();
                            nVar.C0(entry.getValue());
                            nVar.C0(new com.google.gson.k((String) entry.getKey()));
                        } else {
                            int iX = aVar.D;
                            if (iX == 0) {
                                iX = aVar.x();
                            }
                            if (iX == 13) {
                                aVar.D = 9;
                            } else if (iX == 12) {
                                aVar.D = 8;
                            } else {
                                if (iX != 14) {
                                    throw aVar.v0("a name");
                                }
                                aVar.D = 10;
                            }
                        }
                        Object objB2 = ((q) this.b).c.b(aVar);
                        if (map.put(objB2, ((q) this.c).c.b(aVar)) != null) {
                            throw new com.google.gson.h(androidx.compose.runtime.j.f(objB2, "duplicate key: "), 8);
                        }
                    }
                    aVar.L();
                }
                return map;
            default:
                return this.c.b(aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        com.google.gson.m mVarD;
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                q qVar = (q) this.c;
                if (map == null) {
                    bVar.Y();
                } else {
                    bVar.n();
                    for (Map.Entry entry : map.entrySet()) {
                        bVar.N(String.valueOf(entry.getKey()));
                        qVar.c(bVar, entry.getValue());
                    }
                    bVar.L();
                }
                break;
            default:
                Type type = (Type) this.d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                com.google.gson.m mVar = this.c;
                if (type2 != type) {
                    com.google.gson.m mVarE = ((com.google.gson.e) this.b).e(new com.google.gson.reflect.a(type2));
                    if (mVarE instanceof w) {
                        com.google.gson.m mVar2 = mVar;
                        while ((mVar2 instanceof b0) && (mVarD = ((b0) mVar2).d()) != mVar2) {
                            mVar2 = mVarD;
                        }
                        if (mVar2 instanceof w) {
                            mVar = mVarE;
                        }
                    } else {
                        mVar = mVarE;
                    }
                }
                mVar.c(bVar, obj);
                break;
        }
    }

    public q(d dVar, q qVar, q qVar2, com.google.gson.internal.o oVar) {
        this.b = qVar;
        this.c = qVar2;
        this.d = oVar;
    }
}
