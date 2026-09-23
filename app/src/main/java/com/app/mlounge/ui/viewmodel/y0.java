package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.MusicSearchResponse;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ b1 B;
    public int C;
    public String e;
    public MusicSearchResponse y;
    public MusicSearchResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(b1 b1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.k(null, this);
    }
}
