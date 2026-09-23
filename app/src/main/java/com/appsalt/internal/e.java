package com.appsalt.internal;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {
    public final byte[] e;
    public final t y;

    public e(byte[] bArr, t tVar) {
        this.e = bArr;
        this.y = tVar;
    }

    public final int a(byte[] bArr) {
        byte[] bArr2 = this.e;
        if (bArr2.length != bArr.length) {
            return kotlin.jvm.internal.l.b(bArr2.length, bArr.length);
        }
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            int iB = kotlin.jvm.internal.l.b(bArr2[i] & 255, bArr[i2] & 255);
            if (iB != 0) {
                return iB;
            }
            i++;
            i2 = i3;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(((e) obj).e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.e, eVar.e) && this.y == eVar.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Arrays.hashCode(this.e) * 31);
    }

    public final String toString() {
        t tVar = this.y;
        t tVar2 = t.V6;
        byte[] bArr = this.e;
        if (tVar == tVar2) {
            return kotlin.collections.p.I(kotlin.text.k.y(4, kotlin.collections.o.x(bArr, "", new com.app.mlounge.ui.viewmodel.q0(6), 30)), ":", null, null, new com.app.mlounge.ui.viewmodel.q0(7), 30);
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(new kotlin.p(b));
        }
        return kotlin.collections.p.I(arrayList, ".", null, null, null, 62);
    }
}
