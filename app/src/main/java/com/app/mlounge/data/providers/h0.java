package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    final /* synthetic */ String $variant;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, String str, String str2, String str3, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = k0Var;
        this.$variant = str;
        this.$tmdbId = str2;
        this.$mediaType = str3;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new h0(this.this$0, this.$variant, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        k0 k0Var = this.this$0;
        String str = this.$variant;
        String str2 = this.$tmdbId;
        String str3 = this.$mediaType;
        Integer num = this.$season;
        Integer num2 = this.$episode;
        this.label = 1;
        Object objB = k0.b(k0Var, str, str2, str3, num, num2);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objB == aVar ? aVar : objB;
    }
}
