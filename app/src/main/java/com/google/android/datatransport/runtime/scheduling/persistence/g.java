package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.media3.exoplayer.source.a0;
import com.google.android.datatransport.runtime.k;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable {
    public static final com.google.android.datatransport.c C = new com.google.android.datatransport.c("proto");
    public final a A;
    public final javax.inject.a B;
    public final i e;
    public final com.google.android.datatransport.runtime.time.a y;
    public final com.google.android.datatransport.runtime.time.a z;

    public g(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, a aVar3, i iVar, javax.inject.a aVar4) {
        this.e = iVar;
        this.y = aVar;
        this.z = aVar2;
        this.A = aVar3;
        this.B = aVar4;
    }

    public static String N(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object X(Cursor cursor, e eVar) {
        try {
            return eVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long g(SQLiteDatabase sQLiteDatabase, k kVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(kVar.a, String.valueOf(com.google.android.datatransport.runtime.util.a.a(kVar.c))));
        byte[] bArr = kVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final void A(long j, com.google.android.datatransport.runtime.firebase.transport.c cVar, String str) {
        n(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(j, str, cVar));
    }

    public final Object L(com.google.android.datatransport.runtime.synchronization.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        com.google.android.datatransport.runtime.time.a aVar = this.z;
        long jC = aVar.c();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objE = bVar.e();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objE;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.c() >= ((long) this.A.c) + jC) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase a() {
        i iVar = this.e;
        Objects.requireNonNull(iVar);
        com.google.android.datatransport.runtime.time.a aVar = this.z;
        long jC = aVar.c();
        while (true) {
            try {
                return iVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.c() >= ((long) this.A.c) + jC) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final Object n(e eVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = eVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final ArrayList x(SQLiteDatabase sQLiteDatabase, k kVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long lG = g(sQLiteDatabase, kVar);
        if (lG == null) {
            return arrayList;
        }
        X(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lG.toString()}, null, null, null, String.valueOf(i)), new a0(6, this, arrayList, kVar));
        return arrayList;
    }
}
