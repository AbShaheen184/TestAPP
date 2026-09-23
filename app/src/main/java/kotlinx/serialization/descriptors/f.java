package kotlinx.serialization.descriptors;

import java.io.IOException;
import java.util.TimeZone;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.serialization.internal.o0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ f(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.e;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                g gVar = (g) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return gVar.e[iIntValue] + ": " + gVar.f[iIntValue].a();
            case 1:
                o0 o0Var = (o0) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return o0Var.e[iIntValue2] + ": " + o0Var.i(iIntValue2).a();
            default:
                ((IOException) obj).getClass();
                TimeZone timeZone = okhttp3.internal.g.a;
                ((okhttp3.internal.cache.h) obj2).H = true;
                return y.a;
        }
    }
}
