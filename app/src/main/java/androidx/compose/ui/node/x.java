package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends o0 {
    public final /* synthetic */ y R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(yVar);
        this.R = yVar;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        y yVar = this.R;
        w wVar = yVar.o0;
        d1 d1Var = yVar.M;
        d1Var.getClass();
        o0 o0VarS0 = d1Var.S0();
        o0VarS0.getClass();
        return wVar.v(this, o0VarS0, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.d1 F(long j) {
        o0(j);
        new androidx.compose.ui.unit.a(j);
        y yVar = this.R;
        w wVar = yVar.o0;
        d1 d1Var = yVar.M;
        d1Var.getClass();
        o0 o0VarS0 = d1Var.S0();
        o0VarS0.getClass();
        o0.J0(this, wVar.c(this, o0VarS0, j));
        return this;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int a0(int i) {
        y yVar = this.R;
        w wVar = yVar.o0;
        d1 d1Var = yVar.M;
        d1Var.getClass();
        o0 o0VarS0 = d1Var.S0();
        o0VarS0.getClass();
        return wVar.b0(this, o0VarS0, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        y yVar = this.R;
        w wVar = yVar.o0;
        d1 d1Var = yVar.M;
        d1Var.getClass();
        o0 o0VarS0 = d1Var.S0();
        o0VarS0.getClass();
        return wVar.x0(this, o0VarS0, i);
    }

    @Override // androidx.compose.ui.node.n0
    public final int q0(androidx.compose.ui.layout.a aVar) {
        int iC = l.c(this, aVar);
        this.Q.g(iC, aVar);
        return iC;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        y yVar = this.R;
        w wVar = yVar.o0;
        d1 d1Var = yVar.M;
        d1Var.getClass();
        o0 o0VarS0 = d1Var.S0();
        o0VarS0.getClass();
        return wVar.B(this, o0VarS0, i);
    }
}
