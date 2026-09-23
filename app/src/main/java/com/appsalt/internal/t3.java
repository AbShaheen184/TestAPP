package com.appsalt.internal;

import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int e;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new t3(2, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return new t3(2, (kotlin.coroutines.d) obj2).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            long j = w3.a;
            androidx.compose.foundation.gestures.h1 h1Var = new androidx.compose.foundation.gestures.h1(2, 3, null);
            this.e = 1;
            Object objM26withTimeoutKLykuaI = TimeoutKt.m26withTimeoutKLykuaI(j, h1Var, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objM26withTimeoutKLykuaI == aVar) {
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
    }
}
