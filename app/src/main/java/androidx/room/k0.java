package androidx.room;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final r a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final androidx.compose.foundation.c e;
    public final String[] g;
    public final j h;
    public final androidx.datastore.core.a0 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public kotlin.jvm.functions.a k = new androidx.compose.runtime.c0(12);
    public final LinkedHashMap f = new LinkedHashMap();

    public k0(r rVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, androidx.compose.foundation.c cVar) {
        String lowerCase;
        this.a = rVar;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = cVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, kotlin.collections.c0.g(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new j(this.g.length);
        this.i = new androidx.datastore.core.a0(this.g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(k0 k0Var, m mVar, kotlin.coroutines.jvm.internal.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i = c0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.A = i - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(k0Var, cVar);
            }
        } else {
            c0Var = new c0(k0Var, cVar);
        }
        Object objB = c0Var.y;
        int i2 = c0Var.A;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 == 0) {
            kotlin.a.e(objB);
            androidx.navigation.compose.r rVar = new androidx.navigation.compose.r(7);
            c0Var.e = mVar;
            c0Var.A = 1;
            objB = mVar.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", rVar, c0Var);
            if (objB != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) c0Var.e;
            kotlin.a.e(objB);
            return set;
        }
        mVar = (m) c0Var.e;
        kotlin.a.e(objB);
        Set set2 = (Set) objB;
        if (!set2.isEmpty()) {
            c0Var.e = set2;
            c0Var.A = 2;
            if (com.google.firebase.b.w(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(k0 k0Var, kotlin.coroutines.jvm.internal.c cVar) throws Throwable {
        e0 e0Var;
        androidx.localbroadcastmanager.content.b bVar;
        Object value;
        int[] iArr;
        r rVar = k0Var.a;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i = e0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0Var.A = i - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(k0Var, cVar);
            }
        } else {
            e0Var = new e0(k0Var, cVar);
        }
        Object obj = e0Var.y;
        int i2 = e0Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            androidx.localbroadcastmanager.content.b bVar2 = rVar.g;
            boolean zN = bVar2.n();
            kotlin.collections.y yVar = kotlin.collections.y.e;
            if (!zN) {
                return yVar;
            }
            try {
                if (!k0Var.j.compareAndSet(true, false)) {
                    bVar2.I();
                    return yVar;
                }
                if (!((Boolean) k0Var.k.invoke()).booleanValue()) {
                    bVar2.I();
                    return yVar;
                }
                f0 f0Var = new f0(k0Var, null, 1);
                e0Var.e = bVar2;
                e0Var.A = 1;
                Object objQ = rVar.q(false, f0Var, e0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objQ == aVar) {
                    return aVar;
                }
                bVar = bVar2;
                obj = objQ;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                bVar.I();
                throw th;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = e0Var.e;
            try {
                kotlin.a.e(obj);
            } catch (Throwable th2) {
                th = th2;
                bVar.I();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            androidx.datastore.core.a0 a0Var = k0Var.i;
            a0Var.getClass();
            set.getClass();
            if (!set.isEmpty()) {
                MutableStateFlow mutableStateFlow = a0Var.a;
                do {
                    value = mutableStateFlow.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!mutableStateFlow.compareAndSet(value, iArr));
            }
            k0Var.e.invoke(set);
        }
        bVar.I();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (com.google.firebase.b.w(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (com.google.firebase.b.w(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.room.k0 r17, androidx.room.a0 r18, int r19, kotlin.coroutines.jvm.internal.c r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.k0.c(androidx.room.k0, androidx.room.a0, int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(androidx.room.k0 r7, androidx.room.a0 r8, int r9, kotlin.coroutines.jvm.internal.c r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof androidx.room.h0
            if (r0 == 0) goto L16
            r0 = r10
            androidx.room.h0 r0 = (androidx.room.h0) r0
            int r1 = r0.E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.E = r1
            goto L1b
        L16:
            androidx.room.h0 r0 = new androidx.room.h0
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.C
            int r1 = r0.E
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.B
            int r8 = r0.A
            java.lang.String[] r9 = r0.z
            java.lang.String r1 = r0.y
            androidx.room.m r3 = r0.e
            kotlin.a.e(r10)
            r10 = r9
            r9 = r3
            goto L84
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r7)
            r7 = 0
            return r7
        L3b:
            kotlin.a.e(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = androidx.room.k0.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L86
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = androidx.privacysandbox.ads.adservices.java.internal.a.m(r5, r4, r3)
            r0.e = r9
            r0.y = r1
            r0.z = r10
            r0.A = r8
            r0.B = r7
            r0.E = r2
            java.lang.Object r3 = com.google.firebase.b.w(r9, r3, r0)
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r3 != r4) goto L84
            return r4
        L84:
            int r8 = r8 + r2
            goto L4d
        L86:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.k0.d(androidx.room.k0, androidx.room.a0, int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }

    public final void e(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (this.j.compareAndSet(false, true)) {
            aVar.invoke();
            CoroutineScope coroutineScope = this.a.a;
            kotlin.coroutines.d dVar = null;
            if (coroutineScope != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, new CoroutineName("Room Invalidation Tracker Refresh"), null, new s(this, aVar2, dVar, 1), 2, null);
            } else {
                kotlin.jvm.internal.l.f("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(kotlin.coroutines.jvm.internal.c cVar) {
        i0 i0Var;
        androidx.localbroadcastmanager.content.b bVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.A = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.y;
        int i2 = i0Var.A;
        if (i2 == 0) {
            kotlin.a.e(obj);
            r rVar = this.a;
            androidx.localbroadcastmanager.content.b bVar2 = rVar.g;
            if (bVar2.n()) {
                try {
                    androidx.compose.animation.b0 b0Var = new androidx.compose.animation.b0(this, (kotlin.coroutines.d) null, 28);
                    i0Var.e = bVar2;
                    i0Var.A = 1;
                    Object objQ = rVar.q(false, b0Var, i0Var);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objQ == aVar) {
                        return aVar;
                    }
                    bVar = bVar2;
                    bVar.I();
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    bVar.I();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = i0Var.e;
            try {
                kotlin.a.e(obj);
                bVar.I();
            } catch (Throwable th2) {
                th = th2;
                bVar.I();
                throw th;
            }
        }
        return kotlin.y.a;
    }
}
