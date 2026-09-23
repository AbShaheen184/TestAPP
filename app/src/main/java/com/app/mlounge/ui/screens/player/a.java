package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public a(int i, int i2, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.d(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AudioTrackInfo(label=" + this.a + ", groupIndex=" + this.b + ", trackIndex=" + this.c + ", isSelected=" + this.d + ")";
    }
}
