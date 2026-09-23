package com.google.gson.internal.sql;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final boolean a;
    public static final a.C0000a b;
    public static final b.a c;
    public static final c d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = a.b;
            c = b.b;
            d = d.b;
        } else {
            b = null;
            c = null;
            d = null;
        }
    }
}
