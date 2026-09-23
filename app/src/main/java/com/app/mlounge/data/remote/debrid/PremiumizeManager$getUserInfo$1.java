package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.PremiumizeManager", f = "PremiumizeManager.kt", l = {Token.SETELEM, Token.CALL}, m = "getUserInfo", v = 2)
final class PremiumizeManager$getUserInfo$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumizeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumizeManager$getUserInfo$1(PremiumizeManager premiumizeManager, c cVar) {
        super(cVar);
        this.this$0 = premiumizeManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
