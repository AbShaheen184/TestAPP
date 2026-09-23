package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ x1(androidx.compose.foundation.text.n1 n1Var, androidx.compose.ui.layout.d1 d1Var, int i) {
        this.e = 1;
        this.A = n1Var;
        this.y = d1Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        androidx.compose.runtime.v vVar;
        long[] jArr;
        androidx.compose.runtime.v vVar2;
        long[] jArr2;
        int i;
        switch (this.e) {
            case 0:
                z1 z1Var = (z1) this.A;
                androidx.compose.ui.layout.d1 d1Var = (androidx.compose.ui.layout.d1) this.y;
                androidx.compose.ui.layout.c1 c1Var = (androidx.compose.ui.layout.c1) obj;
                int iG = z1Var.L.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                int i2 = this.z;
                if (iG > i2) {
                    iG = i2;
                }
                int i3 = -iG;
                boolean z = z1Var.M;
                int i4 = z ? 0 : i3;
                if (!z) {
                    i3 = 0;
                }
                c1Var.e = true;
                androidx.compose.ui.layout.c1.m(c1Var, d1Var, i4, i3);
                c1Var.e = false;
                break;
            case 1:
                androidx.compose.foundation.text.n1 n1Var = (androidx.compose.foundation.text.n1) this.A;
                androidx.compose.ui.layout.d1 d1Var2 = (androidx.compose.ui.layout.d1) this.y;
                androidx.compose.ui.layout.c1 c1Var2 = (androidx.compose.ui.layout.c1) obj;
                int i5 = n1Var.c;
                androidx.compose.foundation.text.i1 i1Var = n1Var.b;
                androidx.compose.ui.text.input.e0 e0Var = n1Var.d;
                androidx.compose.foundation.text.k1 k1Var = (androidx.compose.foundation.text.k1) n1Var.e.invoke();
                i1Var.a(androidx.compose.foundation.gestures.o1.e, androidx.compose.foundation.text.n0.h(c1Var2, i5, e0Var, k1Var != null ? k1Var.a : null, false, d1Var2.e), this.z, d1Var2.y);
                androidx.compose.ui.layout.c1.l(c1Var2, d1Var2, 0, Math.round(-i1Var.a.g()));
                break;
            default:
                androidx.compose.runtime.s1 s1Var = (androidx.compose.runtime.s1) this.A;
                androidx.collection.f0 f0Var = (androidx.collection.f0) this.y;
                androidx.compose.runtime.v vVar3 = (androidx.compose.runtime.v) obj;
                int i6 = s1Var.e;
                int i7 = this.z;
                if (i6 == i7 && kotlin.jvm.internal.l.a(f0Var, s1Var.f) && (vVar3 instanceof androidx.compose.runtime.z)) {
                    long[] jArr3 = f0Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        int i12 = (i8 << 3) + i11;
                                        Object obj2 = f0Var.b[i12];
                                        boolean z2 = f0Var.c[i12] != i7;
                                        if (z2) {
                                            i = i9;
                                            androidx.compose.runtime.z zVar = (androidx.compose.runtime.z) vVar3;
                                            vVar2 = vVar3;
                                            androidx.collection.o0 o0Var = zVar.D;
                                            _COROUTINE.a.Z(o0Var, obj2, s1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof androidx.compose.runtime.g0) {
                                                androidx.compose.runtime.g0 g0Var = (androidx.compose.runtime.g0) obj2;
                                                if (!o0Var.c(g0Var)) {
                                                    _COROUTINE.a.a0(zVar.G, g0Var);
                                                }
                                                androidx.collection.o0 o0Var2 = s1Var.g;
                                                if (o0Var2 != null) {
                                                    o0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            vVar2 = vVar3;
                                            jArr2 = jArr3;
                                            i = i9;
                                        }
                                        if (z2) {
                                            f0Var.f(i12);
                                        }
                                    } else {
                                        vVar2 = vVar3;
                                        jArr2 = jArr3;
                                        i = i9;
                                    }
                                    j >>= i;
                                    i11++;
                                    i9 = i;
                                    vVar3 = vVar2;
                                    jArr3 = jArr2;
                                }
                                vVar = vVar3;
                                jArr = jArr3;
                                if (i10 == i9) {
                                }
                            } else {
                                vVar = vVar3;
                                jArr = jArr3;
                            }
                            if (i8 != length) {
                                i8++;
                                vVar3 = vVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ x1(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.A = obj;
        this.z = i;
        this.y = obj2;
    }
}
