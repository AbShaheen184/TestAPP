package com.app.mlounge.data.providers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    public static final int $stable = 0;
    private final String title;
    private final Integer year;

    public j1(Integer num, String str) {
        this.title = str;
        this.year = num;
    }

    public final String a() {
        return this.title;
    }

    public final Integer b() {
        return this.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return kotlin.jvm.internal.l.a(this.title, j1Var.title) && kotlin.jvm.internal.l.a(this.year, j1Var.year);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.year;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TmdbDetails(title=" + this.title + ", year=" + this.year + ")";
    }
}
