package com.app.mlounge.ui.screens.music;

import androidx.lifecycle.m0;
import com.app.mlounge.ui.viewmodel.h0;
import com.app.mlounge.ui.viewmodel.j0;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ j0 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j0 j0Var, String str, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = j0Var;
        this.z = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(this.y, this.z, dVar, 0);
            case 1:
                return new f(this.y, this.z, dVar, 1);
            default:
                return new f(this.y, this.z, dVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                f fVar = (f) create(coroutineScope, dVar);
                y yVar = y.a;
                fVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                f fVar2 = (f) create(coroutineScope, dVar);
                y yVar2 = y.a;
                fVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                f fVar3 = (f) create(coroutineScope, dVar);
                y yVar3 = y.a;
                fVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                j0 j0Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var), null, null, new h0(j0Var, this.z, null, 0), 3, null);
                break;
            case 1:
                kotlin.a.e(obj);
                j0 j0Var2 = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var2), null, null, new h0(j0Var2, this.z, null, 0), 3, null);
                break;
            default:
                kotlin.a.e(obj);
                j0 j0Var3 = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(j0Var3), null, null, new h0(j0Var3, this.z, null, 1), 3, null);
                break;
        }
        return y.a;
    }
}
