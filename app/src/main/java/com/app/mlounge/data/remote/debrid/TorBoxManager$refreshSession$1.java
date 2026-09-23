package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.TorBoxManager", f = "TorBoxManager.kt", l = {60, Token.CATCH_SCOPE, Token.ENUM_NEXT}, m = "refreshSession", v = 2)
final class TorBoxManager$refreshSession$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TorBoxManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TorBoxManager$refreshSession$1(TorBoxManager torBoxManager, d dVar) {
        super(dVar);
        this.this$0 = torBoxManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
