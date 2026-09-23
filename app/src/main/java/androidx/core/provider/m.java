package androidx.core.provider;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.room.r;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.af;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.da;
import com.google.android.gms.internal.measurement.h6;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.qf;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.ue;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.d2;
import com.google.android.gms.measurement.internal.i0;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.i4;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.t;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.w1;
import com.google.android.gms.tasks.s;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.k0;
import com.google.common.util.concurrent.m0;
import com.google.common.util.concurrent.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {
    public Object A;
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public m(m3 m3Var, AtomicReference atomicReference, r4 r4Var) {
        this.e = 10;
        this.y = atomicReference;
        this.z = r4Var;
        Objects.requireNonNull(m3Var);
        this.A = m3Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x034e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0354  */
    /* JADX WARN: Code duplicated, block: B:117:0x0365  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0371  */
    /* JADX WARN: Code duplicated, block: B:124:0x0391  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e5 A[Catch: SQLiteException -> 0x03f0, TRY_LEAVE, TryCatch #18 {SQLiteException -> 0x03f0, blocks: (B:125:0x03c6, B:127:0x03e5), top: B:278:0x03c6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0414  */
    /* JADX WARN: Code duplicated, block: B:136:0x0417  */
    /* JADX WARN: Code duplicated, block: B:138:0x041f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0428  */
    /* JADX WARN: Code duplicated, block: B:146:0x0472  */
    /* JADX WARN: Code duplicated, block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        int i;
        s sVarQ;
        t tVar;
        int i2;
        long j;
        int i3;
        Cursor cursorQuery;
        k4 k4Var;
        String str;
        int i4;
        i4 i4Var;
        com.google.android.gms.measurement.internal.m mVar;
        Long lValueOf;
        ContentValues contentValues;
        u0 u0Var;
        AtomicReference atomicReference;
        p4 p4Var;
        switch (this.e) {
            case 0:
                try {
                    objCall = ((e) this.y).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.A).post(new k0(3, (f) this.z, objCall));
                return;
            case 1:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.y;
                try {
                    BuildersKt.runBlocking(cancellableContinuationImpl.getContext().minusKey(kotlin.coroutines.e.e), new androidx.compose.animation.core.f((r) this.z, cancellableContinuationImpl, (androidx.room.s) this.A, (kotlin.coroutines.d) null, 6));
                    return;
                } catch (Throwable th) {
                    cancellableContinuationImpl.cancel(th);
                    return;
                }
            case 2:
                com.google.android.gms.cloudmessaging.a aVar = (com.google.android.gms.cloudmessaging.a) this.z;
                Intent intent = aVar.e;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    sVarQ = n.o(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar.e;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.e;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.y;
                    bundle.putBoolean("supports_message_handled", true);
                    com.google.android.gms.cloudmessaging.n nVarP = com.google.android.gms.cloudmessaging.n.p(context);
                    synchronized (nVarP) {
                        i = nVarP.e;
                        nVarP.e = i + 1;
                    }
                    sVarQ = nVarP.q(new com.google.android.gms.cloudmessaging.m(i, 2, bundle, 0));
                }
                sVarQ.a(com.google.android.gms.cloudmessaging.h.y, new androidx.media3.exoplayer.hls.c((CountDownLatch) this.A, 20));
                return;
            case 3:
                x1 x1Var = (x1) this.y;
                ListenableFuture listenableFuture = (x0) this.z;
                ue ueVar = (ue) this.A;
                try {
                    Object objB = m0.b(listenableFuture);
                    x0 x0Var = (x0) x1Var.f;
                    x0Var.l(objB);
                    ueVar.n(x0Var);
                    return;
                } catch (Throwable unused2) {
                    ueVar.n(listenableFuture);
                    return;
                }
            case 4:
                if (((z) this.y).e != null) {
                    androidx.transition.k.h();
                    return;
                }
                qf qfVar = (qf) this.z;
                da daVar = (da) this.A;
                pf pfVarC = bf.c();
                qf qfVarB = bf.b(pfVarC, qfVar);
                try {
                    daVar.run();
                    bf.b(pfVarC, qfVarB);
                    return;
                } catch (Throwable th2) {
                    try {
                        af.a(th2);
                        throw th2;
                    } catch (Throwable th3) {
                        bf.b(pfVarC, qfVarB);
                        throw th3;
                    }
                }
            case 5:
                j4 j4Var = ((w1) this.A).d;
                j4Var.W();
                com.google.android.gms.measurement.internal.e eVar = (com.google.android.gms.measurement.internal.e) this.y;
                Object objD = eVar.z.d();
                r4 r4Var = (r4) this.z;
                if (objD == null) {
                    j4Var.b0(eVar, r4Var);
                    return;
                } else {
                    j4Var.a0(eVar, r4Var);
                    return;
                }
            case 6:
                u uVar = (u) this.y;
                r4 r4Var2 = (r4) this.z;
                w1 w1Var = (w1) this.A;
                w1Var.getClass();
                j4 j4Var2 = w1Var.d;
                if ("_cmp".equals(uVar.e) && (tVar = uVar.y) != null) {
                    Bundle bundle2 = tVar.e;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            j4Var2.b().I.b(uVar.toString(), "Event has been filtered ");
                            uVar = new u("_cmpx", tVar, uVar.z, uVar.A, uVar.B);
                        }
                    }
                }
                String str2 = uVar.e;
                i1 i1Var = j4Var2.e;
                l4 l4Var = j4Var2.D;
                j4.U(i1Var);
                String str3 = r4Var2.e;
                t5 t5Var = TextUtils.isEmpty(str3) ? null : (t5) i1Var.H.h(str3);
                if (t5Var == null) {
                    j4Var2.b().K.b(r4Var2.e, "EES not loaded for");
                    j4Var2.W();
                    j4Var2.j(uVar, r4Var2);
                    return;
                }
                try {
                    com.google.android.datatransport.runtime.j jVar = t5Var.c;
                    j4.U(l4Var);
                    HashMap mapJ0 = l4.j0(uVar.y.h(), true);
                    String strG = d2.g(str2, d2.f, d2.a);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (t5Var.a(new com.google.android.gms.internal.measurement.b(strG, uVar.A, mapJ0))) {
                        if (((com.google.android.gms.internal.measurement.b) jVar.z).equals((com.google.android.gms.internal.measurement.b) jVar.y)) {
                            j4Var2.W();
                            j4Var2.j(uVar, r4Var2);
                        } else {
                            j4Var2.b().K.b(str2, "EES edited event");
                            j4.U(l4Var);
                            u uVarZ = l4.z((com.google.android.gms.internal.measurement.b) jVar.z);
                            j4Var2.W();
                            j4Var2.j(uVarZ, r4Var2);
                        }
                        if (((ArrayList) jVar.A).isEmpty()) {
                            return;
                        }
                        for (com.google.android.gms.internal.measurement.b bVar : (ArrayList) jVar.A) {
                            j4Var2.b().K.b(bVar.a, "EES logging created event");
                            j4.U(l4Var);
                            u uVarZ2 = l4.z(bVar);
                            j4Var2.W();
                            j4Var2.j(uVarZ2, r4Var2);
                        }
                        return;
                    }
                } catch (h6 unused3) {
                    j4Var2.b().C.c(r4Var2.y, str2, "EES error. appId, eventName");
                }
                j4Var2.b().K.b(str2, "EES was not applied to event");
                j4Var2.W();
                j4Var2.j(uVar, r4Var2);
                return;
            case 7:
                w1 w1Var2 = (w1) this.A;
                w1Var2.d.W();
                w1Var2.d.h((u) this.y, (String) this.z);
                return;
            case 8:
                j4 j4Var3 = ((w1) this.A).d;
                j4Var3.W();
                m4 m4Var = (m4) this.y;
                Object objD2 = m4Var.d();
                r4 r4Var3 = (r4) this.z;
                if (objD2 == null) {
                    j4Var3.Y(m4Var.y, r4Var3);
                    return;
                } else {
                    j4Var3.X(m4Var, r4Var3);
                    return;
                }
            case 9:
                w1 w1Var3 = (w1) this.y;
                r4 r4Var4 = (r4) this.z;
                com.google.android.gms.measurement.internal.d dVar = (com.google.android.gms.measurement.internal.d) this.A;
                j4 j4Var4 = w1Var3.d;
                j4Var4.W();
                String str4 = r4Var4.e;
                x.g(str4);
                HashMap map = j4Var4.b0;
                j4Var4.e().v();
                j4Var4.m0();
                com.google.android.gms.measurement.internal.m mVar2 = j4Var4.z;
                j4.U(mVar2);
                long j2 = dVar.e;
                long j3 = dVar.z;
                mVar2.v();
                mVar2.w();
                Cursor cursor = null;
                k4VarY = null;
                k4 k4VarY = null;
                try {
                    cursorQuery = mVar2.m0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                x.g(string2);
                                j = j3;
                                try {
                                    try {
                                        try {
                                            i3 = 1;
                                            cursorQuery = cursorQuery;
                                            i2 = 4;
                                            j = j;
                                            try {
                                                k4VarY = mVar2.Y(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                                cursorQuery.close();
                                            } catch (SQLiteException e) {
                                                e = e;
                                                cursorQuery = cursorQuery;
                                                try {
                                                    u0 u0Var2 = ((p1) mVar2.e).C;
                                                    p1.m(u0Var2);
                                                    u0Var2.C.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor = cursorQuery;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i3 = 1;
                                            i2 = 4;
                                            cursorQuery = cursorQuery;
                                            u0 u0Var3 = ((p1) mVar2.e).C;
                                            p1.m(u0Var3);
                                            u0Var3.C.c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            k4Var = k4VarY;
                                            if (k4Var == null) {
                                                j4Var4.b().F.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                                return;
                                            }
                                            str = k4Var.c;
                                            i4 = dVar.y;
                                            if (i4 == i3) {
                                                if (i4 == 3) {
                                                    i4Var = (i4) map.get(str);
                                                    if (i4Var == null) {
                                                        i4Var = new i4(j4Var4);
                                                        map.put(str, i4Var);
                                                    } else {
                                                        i4Var.b += i3;
                                                        i4Var.c = i4Var.a();
                                                    }
                                                    j4Var4.c().getClass();
                                                    j4Var4.b().K.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((i4Var.c - System.currentTimeMillis()) / 1000));
                                                }
                                                com.google.android.gms.measurement.internal.m mVar3 = j4Var4.z;
                                                j4.U(mVar3);
                                                Long lValueOf2 = Long.valueOf(dVar.e);
                                                mVar3.H(lValueOf2);
                                                j4Var4.b().K.c(str4, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                                return;
                                            }
                                            if (map.containsKey(str)) {
                                                map.remove(str);
                                            }
                                            com.google.android.gms.measurement.internal.m mVar4 = j4Var4.z;
                                            j4.U(mVar4);
                                            Long lValueOf3 = Long.valueOf(j2);
                                            mVar4.C(lValueOf3);
                                            j4Var4.b().K.c(str4, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                            if (j > 0) {
                                                mVar = j4Var4.z;
                                                j4.U(mVar);
                                                p1 p1Var = (p1) mVar.e;
                                                mVar.v();
                                                mVar.w();
                                                lValueOf = Long.valueOf(j);
                                                contentValues = new ContentValues();
                                                contentValues.put("upload_type", Integer.valueOf(i3));
                                                com.google.android.gms.common.util.a aVar2 = p1Var.H;
                                                u0Var = p1Var.C;
                                                aVar2.getClass();
                                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                                try {
                                                    if (mVar.m0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i2)}) != 1) {
                                                        p1.m(u0Var);
                                                        u0Var.F.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                                        break;
                                                    }
                                                    j4Var4.b().K.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                                    j4Var4.t(str4);
                                                    return;
                                                } catch (SQLiteException e3) {
                                                    p1.m(u0Var);
                                                    u0Var.C.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e3);
                                                    throw e3;
                                                }
                                            }
                                            return;
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        i3 = 1;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    i2 = 4;
                                    i3 = 1;
                                    cursorQuery = cursorQuery;
                                    j = j;
                                }
                            } else {
                                i2 = 4;
                                j = j3;
                                i3 = 1;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            i2 = 4;
                            j = j3;
                            i3 = 1;
                            cursorQuery = cursorQuery;
                        }
                        k4Var = k4VarY;
                        if (k4Var == null) {
                            j4Var4.b().F.c(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                            return;
                        }
                        str = k4Var.c;
                        i4 = dVar.y;
                        if (i4 == i3) {
                            if (i4 == 3) {
                                i4Var = (i4) map.get(str);
                                if (i4Var == null) {
                                    i4Var = new i4(j4Var4);
                                    map.put(str, i4Var);
                                } else {
                                    i4Var.b += i3;
                                    i4Var.c = i4Var.a();
                                }
                                j4Var4.c().getClass();
                                j4Var4.b().K.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str, Long.valueOf((i4Var.c - System.currentTimeMillis()) / 1000));
                            }
                            com.google.android.gms.measurement.internal.m mVar5 = j4Var4.z;
                            j4.U(mVar5);
                            Long lValueOf4 = Long.valueOf(dVar.e);
                            mVar5.H(lValueOf4);
                            j4Var4.b().K.c(str4, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                            return;
                        }
                        if (map.containsKey(str)) {
                            map.remove(str);
                        }
                        com.google.android.gms.measurement.internal.m mVar6 = j4Var4.z;
                        j4.U(mVar6);
                        Long lValueOf5 = Long.valueOf(j2);
                        mVar6.C(lValueOf5);
                        j4Var4.b().K.c(str4, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                        if (j > 0) {
                            mVar = j4Var4.z;
                            j4.U(mVar);
                            p1 p1Var2 = (p1) mVar.e;
                            mVar.v();
                            mVar.w();
                            lValueOf = Long.valueOf(j);
                            contentValues = new ContentValues();
                            contentValues.put("upload_type", Integer.valueOf(i3));
                            com.google.android.gms.common.util.a aVar3 = p1Var2.H;
                            u0Var = p1Var2.C;
                            aVar3.getClass();
                            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                            if (mVar.m0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i2)}) != 1) {
                                p1.m(u0Var);
                                u0Var.F.c(str4, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                break;
                            }
                            j4Var4.b().K.c(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                            j4Var4.t(str4);
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        cursorQuery = cursorQuery;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    i2 = 4;
                    j = j3;
                    i3 = 1;
                    cursorQuery = null;
                } catch (Throwable th7) {
                    th = th7;
                }
                break;
            case 10:
                AtomicReference atomicReference2 = (AtomicReference) this.y;
                synchronized (atomicReference2) {
                    try {
                        try {
                            m3 m3Var = (m3) this.A;
                            p1 p1Var3 = (p1) m3Var.e;
                            d1 d1Var = p1Var3.B;
                            p1.k(d1Var);
                            if (d1Var.C().i(b2.ANALYTICS_STORAGE)) {
                                i0 i0Var = m3Var.A;
                                if (i0Var != null) {
                                    atomicReference2.set(i0Var.D((r4) this.z));
                                    String str5 = (String) atomicReference2.get();
                                    if (str5 != null) {
                                        s2 s2Var = ((p1) m3Var.e).J;
                                        p1.l(s2Var);
                                        s2Var.D.set(str5);
                                        d1 d1Var2 = p1Var3.B;
                                        p1.k(d1Var2);
                                        d1Var2.D.v(str5);
                                    }
                                    m3Var.I();
                                    atomicReference = (AtomicReference) this.y;
                                    atomicReference.notify();
                                    return;
                                }
                                u0 u0Var4 = p1Var3.C;
                                p1.m(u0Var4);
                                u0Var4.C.a("Failed to get app instance id");
                            } else {
                                u0 u0Var5 = p1Var3.C;
                                p1.m(u0Var5);
                                u0Var5.H.a("Analytics storage consent denied; will not get app instance id");
                                s2 s2Var2 = ((p1) m3Var.e).J;
                                p1.l(s2Var2);
                                s2Var2.D.set(null);
                                d1 d1Var3 = p1Var3.B;
                                p1.k(d1Var3);
                                d1Var3.D.v(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e8) {
                            u0 u0Var6 = ((p1) ((m3) this.A).e).C;
                            p1.m(u0Var6);
                            u0Var6.C.b(e8, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.y;
                        }
                    } catch (Throwable th8) {
                        ((AtomicReference) this.y).notify();
                        throw th8;
                    }
                }
                break;
            case 11:
                b6 b6Var = (b6) this.z;
                m3 m3Var2 = (m3) this.A;
                String strD = null;
                try {
                    try {
                        p1 p1Var4 = (p1) m3Var2.e;
                        d1 d1Var4 = p1Var4.B;
                        u0 u0Var7 = p1Var4.C;
                        p1.k(d1Var4);
                        if (d1Var4.C().i(b2.ANALYTICS_STORAGE)) {
                            i0 i0Var2 = m3Var2.A;
                            if (i0Var2 != null) {
                                strD = i0Var2.D((r4) this.y);
                                if (strD != null) {
                                    s2 s2Var3 = p1Var4.J;
                                    p1.l(s2Var3);
                                    s2Var3.D.set(strD);
                                    p1.k(d1Var4);
                                    d1Var4.D.v(strD);
                                }
                                m3Var2.I();
                                p4Var = ((p1) m3Var2.e).F;
                                p1.k(p4Var);
                                p4Var.j0(strD, b6Var);
                                return;
                            }
                            p1.m(u0Var7);
                            u0Var7.C.a("Failed to get app instance id");
                        } else {
                            p1.m(u0Var7);
                            u0Var7.H.a("Analytics storage consent denied; will not get app instance id");
                            s2 s2Var4 = p1Var4.J;
                            p1.l(s2Var4);
                            s2Var4.D.set(null);
                            p1.k(d1Var4);
                            d1Var4.D.v(null);
                        }
                        p4Var = p1Var4.F;
                    } catch (RemoteException e9) {
                        u0 u0Var8 = ((p1) m3Var2.e).C;
                        p1.m(u0Var8);
                        u0Var8.C.b(e9, "Failed to get app instance id");
                    }
                    p1.k(p4Var);
                    p4Var.j0(strD, b6Var);
                    return;
                } catch (Throwable th9) {
                    p4 p4Var2 = ((p1) m3Var2.e).F;
                    p1.k(p4Var2);
                    p4Var2.j0(null, b6Var);
                    throw th9;
                }
            case 12:
                m3 m3Var3 = (m3) this.y;
                r4 r4Var5 = (r4) this.z;
                com.google.android.gms.measurement.internal.d dVar2 = (com.google.android.gms.measurement.internal.d) this.A;
                p1 p1Var5 = (p1) m3Var3.e;
                i0 i0Var3 = m3Var3.A;
                if (i0Var3 == null) {
                    u0 u0Var9 = p1Var5.C;
                    p1.m(u0Var9);
                    u0Var9.C.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    i0Var3.s(r4Var5, dVar2);
                    m3Var3.I();
                    return;
                } catch (RemoteException e10) {
                    u0 u0Var10 = p1Var5.C;
                    p1.m(u0Var10);
                    u0Var10.C.c(Long.valueOf(dVar2.e), e10, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 13:
                androidx.media3.exoplayer.hls.c cVar = (androidx.media3.exoplayer.hls.c) this.y;
                u0 u0Var11 = (u0) this.z;
                JobParameters jobParameters = (JobParameters) this.A;
                u0Var11.K.a("AppMeasurementJobService processed last upload request.");
                ((p3) ((Service) cVar.y)).c(jobParameters);
                return;
            default:
                com.google.firebase.crashlytics.internal.send.b bVar2 = (com.google.firebase.crashlytics.internal.send.b) this.A;
                com.google.firebase.crashlytics.internal.common.b bVar3 = (com.google.firebase.crashlytics.internal.common.b) this.y;
                bVar2.b(bVar3, (com.google.android.gms.tasks.j) this.z);
                ((AtomicInteger) bVar2.i.z).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(bVar2.b, bVar2.a()) * (60000.0d / bVar2.a));
                String str6 = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar3.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str6, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused4) {
                    return;
                }
        }
    }

    public String toString() {
        switch (this.e) {
            case 4:
                da daVar = (da) this.A;
                StringBuilder sb = new StringBuilder(daVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(daVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    public /* synthetic */ m(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.e = i;
        this.y = obj2;
        this.z = obj3;
        this.A = obj;
    }

    public /* synthetic */ m() {
        this.e = 0;
    }
}
