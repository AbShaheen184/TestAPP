package com.app.mlounge.data.remote.model;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class HiAnimeEpCount {
    public static final int $stable = 0;
    private final Integer dub;
    private final Integer sub;

    public HiAnimeEpCount(Integer num, Integer num2) {
        this.sub = num;
        this.dub = num2;
    }

    public final Integer a() {
        return this.dub;
    }

    public final Integer b() {
        return this.sub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiAnimeEpCount)) {
            return false;
        }
        HiAnimeEpCount hiAnimeEpCount = (HiAnimeEpCount) obj;
        return l.a(this.sub, hiAnimeEpCount.sub) && l.a(this.dub, hiAnimeEpCount.dub);
    }

    public final int hashCode() {
        Integer num = this.sub;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.dub;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "HiAnimeEpCount(sub=" + this.sub + ", dub=" + this.dub + ")";
    }
}
