package androidx.media3.exoplayer.trackselection;

import com.google.common.collect.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean e;
    public final boolean y;

    public h(androidx.media3.common.r rVar, int i) {
        this.e = (rVar.e & 1) != 0;
        this.y = androidx.media3.exoplayer.a.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return y.a.c(this.y, hVar.y).c(this.e, hVar.e).e();
    }
}
