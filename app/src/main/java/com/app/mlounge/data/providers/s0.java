package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $base;
    final /* synthetic */ Integer $episode;
    final /* synthetic */ boolean $isTv;
    final /* synthetic */ String $key;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(boolean z, String str, String str2, Integer num, Integer num2, String str3, v0 v0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$isTv = z;
        this.$base = str;
        this.$tmdbId = str2;
        this.$season = num;
        this.$episode = num2;
        this.$key = str3;
        this.this$0 = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new s0(this.$isTv, this.$base, this.$tmdbId, this.$season, this.$episode, this.$key, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r12 == r4) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.providers.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
