package com.app.mlounge.data.remote.model;

import androidx.compose.runtime.j;
import androidx.privacysandbox.ads.adservices.java.internal.a;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class MatchSource {
    public static final int $stable = 0;
    private final String id;
    private final String source;
    private final String url;

    public final String a() {
        return this.id;
    }

    public final String b() {
        return this.source;
    }

    public final String c() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchSource)) {
            return false;
        }
        MatchSource matchSource = (MatchSource) obj;
        return l.a(this.source, matchSource.source) && l.a(this.id, matchSource.id) && l.a(this.url, matchSource.url);
    }

    public final int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.source;
        String str2 = this.id;
        return a.u(j.q("MatchSource(source=", str, ", id=", str2, ", url="), this.url, ")");
    }
}
