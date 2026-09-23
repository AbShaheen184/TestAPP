package androidx.media3.common.util;

import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.rd;
import com.google.android.gms.internal.measurement.sd;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.internal.measurement.zd;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements coil3.util.d, sd {
    public boolean e;

    public m0(androidx.media3.container.u uVar, androidx.media3.container.t tVar) throws androidx.media3.container.s {
        int i = tVar.a;
        ByteBuffer byteBuffer = tVar.b;
        _COROUTINE.a.o(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        u uVar2 = new u(bArr, iMin);
        if (uVar.a) {
            throw new androidx.media3.container.s();
        }
        if (uVar2.f()) {
            this.e = false;
            return;
        }
        int iG = uVar2.g(2);
        boolean zF = uVar2.f();
        if (uVar.b) {
            throw new androidx.media3.container.s();
        }
        if (!zF) {
            this.e = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : uVar2.f();
        uVar2.n();
        if (!uVar.d) {
            throw new androidx.media3.container.s();
        }
        if (uVar2.f()) {
            if (!uVar.e) {
                throw new androidx.media3.container.s();
            }
            uVar2.n();
        }
        if (uVar.c) {
            throw new androidx.media3.container.s();
        }
        if (iG != 3) {
            uVar2.n();
        }
        uVar2.o(uVar.f);
        if (iG != 2 && iG != 0 && !zF2) {
            uVar2.o(3);
        }
        this.e = ((iG == 3 || iG == 0) ? 255 : uVar2.g(8)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.sd
    public /* bridge */ /* synthetic */ Object a(rd rdVar) {
        mb mbVarA;
        InputStream inputStreamD = wf.d(rdVar);
        try {
            int i = 4096;
            if (this.e) {
                if (inputStreamD instanceof zd) {
                    long length = ((zd) inputStreamD).a().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                mbVarA = mb.a(w0.h(inputStreamD, i), true);
            } else {
                mbVarA = mb.a(w0.h(inputStreamD, 4096), false);
            }
            dagger.internal.d.b(inputStreamD, null);
            return mbVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                dagger.internal.d.b(inputStreamD, th);
                throw th2;
            }
        }
    }

    public void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
    }

    @Override // coil3.util.d
    public boolean i(coil3.size.h hVar) {
        return this.e;
    }

    @Override // coil3.util.d
    public boolean v() {
        return this.e;
    }

    public /* synthetic */ m0(boolean z) {
        this.e = z;
    }
}
