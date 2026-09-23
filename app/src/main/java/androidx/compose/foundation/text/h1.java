package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.l2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements l2 {
    public final /* synthetic */ l2 a;
    public final androidx.compose.runtime.g0 b;
    public final androidx.compose.runtime.g0 c;

    public h1(l2 l2Var, final i1 i1Var) {
        this.a = l2Var;
        final int i = 0;
        this.b = androidx.compose.runtime.t.k(new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.g1
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        return Boolean.valueOf(i1Var2.a.g() < i1Var2.b.g());
                    default:
                        return Boolean.valueOf(i1Var.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = androidx.compose.runtime.t.k(new kotlin.jvm.functions.a() { // from class: androidx.compose.foundation.text.g1
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        return Boolean.valueOf(i1Var2.a.g() < i1Var2.b.g());
                    default:
                        return Boolean.valueOf(i1Var.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean a() {
        return this.a.a();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final Object c(androidx.compose.foundation.j1 j1Var, kotlin.jvm.functions.p pVar, kotlin.coroutines.jvm.internal.c cVar) {
        return this.a.c(j1Var, pVar, cVar);
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.l2
    public final float e(float f) {
        return this.a.e(f);
    }
}
