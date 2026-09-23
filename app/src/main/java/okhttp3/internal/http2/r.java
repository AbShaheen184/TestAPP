package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        kotlinx.coroutines.future.a.w(androidx.compose.runtime.j.g("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        return 0;
    }
}
