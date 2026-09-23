package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c4 implements d5, z4 {
    public final String e;
    public final HashMap y = new HashMap();

    public c4(String str) {
        this.e = str;
    }

    public abstract d5 a(b7 b7Var, List list);

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return new u4(this.y.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final d5 c(String str) {
        HashMap map = this.y;
        return map.containsKey(str) ? (d5) map.get(str) : d5.m;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        String str = this.e;
        if (str != null) {
            return str.equals(c4Var.e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final void f(String str, d5 d5Var) {
        HashMap map = this.y;
        if (d5Var == null) {
            map.remove(str);
        } else {
            map.put(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final boolean i(String str) {
        return this.y.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new g5(this.e) : z4.k(this, new g5(str), b7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public d5 l() {
        return this;
    }
}
