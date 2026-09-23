package androidx.work.impl.model;

import androidx.work.OverwritingInputMerger;
import androidx.work.f0;
import androidx.work.i0;
import androidx.work.y;
import com.app.mlounge.emulator.LibretroCore;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final String z = y.g("WorkSpec");
    public final String a;
    public i0 b;
    public final String c;
    public final String d;
    public androidx.work.i e;
    public final androidx.work.i f;
    public final long g;
    public long h;
    public long i;
    public final androidx.work.e j;
    public final int k;
    public androidx.work.a l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final f0 r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public final Boolean y;

    public /* synthetic */ p(String str, i0 i0Var, String str2, String str3, androidx.work.i iVar, androidx.work.i iVar2, long j, long j2, long j3, androidx.work.e eVar, int i, androidx.work.a aVar, long j4, long j5, long j6, long j7, boolean z2, f0 f0Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? i0.e : i0Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? androidx.work.i.b : iVar, (i5 & 32) != 0 ? androidx.work.i.b : iVar2, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & LibretroCore.SCREEN_WIDTH) != 0 ? 0L : j3, (i5 & 512) != 0 ? androidx.work.e.j : eVar, (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i, (i5 & 2048) != 0 ? androidx.work.a.e : aVar, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z2, (131072 & i5) != 0 ? f0.e : f0Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static p b(p pVar, String str, i0 i0Var, String str2, androidx.work.i iVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3 = (i5 & 1) != 0 ? pVar.a : str;
        i0 i0Var2 = (i5 & 2) != 0 ? pVar.b : i0Var;
        String str4 = (i5 & 4) != 0 ? pVar.c : str2;
        String str5 = pVar.d;
        androidx.work.i iVar2 = (i5 & 16) != 0 ? pVar.e : iVar;
        androidx.work.i iVar3 = pVar.f;
        long j3 = pVar.g;
        long j4 = pVar.h;
        long j5 = pVar.i;
        androidx.work.e eVar = pVar.j;
        int i6 = (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? pVar.k : i;
        androidx.work.a aVar = pVar.l;
        long j6 = pVar.m;
        long j7 = (i5 & 8192) != 0 ? pVar.n : j;
        long j8 = pVar.o;
        long j9 = pVar.p;
        boolean z2 = pVar.q;
        f0 f0Var = pVar.r;
        int i7 = (i5 & 262144) != 0 ? pVar.s : i2;
        int i8 = (i5 & 524288) != 0 ? pVar.t : i3;
        long j10 = (i5 & 1048576) != 0 ? pVar.u : j2;
        int i9 = (i5 & 2097152) != 0 ? pVar.v : i4;
        int i10 = pVar.w;
        String str6 = pVar.x;
        Boolean bool = pVar.y;
        pVar.getClass();
        str3.getClass();
        i0Var2.getClass();
        str4.getClass();
        str5.getClass();
        iVar2.getClass();
        iVar3.getClass();
        eVar.getClass();
        aVar.getClass();
        f0Var.getClass();
        return new p(str3, i0Var2, str4, str5, iVar2, iVar3, j3, j4, j5, eVar, i6, aVar, j6, j7, j8, j9, z2, f0Var, i7, i8, j10, i9, i10, str6, bool);
    }

    public final long a() {
        i0 i0Var = this.b;
        i0 i0Var2 = i0.e;
        int i = this.k;
        boolean z2 = i0Var == i0Var2 && i > 0;
        androidx.work.a aVar = this.l;
        long j = this.m;
        long j2 = this.n;
        boolean zC = c();
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.u;
        aVar.getClass();
        int i2 = this.s;
        if (j5 != Long.MAX_VALUE && zC) {
            if (i2 != 0) {
                long j6 = j2 + 900000;
                if (j5 < j6) {
                    return j6;
                }
            }
            return j5;
        }
        if (z2) {
            long jScalb = aVar == androidx.work.a.y ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        long j7 = this.g;
        if (zC) {
            long j8 = i2 == 0 ? j2 + j7 : j2 + j4;
            return (j3 == j4 || i2 != 0) ? j8 : (j4 - j3) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j7;
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.a, pVar.a) && this.b == pVar.b && kotlin.jvm.internal.l.a(this.c, pVar.c) && kotlin.jvm.internal.l.a(this.d, pVar.d) && kotlin.jvm.internal.l.a(this.e, pVar.e) && kotlin.jvm.internal.l.a(this.f, pVar.f) && this.g == pVar.g && this.h == pVar.h && this.i == pVar.i && kotlin.jvm.internal.l.a(this.j, pVar.j) && this.k == pVar.k && this.l == pVar.l && this.m == pVar.m && this.n == pVar.n && this.o == pVar.o && this.p == pVar.p && this.q == pVar.q && this.r == pVar.r && this.s == pVar.s && this.t == pVar.t && this.u == pVar.u && this.v == pVar.v && this.w == pVar.w && kotlin.jvm.internal.l.a(this.x, pVar.x) && kotlin.jvm.internal.l.a(this.y, pVar.y);
    }

    public final int hashCode() {
        int iD = androidx.privacysandbox.ads.adservices.java.internal.a.d(this.w, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.v, androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.d(this.t, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.s, (this.r.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e((this.l.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.k, (this.j.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e((this.f.hashCode() + ((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.g(androidx.privacysandbox.ads.adservices.java.internal.a.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q)) * 31, 31), 31), 31, this.u), 31), 31);
        String str = this.x;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return androidx.compose.runtime.j.l(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    public p(String str, i0 i0Var, String str2, String str3, androidx.work.i iVar, androidx.work.i iVar2, long j, long j2, long j3, androidx.work.e eVar, int i, androidx.work.a aVar, long j4, long j5, long j6, long j7, boolean z2, f0 f0Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        i0Var.getClass();
        str2.getClass();
        str3.getClass();
        iVar.getClass();
        iVar2.getClass();
        eVar.getClass();
        aVar.getClass();
        f0Var.getClass();
        this.a = str;
        this.b = i0Var;
        this.c = str2;
        this.d = str3;
        this.e = iVar;
        this.f = iVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = eVar;
        this.k = i;
        this.l = aVar;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z2;
        this.r = f0Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }
}
