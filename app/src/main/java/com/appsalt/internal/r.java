package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.coroutines.jvm.internal.c {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ t0 D;
    public int E;
    public t0 e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t0 t0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return t0.d(this.D, this);
    }
}
