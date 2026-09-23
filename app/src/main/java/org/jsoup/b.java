package org.jsoup;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends IOException {
    public final String e;
    public final String y;

    public b(String str, String str2) {
        super("Unhandled content type. Must be text/*, */xml, or */*+xml");
        this.e = str;
        this.y = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.e + ", URL=" + this.y;
    }
}
