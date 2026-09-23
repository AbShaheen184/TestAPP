package org.schabi.newpipe.extractor;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Serializable {
    public String A;
    public final String B;
    public final ArrayList C = new ArrayList();
    public final int e;
    public final String y;
    public final String z;

    public b(int i, String str, String str2, String str3, String str4) {
        this.e = i;
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        org.schabi.newpipe.extractor.utils.b.b("Base Created {}", this);
    }

    public final void a(Exception exc) {
        this.C.add(exc);
    }

    public String toString() {
        String str = this.A;
        String str2 = this.z;
        String strR = str2.equals(str) ? "" : androidx.privacysandbox.ads.adservices.java.internal.a.r(" (originalUrl=\"", this.A, "\")");
        String simpleName = getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[url=\"");
        sb.append(str2);
        sb.append("\"");
        sb.append(strR);
        return androidx.compose.runtime.j.m(sb, ", name=\"", this.B, "\"]");
    }
}
