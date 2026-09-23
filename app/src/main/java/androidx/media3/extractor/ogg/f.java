package androidx.media3.extractor.ogg;

import androidx.media3.common.j0;
import androidx.media3.common.util.v;
import androidx.media3.extractor.o;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final v g = new v(255);

    public final boolean a(o oVar, boolean z) throws j0, EOFException {
        boolean zE;
        boolean zE2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        v vVar = this.g;
        vVar.J(27);
        try {
            zE = oVar.e(vVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zE = false;
        }
        if (zE && vVar.B() == 1332176723) {
            if (vVar.z() == 0) {
                this.a = vVar.z();
                this.b = vVar.p();
                vVar.q();
                vVar.q();
                vVar.q();
                int iZ = vVar.z();
                this.c = iZ;
                this.d = iZ + 27;
                vVar.J(iZ);
                try {
                    zE2 = oVar.e(vVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zE2 = false;
                }
                if (zE2) {
                    for (int i = 0; i < this.c; i++) {
                        int iZ2 = vVar.z();
                        this.f[i] = iZ2;
                        this.e += iZ2;
                    }
                    return true;
                }
            } else if (!z) {
                throw j0.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(o oVar, long j) {
        boolean zE;
        _COROUTINE.a.o(oVar.getPosition() == oVar.f());
        v vVar = this.g;
        vVar.J(4);
        while (true) {
            if (j != -1 && oVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zE = oVar.e(vVar.a, 0, 4, true);
            } catch (EOFException unused) {
                zE = false;
            }
            if (!zE) {
                break;
            }
            vVar.M(0);
            if (vVar.B() == 1332176723) {
                oVar.n();
                return true;
            }
            oVar.o(1);
        }
        do {
            if (j != -1 && oVar.getPosition() >= j) {
                break;
            }
        } while (oVar.i(1) != -1);
        return false;
    }
}
