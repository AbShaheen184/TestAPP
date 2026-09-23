package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.exoplayer.source.a0;
import com.google.firebase.messaging.n;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements com.google.android.datatransport.runtime.synchronization.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.android.datatransport.runtime.scheduling.persistence.g y;

    public /* synthetic */ e(com.google.android.datatransport.runtime.scheduling.persistence.g gVar, int i) {
        this.e = i;
        this.y = gVar;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public final Object e() {
        int i = this.e;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = this.y;
        boolean z = false;
        switch (i) {
            case 0:
                gVar.getClass();
                int i2 = com.google.android.datatransport.runtime.firebase.transport.a.e;
                n nVar = new n(20, z);
                nVar.z = null;
                nVar.A = new ArrayList();
                nVar.B = null;
                nVar.y = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = gVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    com.google.android.datatransport.runtime.firebase.transport.a aVar = (com.google.android.datatransport.runtime.firebase.transport.a) com.google.android.datatransport.runtime.scheduling.persistence.g.X(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a0(7, gVar, map, nVar));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            default:
                long jC = gVar.y.c() - gVar.A.d;
                SQLiteDatabase sQLiteDatabaseA2 = gVar.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jC)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            gVar.A(cursorRawQuery.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th2;
                }
        }
    }
}
