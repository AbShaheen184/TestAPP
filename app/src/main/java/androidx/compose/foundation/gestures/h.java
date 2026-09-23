package androidx.compose.foundation.gestures;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.compose.foundation.text.selection.n nVar, String str, long j, androidx.compose.ui.text.l0 l0Var, androidx.compose.foundation.text.selection.b1 b1Var, androidx.compose.ui.text.input.q qVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = nVar;
        this.B = str;
        this.z = j;
        this.C = l0Var;
        this.D = b1Var;
        this.E = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                h hVar = new h((g3) this.B, (j) this.C, (c) this.D, this.z, (Job) this.E, dVar);
                hVar.A = obj;
                return hVar;
            default:
                return new h((androidx.compose.foundation.text.selection.n) this.A, (String) this.B, this.z, (androidx.compose.ui.text.l0) this.C, (androidx.compose.foundation.text.selection.b1) this.D, (androidx.compose.ui.text.input.q) this.E, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((h) create((q2) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
            default:
                return ((h) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.e) {
            case 0:
                c cVar = (c) this.D;
                j jVar = (j) this.C;
                g3 g3Var = (g3) this.B;
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    q2 q2Var = (q2) this.A;
                    g3Var.e = j.M0(jVar, cVar, this.z);
                    androidx.compose.animation.core.a aVar = new androidx.compose.animation.core.a(jVar, g3Var, (Job) this.E, q2Var);
                    g gVar = new g(0, jVar, g3Var, cVar);
                    this.y = 1;
                    Object objA = g3Var.a(aVar, gVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                androidx.compose.ui.text.input.q qVar = (androidx.compose.ui.text.input.q) this.E;
                String str = (String) this.B;
                androidx.compose.foundation.text.selection.b1 b1Var = (androidx.compose.foundation.text.selection.b1) this.D;
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.text.selection.n nVar = (androidx.compose.foundation.text.selection.n) this.A;
                    this.y = 1;
                    androidx.compose.foundation.text.selection.t tVar = (androidx.compose.foundation.text.selection.t) nVar;
                    tVar.getClass();
                    if (str.length() == 0) {
                        obj = null;
                    } else {
                        long j = this.z;
                        if (androidx.compose.ui.text.l0.c(j)) {
                            obj = null;
                        } else {
                            obj = BuildersKt.withContext(tVar.a, new androidx.compose.foundation.text.selection.r(tVar, new androidx.compose.foundation.text.selection.s(j, tVar, str, null), null), this);
                        }
                    }
                    obj2 = kotlin.coroutines.intrinsics.a.e;
                    if (obj != obj2) {
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                androidx.compose.ui.text.l0 l0Var = (androidx.compose.ui.text.l0) obj;
                obj2 = kotlin.y.a;
                if (l0Var != null) {
                    long j2 = l0Var.a;
                    long jB = androidx.compose.ui.text.d0.b(qVar.j((int) (j2 >> 32)), qVar.j((int) (j2 & 4294967295L)));
                    if (!androidx.compose.ui.text.l0.a(jB, (androidx.compose.ui.text.l0) this.C) && kotlin.jvm.internal.l.a(b1Var.n().a.y, str) && qVar == b1Var.b) {
                        b1Var.c.invoke(androidx.compose.foundation.text.selection.b1.e(b1Var.n().a, jB));
                        b1Var.w = new androidx.compose.ui.text.l0(jB);
                    }
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g3 g3Var, j jVar, c cVar, long j, Job job, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = g3Var;
        this.C = jVar;
        this.D = cVar;
        this.z = j;
        this.E = job;
    }
}
