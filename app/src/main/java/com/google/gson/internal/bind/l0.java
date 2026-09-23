package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() != 9) {
            return new StringBuilder(aVar.l0());
        }
        aVar.j0();
        return null;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        StringBuilder sb = (StringBuilder) obj;
        bVar.h0(sb == null ? null : sb.toString());
    }
}
