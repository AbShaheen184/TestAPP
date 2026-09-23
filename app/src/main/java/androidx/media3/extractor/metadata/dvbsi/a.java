package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.g0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {
    public final int a;
    public final String b;

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.b, ")");
    }
}
