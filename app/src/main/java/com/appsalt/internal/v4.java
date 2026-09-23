package com.appsalt.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Throwable e;
    public /* synthetic */ Object y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Serializable serializableA = this.z.a(null, this);
        return serializableA == kotlin.coroutines.intrinsics.a.e ? serializableA : new kotlin.m(serializableA);
    }
}
