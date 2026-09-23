package coil3.util;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final coil3.request.c a(coil3.request.g gVar, Throwable th) {
        coil3.j jVar;
        if (th instanceof coil3.request.m) {
            kotlin.jvm.functions.l lVar = gVar.n;
            coil3.request.e eVar = gVar.t;
            jVar = (coil3.j) lVar.invoke(gVar);
            if (jVar == null) {
                jVar = (coil3.j) eVar.j.invoke(gVar);
            }
            if (jVar == null && (jVar = (coil3.j) gVar.m.invoke(gVar)) == null) {
                jVar = (coil3.j) eVar.i.invoke(gVar);
            }
        } else {
            jVar = (coil3.j) gVar.m.invoke(gVar);
            if (jVar == null) {
                jVar = (coil3.j) gVar.t.i.invoke(gVar);
            }
        }
        return new coil3.request.c(jVar, gVar, th);
    }
}
