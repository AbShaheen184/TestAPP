package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final int C;
    public static final boolean D;
    public final String A;
    public final boolean B;
    public final Context a;
    public final androidx.media3.common.util.d0 b;
    public final androidx.activity.y c;
    public final androidx.media3.common.audio.c d;
    public final androidx.media3.common.audio.c e;
    public com.google.common.base.q f;
    public final androidx.media3.common.audio.c g;
    public final Looper h;
    public final int i;
    public final androidx.media3.common.e j;
    public final int k;
    public final boolean l;
    public final k1 m;
    public final j1 n;
    public long o;
    public long p;
    public final long q;
    public final e r;
    public final long s;
    public final long t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public boolean z;

    static {
        String str = androidx.media3.common.util.i0.a;
        String strB = com.imsdk.a.B(Build.DEVICE);
        C = (strB.contains("emulator") || strB.contains("emu64a") || strB.contains("emu64x") || strB.contains("generic")) ? 30000 : 10000;
        D = true;
    }

    public k(Context context, androidx.work.impl.k kVar) {
        androidx.activity.y yVar = new androidx.activity.y(kVar, 5);
        androidx.media3.common.audio.c cVar = new androidx.media3.common.audio.c(context, 3);
        androidx.media3.common.audio.c cVar2 = new androidx.media3.common.audio.c(context, 1);
        androidx.core.graphics.b bVar = new androidx.core.graphics.b();
        androidx.media3.common.audio.c cVar3 = new androidx.media3.common.audio.c(context, 2);
        context.getClass();
        this.a = context;
        this.c = yVar;
        this.d = cVar;
        this.e = cVar2;
        this.f = bVar;
        this.g = cVar3;
        String str = androidx.media3.common.util.i0.a;
        Looper looperMyLooper = Looper.myLooper();
        this.h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = androidx.media3.common.e.b;
        this.k = 1;
        this.l = true;
        this.m = k1.d;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        this.n = j1.b;
        this.r = new e(androidx.media3.common.util.i0.Q(20L), androidx.media3.common.util.i0.Q(500L));
        this.b = androidx.media3.common.util.d0.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        boolean z = D;
        this.v = z ? C : Integer.MAX_VALUE;
        this.w = z ? 60000 : Integer.MAX_VALUE;
        this.x = 600000;
        this.y = true;
        this.A = "";
        this.i = -1000;
        new com.google.android.gms.common.internal.k();
        this.B = true;
    }
}
