package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public f1 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.e == 1 && (f1Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new e1(f1Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb.append(" templateVersion");
        }
        kotlinx.coroutines.future.a.u(com.google.android.datatransport.runtime.a.r("Missing required properties:", sb));
        return null;
    }
}
