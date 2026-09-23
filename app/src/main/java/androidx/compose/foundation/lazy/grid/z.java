package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.w1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final n a = new n(null, 0, false, 0.0f, new y(), 0.0f, false, CoroutineScopeKt.CoroutineScope(kotlin.coroutines.k.e), _COROUTINE.b.a(), 0, new w1(6), new w1(7), kotlin.collections.w.e, 0, 0, 0, o1.e, 0, 0);

    public static final x a(int i, int i2, androidx.compose.runtime.s sVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        androidx.compose.foundation.text.input.internal.o oVar = x.w;
        boolean zD = sVar.d(i) | sVar.d(i2);
        Object objQ = sVar.Q();
        if (zD || objQ == androidx.compose.runtime.n.a) {
            objQ = new androidx.compose.foundation.lazy.z(i, i2, 1);
            sVar.l0(objQ);
        }
        return (x) androidx.compose.runtime.saveable.l.c(objArr, oVar, (kotlin.jvm.functions.a) objQ, sVar, 0);
    }
}
