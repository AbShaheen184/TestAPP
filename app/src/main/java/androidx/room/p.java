package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import androidx.compose.foundation.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final kotlin.jvm.internal.e a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public androidx.media3.common.audio.c h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final q j = q.e;
    public final long k = -1;
    public final androidx.collection.internal.b l = new androidx.collection.internal.b(3);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;

    public p(Context context, Class cls, String str) {
        this.a = kotlin.jvm.internal.a0.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(androidx.room.migration.a... aVarArr) {
        for (androidx.room.migration.a aVar : aVarArr) {
            Integer numValueOf = Integer.valueOf(aVar.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(aVar.b));
        }
        androidx.room.migration.a[] aVarArr2 = (androidx.room.migration.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        androidx.collection.internal.b bVar = this.l;
        bVar.getClass();
        for (androidx.room.migration.a aVar2 : aVarArr2) {
            bVar.e(aVar2);
        }
    }

    public final r b() {
        String name;
        androidx.emoji2.text.g gVar;
        androidx.sqlite.db.b delegate;
        androidx.sqlite.db.b delegate2;
        boolean zContainsKey;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            androidx.arch.core.executor.a aVar = androidx.arch.core.executor.b.o;
            this.g = aVar;
            this.f = aVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    kotlinx.coroutines.future.a.s(androidx.privacysandbox.ads.adservices.java.internal.a.n(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        androidx.sqlite.db.a fVar = this.h;
        if (fVar == null) {
            fVar = new com.google.android.material.shape.f(18);
        }
        androidx.sqlite.db.a aVar2 = fVar;
        if (this.k > 0) {
            if (this.c != null) {
                kotlinx.coroutines.future.a.q("Required value was null.");
                return null;
            }
            kotlinx.coroutines.future.a.q("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.i;
        q qVar = this.j;
        qVar.getClass();
        Context context = this.b;
        context.getClass();
        if (qVar == q.e) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            qVar = (activityManager == null || activityManager.isLowRamDevice()) ? q.y : q.z;
        }
        Executor executor2 = this.f;
        if (executor2 == null) {
            kotlinx.coroutines.future.a.q("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            kotlinx.coroutines.future.a.q("Required value was null.");
            return null;
        }
        a aVar3 = new a(context, this.c, aVar2, this.l, this.d, z, qVar, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, this.e, this.o, this.r, null, null);
        aVar3.r = this.s;
        Class clsD = kotlin.collections.c0.d(this.a);
        Package r4 = clsD.getPackage();
        if (r4 == null || (name = r4.getName()) == null) {
            name = "";
        }
        String canonicalName = clsD.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader());
            cls.getClass();
            r rVar = (r) cls.getDeclaredConstructor(null).newInstance(null);
            rVar.getClass();
            rVar.k = aVar3.r;
            try {
                androidx.emoji2.text.g gVarE = rVar.e();
                gVarE.getClass();
                gVar = gVarE;
            } catch (kotlin.j unused) {
                gVar = null;
            }
            if (gVar == null) {
                new androidx.constraintlayout.core.widgets.analyzer.e(aVar3, new androidx.navigation.compose.r(rVar), new t0(2, rVar, t.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                throw null;
            }
            rVar.e = new androidx.constraintlayout.core.widgets.analyzer.e(aVar3, gVar, new t0(2, rVar, t.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
            rVar.f = rVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setI = rVar.i();
            List list = aVar3.n;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setI.iterator();
            while (true) {
                int i = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                kotlinx.coroutines.future.a.q("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    for (androidx.room.migration.a aVar4 : rVar.c(linkedHashMap)) {
                        int i3 = aVar4.a;
                        int i4 = aVar4.b;
                        androidx.collection.internal.b bVar = aVar3.d;
                        LinkedHashMap linkedHashMap2 = bVar.e;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i3))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i3));
                            if (map == null) {
                                map = kotlin.collections.x.e;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i4));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            bVar.e(aVar4);
                        }
                    }
                    LinkedHashMap linkedHashMapJ = rVar.j();
                    List list2 = aVar3.m;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapJ.entrySet()) {
                        kotlin.reflect.c cVar = (kotlin.reflect.c) entry.getKey();
                        for (kotlin.reflect.c cVar2 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i5 = size3 - 1;
                                if (((kotlin.jvm.internal.e) cVar2).d(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i5 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i5;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((kotlin.jvm.internal.e) cVar2).b() + ") for " + ((kotlin.jvm.internal.e) cVar).b() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size3);
                            cVar2.getClass();
                            obj.getClass();
                            rVar.j.put(cVar2, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i6 = size4 - 1;
                            if (!zArr2[size4]) {
                                androidx.media3.exoplayer.source.t0.m(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                return null;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size4 = i6;
                        }
                    }
                    rVar.c = aVar3.h;
                    rVar.d = new y(aVar3.i, 0);
                    Executor executor4 = rVar.c;
                    if (executor4 == null) {
                        kotlin.jvm.internal.l.f("internalQueryExecutor");
                        throw null;
                    }
                    CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executor4).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                    rVar.a = CoroutineScope;
                    if (CoroutineScope == null) {
                        kotlin.jvm.internal.l.f("coroutineScope");
                        throw null;
                    }
                    kotlin.coroutines.j coroutineContext = CoroutineScope.getCoroutineContext();
                    y yVar = rVar.d;
                    if (yVar == null) {
                        kotlin.jvm.internal.l.f("internalTransactionExecutor");
                        throw null;
                    }
                    rVar.b = coroutineContext.plus(ExecutorsKt.from(yVar));
                    rVar.h = aVar3.f;
                    androidx.constraintlayout.core.widgets.analyzer.e eVar = rVar.e;
                    if (eVar == null) {
                        kotlin.jvm.internal.l.f("connectionManager");
                        throw null;
                    }
                    androidx.sqlite.db.b bVar2 = (androidx.sqlite.db.b) eVar.h;
                    if (bVar2 == null) {
                        delegate = null;
                        break;
                    }
                    delegate = bVar2;
                    while (!(delegate instanceof androidx.room.support.b)) {
                        if (!(delegate instanceof b)) {
                            delegate = null;
                            break;
                        }
                        delegate = ((b) delegate).getDelegate();
                    }
                    androidx.constraintlayout.core.widgets.analyzer.e eVar2 = rVar.e;
                    if (eVar2 == null) {
                        kotlin.jvm.internal.l.f("connectionManager");
                        throw null;
                    }
                    androidx.sqlite.db.b bVar3 = (androidx.sqlite.db.b) eVar2.h;
                    if (bVar3 == null) {
                        delegate2 = null;
                        break;
                    }
                    delegate2 = bVar3;
                    while (!(delegate2 instanceof androidx.room.support.a)) {
                        if (!(delegate2 instanceof b)) {
                            delegate2 = null;
                            break;
                        }
                        delegate2 = ((b) delegate2).getDelegate();
                    }
                    return rVar;
                }
                kotlin.reflect.c cVar3 = (kotlin.reflect.c) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i7 = size5 - 1;
                        if (((kotlin.jvm.internal.e) cVar3).d(list.get(size5))) {
                            zArr[size5] = true;
                            i = size5;
                            break;
                        }
                        if (i7 < 0) {
                            break;
                        }
                        size5 = i7;
                    }
                }
                if (i < 0) {
                    androidx.media3.exoplayer.source.t0.g(((kotlin.jvm.internal.e) cVar3).b(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(cVar3, list.get(i));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsD.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsD.getCanonicalName(), e3);
        }
    }
}
