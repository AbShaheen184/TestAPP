package androidx.media3.exoplayer.dash;

import androidx.media3.common.i0;
import androidx.media3.common.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final androidx.media3.exoplayer.upstream.o a;
    public final com.google.firebase.messaging.n b;
    public final int[] c;
    public final int d;
    public final androidx.media3.datasource.h e;
    public final long f;
    public final int g;
    public final p h;
    public final k[] i;
    public androidx.media3.exoplayer.trackselection.q j;
    public androidx.media3.exoplayer.dash.manifest.c k;
    public int l;
    public androidx.media3.exoplayer.source.b m;
    public boolean n;

    public m(androidx.core.text.f fVar, androidx.media3.exoplayer.upstream.o oVar, androidx.media3.exoplayer.dash.manifest.c cVar, com.google.firebase.messaging.n nVar, int i, int[] iArr, androidx.media3.exoplayer.trackselection.q qVar, int i2, androidx.media3.datasource.h hVar, long j, int i3, boolean z, ArrayList arrayList, p pVar) {
        androidx.media3.exoplayer.dash.manifest.m mVar;
        androidx.media3.extractor.n iVar;
        r rVar;
        androidx.media3.exoplayer.source.chunk.e eVar;
        this.a = oVar;
        this.k = cVar;
        this.b = nVar;
        this.c = iArr;
        this.j = qVar;
        this.d = i2;
        this.e = hVar;
        this.l = i;
        this.f = j;
        this.g = i3;
        p pVar2 = pVar;
        this.h = pVar2;
        long jD = cVar.d(i);
        ArrayList arrayListA = a();
        this.i = new k[qVar.length()];
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.i.length) {
            androidx.media3.exoplayer.dash.manifest.m mVar2 = (androidx.media3.exoplayer.dash.manifest.m) arrayListA.get(qVar.i(i5));
            androidx.media3.exoplayer.dash.manifest.b bVarG = nVar.G(mVar2.y);
            k[] kVarArr = this.i;
            androidx.media3.exoplayer.dash.manifest.b bVar = bVarG == null ? (androidx.media3.exoplayer.dash.manifest.b) mVar2.y.get(i4) : bVarG;
            r rVar2 = mVar2.e;
            androidx.work.impl.model.f fVar2 = (androidx.work.impl.model.f) fVar.b;
            String str = rVar2.n;
            if (i0.n(str)) {
                if (fVar.a) {
                    iVar = new androidx.media3.extractor.text.h(fVar2.m(rVar2), rVar2);
                } else {
                    eVar = null;
                    mVar = mVar2;
                    kVarArr = kVarArr;
                }
                androidx.media3.exoplayer.source.chunk.e eVar2 = eVar;
                long j2 = jD;
                int i6 = i5;
                kVarArr[i6] = new k(j2, mVar, bVar, eVar2, 0L, mVar.c());
                i5 = i6 + 1;
                pVar2 = pVar;
                jD = j2;
                i4 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    mVar = mVar2;
                    rVar = rVar2;
                    iVar = new androidx.media3.extractor.mkv.e(fVar2, fVar.a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    iVar = new androidx.media3.extractor.bmp.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    iVar = new androidx.media3.extractor.bmp.a(1, (byte) 0);
                } else {
                    int i7 = z ? 4 : 0;
                    mVar = mVar2;
                    iVar = new androidx.media3.extractor.mp4.i(fVar2, (fVar.a ? i7 : i7 | 32) | androidx.media3.extractor.mp4.i.f(3), null, arrayList, pVar2);
                    rVar = rVar2;
                }
                eVar = new androidx.media3.exoplayer.source.chunk.e(iVar, i2, rVar);
                androidx.media3.exoplayer.source.chunk.e eVar3 = eVar;
                long j3 = jD;
                int i8 = i5;
                kVarArr[i8] = new k(j3, mVar, bVar, eVar3, 0L, mVar.c());
                i5 = i8 + 1;
                pVar2 = pVar;
                jD = j3;
                i4 = 0;
            }
            mVar = mVar2;
            rVar = rVar2;
            eVar = new androidx.media3.exoplayer.source.chunk.e(iVar, i2, rVar);
            androidx.media3.exoplayer.source.chunk.e eVar4 = eVar;
            long j4 = jD;
            int i9 = i5;
            kVarArr[i9] = new k(j4, mVar, bVar, eVar4, 0L, mVar.c());
            i5 = i9 + 1;
            pVar2 = pVar;
            jD = j4;
            i4 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((androidx.media3.exoplayer.dash.manifest.a) list.get(i)).c);
        }
        return arrayList;
    }

    public final k b(int i) {
        k[] kVarArr = this.i;
        k kVar = kVarArr[i];
        androidx.media3.exoplayer.dash.manifest.b bVarG = this.b.G(kVar.b.y);
        if (bVarG == null || bVarG.equals(kVar.c)) {
            return kVar;
        }
        k kVar2 = new k(kVar.e, kVar.b, bVarG, kVar.a, kVar.f, kVar.d);
        kVarArr[i] = kVar2;
        return kVar2;
    }
}
