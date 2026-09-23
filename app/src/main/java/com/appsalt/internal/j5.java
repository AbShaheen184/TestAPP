package com.appsalt.internal;

import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.google.firebase.messaging.n B;
    public int C;
    public com.google.firebase.messaging.n e;
    public ReceiveChannel y;
    public ChannelIterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.google.firebase.messaging.n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objF = this.B.f(this);
        return objF == kotlin.coroutines.intrinsics.a.e ? objF : new kotlin.m(objF);
    }
}
