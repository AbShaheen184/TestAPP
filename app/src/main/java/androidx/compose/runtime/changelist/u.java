package androidx.compose.runtime.changelist;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.k2;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j0 {
    public static final u c = new u(1, 0, 2);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, k2 k2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int[] iArr;
        androidx.compose.runtime.a aVar;
        int iC;
        int iD = wVar.d(0);
        if (k2Var.n != 0) {
            androidx.compose.runtime.u.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            androidx.compose.runtime.u.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = k2Var.t;
        int i2 = k2Var.v;
        int i3 = k2Var.u;
        int i4 = i;
        while (true) {
            iArr = k2Var.b;
            if (iD <= 0) {
                break;
            }
            i4 += iArr[(k2Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                androidx.compose.runtime.u.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = iArr[(k2Var.r(i4) * 5) + 3];
        int iG = k2Var.g(k2Var.r(k2Var.t), k2Var.b);
        int iG2 = k2Var.g(k2Var.r(i4), k2Var.b);
        int i6 = i4 + i5;
        int iG3 = k2Var.g(k2Var.r(i6), k2Var.b);
        int i7 = iG3 - iG2;
        k2Var.x(i7, Math.max(k2Var.t - 1, 0));
        k2Var.w(i5);
        int[] iArr2 = k2Var.b;
        int iR = k2Var.r(i6) * 5;
        kotlin.collections.o.e(k2Var.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = k2Var.c;
            int iH = k2Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, k2Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = k2Var.k;
        int i11 = k2Var.l;
        int length = k2Var.c.length;
        int i12 = k2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = k2Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = k2.i(k2.i(k2Var.g(iR2, iArr2) - i15, i12 < iR2 ? 0 : i10, i11, length), k2Var.k, k2Var.l, k2Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = k2Var.p();
        int iA = j2.a(k2Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < k2Var.d.size() && (iC = k2Var.c((aVar = (androidx.compose.runtime.a) k2Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(aVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) arrayList.get(i18);
            int iC2 = k2Var.c(aVar2) + i17;
            if (iC2 >= k2Var.g) {
                aVar2.a = -(iP - iC2);
            } else {
                aVar2.a = iC2;
            }
            k2Var.d.add(j2.a(k2Var.d, iC2, iP), aVar2);
        }
        if (k2Var.I(i6, i5)) {
            androidx.compose.runtime.u.a("Unexpectedly removed anchors");
        }
        k2Var.m(i2, k2Var.u, i);
        if (i7 > 0) {
            k2Var.J(i8, i7, i6 - 1);
        }
    }
}
