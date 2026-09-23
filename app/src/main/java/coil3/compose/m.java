package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m a = new m();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(coil3.p pVar, coil3.request.g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.A = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.y;
        int i2 = lVar.A;
        if (i2 == 0) {
            kotlin.a.e(objB);
            lVar.e = gVar;
            lVar.A = 1;
            objB = pVar.b(gVar, lVar);
            Object obj = kotlin.coroutines.intrinsics.a.e;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = lVar.e;
            kotlin.a.e(objB);
        }
        coil3.request.j jVar = (coil3.request.j) objB;
        if (jVar instanceof coil3.request.p) {
            coil3.request.p pVar2 = (coil3.request.p) jVar;
            return new g(k.d(pVar2.a, gVar.a, 1), pVar2);
        }
        if (!(jVar instanceof coil3.request.c)) {
            coil3.g.a();
            return null;
        }
        coil3.request.c cVar2 = (coil3.request.c) jVar;
        coil3.j jVar2 = cVar2.a;
        return new e(jVar2 != null ? k.d(jVar2, gVar.a, 1) : null, cVar2);
    }
}
