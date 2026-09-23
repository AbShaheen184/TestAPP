package com.app.mlounge.ui.viewmodel;

import android.content.Context;
import com.app.mlounge.data.remote.model.MusicGenre;
import com.app.mlounge.data.remote.model.MusicPageResponse;
import java.util.Collection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ j0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new i0(this.z, dVar, 0);
            default:
                return new i0(this.z, dVar, 1);
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
        return ((i0) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z = true;
        switch (this.e) {
            case 0:
                j0 j0Var = this.z;
                MutableStateFlow mutableStateFlow = j0Var.n;
                MutableStateFlow mutableStateFlow2 = j0Var.h;
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        String strA = ((MusicGenre) mutableStateFlow.getValue()).a();
                        String strB = ((MusicGenre) mutableStateFlow.getValue()).b();
                        this.y = 1;
                        obj = j0.e(j0Var, strA, strB, null, this);
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
                    MusicPageResponse musicPageResponse = (MusicPageResponse) obj;
                    j0Var.f.setValue(musicPageResponse.a());
                    j0Var.l = musicPageResponse.b();
                    if (musicPageResponse.b() == null) {
                        z = false;
                    }
                    j0Var.m = z;
                    break;
                } catch (Exception e) {
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("MusicVM", "loadHome failed", e);
                    break;
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            default:
                j0 j0Var2 = this.z;
                MutableStateFlow mutableStateFlow3 = j0Var2.n;
                MutableStateFlow mutableStateFlow4 = j0Var2.j;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        String strA2 = ((MusicGenre) mutableStateFlow3.getValue()).a();
                        String strB2 = ((MusicGenre) mutableStateFlow3.getValue()).b();
                        Object obj2 = j0Var2.l;
                        this.y = 1;
                        obj = j0.e(j0Var2, strA2, strB2, obj2, this);
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
                    MusicPageResponse musicPageResponse2 = (MusicPageResponse) obj;
                    if (musicPageResponse2.a().isEmpty()) {
                        j0Var2.m = false;
                    } else {
                        MutableStateFlow mutableStateFlow5 = j0Var2.f;
                        mutableStateFlow5.setValue(kotlin.collections.p.O((Collection) mutableStateFlow5.getValue(), musicPageResponse2.a()));
                        j0Var2.l = musicPageResponse2.b();
                        if (musicPageResponse2.b() == null) {
                            z = false;
                        }
                        j0Var2.m = z;
                    }
                } catch (Exception e2) {
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("MusicVM", "loadMore failed", e2);
                    j0Var2.m = false;
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
        }
    }
}
