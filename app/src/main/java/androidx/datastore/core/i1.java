package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends OutputStream {
    public final /* synthetic */ int e = 0;
    public final Object y;

    public i1(FileOutputStream fileOutputStream) {
        this.y = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.e) {
            case 0:
                ((FileOutputStream) this.y).flush();
                break;
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return ((okio.f) this.y) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((FileOutputStream) this.y).write(bArr, i, i2);
                break;
            default:
                ((okio.f) this.y).write(bArr, i, i2);
                break;
        }
    }

    public i1(okio.f fVar) {
        this.y = fVar;
    }

    private final void a() {
    }

    private final void g() {
    }

    private final void n() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.e) {
            case 0:
                ((FileOutputStream) this.y).write(i);
                break;
            default:
                ((okio.f) this.y).o0(i);
                break;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.e) {
            case 0:
                bArr.getClass();
                ((FileOutputStream) this.y).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }
}
