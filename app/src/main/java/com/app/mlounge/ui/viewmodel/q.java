package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.Game;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.data.remote.model.GameStatsResponse;
import com.app.mlounge.data.remote.model.GamesResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new q(this.z, dVar, 0);
            case 1:
                return new q(this.z, dVar, 1);
            default:
                return new q(this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Set setKeySet;
        Set setEntrySet;
        switch (this.e) {
            case 0:
                r rVar = this.z;
                MutableStateFlow mutableStateFlow = rVar.k;
                MutableStateFlow mutableStateFlow2 = rVar.g;
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        mutableStateFlow.setValue(null);
                        com.app.mlounge.data.repository.r rVar2 = rVar.b;
                        String strA = ((GamePlatform) rVar.u.getValue()).a();
                        String str = (String) rVar.C.getValue();
                        String str2 = (String) rVar.E.getValue();
                        this.y = 1;
                        rVar2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.download.e(rVar2, strA, 1, str, str2, null), this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GamesResponse gamesResponse = (GamesResponse) obj;
                    MutableStateFlow mutableStateFlow3 = rVar.e;
                    List listA = gamesResponse.a();
                    if (listA == null) {
                        listA = kotlin.collections.w.e;
                    }
                    mutableStateFlow3.setValue(listA);
                    rVar.N = gamesResponse.b();
                    rVar.M = 1;
                    break;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to load games";
                    }
                    mutableStateFlow.setValue(message);
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 1:
                r rVar3 = this.z;
                MutableStateFlow mutableStateFlow4 = rVar3.e;
                MutableStateFlow mutableStateFlow5 = rVar3.i;
                int i2 = this.y;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow5.setValue(Boolean.TRUE);
                        com.app.mlounge.data.repository.r rVar4 = rVar3.b;
                        String strA2 = ((GamePlatform) rVar3.u.getValue()).a();
                        int i3 = rVar3.M + 1;
                        String str3 = (String) rVar3.C.getValue();
                        String str4 = (String) rVar3.E.getValue();
                        this.y = 1;
                        rVar4.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.download.e(rVar4, strA2, i3, str3, str4, null), this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GamesResponse gamesResponse2 = (GamesResponse) obj;
                    Iterable iterable = (Iterable) mutableStateFlow4.getValue();
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.p(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Game) it.next()).c());
                    }
                    Set setF0 = kotlin.collections.p.f0(arrayList2);
                    List listA2 = gamesResponse2.a();
                    if (listA2 == null) {
                        listA2 = kotlin.collections.w.e;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listA2) {
                        if (!setF0.contains(((Game) obj2).c())) {
                            arrayList3.add(obj2);
                        }
                    }
                    mutableStateFlow4.setValue(kotlin.collections.p.O((Collection) mutableStateFlow4.getValue(), arrayList3));
                    rVar3.M++;
                    break;
                } catch (Exception unused) {
                } finally {
                    mutableStateFlow5.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                int i4 = this.y;
                r rVar5 = this.z;
                try {
                    if (i4 == 0) {
                        kotlin.a.e(obj);
                        com.app.mlounge.data.repository.r rVar6 = rVar5.b;
                        String strA3 = ((GamePlatform) rVar5.u.getValue()).a();
                        this.y = 1;
                        rVar6.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.f(rVar6, strA3, null), this);
                        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i4 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    GameStatsResponse gameStatsResponse = (GameStatsResponse) obj;
                    rVar5.w.setValue(gameStatsResponse);
                    MutableStateFlow mutableStateFlow6 = rVar5.y;
                    Map mapB = gameStatsResponse.b();
                    List listB0 = kotlin.collections.w.e;
                    if (mapB == null || (setEntrySet = mapB.entrySet()) == null) {
                        arrayList = listB0;
                    } else {
                        List listW = kotlin.collections.p.W(setEntrySet, new androidx.constraintlayout.core.e(17));
                        arrayList = new ArrayList(kotlin.collections.r.p(listW, 10));
                        Iterator it2 = listW.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((String) ((Map.Entry) it2.next()).getKey());
                        }
                    }
                    mutableStateFlow6.setValue(arrayList);
                    MutableStateFlow mutableStateFlow7 = rVar5.A;
                    Map mapA = gameStatsResponse.a();
                    if (mapA != null && (setKeySet = mapA.keySet()) != null) {
                        listB0 = kotlin.collections.p.b0(kotlin.collections.p.W(setKeySet, kotlin.comparisons.b.z));
                    }
                    mutableStateFlow7.setValue(listB0);
                    break;
                } catch (Exception unused2) {
                }
                return kotlin.y.a;
        }
    }
}
