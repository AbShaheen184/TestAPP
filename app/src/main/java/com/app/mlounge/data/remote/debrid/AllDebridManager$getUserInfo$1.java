package com.app.mlounge.data.remote.debrid;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.debrid.AllDebridManager", f = "AllDebridManager.kt", l = {Token.OBJECTLIT, Token.SET_REF}, m = "getUserInfo", v = 2)
final class AllDebridManager$getUserInfo$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AllDebridManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllDebridManager$getUserInfo$1(AllDebridManager allDebridManager, c cVar) {
        super(cVar);
        this.this$0 = allDebridManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
