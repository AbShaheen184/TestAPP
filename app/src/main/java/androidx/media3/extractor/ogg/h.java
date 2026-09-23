package androidx.media3.extractor.ogg;

import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.q;
import androidx.media3.common.util.v;
import androidx.media3.container.r;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i = vVar.b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.k(bArr2, 0, bArr.length);
        vVar.M(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media3.extractor.ogg.i
    public final long b(v vVar) {
        byte[] bArr = vVar.a;
        return (((long) this.i) * r.e(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final boolean c(v vVar, long j, androidx.localbroadcastmanager.content.b bVar) {
        if (e(vVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(vVar.a, vVar.c);
            int i = bArrCopyOf[9] & 255;
            ArrayList arrayListA = r.a(bArrCopyOf);
            if (((androidx.media3.common.r) bVar.y) == null) {
                q qVar = new q();
                qVar.m = i0.p("audio/ogg");
                qVar.n = i0.p("audio/opus");
                qVar.F = i;
                qVar.G = 48000;
                qVar.q = arrayListA;
                bVar.y = new androidx.media3.common.r(qVar);
                return true;
            }
        } else {
            if (!e(vVar, p)) {
                ((androidx.media3.common.r) bVar.y).getClass();
                return false;
            }
            ((androidx.media3.common.r) bVar.y).getClass();
            if (!this.n) {
                this.n = true;
                vVar.N(8);
                h0 h0VarR = androidx.media3.extractor.b.r(com.google.common.collect.h0.p((String[]) androidx.media3.extractor.b.u(vVar, false, false).e));
                if (h0VarR != null) {
                    q qVarA = ((androidx.media3.common.r) bVar.y).a();
                    qVarA.k = h0VarR.b(((androidx.media3.common.r) bVar.y).l);
                    bVar.y = new androidx.media3.common.r(qVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.extractor.ogg.i
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = false;
        }
    }
}
