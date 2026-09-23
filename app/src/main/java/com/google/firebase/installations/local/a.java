package com.google.firebase.installations.local;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public String a;
    public int b;
    public String c;
    public String d;
    public Long e;
    public Long f;
    public String g;

    public final b a() {
        String strConcat = this.b == 0 ? " registrationStatus" : "";
        if (this.e == null) {
            strConcat = strConcat.concat(" expiresInSecs");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" tokenCreationEpochInSecs");
        }
        if (strConcat.isEmpty()) {
            return new b(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
        }
        kotlinx.coroutines.future.a.u("Missing required properties:".concat(strConcat));
        return null;
    }
}
