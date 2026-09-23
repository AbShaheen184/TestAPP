package com.app.mlounge.ui.screens.player;

import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final long I;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final List l;
    public final List m;
    public final c1 n;
    public final boolean o;
    public final float p;
    public final int q;
    public final int r;
    public final long s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final String y;
    public final boolean z;

    public p0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j2, long j3, List list, List list2, c1 c1Var, boolean z9, float f, int i, int i2, long j4, String str, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, boolean z13, boolean z14, String str5, String str6, boolean z15, boolean z16, boolean z17, int i3, long j5) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = list;
        this.m = list2;
        this.n = c1Var;
        this.o = z9;
        this.p = f;
        this.q = i;
        this.r = i2;
        this.s = j4;
        this.t = str;
        this.u = z10;
        this.v = z11;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = z12;
        this.A = z13;
        this.B = z14;
        this.C = str5;
        this.D = str6;
        this.E = z15;
        this.F = z16;
        this.G = z17;
        this.H = i3;
        this.I = j5;
    }

    public static p0 a(p0 p0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j2, long j3, ArrayList arrayList, ArrayList arrayList2, c1 c1Var, boolean z9, float f, int i, int i2, long j4, String str, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, boolean z13, String str5, String str6, boolean z14, boolean z15, boolean z16, int i3, long j5, int i4, int i5) {
        boolean z17 = (i4 & 1) != 0 ? p0Var.a : z;
        boolean z18 = (i4 & 2) != 0 ? p0Var.b : z2;
        boolean z19 = (i4 & 4) != 0 ? p0Var.c : z3;
        boolean z20 = (i4 & 8) != 0 ? p0Var.d : z4;
        boolean z21 = (i4 & 16) != 0 ? p0Var.e : z5;
        boolean z22 = (i4 & 32) != 0 ? p0Var.f : z6;
        boolean z23 = (i4 & 64) != 0 ? p0Var.g : z7;
        boolean z24 = (i4 & 128) != 0 ? p0Var.h : z8;
        long j6 = (i4 & LibretroCore.SCREEN_WIDTH) != 0 ? p0Var.i : j;
        long j7 = (i4 & 512) != 0 ? p0Var.j : j2;
        long j8 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? p0Var.k : j3;
        boolean z25 = z17;
        List list = (i4 & 2048) != 0 ? p0Var.l : arrayList;
        List list2 = (i4 & 4096) != 0 ? p0Var.m : arrayList2;
        c1 c1Var2 = (i4 & 8192) != 0 ? p0Var.n : c1Var;
        boolean z26 = (i4 & 16384) != 0 ? p0Var.o : z9;
        float f2 = (i4 & 32768) != 0 ? p0Var.p : f;
        int i6 = (i4 & Parser.ARGC_LIMIT) != 0 ? p0Var.q : i;
        int i7 = (i4 & 131072) != 0 ? p0Var.r : i2;
        boolean z27 = z26;
        long j9 = (i4 & 262144) != 0 ? p0Var.s : j4;
        String str7 = (i4 & 524288) != 0 ? p0Var.t : str;
        boolean z28 = (i4 & 1048576) != 0 ? p0Var.u : z10;
        String str8 = str7;
        boolean z29 = (i4 & 2097152) != 0 ? p0Var.v : z11;
        String str9 = (i4 & 4194304) != 0 ? p0Var.w : str2;
        String str10 = (i4 & 8388608) != 0 ? p0Var.x : str3;
        String str11 = (i4 & 16777216) != 0 ? p0Var.y : str4;
        boolean z30 = (i4 & 33554432) != 0 ? p0Var.z : false;
        boolean z31 = (i4 & 67108864) != 0 ? p0Var.A : z12;
        boolean z32 = (i4 & 134217728) != 0 ? p0Var.B : z13;
        String str12 = (i4 & 268435456) != 0 ? p0Var.C : str5;
        String str13 = (i4 & 536870912) != 0 ? p0Var.D : str6;
        boolean z33 = (i4 & 1073741824) != 0 ? p0Var.E : z14;
        boolean z34 = (i4 & Integer.MIN_VALUE) != 0 ? p0Var.F : z15;
        boolean z35 = (i5 & 1) != 0 ? p0Var.G : z16;
        int i8 = (i5 & 2) != 0 ? p0Var.H : i3;
        boolean z36 = z28;
        long j10 = (i5 & 4) != 0 ? p0Var.I : j5;
        p0Var.getClass();
        list.getClass();
        list2.getClass();
        return new p0(z25, z18, z19, z20, z21, z22, z23, z24, j6, j7, j8, list, list2, c1Var2, z27, f2, i6, i7, j9, str8, z36, z29, str9, str10, str11, z30, z31, z32, str12, str13, z33, z34, z35, i8, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.a == p0Var.a && this.b == p0Var.b && this.c == p0Var.c && this.d == p0Var.d && this.e == p0Var.e && this.f == p0Var.f && this.g == p0Var.g && this.h == p0Var.h && this.i == p0Var.i && this.j == p0Var.j && this.k == p0Var.k && kotlin.jvm.internal.l.a(this.l, p0Var.l) && kotlin.jvm.internal.l.a(this.m, p0Var.m) && kotlin.jvm.internal.l.a(this.n, p0Var.n) && this.o == p0Var.o && Float.compare(this.p, p0Var.p) == 0 && this.q == p0Var.q && this.r == p0Var.r && this.s == p0Var.s && kotlin.jvm.internal.l.a(this.t, p0Var.t) && this.u == p0Var.u && this.v == p0Var.v && kotlin.jvm.internal.l.a(this.w, p0Var.w) && kotlin.jvm.internal.l.a(this.x, p0Var.x) && kotlin.jvm.internal.l.a(this.y, p0Var.y) && this.z == p0Var.z && this.A == p0Var.A && this.B == p0Var.B && kotlin.jvm.internal.l.a(this.C, p0Var.C) && kotlin.jvm.internal.l.a(this.D, p0Var.D) && this.E == p0Var.E && this.F == p0Var.F && this.G == p0Var.G && this.H == p0Var.H && this.I == p0Var.I;
    }

    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((this.l.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31;
        c1 c1Var = this.n;
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.d(this.r, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.q, androidx.privacysandbox.ads.adservices.java.internal.a.c(this.p, androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31, this.o), 31), 31), 31), 31, this.s);
        String str = this.t;
        int iH = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.u), 31, this.v);
        String str2 = this.w;
        int iHashCode2 = (iH + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.x;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.y;
        int iH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B);
        String str5 = this.C;
        int iHashCode4 = (iH2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.D;
        return Long.hashCode(this.I) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.H, androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h(androidx.privacysandbox.ads.adservices.java.internal.a.h((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.E), 31, this.F), 31, this.G), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerUiState(isPlaying=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        sb.append(this.b);
        sb.append(", showControls=");
        sb.append(this.c);
        sb.append(", showResumeDialog=");
        sb.append(this.d);
        sb.append(", showAudioTrackPicker=");
        sb.append(this.e);
        sb.append(", showSubtitlePicker=");
        sb.append(this.f);
        sb.append(", showSettingsDialog=");
        sb.append(this.g);
        sb.append(", showNextEpisode=");
        sb.append(this.h);
        sb.append(", currentPosition=");
        sb.append(this.i);
        sb.append(", totalDuration=");
        sb.append(this.j);
        sb.append(", resumePositionMs=");
        sb.append(this.k);
        sb.append(", audioTracks=");
        sb.append(this.l);
        sb.append(", subtitles=");
        sb.append(this.m);
        sb.append(", activeSubtitle=");
        sb.append(this.n);
        sb.append(", subtitlesLoading=");
        sb.append(this.o);
        sb.append(", subtitleSizeSp=");
        sb.append(this.p);
        sb.append(", subtitleColor=");
        sb.append(this.q);
        sb.append(", subtitleBgColor=");
        sb.append(this.r);
        sb.append(", subtitleOffsetMs=");
        sb.append(this.s);
        sb.append(", subtitleContentCache=");
        sb.append(this.t);
        sb.append(", playbackStarted=");
        sb.append(this.u);
        sb.append(", isHlsStream=");
        sb.append(this.v);
        sb.append(", videoMimeType=");
        sb.append(this.w);
        sb.append(", errorMessage=");
        androidx.room.b0.i(sb, this.x, ", seekWarning=", this.y, ", isSeekable=");
        sb.append(this.z);
        sb.append(", showSeekRecovery=");
        sb.append(this.A);
        sb.append(", isAutoPlayingNext=");
        sb.append(this.B);
        sb.append(", autoPlayStatus=");
        sb.append(this.C);
        sb.append(", activeTitle=");
        sb.append(this.D);
        sb.append(", autoPlayEnabled=");
        sb.append(this.E);
        sb.append(", oneClickPlayEnabled=");
        sb.append(this.F);
        sb.append(", isAudioOnly=");
        sb.append(this.G);
        sb.append(", audioSessionId=");
        sb.append(this.H);
        sb.append(", seekIncrementMs=");
        sb.append(this.I);
        sb.append(")");
        return sb.toString();
    }
}
