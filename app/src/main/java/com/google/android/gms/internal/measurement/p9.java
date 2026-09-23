package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p9 extends com.google.android.gms.common.internal.safeparcel.a implements Comparable {
    public static final Parcelable.Creator<p9> CREATOR = new k6(2);
    public final TreeMap A = new TreeMap();
    public final int e;
    public final t9[] y;
    public final String[] z;

    public p9(int i, t9[] t9VarArr, String[] strArr) {
        this.e = i;
        this.y = t9VarArr;
        for (t9 t9Var : t9VarArr) {
            this.A.put(t9Var.e, t9Var);
        }
        this.z = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.e - ((p9) obj).e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p9)) {
            return false;
        }
        p9 p9Var = (p9) obj;
        return this.e == p9Var.e && wf.c(this.A, p9Var.A) && Arrays.equals(this.z, p9Var.z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.e);
        sb.append(", (");
        Iterator it = this.A.values().iterator();
        while (it.hasNext()) {
            sb.append((t9) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.z;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE0 = com.google.android.gms.dynamite.g.e0(parcel, 20293);
        com.google.android.gms.dynamite.g.d0(parcel, 2, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.dynamite.g.a0(parcel, 3, this.y, i);
        String[] strArr = this.z;
        if (strArr != null) {
            int iE1 = com.google.android.gms.dynamite.g.e0(parcel, 4);
            parcel.writeStringArray(strArr);
            com.google.android.gms.dynamite.g.f0(parcel, iE1);
        }
        com.google.android.gms.dynamite.g.f0(parcel, iE0);
    }
}
