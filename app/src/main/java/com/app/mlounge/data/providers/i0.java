package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = k0Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        i0 i0Var = new i0(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
        i0Var.L$0 = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objAwaitAll;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            List list = k0.VARIANTS;
            k0 k0Var = this.this$0;
            String str = this.$tmdbId;
            String str2 = this.$mediaType;
            Integer num = this.$season;
            Integer num2 = this.$episode;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new h0(k0Var, (String) it.next(), str, str2, num, num2, null), 3, null));
                arrayList = arrayList2;
            }
            this.L$0 = null;
            this.label = 1;
            objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAwaitAll == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objAwaitAll = obj;
        }
        ArrayList arrayListQ = kotlin.collections.r.q((Iterable) objAwaitAll);
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListQ) {
            if (hashSet.add(((ChqStream) obj2).m())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
