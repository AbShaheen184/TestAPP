package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a d = new a("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new a("\n", "  ", true);
    }

    public a(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            kotlinx.coroutines.future.a.q("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            kotlinx.coroutines.future.a.q("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
