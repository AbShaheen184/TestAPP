package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] e;
    public final int y;
    public final int z;

    public b(int[] iArr, int i, int i2) {
        this.e = iArr;
        this.y = i;
        this.z = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return com.imsdk.a.t(this.e, ((Integer) obj).intValue(), this.y, this.z) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.e[this.y + i] != bVar.e[bVar.y + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        _COROUTINE.a.s(i, size());
        return Integer.valueOf(this.e[this.y + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.y; i2 < this.z; i2++) {
            i = (i * 31) + this.e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.z;
        int[] iArr = this.e;
        int i2 = this.y;
        int iT = com.imsdk.a.t(iArr, iIntValue, i2, i);
        if (iT >= 0) {
            return iT - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.z;
            do {
                i2--;
                i = this.y;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.e[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        _COROUTINE.a.s(i, size());
        int i2 = this.y + i;
        int[] iArr = this.e;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z - this.y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        _COROUTINE.a.x(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.y;
        return new b(this.e, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.e;
        int i = this.y;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.z) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
