package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class b1 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        try {
            int iF0 = aVar.f0();
            if (iF0 <= 65535 && iF0 >= -32768) {
                return Short.valueOf((short) iF0);
            }
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("Lossy conversion from ", iF0, " to short; at path ");
            sbV.append(aVar.Z());
            throw new com.google.gson.h(sbV.toString(), 8);
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
            bVar.e0(number.shortValue());
        }
    }
}
