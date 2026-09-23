package com.app.mlounge.ui.components;

import androidx.compose.runtime.a1;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.m1;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ l2 y;
    public final /* synthetic */ a1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(l2 l2Var, a1 a1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = l2Var;
        this.z = a1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new v(this.y, this.z, dVar, 0);
            case 1:
                return new v(this.y, this.z, dVar, 1);
            case 2:
                return new v(this.y, this.z, dVar, 2);
            case 3:
                return new v(this.y, this.z, dVar, 3);
            case 4:
                return new v(this.y, this.z, dVar, 4);
            case 5:
                return new v(this.y, this.z, dVar, 5);
            default:
                return new v(this.y, this.z, dVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                v vVar = (v) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                vVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                v vVar2 = (v) create(coroutineScope, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                vVar2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                v vVar3 = (v) create(coroutineScope, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                vVar3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                v vVar4 = (v) create(coroutineScope, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                vVar4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                v vVar5 = (v) create(coroutineScope, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                vVar5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                v vVar6 = (v) create(coroutineScope, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                vVar6.invokeSuspend(yVar6);
                return yVar6;
            default:
                v vVar7 = (v) create(coroutineScope, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                vVar7.invokeSuspend(yVar7);
                return yVar7;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        l2 l2Var = this.y;
        a1 a1Var = this.z;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            case 1:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            case 2:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            case 3:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            case 4:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            case 5:
                kotlin.a.e(obj);
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
            default:
                kotlin.a.e(obj);
                List list = com.app.mlounge.ui.screens.settings.e0.a;
                if (((Boolean) a1Var.getValue()).booleanValue() && l2Var != null) {
                    ((m1) l2Var).b();
                }
                break;
        }
        return yVar;
    }
}
