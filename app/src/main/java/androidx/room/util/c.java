package androidx.room.util;

import androidx.room.r;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ l C;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, boolean z, boolean z2, l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = rVar;
        this.A = z;
        this.B = z2;
        this.C = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new c(this.z, this.A, this.B, this.C, dVar);
            default:
                return new c(dVar, this.z, this.A, this.B, this.C);
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
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                r rVar = this.z;
                boolean z = !(rVar.k() && rVar.l()) && this.A;
                boolean z2 = this.B;
                r rVar2 = this.z;
                b bVar = new b(z, z2, rVar2, null, this.C, 0);
                this.y = 1;
                Object objQ = rVar2.q(z2, bVar, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objQ == aVar ? aVar : objQ;
            default:
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                boolean z3 = this.B;
                boolean z4 = this.A;
                r rVar3 = this.z;
                b bVar2 = new b(z3, z4, rVar3, null, this.C, 1);
                this.y = 1;
                Object objQ2 = rVar3.q(z4, bVar2, this);
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                return objQ2 == aVar2 ? aVar2 : objQ2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.d dVar, r rVar, boolean z, boolean z2, l lVar) {
        super(2, dVar);
        this.z = rVar;
        this.A = z;
        this.B = z2;
        this.C = lVar;
    }
}
