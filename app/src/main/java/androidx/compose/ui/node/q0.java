package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int y;
    public final /* synthetic */ r0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i) {
        super(0);
        this.y = i;
        this.z = r0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        o0 o0VarS0;
        switch (this.y) {
            case 0:
                r0 r0Var = this.z;
                j0 j0Var = r0Var.C;
                j0Var.h = 0;
                androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
                Object[] objArr = bVarZ.e;
                int i = bVarZ.z;
                for (int i2 = 0; i2 < i; i2++) {
                    r0 r0Var2 = ((f0) objArr[i2]).e0.q;
                    r0Var2.getClass();
                    r0Var2.E = r0Var2.F;
                    r0Var2.F = Integer.MAX_VALUE;
                    if (r0Var2.G == d0.y) {
                        r0Var2.G = d0.z;
                    }
                }
                f0 f0Var = j0Var.a;
                f0 f0Var2 = j0Var.a;
                androidx.compose.runtime.collection.b bVarZ2 = f0Var.z();
                Object[] objArr2 = bVarZ2.e;
                int i3 = bVarZ2.z;
                for (int i4 = 0; i4 < i3; i4++) {
                    r0 r0Var3 = ((f0) objArr2[i4]).e0.q;
                    r0Var3.getClass();
                    r0Var3.O.d = false;
                }
                r rVar = r0Var.g().p0;
                if (rVar != null) {
                    boolean z = rVar.H;
                    androidx.collection.h0 h0Var = (androidx.collection.h0) f0Var2.n();
                    int i5 = ((androidx.compose.runtime.collection.b) h0Var.y).z;
                    for (int i6 = 0; i6 < i5; i6++) {
                        o0 o0VarS1 = ((d1) ((f0) h0Var.get(i6)).d0.e).S0();
                        if (o0VarS1 != null) {
                            o0VarS1.H = z;
                        }
                    }
                }
                r rVar2 = r0Var.g().p0;
                rVar2.getClass();
                rVar2.C0().d();
                if (r0Var.g().p0 != null) {
                    androidx.collection.h0 h0Var2 = (androidx.collection.h0) f0Var2.n();
                    int i7 = ((androidx.compose.runtime.collection.b) h0Var2.y).z;
                    for (int i8 = 0; i8 < i7; i8++) {
                        o0 o0VarS2 = ((d1) ((f0) h0Var2.get(i8)).d0.e).S0();
                        if (o0VarS2 != null) {
                            o0VarS2.H = false;
                        }
                    }
                }
                androidx.compose.runtime.collection.b bVarZ3 = f0Var2.z();
                Object[] objArr3 = bVarZ3.e;
                int i9 = bVarZ3.z;
                for (int i10 = 0; i10 < i9; i10++) {
                    r0 r0Var4 = ((f0) objArr3[i10]).e0.q;
                    r0Var4.getClass();
                    int i11 = r0Var4.E;
                    int i12 = r0Var4.F;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        r0Var4.q0(true);
                    }
                }
                androidx.compose.runtime.collection.b bVarZ4 = f0Var2.z();
                Object[] objArr4 = bVarZ4.e;
                int i13 = bVarZ4.z;
                for (int i14 = 0; i14 < i13; i14++) {
                    r0 r0Var5 = ((f0) objArr4[i14]).e0.q;
                    r0Var5.getClass();
                    g0 g0Var = r0Var5.O;
                    g0Var.e = g0Var.d;
                }
                break;
            case 1:
                r0 r0Var6 = this.z;
                j0 j0Var2 = r0Var6.C;
                androidx.compose.ui.layout.c1 placementScope = null;
                if (l.q(j0Var2.a) || j0Var2.c) {
                    d1 d1Var = j0Var2.a().N;
                    if (d1Var != null) {
                        placementScope = d1Var.I;
                    }
                } else {
                    d1 d1Var2 = j0Var2.a().N;
                    if (d1Var2 != null && (o0VarS0 = d1Var2.S0()) != null) {
                        placementScope = o0VarS0.I;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((androidx.compose.ui.platform.u) i0.a(j0Var2.a)).getPlacementScope();
                }
                o0 o0VarS3 = j0Var2.a().S0();
                o0VarS3.getClass();
                androidx.compose.ui.layout.c1.k(placementScope, o0VarS3, r0Var6.L);
                break;
            default:
                r0 r0Var7 = this.z;
                o0 o0VarS4 = r0Var7.C.a().S0();
                o0VarS4.getClass();
                o0VarS4.F(r0Var7.V);
                break;
        }
        return kotlin.y.a;
    }
}
