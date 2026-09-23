package org.schabi.newpipe.extractor.localization;

import androidx.compose.runtime.j;
import androidx.constraintlayout.core.g;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {
    public static final c z = new c("en", "GB");
    public final String e;
    public final String y;

    public c(String str, String str2) {
        this.e = str;
        this.y = str2;
    }

    public final String a() {
        String str = this.y;
        return str == null ? "" : str;
    }

    public final String b() {
        String str = this.y;
        return g.c(this.e, str == null ? "" : j.i("-", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.e.equals(cVar.e) && Objects.equals(this.y, cVar.y);
    }

    public final int hashCode() {
        return Objects.hashCode(this.y) + (this.e.hashCode() * 31);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.r("Localization[", b(), "]");
    }
}
