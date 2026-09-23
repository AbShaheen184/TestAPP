package com.app.mlounge.data.local.entity;

import kotlin.collections.i0;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public e(String str, long j, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final float a() {
        long j = this.c;
        if (j > 0) {
            return i0.c(this.b / j, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public final boolean b() {
        long j = this.c;
        if (j <= 0) {
            return false;
        }
        long j2 = this.b;
        return ((float) j2) > ((float) j) * 0.05f && ((float) j2) < ((float) j) * 0.95f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.e(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchProgressEntity(contentKey=");
        sb.append(this.a);
        sb.append(", positionMs=");
        sb.append(this.b);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", updatedAt=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.d, ")", sb);
    }

    public /* synthetic */ e(long j, long j2, String str) {
        this(str, j, j2, System.currentTimeMillis());
    }
}
