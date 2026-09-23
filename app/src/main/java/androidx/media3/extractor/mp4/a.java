package androidx.media3.extractor.mp4;

import androidx.media3.common.util.i0;
import androidx.media3.extractor.e0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e0 {
    public int A;
    public final /* synthetic */ int e = 1;
    public int y;
    public long z;

    public a(int i, int i2, long j) {
        this.y = i;
        this.z = j;
        this.A = i2;
    }

    public String toString() {
        switch (this.e) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(i0.c0(this.y));
                sb.append(", size=");
                sb.append(this.z);
                sb.append(", minHeaderSize=");
                return androidx.privacysandbox.ads.adservices.java.internal.a.o(this.A, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a() {
    }
}
