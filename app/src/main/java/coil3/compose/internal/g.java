package coil3.compose.internal;

import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.ui.layout.j;
import androidx.room.b0;
import coil3.compose.o;
import coil3.size.i;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final long a = androidx.compose.ui.unit.b.b(0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final i a(j jVar, s sVar) {
        Object obj;
        Object obj2;
        boolean zA = l.a(jVar, androidx.compose.ui.layout.i.d);
        boolean zG = sVar.g(zA);
        Object objQ = sVar.Q();
        if (zG || objQ == n.a) {
            if (zA) {
                obj = i.a;
            } else {
                o oVar = new o();
                oVar.b = a;
                oVar.c = new ArrayList();
                obj = oVar;
            }
            Object obj3 = obj;
            sVar.l0(obj3);
            obj2 = obj3;
        }
        obj2 = objQ;
        return (i) obj2;
    }

    public static final long b(long j) {
        int iH = kotlin.math.a.H(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) kotlin.math.a.H(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iH) << 32);
    }

    public static void c(String str) {
        throw new IllegalArgumentException(b0.e("Unsupported type: ", str, ". ", androidx.privacysandbox.ads.adservices.java.internal.a.r("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
