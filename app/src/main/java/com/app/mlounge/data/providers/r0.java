package com.app.mlounge.data.providers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.c {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.this$0 = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return v0.e(this.this$0, this);
    }
}
