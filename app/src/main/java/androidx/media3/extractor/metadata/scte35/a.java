package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.v;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public a(long j, long j2, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, v vVar) {
        long jZ = vVar.z();
        if ((128 & jZ) != 0) {
            return 8589934591L & ((((jZ & 1) << 32) | vVar.B()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.b
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return androidx.privacysandbox.ads.adservices.java.internal.a.p(this.c, " }", sb3);
        }
    }

    public a(long j, long j2, List list) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
