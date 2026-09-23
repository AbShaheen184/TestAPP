package androidx.media3.datasource;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h {
    public static final v e = new v();

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return null;
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
    }
}
