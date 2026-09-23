package com.i4studio.subslib.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b e;
    public static final b y;
    public static final /* synthetic */ b[] z;

    static {
        b bVar = new b("MOVIE", 0);
        e = bVar;
        b bVar2 = new b("TV", 1);
        y = bVar2;
        z = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) z.clone();
    }
}
