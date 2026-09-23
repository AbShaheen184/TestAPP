package androidx.media3.exoplayer.source;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements androidx.media3.common.util.h, androidx.media3.exoplayer.trackselection.l, androidx.concurrent.futures.j, com.google.android.datatransport.runtime.synchronization.b, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.android.gms.tasks.b, com.google.android.gms.tasks.h {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a0(kotlin.coroutines.j jVar, CoroutineStart coroutineStart, kotlin.jvm.functions.p pVar) {
        this.e = 2;
        this.y = jVar;
        this.z = coroutineStart;
        this.A = (kotlin.coroutines.jvm.internal.i) pVar;
    }

    @Override // androidx.media3.exoplayer.trackselection.l
    public com.google.common.collect.a1 a(int i, androidx.media3.common.w0 w0Var, int[] iArr) {
        androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) this.y;
        String str = (String) this.z;
        String str2 = (String) this.A;
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        for (int i2 = 0; i2 < w0Var.a; i2++) {
            d0VarK.b(new androidx.media3.exoplayer.trackselection.k(i, w0Var, i2, jVar, iArr[i2], str, str2));
        }
        return d0VarK.g();
    }

    @Override // androidx.media3.common.util.h
    public void accept(Object obj) {
        androidx.media3.exoplayer.drm.d dVar = (androidx.media3.exoplayer.drm.d) this.y;
        ((c0) obj).f(dVar.a, (v) this.z, (s) this.A);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        com.google.android.datatransport.runtime.firebase.transport.c cVar;
        com.google.android.datatransport.runtime.firebase.transport.c cVar2;
        int i = this.e;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        com.google.android.datatransport.runtime.firebase.transport.c cVar3 = com.google.android.datatransport.runtime.firebase.transport.c.CACHE_FULL;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        int i7 = 0;
        switch (i) {
            case 5:
                com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) obj4;
                com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) obj3;
                com.google.android.datatransport.runtime.m mVar = iVar.c;
                String str = iVar.a;
                com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                com.google.android.datatransport.runtime.scheduling.persistence.a aVar = gVar.A;
                if (jSimpleQueryForLong >= aVar.a) {
                    gVar.A(1L, cVar3, str);
                    return -1L;
                }
                Long lG = com.google.android.datatransport.runtime.scheduling.persistence.g.g(sQLiteDatabase, kVar);
                if (lG != null) {
                    jInsert = lG.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", kVar.a);
                    contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(kVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = kVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = aVar.e;
                byte[] bArr2 = mVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.e));
                contentValues2.put("payload_encoding", mVar.a.a);
                contentValues2.put("code", iVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar.g);
                contentValues2.put("pseudonymous_id", iVar.h);
                contentValues2.put("experiment_ids_clear_blob", iVar.i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(ES6Iterator.VALUE_PROPERTY, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 6:
                com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                com.google.android.datatransport.runtime.k kVar2 = (com.google.android.datatransport.runtime.k) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    androidx.compose.ui.node.a1 a1Var = new androidx.compose.ui.node.a1();
                    a1Var.g = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        com.google.firebase.platforminfo.b.h("Null transportName");
                        return null;
                    }
                    a1Var.b = string;
                    a1Var.e = Long.valueOf(cursor2.getLong(i5));
                    a1Var.f = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        a1Var.d = new com.google.android.datatransport.runtime.m(string2 == null ? com.google.android.datatransport.runtime.scheduling.persistence.g.C : new com.google.android.datatransport.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        com.google.android.datatransport.c cVar4 = string3 == null ? com.google.android.datatransport.runtime.scheduling.persistence.g.C : new com.google.android.datatransport.c(string3);
                        Cursor cursorQuery = gVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            a1Var.d = new com.google.android.datatransport.runtime.m(cVar4, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        a1Var.c = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        a1Var.h = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        a1Var.i = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        a1Var.j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        a1Var.k = cursor2.getBlob(11);
                    }
                    arrayList.add(new com.google.android.datatransport.runtime.scheduling.persistence.b(j, kVar2, a1Var.c()));
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) obj4;
                HashMap map = (HashMap) obj3;
                com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) obj2;
                ArrayList arrayList4 = (ArrayList) nVar.A;
                Cursor cursor3 = (Cursor) obj;
                gVar3.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    com.google.android.datatransport.runtime.firebase.transport.c cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.MESSAGE_TOO_OLD;
                        } else if (i12 == 2) {
                            cVar = cVar3;
                            cVar2 = cVar;
                        } else if (i12 == i4) {
                            cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.PAYLOAD_TOO_BIG;
                        } else if (i12 == i3) {
                            cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.MAX_RETRIES_REACHED;
                        } else if (i12 == i2) {
                            cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.INVALID_PAYLOD;
                        } else if (i12 == 6) {
                            cVar5 = com.google.android.datatransport.runtime.firebase.transport.c.SERVER_ERROR;
                        } else {
                            androidx.room.t.m("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                        }
                        cVar2 = cVar3;
                        cVar = cVar5;
                    } else {
                        cVar2 = cVar3;
                        cVar = cVar5;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new com.google.android.datatransport.runtime.firebase.transport.d(j2, cVar));
                    cVar3 = cVar2;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = com.google.android.datatransport.runtime.firebase.transport.e.c;
                    new ArrayList();
                    arrayList4.add(new com.google.android.datatransport.runtime.firebase.transport.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jC = gVar3.y.c();
                SQLiteDatabase sQLiteDatabaseA = gVar3.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        com.google.android.datatransport.runtime.firebase.transport.g gVar4 = new com.google.android.datatransport.runtime.firebase.transport.g(cursorRawQuery.getLong(0), jC);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        nVar.z = gVar4;
                        nVar.B = new com.google.android.datatransport.runtime.firebase.transport.b(new com.google.android.datatransport.runtime.firebase.transport.f(gVar3.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar3.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), com.google.android.datatransport.runtime.scheduling.persistence.a.f.a));
                        nVar.y = (String) gVar3.B.get();
                        return new com.google.android.datatransport.runtime.firebase.transport.a((com.google.android.datatransport.runtime.firebase.transport.g) nVar.z, Collections.unmodifiableList(arrayList4), (com.google.android.datatransport.runtime.firebase.transport.b) nVar.B, (String) nVar.y);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseA.endTransaction();
                    throw th4;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.p] */
    @Override // androidx.concurrent.futures.j
    public Object b(androidx.concurrent.futures.i iVar) {
        switch (this.e) {
            case 2:
                kotlin.coroutines.j jVar = (kotlin.coroutines.j) this.y;
                CoroutineStart coroutineStart = (CoroutineStart) this.z;
                ?? r1 = (kotlin.coroutines.jvm.internal.i) this.A;
                androidx.work.p pVar = new androidx.work.p((Job) jVar.get(Job.Key), 0);
                androidx.concurrent.futures.n nVar = iVar.c;
                if (nVar != null) {
                    nVar.a(pVar, androidx.work.l.e);
                }
                return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(jVar), null, coroutineStart, new androidx.room.coroutines.c0((kotlin.jvm.functions.p) r1, iVar, (kotlin.coroutines.d) null), 1, null);
            default:
                Executor executor = (Executor) this.y;
                String str = (String) this.z;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.A;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                androidx.work.q qVar = new androidx.work.q(atomicBoolean, 0);
                androidx.concurrent.futures.n nVar2 = iVar.c;
                if (nVar2 != null) {
                    nVar2.a(qVar, androidx.work.l.e);
                }
                executor.execute(new androidx.work.r(atomicBoolean, iVar, aVar, 0));
                return str;
        }
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        com.google.android.gms.tasks.j jVar = (com.google.android.gms.tasks.j) this.y;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.z;
        com.google.android.gms.tasks.a aVar = (com.google.android.gms.tasks.a) this.A;
        if (iVar.h()) {
            jVar.d(iVar.f());
        } else if (iVar.e() != null) {
            jVar.c(iVar.e());
        } else if (atomicBoolean.getAndSet(true)) {
            ((com.google.android.gms.tasks.s) aVar.a.y).l(null);
        }
        return org.jsoup.helper.n.o(null);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object e() {
        com.google.android.datatransport.runtime.scheduling.a aVar = (com.google.android.datatransport.runtime.scheduling.a) this.y;
        com.google.android.datatransport.runtime.k kVar = (com.google.android.datatransport.runtime.k) this.z;
        com.google.android.datatransport.runtime.i iVar = (com.google.android.datatransport.runtime.i) this.A;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = aVar.d;
        gVar.getClass();
        com.google.android.datatransport.d dVar = kVar.c;
        String str = iVar.a;
        String str2 = kVar.a;
        String strW = androidx.room.t.w("SQLiteEventStore");
        if (Log.isLoggable(strW, 3)) {
            Log.d(strW, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.n(new a0(5, gVar, iVar, kVar))).getClass();
        aVar.a.u(kVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.s g(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.y;
        String str = (String) this.z;
        androidx.compose.ui.input.pointer.util.b bVar = (androidx.compose.ui.input.pointer.util.b) this.A;
        String str2 = (String) obj;
        com.appsalt.internal.z zVarC = FirebaseMessaging.c(firebaseMessaging.b);
        com.google.firebase.g gVar = firebaseMessaging.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.b) ? "" : gVar.d();
        String strB = firebaseMessaging.h.b();
        synchronized (zVarC) {
            String strB2 = androidx.compose.ui.input.pointer.util.b.b(System.currentTimeMillis(), str2, strB);
            if (strB2 != null) {
                SharedPreferences.Editor editorEdit = zVarC.a.edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strB2);
                editorEdit.commit();
            }
        }
        if (bVar == null || !str2.equals((String) bVar.b)) {
            com.google.firebase.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.f(firebaseMessaging.b).b(intent);
            }
        }
        return org.jsoup.helper.n.o(str2);
    }

    public /* synthetic */ a0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
