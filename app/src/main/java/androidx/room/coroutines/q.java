package androidx.room.coroutines;

import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements b {
    public final kotlin.o A = new kotlin.o(new androidx.navigation.internal.h(this, 5));
    public final androidx.sqlite.b e;
    public final String y;
    public final kotlin.jvm.internal.j z;

    /* JADX WARN: Multi-variable type inference failed */
    public q(androidx.sqlite.b bVar, String str, kotlin.jvm.functions.p pVar) {
        this.e = bVar;
        this.y = str;
        this.z = (kotlin.jvm.internal.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.p, kotlin.jvm.internal.j] */
    @Override // androidx.room.coroutines.b
    public final Object D(boolean z, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        p pVar2 = (p) cVar.getContext().get(p.y);
        o oVar = pVar2 != null ? pVar2.e : null;
        if (oVar != null) {
            return pVar.invoke(oVar, cVar);
        }
        o oVar2 = new o(this.z, (androidx.sqlite.a) this.A.getValue());
        return BuildersKt.withContext(new p(oVar2), new androidx.room.s(pVar, oVar2, (kotlin.coroutines.d) null), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        kotlin.o oVar = this.A;
        if (oVar.a()) {
            ((androidx.sqlite.a) oVar.getValue()).close();
        }
    }
}
