package androidx.compose.material3.internal;

import androidx.compose.material3.j6;
import com.google.firebase.crashlytics.internal.model.t1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.ui.input.pointer.y A;
    public final /* synthetic */ j6 B;
    public final /* synthetic */ int e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(androidx.compose.ui.input.pointer.y yVar, j6 j6Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.A = yVar;
        this.B = j6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                v vVar = new v(this.A, this.B, dVar, 0);
                vVar.z = obj;
                return vVar;
            default:
                v vVar2 = new v(this.A, this.B, dVar, 1);
                vVar2.z = obj;
                return vVar2;
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
        return ((v) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    u uVar = new u((CoroutineScope) this.z, this.B, null);
                    this.y = 1;
                    Object objI = t1.i(this.A, uVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objI == aVar) {
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
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.text.handwriting.c cVar = new androidx.compose.foundation.text.handwriting.c((CoroutineScope) this.z, this.B, null);
                    this.y = 1;
                    Object objM0 = ((androidx.compose.ui.input.pointer.l0) this.A).M0(cVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objM0 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }
}
