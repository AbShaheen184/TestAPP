package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        int iN0 = aVar.n0();
        if (iN0 != 9) {
            return iN0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.l0())) : Boolean.valueOf(aVar.d0());
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.f0((Boolean) obj);
    }
}
