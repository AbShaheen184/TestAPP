package androidx.compose.foundation.layout;

import androidx.compose.foundation.b2;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {
    public final float a;
    public final b2 b;
    public final float c;

    public f(float f, b2 b2Var) {
        this.a = f;
        this.b = b2Var;
        this.c = f;
    }

    @Override // androidx.compose.foundation.layout.e, androidx.compose.foundation.layout.g
    public final float a() {
        return this.c;
    }

    @Override // androidx.compose.foundation.layout.g
    public final void b(int i, androidx.compose.ui.layout.s0 s0Var, int[] iArr, int[] iArr2) {
        c(s0Var, i, iArr, androidx.compose.ui.unit.m.e, iArr2);
    }

    @Override // androidx.compose.foundation.layout.e
    public final void c(androidx.compose.ui.unit.c cVar, int i, int[] iArr, androidx.compose.ui.unit.m mVar, int[] iArr2) {
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iI0 = cVar.i0(this.a);
        boolean z = mVar == androidx.compose.ui.unit.m.y;
        t tVar = h.a;
        if (z) {
            i2 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i3 = iArr[length];
                int iMin2 = Math.min(i2, i - i3);
                iArr2[length] = iMin2;
                iMin = Math.min(iI0, (i - iMin2) - i3);
                i2 = iArr2[length] + i3 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i4 = 0;
            i2 = 0;
            iMin = 0;
            int i5 = 0;
            while (i4 < length2) {
                int i6 = iArr[i4];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[i5] = iMin3;
                int iMin4 = Math.min(iI0, (i - iMin3) - i6);
                int i7 = iArr2[i5] + i6 + iMin4;
                i4++;
                iMin = iMin4;
                i2 = i7;
                i5++;
            }
        }
        int i8 = i2 - iMin;
        if (i8 < i) {
            int iIntValue = ((Number) this.b.invoke(Integer.valueOf(i - i8), mVar)).intValue();
            int length3 = iArr2.length;
            for (int i9 = 0; i9 < length3; i9++) {
                iArr2[i9] = iArr2[i9] + iIntValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return androidx.compose.ui.unit.f.d(this.a, fVar.a) && this.b.equals(fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(Float.hashCode(this.a) * 31, 31, true);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) androidx.compose.ui.unit.f.e(this.a)) + ", " + this.b + ')';
    }
}
