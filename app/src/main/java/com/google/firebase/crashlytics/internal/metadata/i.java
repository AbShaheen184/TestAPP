package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i c = new i(0, 0);
    public final int a;
    public final int b;

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(i.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.b, "]", sb);
    }
}
