package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.o1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final s a = new s(null, 0, false, 0.0f, new a0(), 0.0f, false, CoroutineScopeKt.CoroutineScope(kotlin.coroutines.k.e), _COROUTINE.b.a(), androidx.compose.ui.unit.b.b(0, 0, 15), kotlin.collections.w.e, 0, 0, 0, o1.e, 0, 0);

    public static final y a(int i, int i2, androidx.compose.runtime.s sVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        androidx.compose.foundation.text.input.internal.o oVar = y.x;
        boolean zD = sVar.d(i) | sVar.d(i2);
        Object objQ = sVar.Q();
        if (zD || objQ == androidx.compose.runtime.n.a) {
            objQ = new z(i, i2, 0);
            sVar.l0(objQ);
        }
        return (y) androidx.compose.runtime.saveable.l.c(objArr, oVar, (kotlin.jvm.functions.a) objQ, sVar, 0);
    }
}
