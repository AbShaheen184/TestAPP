package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import com.google.common.collect.a1;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final h0 l;
    public final h0 m;
    public final a1 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public g(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        _COROUTINE.a.o((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = h0.o(arrayList2);
        this.m = h0.o(arrayList3);
        this.n = h0.w(new androidx.compose.foundation.lazy.layout.a(8), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.o == gVar.o && this.r == gVar.r && this.s == gVar.s && Objects.equals(this.a, gVar.a) && Objects.equals(this.b, gVar.b) && Objects.equals(this.c, gVar.c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.l, gVar.l) && Objects.equals(this.m, gVar.m) && Objects.equals(this.n, gVar.n) && Objects.equals(this.p, gVar.p) && Objects.equals(this.q, gVar.q) && Objects.equals(this.t, gVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
