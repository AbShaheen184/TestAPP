package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ e2 A;
    public int B;
    public e2 e;
    public h1 y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(e2 e2Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = e2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(0, this);
    }
}
