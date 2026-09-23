package com.app.mlounge.ui.screens.services;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.lifecycle.m0;
import androidx.room.coroutines.c0;
import com.app.mlounge.ui.viewmodel.h1;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ h1 y;

    public /* synthetic */ f(h1 h1Var) {
        this.y = h1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                h1 h1Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(h1Var), null, null, new c0(h1Var, str, str2, (kotlin.coroutines.d) null, 29), 3, null);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA = t.A(1);
                n.j(this.y, (s) obj, iA);
                break;
        }
        return y.a;
    }

    public /* synthetic */ f(h1 h1Var, int i) {
        this.y = h1Var;
    }
}
