package com.app.mlounge.ui;

import androidx.compose.runtime.a1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.navigation.y A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z, String str, String str2, androidx.navigation.y yVar, a1 a1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = z;
        this.y = str;
        this.z = str2;
        this.A = yVar;
        this.B = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b0(this.e, this.y, this.z, this.A, this.B, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2);
        kotlin.y yVar = kotlin.y.a;
        b0Var.invokeSuspend(yVar);
        return yVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.a.e(obj);
        boolean z = this.e;
        String str = this.z;
        if (z) {
            f0.c(this.B, true);
            this.A.a(str, new t(7));
        } else {
            com.app.mlounge.ui.navigation.k kVar = com.app.mlounge.ui.navigation.k.g;
            if (kotlin.jvm.internal.l.a(this.y, kVar.a) && !kotlin.jvm.internal.l.a(str, kVar.a)) {
                f0.c(this.B, true);
                this.A.a(str, new t(7));
            }
        }
        return kotlin.y.a;
    }
}
