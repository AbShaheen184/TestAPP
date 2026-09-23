package com.app.mlounge.ui.screens.player;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.internal.z A;
    public final /* synthetic */ kotlin.jvm.internal.z B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public int e;
    public final /* synthetic */ a1 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(a1 a1Var, String str, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.z zVar2, int i, int i2, int i3, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = a1Var;
        this.z = str;
        this.A = zVar;
        this.B = zVar2;
        this.C = i;
        this.D = i2;
        this.E = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new v0(this.y, this.z, this.A, this.B, this.C, this.D, this.E, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0120, code lost:
    
        if (r9 == r8) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r103) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.player.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
