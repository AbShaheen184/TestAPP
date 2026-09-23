package androidx.compose.runtime.saveable;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.text.input.internal.o;
import androidx.compose.material3.t3;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import java.util.Arrays;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final o a = new o(14, new b2(14), new t3(7));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final o b(p pVar, kotlin.jvm.functions.l lVar) {
        a aVar = new a(pVar, 0, (byte) 0);
        c0.c(1, lVar);
        return new o(14, aVar, lVar);
    }

    public static final Object c(Object[] objArr, k kVar, kotlin.jvm.functions.a aVar, s sVar, int i) {
        return d(Arrays.copyOf(objArr, objArr.length), kVar, aVar, sVar, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object d(Object[] objArr, k kVar, kotlin.jvm.functions.a aVar, s sVar, int i, int i2) {
        Object[] objArr2;
        k kVar2;
        Object obj;
        Object objC;
        long j = sVar.T;
        kotlin.comparisons.a.c(36);
        String string = Long.toString(j, 36);
        string.getClass();
        kVar.getClass();
        g gVar = (g) sVar.j(i.a);
        Object objQ = sVar.Q();
        Object obj2 = n.a;
        if (objQ == obj2) {
            Object objB = (gVar == null || (objC = gVar.c(string)) == null) ? null : kVar.b(objC);
            if (objB == null) {
                objB = aVar.invoke();
            }
            objArr2 = objArr;
            kVar2 = kVar;
            Object cVar = new c(kVar2, gVar, string, objB, objArr2);
            sVar.l0(cVar);
            objQ = cVar;
        } else {
            objArr2 = objArr;
            kVar2 = kVar;
        }
        c cVar2 = (c) objQ;
        Object objInvoke = Arrays.equals(objArr2, cVar2.B) ? cVar2.A : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zH = sVar.h(cVar2) | ((((i & Token.ASSIGN_MOD) ^ 48) > 32 && sVar.h(kVar2)) || (i & 48) == 32) | sVar.h(gVar) | sVar.f(string) | sVar.h(objInvoke) | sVar.h(objArr2);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object bVar = new b(cVar2, kVar2, gVar, string, obj, objArr3);
            sVar.l0(bVar);
            objQ2 = bVar;
        } else {
            obj = objInvoke;
        }
        l0.e((kotlin.jvm.functions.a) objQ2, sVar);
        return obj;
    }

    public static final Object e(Object[] objArr, kotlin.jvm.functions.a aVar, s sVar) {
        return d(Arrays.copyOf(objArr, objArr.length), a, aVar, sVar, 3456, 0);
    }

    public static final e f(s sVar) {
        sVar.b0(1967007413);
        Object[] objArr = new Object[0];
        Object objQ = sVar.Q();
        if (objQ == n.a) {
            objQ = new androidx.compose.runtime.c0(2);
            sVar.l0(objQ);
        }
        e eVar = (e) c(objArr, e.B, (kotlin.jvm.functions.a) objQ, sVar, 384);
        eVar.z = (g) sVar.j(i.a);
        sVar.p(false);
        return eVar;
    }
}
