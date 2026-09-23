package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.b0;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final b0 a;
    public final String b;
    public final File c;

    public b(b0 b0Var, String str, File file) {
        this.a = b0Var;
        if (str == null) {
            com.google.firebase.platforminfo.b.h("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
