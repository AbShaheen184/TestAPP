package okio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements g {
    public final f0 e;
    public final f y;
    public boolean z;

    public z(f0 f0Var) {
        f0Var.getClass();
        this.e = f0Var;
        this.y = new f();
    }

    @Override // okio.f0
    public final void E(f fVar, long j) {
        fVar.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
        } else {
            this.y.E(fVar, j);
            a();
        }
    }

    @Override // okio.g
    public final g J(i iVar) {
        iVar.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.m0(iVar);
        a();
        return this;
    }

    @Override // okio.g
    public final g S(long j) {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.p0(j);
        a();
        return this;
    }

    public final g a() {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        f fVar = this.y;
        long jN = fVar.n();
        if (jN > 0) {
            this.e.E(fVar, jN);
        }
        return this;
    }

    @Override // okio.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        f0 f0Var = this.e;
        if (this.z) {
            return;
        }
        f fVar = this.y;
        long j = fVar.y;
        if (j > 0) {
            f0Var.E(fVar, j);
        }
        th = null;
        try {
            f0Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.g
    public final f d() {
        return this.y;
    }

    @Override // okio.f0
    public final j0 e() {
        return this.e.e();
    }

    @Override // okio.g, okio.f0, java.io.Flushable
    public final void flush() {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return;
        }
        f fVar = this.y;
        long j = fVar.y;
        f0 f0Var = this.e;
        if (j > 0) {
            f0Var.E(fVar, j);
        }
        f0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.z;
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    @Override // okio.g
    public final g w(byte[] bArr, int i) {
        bArr.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.write(bArr, 0, i);
        a();
        return this;
    }

    @Override // okio.g
    public final g write(byte[] bArr) {
        bArr.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // okio.g
    public final g writeByte(int i) {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.o0(i);
        a();
        return this;
    }

    @Override // okio.g
    public final g writeInt(int i) {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.r0(i);
        a();
        return this;
    }

    @Override // okio.g
    public final g writeShort(int i) {
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.s0(i);
        a();
        return this;
    }

    @Override // okio.g
    public final g y(String str) {
        str.getClass();
        if (this.z) {
            kotlinx.coroutines.future.a.u("closed");
            return null;
        }
        this.y.u0(str);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.z) {
            int iWrite = this.y.write(byteBuffer);
            a();
            return iWrite;
        }
        kotlinx.coroutines.future.a.u("closed");
        return 0;
    }
}
