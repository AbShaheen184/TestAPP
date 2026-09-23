package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Map.Entry, Comparable {
    public final Comparable e;
    public Object y;
    public final /* synthetic */ o2 z;

    public p2(o2 o2Var, Comparable comparable, Object obj) {
        this.z = o2Var;
        this.e = comparable;
        this.y = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.e.compareTo(((p2) obj).e);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.e;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.y;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.e;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.y;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.z.f();
        Object obj2 = this.y;
        this.y = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(this.y);
        return androidx.compose.runtime.j.m(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
