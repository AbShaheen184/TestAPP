package androidx.compose.foundation.gestures;

import android.content.Context;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public Object B;
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ int e = 0;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.app.mlounge.ui.screens.player.a1 a1Var, androidx.media3.exoplayer.source.a aVar, com.app.mlounge.ui.screens.player.c1 c1Var, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = a1Var;
        this.E = aVar;
        this.F = c1Var;
        this.A = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                p2 p2Var = new p2((r2) this.C, (kotlin.jvm.internal.y) this.E, this.A, dVar);
                p2Var.F = obj;
                return p2Var;
            default:
                return new p2((com.app.mlounge.ui.screens.player.a1) this.D, (androidx.media3.exoplayer.source.a) this.E, (com.app.mlounge.ui.screens.player.c1) this.F, this.A, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((p2) create((q2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((p2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        r2 r2Var;
        kotlin.jvm.internal.y yVar;
        r2 r2Var2;
        long j;
        com.app.mlounge.ui.screens.player.c1 c1Var;
        androidx.media3.exoplayer.c0 c0Var;
        long j2;
        switch (this.e) {
            case 0:
                o1 o1Var = o1.y;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.z;
                if (i == 0) {
                    kotlin.a.e(obj);
                    q2 q2Var = (q2) this.F;
                    r2Var = (r2) this.C;
                    o2 o2Var = new o2(r2Var, q2Var);
                    kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) this.E;
                    long j3 = this.A;
                    l lVar = r2Var.c;
                    long j4 = yVar2.e;
                    float fD = r2Var.d(r2Var.d == o1Var ? androidx.compose.ui.unit.q.b(j3) : androidx.compose.ui.unit.q.c(j3));
                    this.F = r2Var;
                    this.B = r2Var;
                    this.D = yVar2;
                    this.y = j4;
                    this.z = 1;
                    lVar.getClass();
                    Object objWithContext = BuildersKt.withContext(lVar.b, new k(fD, lVar, o2Var, null), this);
                    if (objWithContext == aVar) {
                        return aVar;
                    }
                    yVar = yVar2;
                    obj = objWithContext;
                    r2Var2 = r2Var;
                    j = j4;
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.y;
                    yVar = (kotlin.jvm.internal.y) this.D;
                    r2Var = (r2) this.B;
                    r2Var2 = (r2) this.F;
                    kotlin.a.e(obj);
                }
                float fD2 = r2Var2.d(((Number) obj).floatValue());
                yVar.e = r2Var.d == o1Var ? androidx.compose.ui.unit.q.a(j, fD2, 0.0f, 2) : androidx.compose.ui.unit.q.a(j, 0.0f, fD2, 1);
                return kotlin.y.a;
            default:
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.z;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.media3.exoplayer.c0 c0Var2 = ((com.app.mlounge.ui.screens.player.a1) this.D).i;
                    if (c0Var2 == null) {
                        return null;
                    }
                    androidx.media3.exoplayer.source.a aVar3 = (androidx.media3.exoplayer.source.a) this.E;
                    c1Var = (com.app.mlounge.ui.screens.player.c1) this.F;
                    long j5 = this.A;
                    c0Var2.K(aVar3);
                    androidx.media3.exoplayer.trackselection.j jVar = (androidx.media3.exoplayer.trackselection.j) c0Var2.t();
                    jVar.getClass();
                    androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVar);
                    iVar.i(3, false);
                    iVar.f(c1Var.c);
                    c0Var2.O(iVar.a());
                    c0Var2.C();
                    c0Var2.G(j5);
                    c0Var2.M(true);
                    this.B = c1Var;
                    this.C = c0Var2;
                    this.y = j5;
                    this.z = 1;
                    if (DelayKt.delay(500L, this) == aVar2) {
                        return aVar2;
                    }
                    c0Var = c0Var2;
                    j2 = j5;
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.y;
                    c0Var = (androidx.media3.exoplayer.c0) this.C;
                    c1Var = (com.app.mlounge.ui.screens.player.c1) this.B;
                    kotlin.a.e(obj);
                }
                androidx.media3.common.c1 c1VarM = c0Var.m();
                c1VarM.getClass();
                com.google.common.collect.h0 h0Var = c1VarM.a;
                h0Var.getClass();
                int i3 = 0;
                for (Object obj2 : h0Var) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        kotlin.collections.q.o();
                        throw null;
                    }
                    androidx.media3.common.b1 b1Var = (androidx.media3.common.b1) obj2;
                    if (b1Var.b.c == 3) {
                        int i5 = b1Var.a;
                        for (int i6 = 0; i6 < i5; i6++) {
                            androidx.media3.common.r rVarA = b1Var.a(i6);
                            rVarA.getClass();
                            if (kotlin.jvm.internal.l.a(rVarA.b, c1Var.a)) {
                                androidx.media3.common.x0 x0Var = new androidx.media3.common.x0(b1Var.b, i6);
                                androidx.media3.exoplayer.trackselection.j jVar2 = (androidx.media3.exoplayer.trackselection.j) c0Var.t();
                                jVar2.getClass();
                                androidx.media3.exoplayer.trackselection.i iVar2 = new androidx.media3.exoplayer.trackselection.i(jVar2);
                                iVar2.e(x0Var);
                                c0Var.O(iVar2.a());
                            }
                            break;
                        }
                    }
                    i3 = i4;
                }
                Context context = com.app.mlounge.util.a.a;
                com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Player updated with subtitles and resumed at " + j2);
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(r2 r2Var, kotlin.jvm.internal.y yVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = r2Var;
        this.E = yVar;
        this.A = j;
    }
}
