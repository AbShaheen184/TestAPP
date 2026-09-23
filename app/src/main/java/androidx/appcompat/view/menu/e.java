package androidx.appcompat.view.menu;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import androidx.core.view.a1;
import androidx.core.view.f1;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a9;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.b9;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.z8;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.b4;
import com.google.android.gms.measurement.internal.c4;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.i0;
import com.google.android.gms.measurement.internal.j4;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.m0;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s2;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.v1;
import com.google.android.gms.measurement.internal.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public e(s2 s2Var, AtomicReference atomicReference, String str, String str2) {
        this.e = 5;
        this.y = atomicReference;
        this.z = str;
        this.A = str2;
        Objects.requireNonNull(s2Var);
        this.B = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:113:0x03f2 A[LOOP:1: B:111:0x03ec->B:113:0x03f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0442 A[Catch: t1 -> 0x04aa, LOOP:2: B:116:0x0438->B:118:0x0442, LOOP_END, TryCatch #6 {t1 -> 0x04aa, blocks: (B:115:0x042b, B:116:0x0438, B:118:0x0442, B:119:0x0478, B:121:0x0493), top: B:148:0x042b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0493 A[Catch: t1 -> 0x04aa, TRY_LEAVE, TryCatch #6 {t1 -> 0x04aa, blocks: (B:115:0x042b, B:116:0x0438, B:118:0x0442, B:119:0x0478, B:121:0x0493), top: B:148:0x042b }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        b4 b4Var;
        y8 y8Var;
        int i;
        long jElapsedRealtime;
        switch (this.e) {
            case 0:
                g gVar = (g) ((com.google.firebase.platforminfo.d) this.B).e;
                k kVar = (k) this.z;
                f fVar = (f) this.y;
                if (fVar != null) {
                    gVar.W = true;
                    fVar.b.c(false);
                    gVar.W = false;
                }
                if (kVar.isEnabled() && kVar.hasSubMenu()) {
                    ((j) this.A).p(kVar, null, 4);
                    return;
                }
                return;
            case 1:
                a1.i((View) this.y, (f1) this.z, (androidx.compose.foundation.text.input.internal.o) this.A);
                ((ValueAnimator) this.B).start();
                return;
            case 2:
                w1 w1Var = (w1) this.y;
                String str = (String) this.z;
                c4 c4Var = (c4) this.A;
                m0 m0Var = (m0) this.B;
                j4 j4Var = w1Var.d;
                j4Var.W();
                j4Var.e().v();
                j4Var.m0();
                com.google.android.gms.measurement.internal.m mVar = j4Var.z;
                j4.U(mVar);
                Object obj = null;
                List<k4> listA = mVar.A(str, c4Var, ((Integer) f0.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (k4 k4Var : listA) {
                    String str2 = k4Var.c;
                    long j = k4Var.h;
                    long j2 = k4Var.a;
                    if (j4Var.s(str, str2)) {
                        int i2 = k4Var.i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) f0.z.a(obj)).intValue()) {
                                long jMin = Math.min(((Long) f0.x.a(obj)).longValue() * (1 << (i2 - 1)), ((Long) f0.y.a(obj)).longValue());
                                j4Var.c().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : k4Var.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    long j3 = k4Var.a;
                                    z8 z8Var = k4Var.b;
                                    b4Var = new b4(j3, z8Var.a(), k4Var.c, bundle, k4Var.e.e, k4Var.g, "");
                                    try {
                                        y8Var = (y8) l4.g0(z8.B(), b4Var.y);
                                        for (i = 0; i < ((z8) y8Var.y).v(); i++) {
                                            a9 a9Var = (a9) ((z8) y8Var.y).w(i).l();
                                            j4Var.c().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            a9Var.b();
                                            ((b9) a9Var.y).k0(jCurrentTimeMillis);
                                            y8Var.b();
                                            ((z8) y8Var.y).D(i, (b9) a9Var.d());
                                        }
                                        b4Var.y = ((z8) y8Var.d()).a();
                                        if (Log.isLoggable(j4Var.b().F(), 2)) {
                                            l4 l4Var = j4Var.D;
                                            j4.U(l4Var);
                                            b4Var.D = l4Var.W((z8) y8Var.d());
                                        }
                                        arrayList.add(b4Var);
                                    } catch (t1 unused) {
                                        j4Var.b().F.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            j4Var.b().K.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r8.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            long j4 = k4Var.a;
                            z8 z8Var2 = k4Var.b;
                            b4Var = new b4(j4, z8Var2.a(), k4Var.c, bundle, k4Var.e.e, k4Var.g, "");
                            y8Var = (y8) l4.g0(z8.B(), b4Var.y);
                            while (i < ((z8) y8Var.y).v()) {
                                a9 a9Var2 = (a9) ((z8) y8Var.y).w(i).l();
                                j4Var.c().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                a9Var2.b();
                                ((b9) a9Var2.y).k0(jCurrentTimeMillis2);
                                y8Var.b();
                                ((z8) y8Var.y).D(i, (b9) a9Var2.d());
                            }
                            b4Var.y = ((z8) y8Var.d()).a();
                            if (Log.isLoggable(j4Var.b().F(), 2)) {
                                l4 l4Var2 = j4Var.D;
                                j4.U(l4Var2);
                                b4Var.D = l4Var2.W((z8) y8Var.d());
                            }
                            arrayList.add(b4Var);
                        }
                        obj = null;
                    } else {
                        j4Var.b().K.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), k4Var.c);
                    }
                }
                try {
                    m0Var.y(new d4(arrayList));
                    j4Var.b().K.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    j4Var.b().C.c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 3:
                m3 m3VarP = ((AppMeasurementDynamiteService) this.B).d.p();
                b6 b6Var = (b6) this.y;
                u uVar = (u) this.z;
                String str3 = (String) this.A;
                m3VarP.v();
                m3VarP.w();
                p1 p1Var = (p1) m3VarP.e;
                p4 p4Var = p1Var.F;
                p1.k(p4Var);
                if (com.google.android.gms.common.f.b.b(((p1) p4Var.e).e, 12451000) == 0) {
                    m3VarP.J(new e(m3VarP, uVar, str3, b6Var, 7));
                    return;
                }
                u0 u0Var = p1Var.C;
                p1.m(u0Var);
                u0Var.F.a("Not bundling data. Service unavailable or out of date");
                p4 p4Var2 = p1Var.F;
                p1.k(p4Var2);
                p4Var2.m0(b6Var, new byte[0]);
                return;
            case 4:
                w1 w1Var2 = (w1) this.y;
                Bundle bundle2 = (Bundle) this.z;
                String str4 = (String) this.A;
                r4 r4Var = (r4) this.B;
                boolean zIsEmpty = bundle2.isEmpty();
                j4 j4Var2 = w1Var2.d;
                if (zIsEmpty) {
                    com.google.android.gms.measurement.internal.m mVar2 = j4Var2.z;
                    j4.U(mVar2);
                    mVar2.v();
                    mVar2.w();
                    try {
                        mVar2.m0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        u0 u0Var2 = ((p1) mVar2.e).C;
                        p1.m(u0Var2);
                        u0Var2.C.b(e2, "Error clearing default event params");
                        return;
                    }
                }
                com.google.android.gms.measurement.internal.m mVar3 = j4Var2.z;
                j4.U(mVar3);
                p1 p1Var2 = (p1) mVar3.e;
                mVar3.v();
                mVar3.w();
                com.google.android.gms.measurement.internal.q qVar = new com.google.android.gms.measurement.internal.q((p1) mVar3.e, "", str4, "dep", 0L, 0L, 0L, bundle2);
                l4 l4Var3 = mVar3.y.D;
                j4.U(l4Var3);
                byte[] bArrA = l4Var3.V(qVar).a();
                u0 u0Var3 = p1Var2.C;
                p1.m(u0Var3);
                u0Var3.K.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (mVar3.m0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        p1.m(u0Var3);
                        u0Var3.C.b(u0.D(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    p1.m(u0Var3);
                    u0Var3.C.c(u0.D(str4), e3, "Error storing default event parameters. appId");
                }
                com.google.android.gms.measurement.internal.m mVar4 = j4Var2.z;
                j4.U(mVar4);
                long j5 = r4Var.a0;
                try {
                    if (mVar4.S("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) <= 0 && mVar4.S("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j5)}, 0L) > 0) {
                        com.google.android.gms.measurement.internal.m mVar5 = j4Var2.z;
                        j4.U(mVar5);
                        mVar5.O(str4, Long.valueOf(j5), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    u0 u0Var4 = ((p1) mVar4.e).C;
                    p1.m(u0Var4);
                    u0Var4.C.b(e4, "Error checking backfill conditions");
                    return;
                }
            case 5:
                String str5 = (String) this.z;
                String str6 = (String) this.A;
                m3 m3VarP2 = ((p1) ((s2) this.B).e).p();
                AtomicReference atomicReference = (AtomicReference) this.y;
                m3VarP2.v();
                m3VarP2.w();
                m3VarP2.J(new v1(m3VarP2, atomicReference, str5, str6, m3VarP2.L(false)));
                return;
            case 6:
                m3 m3VarP3 = ((AppMeasurementDynamiteService) this.B).d.p();
                b6 b6Var2 = (b6) this.y;
                String str7 = (String) this.z;
                String str8 = (String) this.A;
                m3VarP3.v();
                m3VarP3.w();
                m3VarP3.J(new v1(m3VarP3, str7, str8, m3VarP3.L(false), b6Var2));
                return;
            case 7:
                b6 b6Var3 = (b6) this.A;
                m3 m3Var = (m3) this.B;
                byte[] bArrN = null;
                try {
                    try {
                        i0 i0Var = m3Var.A;
                        if (i0Var != null) {
                            bArrN = i0Var.n((u) this.y, (String) this.z);
                            m3Var.I();
                            p4 p4Var3 = ((p1) m3Var.e).F;
                            p1.k(p4Var3);
                            p4Var3.m0(b6Var3, bArrN);
                            return;
                        }
                        p1 p1Var3 = (p1) m3Var.e;
                        u0 u0Var5 = p1Var3.C;
                        p1.m(u0Var5);
                        u0Var5.C.a("Discarding data. Failed to send event to service to bundle");
                        p4 p4Var4 = p1Var3.F;
                        p1.k(p4Var4);
                        p4Var4.m0(b6Var3, null);
                        return;
                    } catch (RemoteException e5) {
                        u0 u0Var6 = ((p1) m3Var.e).C;
                        p1.m(u0Var6);
                        u0Var6.C.b(e5, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th) {
                    p4 p4Var5 = ((p1) m3Var.e).F;
                    p1.k(p4Var5);
                    p4Var5.m0(b6Var3, null);
                    throw th;
                }
                break;
            case 8:
                m3 m3Var2 = (m3) this.y;
                AtomicReference atomicReference2 = (AtomicReference) this.z;
                r4 r4Var2 = (r4) this.A;
                Bundle bundle3 = (Bundle) this.B;
                synchronized (atomicReference2) {
                    try {
                        i0 i0Var2 = m3Var2.A;
                        if (i0Var2 != null) {
                            i0Var2.p(r4Var2, bundle3, new f3(m3Var2, atomicReference2));
                            m3Var2.I();
                            return;
                        } else {
                            u0 u0Var7 = ((p1) m3Var2.e).C;
                            p1.m(u0Var7);
                            u0Var7.C.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e6) {
                        u0 u0Var8 = ((p1) m3Var2.e).C;
                        p1.m(u0Var8);
                        u0Var8.C.b(e6, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 9:
                m3 m3Var3 = (m3) this.y;
                AtomicReference atomicReference3 = (AtomicReference) this.z;
                r4 r4Var3 = (r4) this.A;
                c4 c4Var2 = (c4) this.B;
                synchronized (atomicReference3) {
                    try {
                        i0 i0Var3 = m3Var3.A;
                        if (i0Var3 != null) {
                            i0Var3.e(r4Var3, c4Var2, new g3(m3Var3, atomicReference3));
                            m3Var3.I();
                            return;
                        } else {
                            u0 u0Var9 = ((p1) m3Var3.e).C;
                            p1.m(u0Var9);
                            u0Var9.C.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        u0 u0Var10 = ((p1) m3Var3.e).C;
                        p1.m(u0Var10);
                        u0Var10.C.b(e7, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                j4 j4Var3 = (j4) ((androidx.media3.exoplayer.hls.c) this.B).y;
                p4 p4VarL0 = j4Var3.l0();
                j4Var3.c().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (j4Var3.f0().G(null, f0.e1)) {
                    j4Var3.c().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                long j6 = jElapsedRealtime;
                Bundle bundle4 = (Bundle) this.A;
                String str9 = (String) this.z;
                String str10 = (String) this.y;
                u uVarD0 = p4VarL0.d0(str9, bundle4, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, jCurrentTimeMillis3, j6, false);
                x.g(uVarD0);
                j4Var3.h(uVarD0, str10);
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.B = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }
}
