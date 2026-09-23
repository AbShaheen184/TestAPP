package androidx.media3.extractor.text.cea;

import androidx.media3.extractor.text.i;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements Comparable {
    public long H;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (e(4) != gVar.e(4)) {
            return e(4) ? 1 : -1;
        }
        long j = this.D - gVar.D;
        if (j == 0) {
            j = this.H - gVar.H;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
