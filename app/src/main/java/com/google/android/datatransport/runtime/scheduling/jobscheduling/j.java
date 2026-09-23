package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.source.t0;
import com.appsalt.internal.k0;
import com.caverock.androidsvg.x1;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.y;
import com.google.android.gms.tasks.s;
import com.google.firebase.components.p;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.q;
import com.google.firebase.crashlytics.internal.common.v;
import com.google.firebase.messaging.w;
import com.google.gson.internal.o;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.tasks.TasksKt;
import org.jsoup.helper.n;
import org.jsoup.select.u;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements com.google.android.datatransport.runtime.synchronization.b, com.google.firebase.components.e, com.google.firebase.inject.a, com.google.android.gms.tasks.b, com.google.android.gms.tasks.d, o, u {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ j(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // com.google.gson.internal.o
    public Object a() {
        int i = this.e;
        Object obj = this.y;
        switch (i) {
            case 11:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    com.google.android.gms.dynamite.g gVar = com.google.gson.internal.reflect.c.a;
                    t0.j("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    t0.j("Failed to invoke constructor '" + com.google.gson.internal.reflect.c.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return com.google.gson.internal.u.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // com.google.firebase.inject.a
    public void c(com.google.firebase.inject.b bVar) {
        com.google.firebase.crashlytics.internal.a aVar = (com.google.firebase.crashlytics.internal.a) this.y;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) {
        switch (this.e) {
            case 5:
                ((CountDownLatch) this.y).countDown();
                return null;
            case 6:
                return (com.google.android.gms.tasks.i) ((com.google.firebase.crashlytics.internal.common.k) this.y).call();
            default:
                ((Runnable) this.y).run();
                return n.o(null);
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public Object e() {
        com.google.firebase.messaging.n nVar = (com.google.firebase.messaging.n) this.y;
        Iterator it = ((Iterable) ((com.google.android.datatransport.runtime.scheduling.persistence.g) nVar.z).n(new androidx.transition.k(20))).iterator();
        while (it.hasNext()) {
            ((com.google.android.datatransport.runtime.j) nVar.A).u((com.google.android.datatransport.runtime.k) it.next(), 1, false);
        }
        return null;
    }

    @Override // org.jsoup.select.u
    public void f(org.jsoup.nodes.o oVar, int i) {
        StringBuilder sb = (StringBuilder) this.y;
        if (oVar instanceof org.jsoup.nodes.e) {
            sb.append(((org.jsoup.nodes.e) oVar).J());
        } else if (oVar instanceof org.jsoup.nodes.d) {
            sb.append(((org.jsoup.nodes.d) oVar).J());
        } else if (oVar instanceof org.jsoup.nodes.c) {
            sb.append(((org.jsoup.nodes.c) oVar).J());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:102:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:109:0x0484  */
    /* JADX WARN: Code duplicated, block: B:111:0x048b  */
    /* JADX WARN: Code duplicated, block: B:128:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:131:0x0504  */
    /* JADX WARN: Code duplicated, block: B:133:0x050f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0514  */
    /* JADX WARN: Code duplicated, block: B:155:0x064e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0657  */
    /* JADX WARN: Code duplicated, block: B:161:0x0676  */
    /* JADX WARN: Code duplicated, block: B:170:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:172:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x029b  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0301  */
    /* JADX WARN: Code duplicated, block: B:82:0x037e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0386  */
    /* JADX WARN: Code duplicated, block: B:85:0x038f  */
    /* JADX WARN: Code duplicated, block: B:89:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x03cb A[LOOP:3: B:94:0x03c5->B:96:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x03e2  */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x06dd, please report this as an issue */
    @Override // com.google.firebase.components.e
    public Object g(x1 x1Var) throws Throwable {
        Boolean boolValueOf;
        q qVar;
        String str;
        v vVar;
        int i;
        Throwable th;
        String strI;
        String str2;
        com.google.firebase.crashlytics.b bVar;
        long jCurrentTimeMillis;
        String str3;
        String str4;
        String strD;
        com.google.android.gms.tasks.q qVar2;
        int iD;
        String string;
        String[] strArr;
        ArrayList arrayList;
        int i2;
        StringBuilder sb;
        Iterator it;
        String string2;
        com.google.android.gms.tasks.q qVar3;
        String strH;
        int i3;
        q qVar4;
        k0 k0Var;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i4;
        com.google.firebase.crashlytics.internal.settings.a aVarA;
        m mVar;
        s sVarI;
        Context context;
        boolean z;
        String str5;
        boolean zExists;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        com.google.firebase.crashlytics.internal.settings.a aVarA2;
        String str6;
        String string3;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.y;
        int i5 = CrashlyticsRegistrar.d;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        com.google.firebase.g gVar = (com.google.firebase.g) x1Var.a(com.google.firebase.g.class);
        com.google.firebase.installations.d dVar = (com.google.firebase.installations.d) x1Var.a(com.google.firebase.installations.d.class);
        p pVarK = x1Var.K(com.google.firebase.crashlytics.internal.a.class);
        p pVarK2 = x1Var.K(com.google.firebase.analytics.connector.a.class);
        p pVarK3 = x1Var.K(com.google.firebase.remoteconfig.interop.a.class);
        ExecutorService executorService = (ExecutorService) x1Var.f(crashlyticsRegistrar.a);
        ExecutorService executorService2 = (ExecutorService) x1Var.f(crashlyticsRegistrar.b);
        ExecutorService executorService3 = (ExecutorService) x1Var.f(crashlyticsRegistrar.c);
        gVar.a();
        Context context2 = gVar.a;
        String packageName = context2.getPackageName();
        Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.5 for " + packageName, null);
        com.google.firebase.crashlytics.internal.concurrency.d dVar2 = new com.google.firebase.crashlytics.internal.concurrency.d(executorService, executorService2);
        com.google.firebase.crashlytics.internal.persistence.c cVar = new com.google.firebase.crashlytics.internal.persistence.c(context2);
        m mVar2 = new m();
        mVar2.z = new Object();
        mVar2.A = new com.google.android.gms.tasks.j();
        mVar2.e = false;
        mVar2.C = new com.google.android.gms.tasks.j();
        gVar.a();
        Context context3 = gVar.a;
        mVar2.y = gVar;
        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            mVar2.e = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context3.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context3.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                mVar2.e = false;
                boolValueOf3 = null;
            } else {
                mVar2.e = true;
                boolValueOf3 = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
            boolValueOf = boolValueOf3;
        }
        mVar2.B = boolValueOf;
        synchronized (mVar2.z) {
            try {
                if (mVar2.a()) {
                    ((com.google.android.gms.tasks.j) mVar2.A).d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v vVar2 = new v(context2, packageName, dVar, mVar2);
        com.google.firebase.crashlytics.internal.a aVar = new com.google.firebase.crashlytics.internal.a(pVarK);
        com.google.firebase.crashlytics.internal.breadcrumbs.b bVar2 = new com.google.firebase.crashlytics.internal.breadcrumbs.b();
        a0 a0Var = new a0(22);
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f();
        fVar.c = bVar2;
        fVar.a = new ArrayList();
        fVar.b = a0Var;
        pVarK2.a(new com.google.firebase.crashlytics.a(fVar));
        com.google.firebase.crashlytics.internal.common.j jVar = new com.google.firebase.crashlytics.internal.common.j(mVar2, cVar);
        com.google.firebase.sessions.api.c cVar2 = com.google.firebase.sessions.api.c.a;
        com.google.firebase.sessions.api.d dVar3 = com.google.firebase.sessions.api.d.e;
        com.google.firebase.sessions.api.c cVar3 = com.google.firebase.sessions.api.c.a;
        com.google.firebase.sessions.api.a aVarA3 = com.google.firebase.sessions.api.c.a(dVar3);
        if (aVarA3.b != null) {
            Log.d("FirebaseSessions", "Subscriber " + dVar3 + " already registered.");
        } else {
            aVarA3.b = jVar;
            Log.d("FirebaseSessions", "Subscriber " + dVar3 + " registered.");
            Mutex.DefaultImpls.unlock$default(aVarA3.a, null, 1, null);
        }
        v vVar3 = vVar2;
        q qVar5 = new q(gVar, vVar3, aVar, mVar2, new com.google.firebase.crashlytics.a(fVar), new com.google.firebase.crashlytics.a(fVar), cVar, jVar, new com.google.android.material.behavior.d(pVarK3), dVar2);
        com.google.firebase.crashlytics.internal.concurrency.d dVar4 = qVar5.o;
        gVar.a();
        String str7 = gVar.c.b;
        int iD2 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD2 == 0) {
            iD2 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.crashlytics.android.build_id", "string");
        }
        String string4 = iD2 != 0 ? context2.getResources().getString(iD2) : null;
        ArrayList<com.google.firebase.crashlytics.internal.common.d> arrayList2 = new ArrayList();
        int iD3 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iD4 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD5 = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        try {
            try {
                try {
                    if (iD3 == 0 || iD4 == 0 || iD5 == 0) {
                        qVar = qVar5;
                        str = str7;
                        vVar = vVar3;
                        String str8 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iD3), Integer.valueOf(iD4), Integer.valueOf(iD5));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            th = null;
                            Log.d("FirebaseCrashlytics", str8, null);
                        }
                        strI = androidx.compose.runtime.j.i("Mapping file ID is: ", string4);
                        if (Log.isLoggable("FirebaseCrashlytics", i)) {
                            Log.d("FirebaseCrashlytics", strI, th);
                        }
                        for (com.google.firebase.crashlytics.internal.common.d dVar5 : arrayList2) {
                            String str9 = dVar5.a;
                            String str10 = dVar5.b;
                            String str11 = dVar5.c;
                            StringBuilder sbQ = androidx.compose.runtime.j.q("Build id for ", str9, " on ", str10, ": ");
                            sbQ.append(str11);
                            string3 = sbQ.toString();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", string3, null);
                            }
                        }
                        String str12 = str;
                        v vVar4 = vVar;
                        com.google.firebase.crashlytics.internal.common.a aVarA4 = com.google.firebase.crashlytics.internal.common.a.a(context2, vVar4, str12, string4, arrayList2, new com.google.android.material.internal.k(context2));
                        str4 = "Installer package name is: " + aVarA4.d;
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", str4, null);
                        }
                        int i6 = 23;
                        new a0(i6);
                        String str13 = aVarA4.f;
                        String str14 = aVarA4.g;
                        strD = vVar4.d();
                        y yVar = new y(i6);
                        qVar2 = new com.google.android.gms.tasks.q(yVar);
                        com.google.android.gms.tasks.q qVar6 = new com.google.android.gms.tasks.q();
                        qVar6.e = new File((File) cVar.c, "com.crashlytics.settings.json");
                        Locale locale = Locale.US;
                        String strR = androidx.privacysandbox.ads.adservices.java.internal.a.r("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str12, "/settings");
                        androidx.media3.container.a aVar2 = new androidx.media3.container.a();
                        aVar2.e = strR;
                        String str15 = Build.MANUFACTURER;
                        String str16 = v.h;
                        String strJ = androidx.compose.runtime.j.j(str15.replaceAll(str16, ""), "/", Build.MODEL.replaceAll(str16, ""));
                        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str16, "");
                        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str16, "");
                        iD = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                        if (iD == 0) {
                            iD = com.google.firebase.crashlytics.internal.common.g.d(context2, "com.crashlytics.android.build_id", "string");
                        }
                        if (iD != 0) {
                            string = context2.getResources().getString(iD);
                        } else {
                            string = null;
                        }
                        strArr = new String[]{string, str12, str14, str13};
                        arrayList = new ArrayList();
                        i2 = 0;
                        while (i2 < 4) {
                            str6 = strArr[i2];
                            int i7 = i2;
                            if (str6 != null) {
                                arrayList.add(str6.replace("-", "").toLowerCase(Locale.US));
                            }
                            i2 = i7 + 1;
                        }
                        Collections.sort(arrayList);
                        sb = new StringBuilder();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            sb.append((String) it.next());
                        }
                        string2 = sb.toString();
                        if (string2.length() > 0) {
                            strH = com.google.firebase.crashlytics.internal.common.g.h(string2);
                            qVar3 = qVar2;
                        } else {
                            qVar3 = qVar2;
                            strH = null;
                        }
                        if (strD != null) {
                            i3 = 4;
                        } else {
                            i3 = 1;
                        }
                        com.google.android.gms.tasks.q qVar7 = qVar3;
                        qVar4 = qVar;
                        com.google.firebase.crashlytics.internal.settings.c cVar4 = new com.google.firebase.crashlytics.internal.settings.c(str12, strJ, strReplaceAll, strReplaceAll2, vVar4, strH, str14, str13, com.google.android.datatransport.runtime.a.j(i3));
                        k0Var = new k0();
                        AtomicReference atomicReference3 = new AtomicReference();
                        k0Var.h = atomicReference3;
                        k0Var.i = new AtomicReference(new com.google.android.gms.tasks.j());
                        k0Var.a = context2;
                        k0Var.b = cVar4;
                        k0Var.d = yVar;
                        k0Var.c = qVar7;
                        k0Var.e = qVar6;
                        k0Var.f = aVar2;
                        k0Var.g = mVar2;
                        atomicReference3.set(b0.c(yVar));
                        atomicReference = (AtomicReference) k0Var.i;
                        atomicReference2 = (AtomicReference) k0Var.h;
                        i4 = 10;
                        if (((Context) k0Var.a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(((com.google.firebase.crashlytics.internal.settings.c) k0Var.b).f) || (aVarA2 = k0Var.a(1)) == null) {
                            aVarA = k0Var.a(3);
                            if (aVarA != null) {
                                atomicReference2.set(aVarA);
                                ((com.google.android.gms.tasks.j) atomicReference.get()).d(aVarA);
                            }
                            mVar = (m) k0Var.g;
                            s sVar = ((com.google.android.gms.tasks.j) mVar.C).a;
                            synchronized (mVar.z) {
                                s sVar2 = ((com.google.android.gms.tasks.j) mVar.A).a;
                            }
                            sVarI = com.google.firebase.crashlytics.internal.concurrency.a.a(sVar, sVar2).i(dVar2.a, new com.google.android.material.internal.k(i4, k0Var, dVar2, false));
                        } else {
                            atomicReference2.set(aVarA2);
                            ((com.google.android.gms.tasks.j) atomicReference.get()).d(aVarA2);
                            sVarI = n.o(null);
                        }
                        sVarI.b(executorService3, new com.google.firebase.i(i4));
                        com.google.firebase.crashlytics.internal.persistence.c cVar5 = qVar4.i;
                        context = qVar4.a;
                        if (context != null || (resources = context.getResources()) == null) {
                            z = true;
                        } else {
                            int iD6 = com.google.firebase.crashlytics.internal.common.g.d(context, "com.crashlytics.RequireBuildId", "bool");
                            if (iD6 > 0) {
                                z = resources.getBoolean(iD6);
                            } else {
                                int iD7 = com.google.firebase.crashlytics.internal.common.g.d(context, "com.crashlytics.RequireBuildId", "string");
                                if (iD7 > 0) {
                                    z = Boolean.parseBoolean(context.getString(iD7));
                                } else {
                                    z = true;
                                }
                            }
                        }
                        str5 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04fc: IGET (r8v10 'str5' java.lang.String) = (r41v0 ?? I:??[OBJECT, ARRAY]) (LINE:1277) com.google.firebase.crashlytics.internal.common.a.b java.lang.String in method: com.google.android.datatransport.runtime.scheduling.jobscheduling.j.g(com.caverock.androidsvg.x1):java.lang.Object, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1790
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.j.g(com.caverock.androidsvg.x1):java.lang.Object");
                    }

                    @Override // com.google.android.gms.tasks.d
                    public void onComplete(com.google.android.gms.tasks.i iVar) {
                        switch (this.e) {
                            case 8:
                                com.google.firebase.messaging.u.c((Intent) this.y);
                                break;
                            case 9:
                                ((w) this.y).b.d(null);
                                break;
                            case 10:
                                ((ScheduledFuture) this.y).cancel(false);
                                break;
                            default:
                                TasksKt.asDeferredImpl$lambda$1((CompletableDeferred) this.y, iVar);
                                break;
                        }
                    }
                }
