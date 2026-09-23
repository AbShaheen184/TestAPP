package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appsalt.internal.k0;
import com.google.android.gms.tasks.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements com.google.android.datatransport.runtime.synchronization.b, com.google.firebase.concurrent.f {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ g(k0 k0Var, Iterable iterable, com.google.android.datatransport.runtime.k kVar, long j) {
        this.e = 0;
        this.z = k0Var;
        this.A = iterable;
        this.B = kVar;
        this.y = j;
    }

    @Override // com.google.firebase.concurrent.f
    public ScheduledFuture a(q qVar) {
        switch (this.e) {
            case 1:
                com.google.firebase.concurrent.e eVar = (com.google.firebase.concurrent.e) this.z;
                Runnable runnable = (Runnable) this.A;
                return eVar.y.schedule(new com.google.firebase.concurrent.d(eVar, runnable, qVar, 1), this.y, (TimeUnit) this.B);
            default:
                com.google.firebase.concurrent.e eVar2 = (com.google.firebase.concurrent.e) this.z;
                Callable callable = (Callable) this.A;
                return eVar2.y.schedule(new androidx.work.impl.c(1, eVar2, callable, qVar), this.y, (TimeUnit) this.B);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object e() {
        k0 k0Var = (k0) this.z;
        Iterable iterable = (Iterable) this.A;
        com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) this.B;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var.c;
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(com.google.android.datatransport.runtime.scheduling.persistence.g.N(iterable));
            SQLiteDatabase sQLiteDatabaseA = gVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gVar.A(cursorRawQuery.getInt(0), com.google.android.datatransport.runtime.firebase.transport.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        gVar.n(new com.google.android.datatransport.runtime.scheduling.persistence.d(((com.google.android.datatransport.runtime.time.a) k0Var.g).c() + this.y, kVar));
        return null;
    }

    public /* synthetic */ g(com.google.firebase.concurrent.e eVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.z = eVar;
        this.A = obj;
        this.y = j;
        this.B = timeUnit;
    }
}
