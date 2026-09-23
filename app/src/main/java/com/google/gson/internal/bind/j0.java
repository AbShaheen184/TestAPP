package com.google.gson.internal.bind;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        try {
            com.google.gson.internal.h.c(strL0);
            return new BigInteger(strL0);
        } catch (NumberFormatException e) {
            StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("Failed parsing '", strL0, "' as BigInteger; at path ");
            sbX.append(aVar.Z());
            throw new com.google.gson.h(8, sbX.toString(), e);
        }
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        bVar.g0((BigInteger) obj);
    }
}
