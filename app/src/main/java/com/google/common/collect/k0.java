package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends b0 implements Set {
    public static final /* synthetic */ int z = 0;
    public transient h0 y;

    public static int j(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            _COROUTINE.a.n("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static k0 k(int i, Object... objArr) {
        if (i == 0) {
            return h1.G;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new n1(obj);
        }
        int iJ = j(i);
        Object[] objArr2 = new Object[iJ];
        int i2 = iJ - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                com.google.firebase.platforminfo.b.h(androidx.privacysandbox.ads.adservices.java.internal.a.n(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iS = q.s(iHashCode);
            while (true) {
                int i6 = iS & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iS++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new n1(obj4);
        }
        if (j(i4) < iJ / 2) {
            return k(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new h1(i3, i2, i4, objArr, objArr2);
    }

    public static k0 l(Collection collection) {
        if ((collection instanceof k0) && !(collection instanceof SortedSet)) {
            k0 k0Var = (k0) collection;
            if (!k0Var.h()) {
                return k0Var;
            }
        }
        Object[] array = collection.toArray();
        return k(array.length, array);
    }

    public static k0 o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        _COROUTINE.a.n("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return k(length, objArr2);
    }

    @Override // com.google.common.collect.b0
    public h0 b() {
        h0 h0Var = this.y;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarM = m();
        this.y = h0VarM;
        return h0VarM;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k0) && (this instanceof h1) && (((k0) obj) instanceof h1) && ((h1) this).B != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() != set.size() || !containsAll(set)) {
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return q.m(this);
    }

    public h0 m() {
        Object[] array = toArray(b0.e);
        e0 e0Var = h0.y;
        return h0.j(array.length, array);
    }
}
