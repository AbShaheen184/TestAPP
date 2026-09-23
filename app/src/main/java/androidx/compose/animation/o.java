package androidx.compose.animation;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements androidx.compose.ui.layout.q0 {
    public final v a;

    public o(v vVar) {
        this.a = vVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        androidx.compose.ui.layout.d1 d1Var;
        int i;
        androidx.compose.ui.layout.d1 d1Var2;
        int i2;
        int i3;
        int size = list.size();
        androidx.compose.ui.layout.d1[] d1VarArr = new androidx.compose.ui.layout.d1[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            d1Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            androidx.compose.ui.layout.p0 p0Var = (androidx.compose.ui.layout.p0) list.get(i4);
            Object objL = p0Var.L();
            q qVar = objL instanceof q ? (q) objL : null;
            if (qVar != null && ((Boolean) qVar.b.getValue()).booleanValue()) {
                androidx.compose.ui.layout.d1 d1VarF = p0Var.F(j);
                long j3 = (((long) d1VarF.y) & 4294967295L) | (((long) d1VarF.e) << 32);
                d1VarArr[i4] = d1VarF;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            androidx.compose.ui.layout.p0 p0Var2 = (androidx.compose.ui.layout.p0) list.get(i5);
            if (d1VarArr[i5] == null) {
                d1VarArr[i5] = p0Var2.F(j);
            }
        }
        if (s0Var.V()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                d1Var2 = d1VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = d1Var2 != null ? d1Var2.e : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            androidx.compose.ui.layout.d1 d1Var3 = d1VarArr[i8];
                            int i9 = d1Var3 != null ? d1Var3.e : 0;
                            if (i7 < i9) {
                                d1Var2 = d1Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                d1Var2 = null;
            }
            i2 = d1Var2 != null ? d1Var2.e : 0;
        }
        if (s0Var.V()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                d1Var = d1VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = d1Var != null ? d1Var.y : 0;
                    if (1 <= i10) {
                        while (true) {
                            androidx.compose.ui.layout.d1 d1Var4 = d1VarArr[i];
                            int i12 = d1Var4 != null ? d1Var4.y : 0;
                            if (i11 < i12) {
                                d1Var = d1Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = d1Var != null ? d1Var.y : 0;
        }
        if (!s0Var.V()) {
            this.a.c.setValue(new androidx.compose.ui.unit.l((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return s0Var.q(i2, i3, kotlin.collections.x.e, new n(d1VarArr, this, i2, i3));
    }

    @Override // androidx.compose.ui.layout.q0
    public final int b(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).B(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).B(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int e(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int g(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).v(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).v(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.q0
    public final int h(androidx.compose.ui.layout.s sVar, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((androidx.compose.ui.layout.p0) list.get(i2)).b(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
