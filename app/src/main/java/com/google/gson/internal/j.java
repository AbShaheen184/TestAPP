package com.google.gson.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Number {
    public final String e;

    public j(String str) {
        this.e = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.e.equals(((j) obj).e);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.e;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return h.i(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.e;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return h.i(str).longValue();
        }
    }

    public final String toString() {
        return this.e;
    }
}
