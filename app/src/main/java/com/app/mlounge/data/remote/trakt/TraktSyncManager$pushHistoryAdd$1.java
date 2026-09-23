package com.app.mlounge.data.remote.trakt;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager", f = "TraktSyncManager.kt", l = {188}, m = "pushHistoryAdd", v = 2)
final class TraktSyncManager$pushHistoryAdd$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$pushHistoryAdd$1(TraktSyncManager traktSyncManager, c cVar) {
        super(cVar);
        this.this$0 = traktSyncManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(null, null, null, null, this);
    }
}
