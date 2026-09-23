package com.google.gson.internal.sql;

import com.google.gson.m;
import com.google.gson.n;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c implements n {
    @Override // com.google.gson.n
    public final m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        if (aVar.a() != Timestamp.class) {
            return null;
        }
        eVar.getClass();
        return new d(eVar.e(new com.google.gson.reflect.a(Date.class)));
    }
}
