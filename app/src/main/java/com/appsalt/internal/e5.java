package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 extends kotlin.coroutines.jvm.internal.c {
    public a A;
    public /* synthetic */ Object B;
    public final /* synthetic */ a C;
    public int D;
    public Object e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        Object objC = this.C.c(null, this);
        return objC == kotlin.coroutines.intrinsics.a.e ? objC : new kotlin.m(objC);
    }
}
