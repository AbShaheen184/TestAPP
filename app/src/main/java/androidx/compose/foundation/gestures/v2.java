package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ s1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2(s1 s1Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = s1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new v2(this.y, dVar, 0);
            case 1:
                return new v2(this.y, dVar, 1);
            case 2:
                return new v2(this.y, dVar, 2);
            case 3:
                return new v2(this.y, dVar, 3);
            case 4:
                return new v2(this.y, dVar, 4);
            case 5:
                return new v2(this.y, dVar, 5);
            case 6:
                return new v2(this.y, dVar, 6);
            default:
                return new v2(this.y, dVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                v2 v2Var = (v2) create(coroutineScope, dVar);
                kotlin.y yVar = kotlin.y.a;
                v2Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                v2 v2Var2 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar2 = kotlin.y.a;
                v2Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                v2 v2Var3 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar3 = kotlin.y.a;
                v2Var3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                v2 v2Var4 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar4 = kotlin.y.a;
                v2Var4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                v2 v2Var5 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar5 = kotlin.y.a;
                v2Var5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                v2 v2Var6 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar6 = kotlin.y.a;
                v2Var6.invokeSuspend(yVar6);
                return yVar6;
            case 6:
                v2 v2Var7 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar7 = kotlin.y.a;
                v2Var7.invokeSuspend(yVar7);
                return yVar7;
            default:
                v2 v2Var8 = (v2) create(coroutineScope, dVar);
                kotlin.y yVar8 = kotlin.y.a;
                v2Var8.invokeSuspend(yVar8);
                return yVar8;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                s1 s1Var = this.y;
                s1Var.z = true;
                Mutex mutex = s1Var.A;
                if (mutex.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                }
                break;
            case 1:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 2:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 3:
                kotlin.a.e(obj);
                s1 s1Var2 = this.y;
                s1Var2.z = true;
                Mutex mutex2 = s1Var2.A;
                if (mutex2.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                }
                break;
            case 4:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 5:
                kotlin.a.e(obj);
                this.y.b();
                break;
            case 6:
                kotlin.a.e(obj);
                s1 s1Var3 = this.y;
                s1Var3.z = true;
                Mutex mutex3 = s1Var3.A;
                if (mutex3.isLocked()) {
                    Mutex.DefaultImpls.unlock$default(mutex3, null, 1, null);
                }
                break;
            default:
                kotlin.a.e(obj);
                this.y.b();
                break;
        }
        return kotlin.y.a;
    }
}
