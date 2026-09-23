package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ f A;
    public int B;
    public f e;
    public kotlin.jvm.internal.v y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        Object objE = this.A.e(this);
        return objE == kotlin.coroutines.intrinsics.a.e ? objE : new kotlin.m(objE);
    }
}
