package androidx.compose.ui.viewinterop;

import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, h hVar, long j, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = z;
        this.z = hVar;
        this.A = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e(this.y, this.z, this.A, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            androidx.compose.ui.input.nestedscroll.d dVar = this.z.e;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (this.y) {
                this.e = 2;
                Object objA = dVar.a(this.A, 0L, this);
                if (objA != aVar) {
                    obj = objA;
                    ((androidx.compose.ui.unit.q) obj).getClass();
                }
            } else {
                this.e = 1;
                Object objA2 = dVar.a(0L, this.A, this);
                if (objA2 != aVar) {
                    obj = objA2;
                    ((androidx.compose.ui.unit.q) obj).getClass();
                }
            }
            return aVar;
        }
        if (i == 1) {
            kotlin.a.e(obj);
            ((androidx.compose.ui.unit.q) obj).getClass();
        } else {
            if (i != 2) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            ((androidx.compose.ui.unit.q) obj).getClass();
        }
        return y.a;
    }
}
