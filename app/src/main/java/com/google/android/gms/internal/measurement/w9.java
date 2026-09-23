package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w9 extends com.google.android.gms.common.internal.safeparcel.a implements Comparable {
    public static final Parcelable.Creator<w9> CREATOR = new k6(9);
    public final int e;
    public final int y;

    public w9(int i, int i2) {
        this.e = i;
        this.y = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w9 w9Var = (w9) obj;
        int i = w9Var.e;
        int i2 = this.e;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = w9Var.y;
        int i4 = this.y;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.w9) r3).e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.y;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.w9
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.w9 r3 = (com.google.android.gms.internal.measurement.w9) r3
            int r0 = r3.e
            int r1 = r2.e
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.y
            int r0 = r2.y
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.w9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.e * 31) + this.y;
    }

    public final String toString() {
        int i = this.e;
        int length = String.valueOf(i).length();
        int i2 = this.y;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 1, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.y);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
