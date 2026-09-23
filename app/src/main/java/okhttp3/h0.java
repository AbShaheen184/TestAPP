package okhttp3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Reader {
    public InputStreamReader A;
    public final okio.h e;
    public final Charset y;
    public boolean z;

    public h0(okio.h hVar, Charset charset) {
        hVar.getClass();
        charset.getClass();
        this.e = hVar;
        this.y = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.z = true;
        InputStreamReader inputStreamReader = this.A;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.e.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        cArr.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.w("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.A;
        if (inputStreamReader == null) {
            okio.h hVar = this.e;
            inputStreamReader = new InputStreamReader(hVar.V(), okhttp3.internal.g.f(hVar, this.y));
            this.A = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
