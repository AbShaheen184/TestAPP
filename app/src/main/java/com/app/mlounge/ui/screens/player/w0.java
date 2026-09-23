package com.app.mlounge.ui.screens.player;

import android.content.Context;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ com.app.mlounge.data.remote.ntv.e A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a1 a1Var, com.app.mlounge.data.remote.ntv.e eVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a1Var;
        this.A = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new w0(this.z, this.A, dVar, 0);
            case 1:
                return new w0(this.z, this.A, dVar, 1);
            default:
                return new w0(this.z, this.A, dVar, 2);
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
        return ((w0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object objWithContext;
        Object value3;
        kotlin.coroutines.d dVar = null;
        int i = 1;
        switch (this.e) {
            case 0:
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                a1 a1Var = this.z;
                com.app.mlounge.data.remote.ntv.q qVar = a1Var.d;
                Context context = a1Var.f;
                context.getClass();
                com.app.mlounge.data.remote.ntv.e eVar = this.A;
                String str = eVar.a;
                String str2 = eVar.b;
                String str3 = eVar.c;
                String str4 = eVar.d;
                String str5 = eVar.e;
                this.y = 1;
                Object objG = qVar.g(context, str, str2, str3, str4, str5, this);
                return objG == aVar ? aVar : objG;
            case 1:
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                a1 a1Var2 = this.z;
                com.app.mlounge.data.remote.ntv.q qVar2 = a1Var2.d;
                Context context2 = a1Var2.f;
                context2.getClass();
                com.app.mlounge.data.remote.ntv.e eVar2 = this.A;
                String str6 = eVar2.a;
                String str7 = eVar2.b;
                String str8 = eVar2.c;
                String str9 = eVar2.d;
                String str10 = eVar2.e;
                this.y = 1;
                Object objG2 = qVar2.g(context2, str6, str7, str8, str9, str10, this);
                return objG2 == aVar2 ? aVar2 : objG2;
            default:
                a1 a1Var3 = this.z;
                MutableStateFlow mutableStateFlow = a1Var3.g;
                kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                int i4 = this.y;
                try {
                    if (i4 == 0) {
                        kotlin.a.e(obj);
                        do {
                            value2 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value2, p0.a((p0) value2, false, true, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, null, null, false, false, null, null, false, false, false, 0, 0L, -8388611, 7)));
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        w0 w0Var = new w0(a1Var3, this.A, dVar, i);
                        this.y = 1;
                        objWithContext = BuildersKt.withContext(io2, w0Var, this);
                        if (objWithContext == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i4 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objWithContext = obj;
                    }
                    com.app.mlounge.data.remote.ntv.r rVar = (com.app.mlounge.data.remote.ntv.r) objWithContext;
                    if (rVar != null) {
                        Context context3 = com.app.mlounge.util.a.a;
                        com.app.mlounge.util.a.a("D", "CinemaHQ-Player", "Re-resolved live stream, retrying playback");
                        String str11 = rVar.a;
                        a1Var3.n = str11;
                        a1Var3.f(str11, rVar.b, a1Var3.p, 0, 0, 0);
                    } else {
                        do {
                            value3 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value3, p0.a((p0) value3, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "Playback error: stream expired.", null, false, false, null, null, false, false, false, 0, 0L, -8388611, 7)));
                    }
                } catch (Exception e) {
                    Context context4 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("CinemaHQ-Player", "Live re-resolve failed", e);
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, p0.a((p0) value, false, false, false, false, false, false, false, false, 0L, 0L, 0L, null, null, null, false, 0.0f, 0, 0, 0L, null, false, false, null, "Playback error: stream expired.", null, false, false, null, null, false, false, false, 0, 0L, -8388611, 7)));
                }
                return kotlin.y.a;
        }
    }
}
