package androidx.compose.foundation;

import androidx.compose.foundation.gestures.l2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements l2 {
    public static final androidx.compose.foundation.text.input.internal.o j = new androidx.compose.foundation.text.input.internal.o(14, new b2(0), new androidx.compose.animation.core.n1(27));
    public final androidx.compose.runtime.g1 a;
    public float f;
    public final androidx.compose.runtime.g0 h;
    public final androidx.compose.runtime.g0 i;
    public final androidx.compose.runtime.g1 b = new androidx.compose.runtime.g1(0);
    public final androidx.compose.runtime.g1 c = new androidx.compose.runtime.g1(0);
    public final androidx.compose.foundation.interaction.k d = new androidx.compose.foundation.interaction.k();
    public final androidx.compose.runtime.g1 e = new androidx.compose.runtime.g1(Integer.MAX_VALUE);
    public final androidx.compose.foundation.gestures.n g = new androidx.compose.foundation.gestures.n(new androidx.activity.compose.g(this, 4));

    public c2(int i) {
        this.a = new androidx.compose.runtime.g1(i);
        final int i2 = 0;
        this.h = androidx.compose.runtime.t.k(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.a2
            public final /* synthetic */ c2 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        c2 c2Var = this.y;
                        return Boolean.valueOf(c2Var.a.g() < c2Var.e.g());
                    default:
                        return Boolean.valueOf(this.y.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.i = androidx.compose.runtime.t.k(new kotlin.jvm.functions.a(this) { // from class: androidx.compose.foundation.a2
            public final /* synthetic */ c2 y;

            {
                this.y = this;
            }

            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        c2 c2Var = this.y;
                        return Boolean.valueOf(c2Var.a.g() < c2Var.e.g());
                    default:
                        return Boolean.valueOf(this.y.a.g() > 0);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean a() {
        return this.g.a();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean b() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final Object c(j1 j1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objC = this.g.c(j1Var, pVar, cVar);
        return objC == kotlin.coroutines.intrinsics.a.e ? objC : kotlin.y.a;
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean d() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final float e(float f) {
        return this.g.e(f);
    }
}
