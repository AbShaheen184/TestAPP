package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class i extends IOException {
    public final int e;

    public i(int i) {
        this.e = i;
    }

    public i(Exception exc, int i) {
        super(exc);
        this.e = i;
    }

    public i(String str, int i) {
        super(str);
        this.e = i;
    }

    public i(String str, Exception exc, int i) {
        super(str, exc);
        this.e = i;
    }
}
