package com.app.mlounge.ui.screens.history;

import androidx.compose.runtime.a1;
import java.util.Map;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ a1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Map map, a1 a1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = map;
        this.z = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c(this.y, this.z, dVar, 0);
            default:
                return new c(this.y, this.z, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                c cVar = (c) create(coroutineScope, dVar);
                y yVar = y.a;
                cVar.invokeSuspend(yVar);
                return yVar;
            default:
                c cVar2 = (c) create(coroutineScope, dVar);
                y yVar2 = y.a;
                cVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                a1 a1Var = this.z;
                String str = (String) a1Var.getValue();
                if (str != null) {
                    a1Var.setValue(null);
                    androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) this.y.get(str);
                    if (yVar != null) {
                        androidx.compose.ui.focus.y.a(yVar);
                    }
                }
                break;
            default:
                kotlin.a.e(obj);
                a1 a1Var2 = this.z;
                String str2 = (String) a1Var2.getValue();
                if (str2 != null) {
                    a1Var2.setValue(null);
                    androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.y.get(str2);
                    if (yVar2 != null) {
                        androidx.compose.ui.focus.y.a(yVar2);
                    }
                }
                break;
        }
        return y.a;
    }
}
