package org.schabi.newpipe.extractor;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {
    public final int A;
    public final String e;
    public final int y;
    public final int z;

    public a(int i, String str, int i2, int i3) {
        this.e = str;
        this.y = i;
        this.z = i2;
        androidx.constraintlayout.core.g.a(i3, "estimatedResolutionLevel is null");
        this.A = i3;
    }

    public final String toString() {
        return "Image {url=" + this.e + ", height=" + this.y + ", width=" + this.z + ", estimatedResolutionLevel=" + org.jsoup.a.h(this.A) + "}";
    }
}
