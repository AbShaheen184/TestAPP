package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.w8;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 {
    public t8 a;
    public Long b;
    public long c;
    public final /* synthetic */ c d;

    /* JADX WARN: Code duplicated, block: B:47:0x00f7 A[PHI: r8 r16 r17
  0x00f7: PHI (r8v7 android.database.Cursor) = (r8v6 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x0122, B:46:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r16v5 com.google.android.gms.internal.measurement.t8) = (r16v3 com.google.android.gms.internal.measurement.t8), (r16v10 com.google.android.gms.internal.measurement.t8) binds: [B:61:0x0122, B:46:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x0122, B:46:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final t8 a(t8 t8Var, String str) {
        ?? r9;
        t8 t8Var2;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strZ = t8Var.z();
        List listW = t8Var.w();
        c cVar = this.d;
        j4 j4Var = cVar.y;
        j4 j4Var2 = cVar.y;
        p1 p1Var = (p1) cVar.e;
        j4Var.k0();
        w8 w8VarF = l4.F(t8Var, "_eid");
        Long l = (Long) (w8VarF == null ? null : l4.N(w8VarF));
        if (l != null) {
            ?? Equals = strZ.equals("_ep");
            if (Equals != 0) {
                j4Var.k0();
                w8 w8VarF2 = l4.F(t8Var, "_en");
                String str2 = (String) (w8VarF2 == null ? null : l4.N(w8VarF2));
                if (TextUtils.isEmpty(str2)) {
                    u0 u0Var = p1Var.C;
                    p1.m(u0Var);
                    u0Var.D.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    m mVar = j4Var.z;
                    j4.U(mVar);
                    p1 p1Var2 = (p1) mVar.e;
                    mVar.v();
                    mVar.w();
                    try {
                        try {
                            cursorRawQuery = mVar.m0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    t8Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((t8) ((s8) l4.g0(t8.K(), cursorRawQuery.getBlob(0))).d(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            u0 u0Var2 = p1Var2.C;
                                            p1.m(u0Var2);
                                            u0Var2.C.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            r0 = t8Var2;
                                        }
                                    } catch (IOException e2) {
                                        u0 u0Var3 = p1Var2.C;
                                        p1.m(u0Var3);
                                        j = 0;
                                        try {
                                            u0Var3.C.d("Failed to merge main event. appId, eventId", u0.D(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            u0 u0Var4 = p1Var2.C;
                                            p1.m(u0Var4);
                                            u0Var4.C.b(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            r0 = t8Var2;
                                            if (r0 != 0) {
                                            }
                                            u0 u0Var5 = p1Var.C;
                                            p1.m(u0Var5);
                                            u0Var5.D.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                            return t8Var2;
                                        }
                                        cursorRawQuery.close();
                                        r0 = t8Var2;
                                    }
                                } else {
                                    u0 u0Var6 = p1Var2.C;
                                    p1.m(u0Var6);
                                    u0Var6.K.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    t8Var2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e4) {
                                e = e4;
                                t8Var2 = null;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            t8Var2 = null;
                            j = 0;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            r9 = 0;
                            if (r9 != 0) {
                                r9.close();
                            }
                            throw th;
                        }
                        if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                            u0 u0Var7 = p1Var.C;
                            p1.m(u0Var7);
                            u0Var7.D.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                            return t8Var2;
                        }
                        this.a = (t8) obj;
                        this.c = ((Long) ((Pair) r0).second).longValue();
                        j4Var2.k0();
                        this.b = (Long) l4.H(this.a, "_eid");
                    } catch (Throwable th2) {
                        th = th2;
                        r9 = Equals;
                        if (r9 != 0) {
                            r9.close();
                        }
                        throw th;
                    }
                } else {
                    j = 0;
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= j) {
                    m mVar2 = j4Var2.z;
                    j4.U(mVar2);
                    p1 p1Var3 = (p1) mVar2.e;
                    mVar2.v();
                    u0 u0Var8 = p1Var3.C;
                    p1.m(u0Var8);
                    u0Var8.K.b(str, "Clearing complex main event info. appId");
                    try {
                        mVar2.m0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        u0 u0Var9 = p1Var3.C;
                        p1.m(u0Var9);
                        u0Var9.C.b(e6, "Error clearing complex main event");
                    }
                } else {
                    m mVar3 = j4Var2.z;
                    j4.U(mVar3);
                    mVar3.N(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (w8 w8Var : this.a.w()) {
                    j4Var2.k0();
                    if (l4.F(t8Var, w8Var.v()) == null) {
                        arrayList.add(w8Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    u0 u0Var10 = p1Var.C;
                    p1.m(u0Var10);
                    u0Var10.D.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listW);
                    listW = arrayList;
                }
                strZ = str2;
            } else {
                this.b = l;
                this.a = t8Var;
                j4Var.k0();
                w8 w8VarF3 = l4.F(t8Var, "_epc");
                Serializable serializableN = w8VarF3 == null ? null : l4.N(w8VarF3);
                long jLongValue = ((Long) (serializableN != null ? serializableN : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    u0 u0Var11 = p1Var.C;
                    p1.m(u0Var11);
                    u0Var11.D.b(strZ, "Complex event with zero extra param count. eventName");
                } else {
                    m mVar4 = j4Var.z;
                    j4.U(mVar4);
                    mVar4.N(str, l, this.c, t8Var);
                }
            }
        }
        s8 s8Var = (s8) t8Var.l();
        s8Var.n(strZ);
        s8Var.b();
        ((t8) s8Var.y).O();
        s8Var.b();
        ((t8) s8Var.y).N(listW);
        return (t8) s8Var.d();
    }
}
