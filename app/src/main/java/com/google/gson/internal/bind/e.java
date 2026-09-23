package com.google.gson.internal.bind;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class e implements com.google.gson.n {
    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        if (aVar.a() == Date.class) {
            return new g();
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
