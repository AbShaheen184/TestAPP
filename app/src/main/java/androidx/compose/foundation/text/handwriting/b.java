package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.e0;
import androidx.compose.ui.node.m;
import androidx.compose.ui.o;
import androidx.compose.ui.r;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final m a;

    static {
        float f = 40;
        float f2 = 10;
        a = new m(f2, f, f2, f);
    }

    public static final r a(boolean z, boolean z2, kotlin.jvm.functions.a aVar) {
        r e0Var = o.b;
        if (!z || !e.a) {
            return e0Var;
        }
        if (z2) {
            e0Var = new e0(a);
        }
        return e0Var.d(new a(aVar));
    }
}
