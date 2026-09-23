package com.app.mlounge.data.remote.trakt;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class TraktUserIds {
    public static final int $stable = 0;
    private final String slug;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktUserIds) && l.a(this.slug, ((TraktUserIds) obj).slug);
    }

    public final int hashCode() {
        String str = this.slug;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.r("TraktUserIds(slug=", this.slug, ")");
    }
}
