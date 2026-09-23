package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        try {
            return new AtomicInteger(aVar.f0());
        } catch (NumberFormatException e) {
            throw new com.google.gson.h(e, 8);
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.e0(((AtomicInteger) obj).get());
    }
}
