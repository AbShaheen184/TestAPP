package com.google.gson.internal.sql;

import com.google.gson.m;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m {
    public static final c b = new c();
    public final m a;

    public d(m mVar) {
        this.a = mVar;
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) {
        Date date = (Date) this.a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) {
        this.a.c(bVar, (Timestamp) obj);
    }
}
