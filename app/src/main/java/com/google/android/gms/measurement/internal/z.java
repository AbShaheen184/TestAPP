package com.google.android.gms.measurement.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements w, com.google.firebase.events.a, com.google.firebase.crashlytics.internal.metadata.d, com.google.firebase.crashlytics.internal.stacktrace.a {
    public final /* synthetic */ int e;
    public static final /* synthetic */ z y = new z(0);
    public static final /* synthetic */ z z = new z(1);
    public static final /* synthetic */ z A = new z(2);
    public static final /* synthetic */ z B = new z(3);
    public static final /* synthetic */ z C = new z(4);
    public static final /* synthetic */ z D = new z(5);
    public static final /* synthetic */ z E = new z(6);
    public static final /* synthetic */ z F = new z(7);
    public static final /* synthetic */ z G = new z(8);
    public static final /* synthetic */ z H = new z(9);
    public static final /* synthetic */ z I = new z(10);
    public static final /* synthetic */ z J = new z(11);
    public static final /* synthetic */ z K = new z(12);
    public static final /* synthetic */ z L = new z(13);
    public static final /* synthetic */ z M = new z(14);
    public static final /* synthetic */ z N = new z(15);
    public static final /* synthetic */ z O = new z(16);
    public static final /* synthetic */ z P = new z(17);
    public static final /* synthetic */ z Q = new z(18);
    public static final /* synthetic */ z R = new z(19);
    public static final /* synthetic */ z S = new z(20);
    public static final /* synthetic */ z T = new z(21);
    public static final /* synthetic */ z U = new z(22);

    public /* synthetic */ z(int i) {
        this.e = i;
    }

    public static final void e(okio.c cVar) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = okio.c.h;
        if (okio.c.i == null) {
            okio.c.i = new okio.c();
            com.google.android.gms.dynamite.f fVar = new com.google.android.gms.dynamite.f("Okio Watchdog");
            fVar.setDaemon(true);
            fVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = cVar.c;
        boolean z2 = cVar.a;
        if (j != 0 && z2) {
            cVar.g = Math.min(j, cVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            cVar.g = jNanoTime + j;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            cVar.g = cVar.c();
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar2 = okio.c.h;
        int i = lVar2.y + 1;
        lVar2.y = i;
        okio.c[] cVarArr = (okio.c[]) lVar2.z;
        if (i == cVarArr.length) {
            okio.c[] cVarArr2 = new okio.c[i * 2];
            kotlin.collections.o.j(0, 0, 14, cVarArr, cVarArr2);
            lVar2.z = cVarArr2;
        }
        lVar2.g(i, cVar);
        if (cVar.f == 1) {
            okio.c.k.signal();
        }
    }

    public static ArrayList g(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((okhttp3.z) obj) != okhttp3.z.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((okhttp3.z) it.next()).e);
        }
        return arrayList2;
    }

    public static okio.c h() throws InterruptedException {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = okio.c.h;
        okio.c cVar = ((okio.c[]) lVar.z)[1];
        if (cVar == null) {
            long jNanoTime = System.nanoTime();
            okio.c.k.await(okio.c.l, TimeUnit.MILLISECONDS);
            if (((okio.c[]) lVar.z)[1] != null || System.nanoTime() - jNanoTime < okio.c.m) {
                return null;
            }
            return okio.c.i;
        }
        long jNanoTime2 = cVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            okio.c.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        lVar.n(cVar);
        cVar.e = 2;
        return cVar;
    }

    public static String i(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static byte[] j(List list) {
        list.getClass();
        okio.f fVar = new okio.f();
        for (String str : g(list)) {
            fVar.o0(str.length());
            fVar.u0(str);
        }
        return fVar.d0(fVar.y);
    }

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        switch (this.e) {
            case 0:
                List list = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(40, 240000L, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 1:
                List list2 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(65, 3600000L, "measurement.upload.interval").get();
            case 2:
                List list3 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(27, 60000L, "measurement.alarm_manager.minimum_interval").get();
            case 3:
                List list4 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.config.url_scheme", 8, "https").get();
            case 4:
                List list5 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
            case 5:
                List list6 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(38, 1000L, "measurement.service_client.reconnect_millis").get();
            case 6:
                List list7 = f0.a;
                com.google.android.gms.internal.measurement.e4.y.get();
                return (Long) com.google.android.gms.internal.measurement.f4.a.g(4, -1L, "measurement.test.long_flag").get();
            case 7:
                List list8 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 8:
                List list9 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 9:
                List list10 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 10:
                List list11 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Long) com.google.android.gms.internal.measurement.f3.a.g(12, 3600000L, "measurement.session.engagement_interval").get();
            case 11:
                List list12 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (String) com.google.android.gms.internal.measurement.f3.a.i("measurement.rb.attribution.query_parameters_to_remove", 59, "").get();
            case 12:
                List list13 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case 13:
                List list14 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.f3.a.b(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case 14:
                List list15 = f0.a;
                com.google.android.gms.internal.measurement.e3.y.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.f3.a.g(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case 15:
                List list16 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.a4.a.get();
            case 16:
                List list17 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.s3.a.get();
            case 17:
                List list18 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.t4.a.get();
            case 18:
                List list19 = f0.a;
                com.google.android.gms.internal.measurement.g4.y.get();
                return (Boolean) com.google.android.gms.internal.measurement.h4.a.b(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case 19:
                List list20 = f0.a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.b.get();
            case 20:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.y3.a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.r4.a.get()).booleanValue());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public String c() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    public com.google.gson.internal.o k(com.google.gson.reflect.a aVar, boolean z2) {
        com.google.gson.internal.o oVar;
        final String str;
        com.google.gson.internal.o jVar;
        final Type typeB = aVar.b();
        Class clsA = aVar.a();
        Map map = Collections.EMPTY_MAP;
        com.google.firebase.platforminfo.b bVar = null;
        if (map.get(typeB) != null) {
            androidx.transition.k.h();
            return null;
        }
        if (map.get(clsA) != null) {
            androidx.transition.k.h();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        if (EnumSet.class.isAssignableFrom(clsA)) {
            oVar = new com.google.gson.internal.o() { // from class: com.google.gson.internal.b
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i2) {
                        case 0:
                            Type type = typeB;
                            if (type instanceof ParameterizedType) {
                                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                                if (type2 instanceof Class) {
                                    return EnumSet.noneOf((Class) type2);
                                }
                                com.google.firebase.platforminfo.b.m(type, "Invalid EnumSet type: ");
                            } else {
                                com.google.firebase.platforminfo.b.m(type, "Invalid EnumSet type: ");
                            }
                            return null;
                        default:
                            Type type3 = typeB;
                            if (type3 instanceof ParameterizedType) {
                                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                                if (type4 instanceof Class) {
                                    return new EnumMap((Class) type4);
                                }
                                com.google.firebase.platforminfo.b.m(type3, "Invalid EnumMap type: ");
                            } else {
                                com.google.firebase.platforminfo.b.m(type3, "Invalid EnumMap type: ");
                            }
                            return null;
                    }
                }
            };
        } else {
            oVar = clsA == EnumMap.class ? new com.google.gson.internal.o() { // from class: com.google.gson.internal.b
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i) {
                        case 0:
                            Type type = typeB;
                            if (type instanceof ParameterizedType) {
                                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                                if (type2 instanceof Class) {
                                    return EnumSet.noneOf((Class) type2);
                                }
                                com.google.firebase.platforminfo.b.m(type, "Invalid EnumSet type: ");
                            } else {
                                com.google.firebase.platforminfo.b.m(type, "Invalid EnumSet type: ");
                            }
                            return null;
                        default:
                            Type type3 = typeB;
                            if (type3 instanceof ParameterizedType) {
                                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                                if (type4 instanceof Class) {
                                    return new EnumMap((Class) type4);
                                }
                                com.google.firebase.platforminfo.b.m(type3, "Invalid EnumMap type: ");
                            } else {
                                com.google.firebase.platforminfo.b.m(type3, "Invalid EnumMap type: ");
                            }
                            return null;
                    }
                }
            } : null;
        }
        if (oVar != null) {
            return oVar;
        }
        List list = Collections.EMPTY_LIST;
        com.google.gson.internal.h.e();
        int i3 = 11;
        if (Modifier.isAbstract(clsA.getModifiers())) {
            jVar = null;
        } else {
            try {
                Constructor declaredConstructor = clsA.getDeclaredConstructor(null);
                com.google.android.gms.dynamite.g gVar = com.google.gson.internal.reflect.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + com.google.gson.internal.reflect.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + com.google.gson.internal.reflect.c.e(e);
                }
                jVar = str != null ? new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
                    @Override // com.google.gson.internal.o
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                throw new com.google.gson.h(str, 8);
                            case 1:
                                throw new com.google.gson.h(str, 8);
                            default:
                                throw new com.google.gson.h(str, 8);
                        }
                    }
                } : new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(declaredConstructor, i3);
            } catch (NoSuchMethodException unused) {
                jVar = null;
            }
        }
        if (jVar != null) {
            return jVar;
        }
        int i4 = 12;
        if (Collection.class.isAssignableFrom(clsA)) {
            if (clsA.isAssignableFrom(ArrayList.class)) {
                bVar = new com.google.firebase.platforminfo.b(13);
            } else if (clsA.isAssignableFrom(LinkedHashSet.class)) {
                bVar = new com.google.firebase.platforminfo.b(14);
            } else if (clsA.isAssignableFrom(TreeSet.class)) {
                bVar = new com.google.firebase.platforminfo.b(15);
            } else if (clsA.isAssignableFrom(ArrayDeque.class)) {
                bVar = new com.google.firebase.platforminfo.b(16);
            }
        } else if (Map.class.isAssignableFrom(clsA)) {
            if (clsA.isAssignableFrom(com.google.gson.internal.n.class)) {
                if (typeB instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) typeB).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || com.google.gson.internal.h.g(actualTypeArguments[0]) != String.class) {
                        if (clsA.isAssignableFrom(LinkedHashMap.class)) {
                            bVar = new com.google.firebase.platforminfo.b(9);
                        } else if (clsA.isAssignableFrom(TreeMap.class)) {
                            bVar = new com.google.firebase.platforminfo.b(10);
                        } else if (clsA.isAssignableFrom(ConcurrentHashMap.class)) {
                            bVar = new com.google.firebase.platforminfo.b(i3);
                        } else if (clsA.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            bVar = new com.google.firebase.platforminfo.b(i4);
                        }
                    }
                }
                bVar = new com.google.firebase.platforminfo.b(8);
            } else if (clsA.isAssignableFrom(LinkedHashMap.class)) {
                bVar = new com.google.firebase.platforminfo.b(9);
            } else if (clsA.isAssignableFrom(TreeMap.class)) {
                bVar = new com.google.firebase.platforminfo.b(10);
            } else if (clsA.isAssignableFrom(ConcurrentHashMap.class)) {
                bVar = new com.google.firebase.platforminfo.b(i3);
            } else if (clsA.isAssignableFrom(ConcurrentSkipListMap.class)) {
                bVar = new com.google.firebase.platforminfo.b(i4);
            }
        }
        if (bVar != null) {
            return bVar;
        }
        final String strI = i(clsA);
        if (strI != null) {
            return new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.o
                public final Object a() {
                    switch (i) {
                        case 0:
                            throw new com.google.gson.h(strI, 8);
                        case 1:
                            throw new com.google.gson.h(strI, 8);
                        default:
                            throw new com.google.gson.h(strI, 8);
                    }
                }
            };
        }
        if (z2) {
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.j(clsA, i4);
        }
        final String str2 = "Unable to create instance of " + clsA + "; Register an InstanceCreator or a TypeAdapter for this type.";
        final int i5 = 2;
        return new com.google.gson.internal.o() { // from class: com.google.gson.internal.a
            @Override // com.google.gson.internal.o
            public final Object a() {
                switch (i5) {
                    case 0:
                        throw new com.google.gson.h(str2, 8);
                    case 1:
                        throw new com.google.gson.h(str2, 8);
                    default:
                        throw new com.google.gson.h(str2, 8);
                }
            }
        };
    }

    public String toString() {
        switch (this.e) {
            case 25:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void b() {
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.d
    public void d(String str, long j) {
    }
}
