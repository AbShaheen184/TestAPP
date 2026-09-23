package androidx.media3.extractor.metadata.mp4;

import androidx.compose.runtime.j;
import androidx.media3.common.util.i0;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;
    public final long b;
    public final int c;

    public a(long j, long j2, int i) {
        _COROUTINE.a.o(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = i0.a;
        Locale locale = Locale.US;
        StringBuilder sbO = j.o(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbO.append(this.b);
        sbO.append(", speedDivisor=");
        sbO.append(this.c);
        return sbO.toString();
    }
}
