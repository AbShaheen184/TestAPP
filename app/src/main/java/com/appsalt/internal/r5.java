package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public androidx.compose.runtime.internal.c e;
    public /* synthetic */ Object y;
    public final /* synthetic */ androidx.compose.runtime.internal.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(androidx.compose.runtime.internal.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Object objE = this.z.e(0, this);
        return objE == kotlin.coroutines.intrinsics.a.e ? objE : new kotlin.m(objE);
    }
}
