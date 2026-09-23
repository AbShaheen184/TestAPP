package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ j0 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int e;
    public MutableStateFlow y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(j0 j0Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = j0Var;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new h0(this.A, this.B, dVar, 0);
            default:
                return new h0(this.A, this.B, dVar, 1);
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
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        switch (this.e) {
            case 0:
                String str = this.B;
                j0 j0Var = this.A;
                MutableStateFlow mutableStateFlow3 = j0Var.h;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.z;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow3.setValue(Boolean.TRUE);
                        mutableStateFlow = j0Var.x;
                        com.app.mlounge.data.repository.a0 a0Var = j0Var.c;
                        this.y = mutableStateFlow;
                        this.z = 1;
                        a0Var.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.y(a0Var, str, null, 0), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow = this.y;
                        kotlin.a.e(obj);
                    }
                    mutableStateFlow.setValue(obj);
                    break;
                } catch (Exception e) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("MusicVM", "loadAlbumDetail failed for ".concat(str), e);
                    break;
                } finally {
                    mutableStateFlow3.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                String str2 = this.B;
                j0 j0Var2 = this.A;
                MutableStateFlow mutableStateFlow4 = j0Var2.h;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow2 = j0Var2.z;
                        com.app.mlounge.data.repository.a0 a0Var2 = j0Var2.c;
                        this.y = mutableStateFlow2;
                        this.z = 1;
                        a0Var2.getClass();
                        obj = BuildersKt.withContext(Dispatchers.getIO(), new com.app.mlounge.data.repository.y(a0Var2, str2, null, 1), this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableStateFlow2 = this.y;
                        kotlin.a.e(obj);
                    }
                    mutableStateFlow2.setValue(obj);
                    break;
                } catch (Exception e2) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("MusicVM", "loadArtistDetail failed for ".concat(str2), e2);
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
