package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public i(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbO = androidx.compose.runtime.j.o(i, "Pos: ", ", limit: ");
        sbO.append(i2);
        sbO.append(", len: ");
        sbO.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbO.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbO = androidx.compose.runtime.j.o(j, "Pos: ", ", limit: ");
        sbO.append(j2);
        sbO.append(", len: ");
        sbO.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbO.toString()), indexOutOfBoundsException);
    }

    public i(int i, String str) {
        super("HTTP error fetching URL. Status=" + i + ", URL=[" + str + "]");
    }

    public /* synthetic */ i(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
