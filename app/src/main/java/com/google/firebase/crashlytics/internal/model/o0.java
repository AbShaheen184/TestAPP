package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public long a;
    public String b;
    public d2 c;
    public e2 d;
    public f2 e;
    public i2 f;
    public byte g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.g == 1 && (str = this.b) != null && (d2Var = this.c) != null && (e2Var = this.d) != null) {
            return new p0(this.a, str, d2Var, e2Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        kotlinx.coroutines.future.a.u(com.google.android.datatransport.runtime.a.r("Missing required properties:", sb));
        return null;
    }
}
