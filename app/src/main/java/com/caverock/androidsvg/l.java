package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public m a;
    public q0 b;
    public int c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        sb.append(" {...} (src=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "null" : "RenderOptions";
        } else {
            str = "Document";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
