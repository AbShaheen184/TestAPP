package androidx.compose.foundation.lazy.layout;

import com.app.mlounge.data.local.prefs.y1;
import com.app.mlounge.data.local.prefs.z1;
import com.app.mlounge.data.remote.api.TmdbApi;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.ui.viewmodel.d2;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, int i, kotlin.coroutines.d dVar, int i2) {
        super(2, dVar);
        this.e = i2;
        this.A = obj;
        this.z = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new u0((v0) this.A, this.z, dVar, 0);
            case 1:
                return new u0((p1) this.A, this.z, dVar, 1);
            default:
                return new u0((d2) this.A, this.z, dVar, 2);
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
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    q0 q0Var = ((v0) this.A).M;
                    this.y = 1;
                    Object objE = q0Var.e(this.z, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 1:
                int i2 = this.y;
                kotlin.y yVar = kotlin.y.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return yVar;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                y1 y1Var = ((p1) this.A).b;
                this.y = 1;
                Object objH = _COROUTINE.a.H(z1.a(y1Var.a), new androidx.compose.foundation.gestures.h1(this.z, null, 2, false), this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (objH != aVar2) {
                    objH = yVar;
                }
                return objH == aVar2 ? aVar2 : yVar;
            default:
                d2 d2Var = (d2) this.A;
                int i3 = this.y;
                int i4 = this.z;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        com.app.mlounge.data.repository.j0 j0Var = d2Var.c;
                        this.y = 1;
                        try {
                            obj = TmdbApi.getTvShowDetail$default(j0Var.a, i4, null, this, 2, null);
                            kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                            if (obj == aVar3) {
                                return aVar3;
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        if (i3 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    Integer numK = ((TmdbTvDetailResponse) obj).k();
                    if (numK != null) {
                        int iIntValue = numK.intValue();
                        MutableStateFlow mutableStateFlow = d2Var.h;
                        Map map2 = (Map) mutableStateFlow.getValue();
                        Integer num = new Integer(i4);
                        Integer num2 = new Integer(iIntValue);
                        map2.getClass();
                        if (map2.isEmpty()) {
                            Map mapSingletonMap = Collections.singletonMap(num, num2);
                            mapSingletonMap.getClass();
                            map = mapSingletonMap;
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                            linkedHashMap.put(num, num2);
                            map = linkedHashMap;
                        }
                        mutableStateFlow.setValue(map);
                    }
                    break;
                } catch (Exception unused2) {
                }
                return kotlin.y.a;
        }
    }
}
