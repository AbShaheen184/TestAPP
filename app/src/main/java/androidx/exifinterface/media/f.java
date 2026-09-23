package androidx.exifinterface.media;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.e.mark(Integer.MAX_VALUE);
        } else {
            kotlinx.coroutines.future.a.q("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void g(long j) throws IOException {
        int i = this.y;
        if (i > j) {
            this.y = 0;
            this.e.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.e.mark(Integer.MAX_VALUE);
    }
}
