package androidx.media3.common;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends IOException {
    public final boolean e;
    public final int y;

    public j0(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.e = z;
        this.y = i;
    }

    public static j0 a(RuntimeException runtimeException, String str) {
        return new j0(str, runtimeException, true, 1);
    }

    public static j0 b(Exception exc, String str) {
        return new j0(str, exc, true, 4);
    }

    public static j0 c(String str) {
        return new j0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.e);
        sb.append(", dataType=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.y, "}", sb);
    }
}
