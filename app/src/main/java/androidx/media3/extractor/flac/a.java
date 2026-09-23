package androidx.media3.extractor.flac;

import androidx.media3.common.util.v;
import androidx.media3.extractor.h;
import androidx.media3.extractor.i;
import androidx.media3.extractor.o;
import androidx.media3.extractor.r;
import androidx.media3.extractor.t;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i {
    public final t e;
    public final int y;
    public final r z = new r();

    public a(t tVar, int i) {
        this.e = tVar;
        this.y = i;
    }

    @Override // androidx.media3.extractor.i
    public final h a(o oVar, long j) {
        long position = oVar.getPosition();
        long jB = b(oVar);
        long jF = oVar.f();
        oVar.g(Math.max(6, this.e.c));
        long jB2 = b(oVar);
        long jF2 = oVar.f();
        if (jB > j || jB2 <= j) {
            return jB2 <= j ? new h(jB2, jF2, -2) : new h(jB, position, -1);
        }
        return new h(-9223372036854775807L, jF, 0);
    }

    public final long b(o oVar) {
        r rVar;
        t tVar;
        int iJ;
        while (true) {
            long jF = oVar.f();
            long length = oVar.getLength() - 6;
            rVar = this.z;
            tVar = this.e;
            if (jF >= length) {
                break;
            }
            long jF2 = oVar.f();
            v vVar = new v(17);
            int i = 0;
            boolean zA = false;
            oVar.w(vVar.a, 0, 2);
            char cG = vVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.y;
            if (cG != i2) {
                oVar.n();
                oVar.g((int) (jF2 - oVar.getPosition()));
            } else {
                byte[] bArr = vVar.a;
                while (i < 15 && (iJ = oVar.j(bArr, 2 + i, 15 - i)) != -1) {
                    i += iJ;
                }
                vVar.L(i + 2);
                oVar.n();
                oVar.g((int) (jF2 - oVar.getPosition()));
                zA = androidx.media3.extractor.b.a(vVar, tVar, i2, rVar);
            }
            if (zA) {
                break;
            }
            oVar.g(1);
        }
        if (oVar.f() < oVar.getLength() - 6) {
            return rVar.a;
        }
        oVar.g((int) (oVar.getLength() - oVar.f()));
        return tVar.j;
    }
}
