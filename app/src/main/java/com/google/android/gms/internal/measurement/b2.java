package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements d5 {
    public final boolean e;

    public b2(Boolean bool) {
        this.e = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean d() {
        return Boolean.valueOf(this.e);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String e() {
        return Boolean.toString(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && this.e == ((b2) obj).e;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        return Double.valueOf(true != this.e ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.e).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.e;
        if (zEquals) {
            return new g5(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return new b2(Boolean.valueOf(this.e));
    }

    public final String toString() {
        return String.valueOf(this.e);
    }
}
