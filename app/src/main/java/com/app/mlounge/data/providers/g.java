package com.app.mlounge.data.providers;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final int $stable = 0;
    private final String server;
    private final String url;

    public g(String str, String str2) {
        str.getClass();
        this.url = str;
        this.server = str2;
    }

    public final String a() {
        return this.server;
    }

    public final String b() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.url, gVar.url) && kotlin.jvm.internal.l.a(this.server, gVar.server);
    }

    public final int hashCode() {
        return this.server.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return androidx.compose.runtime.j.k("FinalLink(url=", this.url, ", server=", this.server, ")");
    }
}
