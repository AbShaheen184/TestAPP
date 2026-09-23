package androidx.room.util;

import androidx.room.r;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ l C;
    public int e;
    public final /* synthetic */ kotlin.coroutines.j y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.j jVar, r rVar, boolean z, boolean z2, l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = jVar;
        this.z = rVar;
        this.A = z;
        this.B = z2;
        this.C = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d(this.y, this.z, this.A, this.B, this.C, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        c cVar = new c(this.z, this.A, this.B, this.C, (kotlin.coroutines.d) null);
        this.e = 1;
        Object objWithContext = BuildersKt.withContext(this.y, cVar, this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objWithContext == aVar ? aVar : objWithContext;
    }
}
