package com.app.mlounge.ui.screens.player;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.c {
    public File A;
    public long B;
    public /* synthetic */ Object C;
    public final /* synthetic */ a1 D;
    public int E;
    public c1 e;
    public androidx.localbroadcastmanager.content.b y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a1 a1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return a1.e(this.D, null, null, 0L, this);
    }
}
