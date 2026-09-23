package com.google.gson.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements CharSequence {
    public char[] e;
    public String y;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.e, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.y == null) {
            this.y = new String(this.e);
        }
        return this.y;
    }
}
