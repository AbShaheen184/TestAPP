package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends com.google.gson.m {
    public final y a;

    public w(y yVar) {
        this.a = yVar;
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            aVar.g();
            while (aVar.a0()) {
                v vVar = (v) map.get(aVar.h0());
                if (vVar == null) {
                    aVar.t0();
                } else {
                    f(objD, aVar, vVar);
                }
            }
            aVar.L();
            return e(objD);
        } catch (IllegalAccessException e) {
            com.google.android.gms.dynamite.g gVar = com.google.gson.internal.reflect.c.a;
            androidx.media3.exoplayer.source.t0.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new com.google.gson.h(e2, 8);
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.Y();
            return;
        }
        bVar.n();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(bVar, obj);
            }
            bVar.L();
        } catch (IllegalAccessException e) {
            com.google.android.gms.dynamite.g gVar = com.google.gson.internal.reflect.c.a;
            androidx.media3.exoplayer.source.t0.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, com.google.gson.stream.a aVar, v vVar);
}
