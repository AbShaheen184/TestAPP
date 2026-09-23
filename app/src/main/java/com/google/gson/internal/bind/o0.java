package com.google.gson.internal.bind;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        if (strL0.equals("null")) {
            return null;
        }
        return new URL(strL0);
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        URL url = (URL) obj;
        bVar.h0(url == null ? null : url.toExternalForm());
    }
}
