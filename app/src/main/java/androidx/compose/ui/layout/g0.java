package androidx.compose.ui.layout;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ kotlin.jvm.functions.l d;
    public final /* synthetic */ h0 e;
    public final /* synthetic */ m0 f;
    public final /* synthetic */ kotlin.jvm.functions.l g;

    public g0(int i, int i2, Map map, kotlin.jvm.functions.l lVar, h0 h0Var, m0 m0Var, kotlin.jvm.functions.l lVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = lVar;
        this.e = h0Var;
        this.f = m0Var;
        this.g = lVar2;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int a() {
        return this.b;
    }

    @Override // androidx.compose.ui.layout.r0
    public final int b() {
        return this.a;
    }

    @Override // androidx.compose.ui.layout.r0
    public final Map c() {
        return this.c;
    }

    @Override // androidx.compose.ui.layout.r0
    public final void d() {
        androidx.compose.ui.node.r rVar;
        androidx.compose.ui.node.f0 f0Var = this.f.e;
        boolean zV = this.e.V();
        kotlin.jvm.functions.l lVar = this.g;
        if (!zV || (rVar = ((androidx.compose.ui.node.s) f0Var.d0.d).p0) == null) {
            lVar.invoke(((androidx.compose.ui.node.s) f0Var.d0.d).I);
        } else {
            lVar.invoke(rVar.I);
        }
    }

    @Override // androidx.compose.ui.layout.r0
    public final kotlin.jvm.functions.l e() {
        return this.d;
    }
}
