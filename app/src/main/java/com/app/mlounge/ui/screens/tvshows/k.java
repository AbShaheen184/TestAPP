package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.lazy.y;
import androidx.compose.runtime.a1;
import com.app.mlounge.ui.viewmodel.b2;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ b2 A;
    public final /* synthetic */ y B;
    public final /* synthetic */ Map C;
    public final /* synthetic */ a1 D;
    public int e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b2 b2Var, y yVar, Map map, a1 a1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = b2Var;
        this.B = yVar;
        this.C = map;
        this.D = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new k(this.A, this.B, this.C, this.D, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (androidx.compose.foundation.lazy.y.k(r8, r1, r7) == r4) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.app.mlounge.ui.viewmodel.b2 r0 = r7.A
            androidx.compose.runtime.g1 r0 = r0.j
            int r1 = r7.z
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L15
            kotlin.a.e(r8)     // Catch: java.lang.Exception -> La9
            goto L93
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            kotlinx.coroutines.future.a.u(r8)
            r8 = 0
            return r8
        L1c:
            int r1 = r7.y
            int r3 = r7.e
            kotlin.a.e(r8)
            goto L84
        L24:
            kotlin.a.e(r8)
            androidx.compose.runtime.a1 r8 = r7.D
            java.lang.Object r1 = r8.getValue()
            com.app.mlounge.data.remote.model.TmdbSeason r1 = (com.app.mlounge.data.remote.model.TmdbSeason) r1
            if (r1 == 0) goto La9
            int r1 = r0.g()
            if (r1 <= 0) goto La9
            java.lang.Object r8 = r8.getValue()
            com.app.mlounge.data.remote.model.TmdbSeason r8 = (com.app.mlounge.data.remote.model.TmdbSeason) r8
            if (r8 == 0) goto L45
            java.util.List r8 = r8.b()
            if (r8 != 0) goto L47
        L45:
            kotlin.collections.w r8 = kotlin.collections.w.e
        L47:
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        L4c:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L67
            java.lang.Object r5 = r8.next()
            com.app.mlounge.data.remote.model.TmdbEpisode r5 = (com.app.mlounge.data.remote.model.TmdbEpisode) r5
            int r5 = r5.a()
            int r6 = r0.g()
            if (r5 != r6) goto L64
            r8 = r1
            goto L68
        L64:
            int r1 = r1 + 1
            goto L4c
        L67:
            r8 = -1
        L68:
            if (r8 < 0) goto La9
            int r1 = r8 + 7
            kotlin.time.g r5 = kotlin.time.a.y
            r5 = 500(0x1f4, float:7.0E-43)
            kotlin.time.c r6 = kotlin.time.c.MILLISECONDS
            long r5 = dagger.hilt.android.internal.a.h(r5, r6)
            r7.e = r8
            r7.y = r1
            r7.z = r3
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.m17delayVtjQ1oo(r5, r7)
            if (r3 != r4) goto L83
            goto L92
        L83:
            r3 = r8
        L84:
            androidx.compose.foundation.lazy.y r8 = r7.B     // Catch: java.lang.Exception -> La9
            r7.e = r3     // Catch: java.lang.Exception -> La9
            r7.y = r1     // Catch: java.lang.Exception -> La9
            r7.z = r2     // Catch: java.lang.Exception -> La9
            java.lang.Object r8 = androidx.compose.foundation.lazy.y.k(r8, r1, r7)     // Catch: java.lang.Exception -> La9
            if (r8 != r4) goto L93
        L92:
            return r4
        L93:
            java.util.Map r8 = r7.C     // Catch: java.lang.Exception -> La9
            int r0 = r0.g()     // Catch: java.lang.Exception -> La9
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> La9
            r1.<init>(r0)     // Catch: java.lang.Exception -> La9
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> La9
            androidx.compose.ui.focus.y r8 = (androidx.compose.ui.focus.y) r8     // Catch: java.lang.Exception -> La9
            if (r8 == 0) goto La9
            androidx.compose.ui.focus.y.a(r8)     // Catch: java.lang.Exception -> La9
        La9:
            kotlin.y r8 = kotlin.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.tvshows.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
