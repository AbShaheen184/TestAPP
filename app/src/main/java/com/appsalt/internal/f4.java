package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 implements CharSequence {
    public final String e;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4) {
            return kotlin.jvm.internal.l.a(this.e, ((f4) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(')', "MessageId(value=", this.e);
    }
}
