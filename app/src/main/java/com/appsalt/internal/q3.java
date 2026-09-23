package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ d4 A;
    public int B;
    public Object e;
    public Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(d4 d4Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = d4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, this);
    }
}
