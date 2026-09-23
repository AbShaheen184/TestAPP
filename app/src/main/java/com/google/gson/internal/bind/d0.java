package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class d0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        try {
            return Long.valueOf(aVar.g0());
        } catch (NumberFormatException e) {
            throw new com.google.gson.h(e, 8);
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.Y();
        } else {
            bVar.e0(number.longValue());
        }
    }
}
