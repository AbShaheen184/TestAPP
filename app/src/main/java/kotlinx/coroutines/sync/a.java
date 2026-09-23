package kotlinx.coroutines.sync;

import kotlin.coroutines.j;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ MutexImpl y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a(MutexImpl mutexImpl, Object obj, int i) {
        this.e = i;
        this.y = mutexImpl;
        this.z = obj;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                return MutexImpl.CancellableContinuationWithOwner.tryResume$lambda$3(this.y, (MutexImpl.CancellableContinuationWithOwner) this.z, (Throwable) obj, (y) obj2, (j) obj3);
            default:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1$lambda$0(this.y, this.z, (Throwable) obj, obj2, (j) obj3);
        }
    }
}
