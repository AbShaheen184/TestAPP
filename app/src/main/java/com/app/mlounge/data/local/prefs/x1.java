package com.app.mlounge.data.local.prefs;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ u1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(u1 u1Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = u1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
