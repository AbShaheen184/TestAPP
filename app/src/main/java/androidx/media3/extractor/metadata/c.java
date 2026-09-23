package androidx.media3.extractor.metadata;

import androidx.media3.common.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g0 {
    public final long a;

    public c(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && c.class == obj.getClass() && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return kotlin.math.a.v(this.a) + 527;
    }

    public final String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.a;
    }
}
