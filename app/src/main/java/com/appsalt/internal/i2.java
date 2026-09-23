package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public static final kotlin.ranges.d d = new kotlin.ranges.d(2, 3, 1);
    public static final long e;
    public final int a;
    public int b;
    public kotlin.time.f c;

    static {
        kotlin.time.g gVar = kotlin.time.a.y;
        e = dagger.hilt.android.internal.a.h(1, kotlin.time.c.MINUTES);
    }

    public i2() {
        int iB;
        kotlin.random.a aVar = kotlin.random.d.e;
        kotlin.ranges.d dVar = d;
        dVar.getClass();
        try {
            kotlin.random.a aVar2 = kotlin.random.d.e;
            dVar.getClass();
            if (dVar.isEmpty()) {
                com.google.firebase.platforminfo.b.f(dVar, "Cannot get random in empty range: ");
                iB = 0;
            } else {
                int i = dVar.y;
                int i2 = dVar.e;
                if (i < Integer.MAX_VALUE) {
                    iB = kotlin.random.d.e.c(i2, i + 1);
                } else if (i2 > Integer.MIN_VALUE) {
                    iB = kotlin.random.d.e.c(i2 - 1, i) + 1;
                } else {
                    iB = kotlin.random.d.e.b();
                }
            }
            this.a = iB;
            this.c = new kotlin.time.f(kotlin.time.e.b());
        } catch (IllegalArgumentException e2) {
            androidx.transition.k.m(e2.getMessage());
            throw null;
        }
    }
}
