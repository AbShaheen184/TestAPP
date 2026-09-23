package androidx.media3.exoplayer.hls;

import androidx.media3.common.i0;
import androidx.media3.common.util.v;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements h0 {
    public static final androidx.media3.common.r f;
    public static final androidx.media3.common.r g;
    public final h0 a;
    public final androidx.media3.common.r b;
    public androidx.media3.common.r c;
    public byte[] d;
    public int e;

    static {
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = i0.p("application/id3");
        f = new androidx.media3.common.r(qVar);
        androidx.media3.common.q qVar2 = new androidx.media3.common.q();
        qVar2.n = i0.p("application/x-emsg");
        g = new androidx.media3.common.r(qVar2);
    }

    public p(h0 h0Var, int i) {
        this.a = h0Var;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                kotlinx.coroutines.future.a.q(androidx.privacysandbox.ads.adservices.java.internal.a.n(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // androidx.media3.extractor.h0
    public final void b(v vVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        vVar.k(this.d, this.e, i);
        this.e += i;
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) throws EOFException {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int i3 = iVar.read(this.d, this.e, i);
        if (i3 != -1) {
            this.e += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.h0
    public final void e(androidx.media3.common.r rVar) {
        this.c = rVar;
        this.a.e(this.b);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        this.c.getClass();
        int i4 = this.e - i3;
        v vVar = new v(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.o;
        androidx.media3.common.r rVar = this.b;
        String str2 = rVar.o;
        String str3 = rVar.o;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.o)) {
                androidx.media3.common.util.b.t("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.o);
                return;
            }
            androidx.media3.extractor.metadata.emsg.a aVarD0 = androidx.media3.extractor.metadata.dvbsi.b.d0(vVar);
            androidx.media3.common.r rVarA = aVarD0.a();
            if (rVarA == null || !Objects.equals(str3, rVarA.o)) {
                androidx.media3.common.util.b.t("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + aVarD0.a());
                return;
            }
            byte[] bArrC = aVarD0.c();
            bArrC.getClass();
            vVar = new v(bArrC);
        }
        int iA = vVar.a();
        h0 h0Var = this.a;
        h0Var.f(iA, vVar);
        h0Var.g(j, i, iA, 0, g0Var);
    }
}
