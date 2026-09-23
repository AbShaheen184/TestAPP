package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class u0 extends com.google.gson.m {
    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.l0(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (strNextToken2 == null && strNextToken3 == null) {
            return new Locale(strNextToken);
        }
        return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        bVar.h0(locale == null ? null : locale.toString());
    }
}
