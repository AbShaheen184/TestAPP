package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public String e;
    public /* synthetic */ Object y;
    public final /* synthetic */ p1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p1 p1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = p1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return p1.e(this.z, this);
    }
}
