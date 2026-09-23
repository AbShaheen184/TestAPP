package com.appsalt.internal;

import java.util.List;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public static final long i;
    public final i2 a = new i2();
    public kotlin.time.f b = new kotlin.time.f(kotlin.time.e.b());
    public final List c;
    public int d;
    public final int e;
    public final MutableSharedFlow f;
    public final MutableSharedFlow g;
    public boolean h;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        i = dagger.hilt.android.internal.a.h(10, kotlin.time.c.MINUTES);
    }

    public e2() {
        kotlin.time.g gVar = kotlin.time.a.y;
        kotlin.time.c cVar = kotlin.time.c.SECONDS;
        long jH = dagger.hilt.android.internal.a.h(5, cVar);
        kotlin.time.c cVar2 = kotlin.time.c.MILLISECONDS;
        List listK = kotlin.collections.q.k(new kotlin.ranges.f(kotlin.time.a.j(jH, cVar2), kotlin.time.a.j(dagger.hilt.android.internal.a.h(10, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(dagger.hilt.android.internal.a.h(10, cVar), cVar2), kotlin.time.a.j(dagger.hilt.android.internal.a.h(20, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(dagger.hilt.android.internal.a.h(20, cVar), cVar2), kotlin.time.a.j(dagger.hilt.android.internal.a.h(40, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(dagger.hilt.android.internal.a.h(40, cVar), cVar2), kotlin.time.a.j(dagger.hilt.android.internal.a.h(80, cVar), cVar2)), new kotlin.ranges.f(kotlin.time.a.j(dagger.hilt.android.internal.a.h(60, cVar), cVar2), kotlin.time.a.j(dagger.hilt.android.internal.a.h(180, cVar), cVar2)));
        this.c = listK;
        this.e = listK.size() - 1;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.f = mutableSharedFlowMutableSharedFlow$default;
        this.g = mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r2.emit(r0, r3) == r8) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r18, kotlin.coroutines.jvm.internal.c r19) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsalt.internal.e2.a(int, kotlin.coroutines.jvm.internal.c):java.lang.Object");
    }
}
