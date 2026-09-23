package com.appsalt.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.appsalt.internal.k0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static void d(JSONObject jSONObject, String str) {
        StringBuilder sbP = androidx.compose.runtime.j.p(str);
        sbP.append(jSONObject.toString());
        String string = sbP.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a a(int i) throws Throwable {
        com.google.firebase.crashlytics.internal.settings.a aVar = null;
        try {
            if (!androidx.constraintlayout.core.g.b(2, i)) {
                JSONObject jSONObjectK = ((com.google.android.gms.tasks.q) this.e).k();
                if (jSONObjectK != null) {
                    com.google.firebase.crashlytics.internal.settings.a aVarJ = ((com.google.android.gms.tasks.q) this.c).j(jSONObjectK);
                    d(jSONObjectK, "Loaded cached settings: ");
                    ((com.google.android.gms.measurement.internal.y) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (androidx.constraintlayout.core.g.b(3, i) || aVarJ.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarJ;
                        } catch (Exception e) {
                            e = e;
                            aVar = aVarJ;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public com.google.firebase.crashlytics.internal.settings.a b() {
        return (com.google.firebase.crashlytics.internal.settings.a) ((AtomicReference) this.h).get();
    }

    public void c(com.google.android.datatransport.runtime.k kVar, int i) {
        byte[] bArr;
        long j;
        com.google.android.datatransport.runtime.backends.a aVar;
        String str;
        com.google.android.datatransport.runtime.backends.a aVar2;
        int i2;
        androidx.media3.exoplayer.image.f fVarF;
        String str2;
        Integer numValueOf;
        k0 k0Var;
        final k0 k0Var2 = this;
        final com.google.android.datatransport.runtime.k kVar2 = kVar;
        byte[] bArr2 = kVar2.b;
        com.google.android.datatransport.runtime.scheduling.persistence.g gVar = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var2.f;
        com.google.android.datatransport.runtime.backends.g gVarA = ((com.google.android.datatransport.runtime.backends.e) k0Var2.b).a(kVar2.a);
        long jMax = 0;
        while (true) {
            final int i3 = 0;
            if (!((Boolean) gVar.L(new com.google.android.datatransport.runtime.synchronization.b(k0Var2) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                public final /* synthetic */ k0 y;

                {
                    this.y = k0Var2;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.b
                public final Object e() {
                    Boolean bool;
                    switch (i3) {
                        case 0:
                            com.google.android.datatransport.runtime.k kVar3 = kVar2;
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            SQLiteDatabase sQLiteDatabaseA = gVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lG = com.google.android.datatransport.runtime.scheduling.persistence.g.g(sQLiteDatabaseA, kVar3);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            gVar3.getClass();
                            return (Iterable) gVar3.n(new androidx.media3.exoplayer.analytics.c(8, gVar3, kVar2));
                    }
                }
            })).booleanValue()) {
                gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.h(jMax, k0Var2, kVar2));
                return;
            }
            final int i4 = 1;
            Iterable iterable = (Iterable) gVar.L(new com.google.android.datatransport.runtime.synchronization.b(k0Var2) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                public final /* synthetic */ k0 y;

                {
                    this.y = k0Var2;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.b
                public final Object e() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            com.google.android.datatransport.runtime.k kVar3 = kVar2;
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            SQLiteDatabase sQLiteDatabaseA = gVar2.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lG = com.google.android.datatransport.runtime.scheduling.persistence.g.g(sQLiteDatabaseA, kVar3);
                                if (lG == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lG.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            com.google.android.datatransport.runtime.scheduling.persistence.g gVar3 = (com.google.android.datatransport.runtime.scheduling.persistence.g) this.y.c;
                            gVar3.getClass();
                            return (Iterable) gVar3.n(new androidx.media3.exoplayer.analytics.c(8, gVar3, kVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (gVarA == null) {
                androidx.room.t.m("Uploader", "Unknown backend for %s, deleting event batch for it...", kVar2);
                aVar2 = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<com.google.android.datatransport.runtime.i> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.b) it.next()).c);
                }
                if (bArr2 != null) {
                    com.google.android.datatransport.runtime.scheduling.persistence.g gVar2 = (com.google.android.datatransport.runtime.scheduling.persistence.g) k0Var2.i;
                    Objects.requireNonNull(gVar2);
                    com.google.android.datatransport.runtime.firebase.transport.a aVar3 = (com.google.android.datatransport.runtime.firebase.transport.a) gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(gVar2, i3));
                    androidx.compose.ui.node.a1 a1Var = new androidx.compose.ui.node.a1();
                    a1Var.g = new HashMap();
                    a1Var.e = Long.valueOf(((com.google.android.datatransport.runtime.time.a) k0Var2.g).c());
                    a1Var.f = Long.valueOf(((com.google.android.datatransport.runtime.time.a) k0Var2.h).c());
                    a1Var.b = "GDT_CLIENT_METRICS";
                    com.google.android.datatransport.c cVar = new com.google.android.datatransport.c("proto");
                    aVar3.getClass();
                    com.google.android.datatransport.runtime.j jVar = com.google.android.datatransport.runtime.p.a;
                    jVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar.p(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    a1Var.d = new com.google.android.datatransport.runtime.m(cVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((com.google.android.datatransport.cct.b) gVarA).a(a1Var.c()));
                }
                com.google.android.datatransport.cct.b bVar = (com.google.android.datatransport.cct.b) gVarA;
                HashMap map = new HashMap();
                for (com.google.android.datatransport.runtime.i iVar : arrayList) {
                    String str3 = iVar.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    com.google.android.datatransport.runtime.i iVar2 = (com.google.android.datatransport.runtime.i) ((List) entry.getValue()).get(0);
                    com.google.android.datatransport.cct.internal.j0 j0Var = com.google.android.datatransport.cct.internal.j0.e;
                    long jC = bVar.f.c();
                    long jC2 = bVar.e.c();
                    com.google.android.datatransport.cct.internal.n nVar = new com.google.android.datatransport.cct.internal.n(new com.google.android.datatransport.cct.internal.l(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a("model"), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a("manufacturer"), iVar2.a("fingerprint"), iVar2.a("locale"), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (com.google.android.datatransport.runtime.i iVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        com.google.android.datatransport.runtime.m mVar = iVar3.c;
                        byte[] bArr4 = iVar3.j;
                        com.google.android.datatransport.c cVar2 = mVar.a;
                        byte[] bArr5 = mVar.b;
                        long j2 = jMax;
                        if (cVar2.equals(new com.google.android.datatransport.c("proto"))) {
                            k0Var = new k0();
                            k0Var.e = bArr5;
                        } else {
                            if (cVar2.equals(new com.google.android.datatransport.c("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                k0 k0Var3 = new k0();
                                k0Var3.f = str4;
                                k0Var = k0Var3;
                            } else {
                                String strW = androidx.room.t.w("CctTransportBackend");
                                if (Log.isLoggable(strW, 5)) {
                                    Log.w(strW, "Received event of unsupported encoding " + cVar2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        k0Var.a = Long.valueOf(iVar3.d);
                        k0Var.d = Long.valueOf(iVar3.e);
                        String str5 = (String) iVar3.f.get("tz-offset");
                        k0Var.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        k0Var.h = new com.google.android.datatransport.cct.internal.v((com.google.android.datatransport.cct.internal.h0) com.google.android.datatransport.cct.internal.h0.e.get(iVar3.b("net-type")), (com.google.android.datatransport.cct.internal.g0) com.google.android.datatransport.cct.internal.g0.e.get(iVar3.b("mobile-subtype")));
                        Integer num = iVar3.b;
                        if (num != null) {
                            k0Var.b = num;
                        }
                        Integer num2 = iVar3.g;
                        if (num2 != null) {
                            com.google.android.datatransport.cct.internal.r rVar = new com.google.android.datatransport.cct.internal.r(new com.google.android.datatransport.cct.internal.q(num2));
                            com.google.android.datatransport.cct.internal.z zVar = com.google.android.datatransport.cct.internal.z.e;
                            k0Var.c = new com.google.android.datatransport.cct.internal.o(rVar);
                        }
                        byte[] bArr6 = iVar3.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            k0Var.i = new com.google.android.datatransport.cct.internal.p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strConcat = ((Long) k0Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) k0Var.d) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) k0Var.g) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            kotlinx.coroutines.future.a.u("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new com.google.android.datatransport.cct.internal.s(((Long) k0Var.a).longValue(), (Integer) k0Var.b, (com.google.android.datatransport.cct.internal.o) k0Var.c, ((Long) k0Var.d).longValue(), (byte[]) k0Var.e, (String) k0Var.f, ((Long) k0Var.g).longValue(), (com.google.android.datatransport.cct.internal.v) k0Var.h, (com.google.android.datatransport.cct.internal.p) k0Var.i));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new com.google.android.datatransport.cct.internal.t(jC, jC2, nVar, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                com.google.android.datatransport.cct.internal.m mVar2 = new com.google.android.datatransport.cct.internal.m(arrayList3);
                URL urlB = bVar.d;
                if (bArr != null) {
                    try {
                        com.google.android.datatransport.cct.a aVarA = com.google.android.datatransport.cct.a.a(bArr);
                        str = aVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.a;
                        if (str6 != null) {
                            urlB = com.google.android.datatransport.cct.b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(29, urlB, mVar2, str);
                    androidx.activity.y yVar = new androidx.activity.y(bVar, 28);
                    int i5 = 5;
                    do {
                        fVarF = yVar.f(c2Var);
                        URL url = (URL) fVarF.d;
                        if (url != null) {
                            androidx.room.t.m("CctTransportBackend", "Following redirect to: %s", url);
                            c2Var = new androidx.appcompat.widget.c2(29, url, (com.google.android.datatransport.cct.internal.m) c2Var.z, (String) c2Var.A);
                        } else {
                            c2Var = null;
                        }
                        if (c2Var == null) {
                            break;
                        } else {
                            i5--;
                        }
                    } while (i5 >= 1);
                    int i6 = fVarF.b;
                    if (i6 == 200) {
                        aVar2 = new com.google.android.datatransport.runtime.backends.a(1, fVarF.c);
                    } else {
                        if (i6 >= 500 || i6 == 404) {
                            aVar = new com.google.android.datatransport.runtime.backends.a(2, -1L);
                        } else if (i6 == 400) {
                            try {
                                aVar = new com.google.android.datatransport.runtime.backends.a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                androidx.room.t.p("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                aVar2 = new com.google.android.datatransport.runtime.backends.a(2, -1L);
                            }
                        } else {
                            aVar = new com.google.android.datatransport.runtime.backends.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i7 = aVar2.a;
            if (i7 == i2) {
                gVar.L(new com.google.android.datatransport.runtime.scheduling.jobscheduling.g(this, iterable, kVar, j));
                ((com.google.android.datatransport.runtime.j) this.d).u(kVar, i + 1, true);
                return;
            }
            k0Var2 = this;
            kVar2 = kVar;
            jMax = j;
            gVar.L(new androidx.media3.exoplayer.analytics.c(6, k0Var2, iterable));
            if (i7 == 1) {
                jMax = Math.max(jMax, aVar2.b);
                if (bArr != null) {
                    gVar.L(new androidx.activity.y(k0Var2, 29));
                }
            } else if (i7 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((com.google.android.datatransport.runtime.scheduling.persistence.b) it2.next()).c.a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                gVar.L(new androidx.media3.exoplayer.analytics.c(7, k0Var2, map2));
            }
            bArr2 = bArr;
        }
    }
}
