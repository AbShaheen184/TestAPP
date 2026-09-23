package androidx.compose.animation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements kotlin.jvm.functions.q {
    public final /* synthetic */ l0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l0 l0Var) {
        super(3);
        this.y = l0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.layout.d1 d1VarF = ((androidx.compose.ui.layout.p0) obj2).F(((androidx.compose.ui.unit.a) obj3).a);
        return ((androidx.compose.ui.layout.s0) obj).q(d1VarF.e, d1VarF.y, kotlin.collections.x.e, new c(0, d1VarF, this.y));
    }
}
