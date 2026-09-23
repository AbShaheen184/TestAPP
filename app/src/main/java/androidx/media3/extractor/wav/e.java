package androidx.media3.extractor.wav;

import androidx.compose.runtime.j;
import androidx.media3.common.j0;
import androidx.media3.common.util.v;
import androidx.media3.exoplayer.upstream.h;
import androidx.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(o oVar) {
        v vVar = new v(8);
        int i = h.c(oVar, vVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        oVar.w(vVar.a, 0, 4);
        vVar.M(0);
        int iM = vVar.m();
        if (iM == 1463899717) {
            return true;
        }
        androidx.media3.common.util.b.f("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static h b(int i, o oVar, v vVar) throws j0 {
        h hVarC = h.c(oVar, vVar);
        while (true) {
            int i2 = hVarC.a;
            if (i2 == i) {
                return hVarC;
            }
            j.x("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = hVarC.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw j0.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            oVar.o((int) j2);
            hVarC = h.c(oVar, vVar);
        }
    }
}
