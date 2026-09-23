package androidx.media3.datasource;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h {
    public Map A;
    public final h e;
    public long y;
    public Uri z;

    public y(h hVar) {
        hVar.getClass();
        this.e = hVar;
        this.z = Uri.EMPTY;
        this.A = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.h
    public final void c(androidx.media3.exoplayer.upstream.f fVar) {
        fVar.getClass();
        this.e.c(fVar);
    }

    @Override // androidx.media3.datasource.h
    public final void close() {
        this.e.close();
    }

    @Override // androidx.media3.datasource.h
    public final Map l() {
        return this.e.l();
    }

    @Override // androidx.media3.common.i
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e.read(bArr, i, i2);
        if (i3 != -1) {
            this.y += (long) i3;
        }
        return i3;
    }

    @Override // androidx.media3.datasource.h
    public final long t(l lVar) {
        h hVar = this.e;
        this.z = lVar.a;
        this.A = Collections.EMPTY_MAP;
        try {
            return hVar.t(lVar);
        } finally {
            Uri uriV = hVar.v();
            if (uriV != null) {
                this.z = uriV;
            }
            this.A = hVar.l();
        }
    }

    @Override // androidx.media3.datasource.h
    public final Uri v() {
        return this.e.v();
    }
}
