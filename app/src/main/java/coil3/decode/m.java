package coil3.decode;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends InputStream implements InputStreamRetargetInterface {
    public final InputStream e;
    public int y = 1073741824;

    public m(InputStream inputStream) {
        this.e = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.y;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.e.read();
        if (i == -1) {
            this.y = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.e.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.e.read(bArr);
        if (i == -1) {
            this.y = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e.read(bArr, i, i2);
        if (i3 == -1) {
            this.y = 0;
        }
        return i3;
    }
}
