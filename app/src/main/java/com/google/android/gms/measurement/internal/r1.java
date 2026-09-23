package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.x7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ r4 y;
    public final /* synthetic */ w1 z;

    public /* synthetic */ r1(w1 w1Var, r4 r4Var, int i) {
        this.e = i;
        this.y = r4Var;
        this.z = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.e) {
            case 0:
                w1 w1Var = this.z;
                w1Var.d.W();
                w1Var.d.Z(this.y);
                break;
            case 1:
                w1 w1Var2 = this.z;
                w1Var2.d.W();
                j4 j4Var = w1Var2.d;
                j4Var.e().v();
                j4Var.m0();
                r4 r4Var = this.y;
                com.google.android.gms.common.internal.x.g(r4Var);
                String str = r4Var.e;
                com.google.android.gms.common.internal.x.d(str);
                int i = 0;
                if (j4Var.f0().G(null, f0.y0)) {
                    j4Var.c().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iE = j4Var.f0().E(null, f0.h0);
                    j4Var.f0();
                    long jLongValue = jCurrentTimeMillis - ((Long) f0.e.a(null)).longValue();
                    while (i < iE && j4Var.I(null, jLongValue)) {
                        i++;
                    }
                } else {
                    j4Var.f0();
                    long jIntValue = ((Integer) f0.l.a(null)).intValue();
                    while (i < jIntValue && j4Var.I(str, 0L)) {
                        i++;
                    }
                }
                if (j4Var.f0().G(null, f0.z0)) {
                    j4Var.e().v();
                    j4Var.H();
                }
                g4 g4Var = j4Var.G;
                int i2 = com.google.android.datatransport.runtime.a.i(r4Var.b0);
                g4Var.v();
                if (i2 == 2 && !g4.y(str)) {
                    i1 i1Var = g4Var.y.e;
                    j4.U(i1Var);
                    x7 x7VarH = i1Var.H(str);
                    if (x7VarH != null && x7VarH.I() && !x7VarH.J().v().isEmpty()) {
                        j4Var.b().K.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        j4Var.c().getClass();
                        j4Var.r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                w1 w1Var3 = this.z;
                w1Var3.d.W();
                j4 j4Var2 = w1Var3.d;
                j4Var2.e().v();
                j4Var2.m0();
                r4 r4Var2 = this.y;
                com.google.android.gms.common.internal.x.d(r4Var2.e);
                j4Var2.d0(r4Var2);
                break;
            case 3:
                w1 w1Var4 = this.z;
                w1Var4.d.W();
                j4 j4Var3 = w1Var4.d;
                if (j4Var3.V != null) {
                    ArrayList arrayList = new ArrayList();
                    j4Var3.W = arrayList;
                    arrayList.addAll(j4Var3.V);
                }
                m mVar = j4Var3.z;
                j4.U(mVar);
                p1 p1Var = (p1) mVar.e;
                r4 r4Var3 = this.y;
                String str2 = r4Var3.e;
                com.google.android.gms.common.internal.x.g(str2);
                com.google.android.gms.common.internal.x.d(str2);
                mVar.v();
                mVar.w();
                try {
                    SQLiteDatabase sQLiteDatabaseM0 = mVar.m0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM0.delete("upload_queue", "app_id=?", strArr);
                    if (p1Var.A.G(null, f0.c1)) {
                        iDelete += sQLiteDatabaseM0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        u0 u0Var = p1Var.C;
                        p1.m(u0Var);
                        u0Var.K.c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.c(u0.D(str2), e, "Error resetting analytics data. appId, error");
                }
                if (r4Var3.E) {
                    j4Var3.Z(r4Var3);
                }
                break;
            case 4:
                w1 w1Var5 = this.z;
                w1Var5.d.W();
                j4 j4Var4 = w1Var5.d;
                j4Var4.e().v();
                j4Var4.m0();
                r4 r4Var4 = this.y;
                com.google.android.gms.common.internal.x.d(r4Var4.e);
                j4Var4.n0(r4Var4);
                j4Var4.o0(r4Var4);
                break;
            case 5:
                j4 j4Var5 = this.z.d;
                j4Var5.W();
                j4Var5.o0(this.y);
                break;
            default:
                j4 j4Var6 = this.z.d;
                j4Var6.W();
                j4Var6.n0(this.y);
                break;
        }
    }
}
