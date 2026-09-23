package coil3.network;

import android.content.Context;
import androidx.compose.runtime.c0;
import coil3.v;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements coil3.fetch.h {
    public final kotlin.o a;
    public final kotlin.o b;
    public final androidx.work.impl.k c;
    public final kotlin.o d;

    public j(kotlin.jvm.functions.a aVar) {
        c0 c0Var = new c0(20);
        i iVar = i.e;
        c0 c0Var2 = new c0(21);
        this.a = new kotlin.o(aVar);
        this.b = kotlin.a.d(c0Var);
        androidx.work.impl.k kVar = new androidx.work.impl.k(4);
        kVar.y = iVar;
        kVar.z = coil3.network.internal.b.a;
        this.c = kVar;
        this.d = kotlin.a.d(c0Var2);
    }

    @Override // coil3.fetch.h
    public final coil3.fetch.i a(Object obj, coil3.request.n nVar, coil3.p pVar) {
        v vVar = (v) obj;
        if (!kotlin.jvm.internal.l.a(vVar.c, "http") && !kotlin.jvm.internal.l.a(vVar.c, "https")) {
            return null;
        }
        String str = vVar.a;
        kotlin.o oVar = this.a;
        kotlin.o oVar2 = new kotlin.o(new androidx.navigation.internal.h(pVar, 13));
        kotlin.o oVar3 = this.b;
        androidx.work.impl.k kVar = this.c;
        Context context = nVar.a;
        Object obj2 = kVar.z;
        coil3.network.internal.b bVar = coil3.network.internal.b.a;
        if (obj2 == bVar) {
            synchronized (kVar) {
                obj2 = kVar.z;
                if (obj2 == bVar) {
                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) kVar.y;
                    lVar.getClass();
                    Object objInvoke = lVar.invoke(context);
                    kVar.z = objInvoke;
                    kVar.y = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new n(str, nVar, oVar, oVar2, oVar3, new kotlin.e(obj2), this.d);
    }
}
