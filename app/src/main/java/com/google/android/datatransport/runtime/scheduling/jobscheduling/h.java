package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appsalt.internal.k0;
import com.google.firebase.crashlytics.internal.model.k1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements com.google.android.datatransport.runtime.synchronization.b, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.firebase.inject.a {
    public final /* synthetic */ long e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(long j, Object obj, Object obj2) {
        this.y = obj;
        this.z = obj2;
        this.e = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) {
        String str = (String) this.y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((com.google.android.datatransport.runtime.firebase.transport.c) this.z).e;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.e;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // com.google.firebase.inject.a
    public void c(com.google.firebase.inject.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).d((String) this.y, this.e, (k1) this.z);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object e() {
        k0 k0Var = (k0) this.y;
        com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) this.z;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var.c;
        long jC = ((com.google.android.datatransport.runtime.time.a) k0Var.g).c() + this.e;
        gVar.getClass();
        gVar.n(new com.google.android.datatransport.runtime.scheduling.persistence.d(jC, kVar));
        return null;
    }

    public /* synthetic */ h(String str, long j, k1 k1Var) {
        this.y = str;
        this.e = j;
        this.z = k1Var;
    }
}
