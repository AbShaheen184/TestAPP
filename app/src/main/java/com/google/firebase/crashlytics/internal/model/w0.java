package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final x0 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new x0(this.a, str, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        kotlinx.coroutines.future.a.u(com.google.android.datatransport.runtime.a.r("Missing required properties:", sb));
        return null;
    }
}
