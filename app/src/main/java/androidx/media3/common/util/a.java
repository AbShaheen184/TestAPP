package androidx.media3.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends OutputStream {
    public final FileOutputStream e;
    public boolean y = false;

    public a(File file) {
        this.e = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.e;
        if (this.y) {
            return;
        }
        this.y = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e) {
            b.u("AtomicFile", "Failed to sync file descriptor:", e);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.e.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.e.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.e.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.e.write(bArr, i, i2);
    }
}
