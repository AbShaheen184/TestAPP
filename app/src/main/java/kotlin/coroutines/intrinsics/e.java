package kotlin.coroutines.intrinsics;

import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.c {
    public int e;
    public final /* synthetic */ p y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.coroutines.d dVar, j jVar, p pVar, Object obj) {
        super(dVar, jVar);
        this.y = pVar;
        this.z = obj;
        dVar.getClass();
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                kotlinx.coroutines.future.a.u("This coroutine had already completed");
                return null;
            }
            this.e = 2;
            kotlin.a.e(obj);
            return obj;
        }
        this.e = 1;
        kotlin.a.e(obj);
        p pVar = this.y;
        pVar.getClass();
        c0.c(2, pVar);
        return pVar.invoke(this.z, this);
    }
}
