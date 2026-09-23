package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d c;
    public static final d d;
    public final boolean a;
    public final Throwable b;

    static {
        if (r.A) {
            d = null;
            c = null;
        } else {
            d = new d(null, false);
            c = new d(null, true);
        }
    }

    public d(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
