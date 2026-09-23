package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.v;
import com.app.mlounge.ui.viewmodel.g0;
import com.appsalt.internal.t4;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final androidx.datastore.preferences.core.d b = new androidx.datastore.preferences.core.d("fire-global");
    public static final androidx.datastore.preferences.core.d c = new androidx.datastore.preferences.core.d("fire-count");
    public static final androidx.datastore.preferences.core.d d = new androidx.datastore.preferences.core.d("last-used-date");
    public final com.google.firebase.datastorage.b a;

    public h(Context context, String str) {
        this.a = new com.google.firebase.datastorage.b(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            com.google.firebase.datastorage.b bVar = this.a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) BuildersKt__BuildersKt.runBlocking$default(null, new t4(bVar, null, 2), 1, null)).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((androidx.datastore.preferences.core.d) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new androidx.compose.foundation.text.c(jCurrentTimeMillis, 10));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized androidx.datastore.preferences.core.d c(androidx.datastore.preferences.core.a aVar, String str) {
        for (Map.Entry entry : aVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((androidx.datastore.preferences.core.d) entry.getKey()).a;
                        str2.getClass();
                        return new androidx.datastore.preferences.core.d(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(androidx.datastore.preferences.core.a aVar, String str) {
        try {
            androidx.datastore.preferences.core.d dVarC = c(aVar, str);
            if (dVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) v.z(aVar, dVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                aVar.d(dVarC);
            } else {
                aVar.f(dVarC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(androidx.datastore.preferences.core.d dVar, long j) {
        kotlin.coroutines.d dVar2;
        long jLongValue;
        com.google.firebase.datastorage.b bVar = this.a;
        bVar.getClass();
        dVar.getClass();
        dVar2 = null;
        jLongValue = ((Long) BuildersKt__BuildersKt.runBlocking$default(null, new g0(bVar, dVar, dVar2, 13), 1, null)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        com.google.firebase.datastorage.b bVar2 = this.a;
        Long lValueOf = Long.valueOf(j);
        bVar2.getClass();
        return true;
    }
}
