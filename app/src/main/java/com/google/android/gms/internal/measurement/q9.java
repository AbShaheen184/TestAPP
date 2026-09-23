package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q9> CREATOR = new k6(3);
    public final p9[] A;
    public final TreeMap B = new TreeMap();
    public final boolean C;
    public final long D;
    public final String e;
    public final byte[] y;
    public final String z;

    public q9(String str, String str2, p9[] p9VarArr, boolean z, byte[] bArr, long j) {
        this.e = str;
        this.z = str2;
        this.A = p9VarArr;
        this.C = z;
        this.y = bArr;
        this.D = j;
        for (p9 p9Var : p9VarArr) {
            this.B.put(Integer.valueOf(p9Var.e), p9Var);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj;
        return wf.c(this.e, q9Var.e) && wf.c(this.z, q9Var.z) && this.B.equals(q9Var.B) && this.C == q9Var.C && Arrays.equals(this.y, q9Var.y) && this.D == q9Var.D;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.z, this.B, Boolean.valueOf(this.C), this.y, Long.valueOf(this.D)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.e);
        sb.append("', '");
        sb.append(this.z);
        sb.append("', (");
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            sb.append((p9) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.C);
        sb.append(", ");
        byte[] bArr = this.y;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.Z(parcel, 2, this.e);
        com.google.android.gms.dynamite.g.Z(parcel, 3, this.z);
        com.google.android.gms.dynamite.g.a0(parcel, 4, this.A, i);
        com.google.android.gms.dynamite.g.d0(parcel, 5, 4);
        parcel.writeInt(this.C ? 1 : 0);
        com.google.android.gms.dynamite.g.U(parcel, 6, this.y);
        com.google.android.gms.dynamite.g.d0(parcel, 7, 8);
        parcel.writeLong(this.D);
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
