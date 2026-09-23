package androidx.media3.exoplayer.dash;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.media3.exoplayer.upstream.o {
    public final /* synthetic */ i a;

    @Override // androidx.media3.exoplayer.upstream.o
    public void b() throws IOException {
        i iVar = this.a;
        iVar.A.b();
        IOException iOException = iVar.C;
        if (iOException != null) {
            throw iOException;
        }
    }
}
