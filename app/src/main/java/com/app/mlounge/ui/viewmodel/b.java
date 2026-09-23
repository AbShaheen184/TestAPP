package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.model.EpornerSearchDetails;
import com.app.mlounge.data.remote.model.EpornerVideo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ com.app.mlounge.data.repository.a A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, com.app.mlounge.data.repository.a aVar, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = cVar;
        this.A = aVar;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b(this.z, this.A, this.B, dVar, 0);
            default:
                return new b(this.z, this.A, this.B, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((b) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x0184  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List listC;
        Integer numA;
        boolean z = true;
        switch (this.e) {
            case 0:
                c cVar = this.z;
                MutableStateFlow mutableStateFlow = cVar.k;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow.setValue(Boolean.TRUE);
                        com.app.mlounge.data.repository.r rVar = cVar.b;
                        com.app.mlounge.data.repository.a aVar2 = this.A;
                        String str = this.B;
                        int i2 = cVar.E + 1;
                        this.y = 1;
                        obj = com.app.mlounge.data.repository.r.d(rVar, aVar2, str, i2, this);
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
                    EpornerSearchDetails epornerSearchDetails = (EpornerSearchDetails) obj;
                    if (epornerSearchDetails == null || (listC = epornerSearchDetails.c()) == null) {
                        listC = kotlin.collections.w.e;
                    }
                    MutableStateFlow mutableStateFlow2 = cVar.e;
                    ArrayList arrayListO = kotlin.collections.p.O((Collection) mutableStateFlow2.getValue(), listC);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListO) {
                        if (hashSet.add(((EpornerVideo) obj2).b())) {
                            arrayList.add(obj2);
                        }
                    }
                    mutableStateFlow2.setValue(arrayList);
                    cVar.E = (epornerSearchDetails == null || (numA = epornerSearchDetails.a()) == null) ? cVar.E + 1 : numA.intValue();
                    Integer numB = epornerSearchDetails != null ? epornerSearchDetails.b() : null;
                    if (numB != null) {
                        if (cVar.E >= numB.intValue()) {
                            z = false;
                        }
                    } else if (listC.size() < 20) {
                        z = false;
                    }
                    cVar.F = z;
                    break;
                } catch (Exception e) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("AdultViewModel", "loadMore failed", e);
                } finally {
                    mutableStateFlow.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                String str2 = this.B;
                c cVar2 = this.z;
                MutableStateFlow mutableStateFlow3 = cVar2.m;
                MutableStateFlow mutableStateFlow4 = cVar2.i;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                int i3 = this.y;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow3.setValue(null);
                        com.app.mlounge.data.repository.r rVar2 = cVar2.b;
                        com.app.mlounge.data.repository.a aVar4 = this.A;
                        this.y = 1;
                        obj = com.app.mlounge.data.repository.r.d(rVar2, aVar4, str2, 1, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    EpornerSearchDetails epornerSearchDetails2 = (EpornerSearchDetails) obj;
                    if (epornerSearchDetails2 != null) {
                        List listC2 = epornerSearchDetails2.c();
                        if (listC2 == null) {
                            listC2 = kotlin.collections.w.e;
                        }
                        if (listC2.isEmpty()) {
                            mutableStateFlow3.setValue("No videos found for \"" + str2 + "\" — try a different category");
                        }
                        MutableStateFlow mutableStateFlow5 = cVar2.e;
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listC2) {
                            if (hashSet2.add(((EpornerVideo) obj3).b())) {
                                arrayList2.add(obj3);
                            }
                        }
                        mutableStateFlow5.setValue(arrayList2);
                        Integer numA2 = epornerSearchDetails2.a();
                        cVar2.E = numA2 != null ? numA2.intValue() : 1;
                        Integer numB2 = epornerSearchDetails2.b();
                        if (numB2 != null) {
                            if (cVar2.E >= numB2.intValue()) {
                                z = false;
                            }
                        } else if (listC2.size() < 20) {
                            z = false;
                        }
                        cVar2.F = z;
                    } else {
                        mutableStateFlow3.setValue("Adult source is currently unavailable — check your internet connection");
                    }
                } catch (Exception e2) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("AdultViewModel", "loadVideos failed", e2);
                    mutableStateFlow3.setValue("Failed to load — API returned an unexpected response");
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
