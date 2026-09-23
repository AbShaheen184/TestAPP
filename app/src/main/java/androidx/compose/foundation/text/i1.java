package androidx.compose.foundation.text;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.w1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final androidx.compose.foundation.text.input.internal.o g = androidx.compose.runtime.saveable.l.b(new b2(7), new w1(17));
    public final androidx.compose.runtime.f1 a;
    public final androidx.compose.runtime.f1 b = new androidx.compose.runtime.f1(0.0f);
    public final androidx.compose.runtime.g1 c = new androidx.compose.runtime.g1(0);
    public androidx.compose.ui.geometry.c d = androidx.compose.ui.geometry.c.e;
    public long e = androidx.compose.ui.text.l0.b;
    public final androidx.compose.runtime.j1 f;

    public i1(o1 o1Var, float f) {
        this.a = new androidx.compose.runtime.f1(f);
        this.f = new androidx.compose.runtime.j1(o1Var, androidx.compose.runtime.f.D);
    }

    public final void a(o1 o1Var, androidx.compose.ui.geometry.c cVar, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = cVar.a;
        float f4 = cVar.b;
        androidx.compose.ui.geometry.c cVar2 = this.d;
        float f5 = cVar2.a;
        androidx.compose.runtime.f1 f1Var = this.a;
        if (f3 != f5 || f4 != cVar2.b) {
            boolean z = o1Var == o1.e;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? cVar.d : cVar.c;
            float fG = f1Var.g();
            float f7 = i;
            float f8 = fG + f7;
            if (f6 <= f8 && (f3 >= fG || f6 - f3 <= f7)) {
                f = (f3 >= fG || f6 - f3 > f7) ? 0.0f : f3 - fG;
            } else {
                f = f6 - f8;
            }
            f1Var.h(f1Var.g() + f);
            this.d = cVar;
        }
        f1Var.h(kotlin.collections.i0.c(f1Var.g(), 0.0f, f2));
        this.c.h(i);
    }
}
