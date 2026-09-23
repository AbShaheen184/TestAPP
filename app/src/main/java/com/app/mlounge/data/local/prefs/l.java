package com.app.mlounge.data.local.prefs;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public boolean e;
    public /* synthetic */ Object y;
    public final /* synthetic */ y1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y1 y1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = y1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.n(false, this);
    }
}
