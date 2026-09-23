package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.exoplayer.source.t0;
import com.google.common.collect.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements q {
    public a1 e;
    public final androidx.work.impl.model.f y = new androidx.work.impl.model.f(15);
    public static final int[] z = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final androidx.localbroadcastmanager.content.b A = new androidx.localbroadcastmanager.content.b(new t0(3));
    public static final androidx.localbroadcastmanager.content.b B = new androidx.localbroadcastmanager.content.b(new t0(4));

    @Override // androidx.media3.extractor.q
    public final synchronized n[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // androidx.media3.extractor.q
    public final synchronized n[] b(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = z;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iE = androidx.work.impl.v.E((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iE != -1) {
                c(iE, arrayList);
            }
            int iF = androidx.work.impl.v.F(uri);
            if (iF != -1 && iF != iE) {
                c(iF, arrayList);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iE && i2 != iF) {
                    c(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (n[]) arrayList.toArray(new n[0]);
    }

    public final void c(int i, ArrayList arrayList) {
        androidx.work.impl.model.f fVar = this.y;
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new androidx.media3.extractor.ts.a());
                break;
            case 1:
                arrayList.add(new androidx.media3.extractor.ts.c());
                break;
            case 2:
                arrayList.add(new androidx.media3.extractor.ts.d(0));
                break;
            case 3:
                arrayList.add(new androidx.media3.extractor.amr.a());
                break;
            case 4:
                n nVarV = A.v(0);
                if (nVarV == null) {
                    arrayList.add(new androidx.media3.extractor.flac.c());
                } else {
                    arrayList.add(nVarV);
                }
                break;
            case 5:
                arrayList.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                arrayList.add(new androidx.media3.extractor.mkv.e(fVar, 0));
                break;
            case 7:
                arrayList.add(new androidx.media3.extractor.mp3.d(0));
                break;
            case 8:
                int iF = androidx.media3.extractor.mp4.i.f(3);
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                arrayList.add(new androidx.media3.extractor.mp4.i(fVar, iF, null, a1.B, null));
                arrayList.add(new androidx.media3.extractor.mp4.m(fVar, 160));
                break;
            case 9:
                arrayList.add(new androidx.media3.extractor.ogg.d());
                break;
            case 10:
                arrayList.add(new androidx.media3.extractor.ts.y());
                break;
            case 11:
                if (this.e == null) {
                    com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
                    this.e = a1.B;
                }
                arrayList.add(new androidx.media3.extractor.ts.c0(1, 0, fVar, new androidx.media3.common.util.g0(0L), new androidx.compose.foundation.lazy.grid.t(i2, this.e)));
                break;
            case 12:
                arrayList.add(new androidx.media3.extractor.wav.d());
                break;
            case 14:
                arrayList.add(new androidx.media3.extractor.bmp.a(0));
                break;
            case 15:
                n nVarV2 = B.v(new Object[0]);
                if (nVarV2 != null) {
                    arrayList.add(nVarV2);
                }
                break;
            case 16:
                arrayList.add(new androidx.media3.extractor.avi.b(fVar));
                break;
            case 17:
                arrayList.add(new androidx.media3.extractor.bmp.a(1, (byte) 0));
                break;
            case 18:
                arrayList.add(new androidx.media3.extractor.avif.a(1));
                break;
            case 19:
                arrayList.add(new androidx.media3.extractor.bmp.a(0, (byte) 0));
                break;
            case 20:
                arrayList.add(new androidx.media3.extractor.heif.b());
                break;
            case 21:
                arrayList.add(new androidx.media3.extractor.avif.a(0));
                break;
        }
    }
}
