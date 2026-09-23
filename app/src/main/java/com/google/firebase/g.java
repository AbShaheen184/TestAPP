package com.google.firebase;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import androidx.work.impl.k;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.internal.y;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.n;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object k = new Object();
    public static final androidx.collection.f l = new androidx.collection.f(0);
    public final Context a;
    public final String b;
    public final j c;
    public final com.google.firebase.components.g d;
    public final n g;
    public final com.google.firebase.inject.b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, j jVar) {
        ?? arrayList;
        int i = 0;
        this.a = context;
        x.d(str);
        this.b = str;
        this.c = jVar;
        a aVar = FirebaseInitProvider.e;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.google.firebase.components.d((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        com.google.firebase.concurrent.i iVar = com.google.firebase.concurrent.i.e;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new com.google.firebase.components.d(new FirebaseCommonRegistrar(), i2));
        arrayList3.add(new com.google.firebase.components.d(new ExecutorsRegistrar(), i2));
        arrayList4.add(com.google.firebase.components.b.c(context, Context.class, new Class[0]));
        arrayList4.add(com.google.firebase.components.b.c(this, g.class, new Class[0]));
        arrayList4.add(com.google.firebase.components.b.c(jVar, j.class, new Class[0]));
        y yVar = new y(25);
        if (b.L(context) && FirebaseInitProvider.y.get()) {
            arrayList4.add(com.google.firebase.components.b.c(aVar, a.class, new Class[0]));
        }
        com.google.firebase.components.g gVar = new com.google.firebase.components.g(arrayList3, arrayList4, yVar);
        this.d = gVar;
        Trace.endSection();
        this.g = new n(new c(i, this, context));
        this.h = gVar.c(com.google.firebase.heartbeatinfo.d.class);
        d dVar = new d(this);
        a();
        if (this.e.get()) {
            com.google.android.gms.common.api.internal.d.B.e.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((com.google.firebase.heartbeatinfo.d) gVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j jVarA = j.a(context);
                if (jVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, jVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g g(Context context, j jVar) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.d.a(application);
                        com.google.android.gms.common.api.internal.d dVar = com.google.android.gms.common.api.internal.d.B;
                        dVar.getClass();
                        synchronized (dVar) {
                            dVar.z.add(eVar);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            androidx.collection.f fVar = l;
            x.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            x.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", jVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        x.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!b.L(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = f.b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        com.google.firebase.components.g gVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = gVar.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((com.google.firebase.heartbeatinfo.d) this.h.get()).b();
            }
        }
        synchronized (gVar) {
            map = new HashMap(gVar.a);
        }
        gVar.h(map, zEquals);
        ((com.google.firebase.heartbeatinfo.d) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final boolean h() {
        boolean z;
        a();
        com.google.firebase.internal.a aVar = (com.google.firebase.internal.a) this.g.get();
        synchronized (aVar) {
            z = aVar.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.g(this.b, "name");
        kVar.g(this.c, "options");
        return kVar.toString();
    }
}
