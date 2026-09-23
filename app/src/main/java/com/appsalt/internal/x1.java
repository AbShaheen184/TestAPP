package com.appsalt.internal;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e3 B;
    public int C;
    public e3 e;
    public j4 y;
    public Mutex z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(e3 e3Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = e3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return e3.a(this.B, null, this);
    }
}
