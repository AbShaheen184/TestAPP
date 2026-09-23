package androidx.media3.extractor.metadata.icy;

import androidx.compose.runtime.j;
import androidx.media3.common.e0;
import androidx.media3.common.g0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        String str = this.b;
        if (str != null) {
            e0Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.a.length, "\"", j.q("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
