package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var, Integer num, Integer num2, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
        this.this$0 = a2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        String str = this.$mediaType;
        y1 y1Var = new y1(this.this$0, this.$season, this.$episode, str, this.$tmdbId, dVar);
        y1Var.L$0 = obj;
        return y1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
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
        List list = a2.BACKENDS;
        String str = this.$mediaType;
        Integer num = this.$season;
        Integer num2 = this.$episode;
        String str2 = this.$tmdbId;
        a2 a2Var = this.this$0;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new x1(str, num, num2, (String) it.next(), str2, a2Var, null), 3, null));
            arrayList = arrayList2;
        }
        this.L$0 = null;
        this.label = 1;
        Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objAwaitAll == aVar ? aVar : objAwaitAll;
    }
}
