package androidx.work.impl;

import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.r {
    public int e;
    public /* synthetic */ Throwable y;
    public /* synthetic */ long z;

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        m mVar = new m(4, (kotlin.coroutines.d) obj4);
        mVar.y = (Throwable) obj2;
        mVar.z = jLongValue;
        return mVar.invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            Throwable th = this.y;
            long j = this.z;
            androidx.work.y.e().d(n.a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * ((long) 30000), n.b);
            this.e = 1;
            Object objDelay = DelayKt.delay(jMin, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objDelay == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        return Boolean.TRUE;
    }
}
