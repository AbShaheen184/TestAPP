package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.RealDebridManager", f = "RealDebridManager.kt", l = {Token.SET_REF, Token.DEL_REF, Token.REF_SPECIAL, Token.STRICT_SETNAME, Token.DEFAULTNAMESPACE}, m = "exchangeToken", v = 2)
final class RealDebridManager$exchangeToken$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealDebridManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDebridManager$exchangeToken$1(RealDebridManager realDebridManager, c cVar) {
        super(cVar);
        this.this$0 = realDebridManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
