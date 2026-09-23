package com.google.gson.internal.bind;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.gson.m {
    public static final t c = new t(1);
    public final com.google.gson.e a;
    public final int b;

    public u(com.google.gson.e eVar, int i) {
        this.a = eVar;
        this.b = i;
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iN0 = aVar.n0();
        int iE = androidx.constraintlayout.core.g.e(iN0);
        if (iE == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iE != 2) {
            arrayList = null;
        } else {
            aVar.g();
            arrayList = new com.google.gson.internal.n(true);
        }
        if (arrayList == null) {
            return d(iN0, aVar);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.a0()) {
                String strH0 = arrayList instanceof Map ? aVar.h0() : null;
                int iN1 = aVar.n0();
                int iE2 = androidx.constraintlayout.core.g.e(iN1);
                if (iE2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iE2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.g();
                    arrayList2 = new com.google.gson.internal.n(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(iN1, aVar);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strH0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.A();
                } else {
                    aVar.L();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.Y();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.e eVar = this.a;
        eVar.getClass();
        com.google.gson.m mVarE = eVar.e(new com.google.gson.reflect.a(cls));
        if (!(mVarE instanceof u)) {
            mVarE.c(bVar, obj);
        } else {
            bVar.n();
            bVar.L();
        }
    }

    public final Serializable d(int i, com.google.gson.stream.a aVar) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE == 5) {
            return aVar.l0();
        }
        if (iE == 6) {
            return com.google.android.datatransport.runtime.a.b(this.b, aVar);
        }
        if (iE == 7) {
            return Boolean.valueOf(aVar.d0());
        }
        if (iE == 8) {
            aVar.j0();
            return null;
        }
        kotlinx.coroutines.future.a.u("Unexpected token: ".concat(com.google.android.datatransport.runtime.a.x(i)));
        return null;
    }
}
