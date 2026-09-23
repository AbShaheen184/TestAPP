package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        try {
            String strL0 = aVar.l0();
            if (strL0.equals("null")) {
                return null;
            }
            return new URI(strL0);
        } catch (URISyntaxException e) {
            throw new com.google.gson.h(e, 8);
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bVar.h0(uri == null ? null : uri.toASCIIString());
    }
}
