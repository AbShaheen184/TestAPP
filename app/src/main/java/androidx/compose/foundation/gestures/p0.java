package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 0;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = q0Var;
        this.y = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                p0 p0Var = new p0((q0) this.B, this.y, dVar);
                p0Var.A = obj;
                return p0Var;
            default:
                return new p0((com.app.mlounge.ui.screens.player.a1) this.A, (com.app.mlounge.ui.screens.player.c1) this.B, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((p0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0196, code lost:
    
        if (com.app.mlounge.ui.screens.player.a1.e(r4, r0, r36, r3, r58) == r7) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r59) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.app.mlounge.ui.screens.player.a1 a1Var, com.app.mlounge.ui.screens.player.c1 c1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = a1Var;
        this.B = c1Var;
    }
}
