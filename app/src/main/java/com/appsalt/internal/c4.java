package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ x4 B;
    public int C;
    public Object e;
    public c3 y;
    public z0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(x4 x4Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = x4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objA = this.B.a(0, this);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : new kotlin.m(objA);
    }
}
