package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.k;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements e {
    public final /* synthetic */ long e;
    public final /* synthetic */ k y;

    public /* synthetic */ d(long j, k kVar) {
        this.e = j;
        this.y = kVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.e));
        k kVar = this.y;
        String str = kVar.a;
        com.google.android.datatransport.d dVar = kVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
