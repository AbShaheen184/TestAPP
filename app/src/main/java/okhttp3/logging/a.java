package okhttp3.logging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] A;
    public static final a e;
    public static final a y;
    public static final a z;

    static {
        a aVar = new a("NONE", 0);
        e = aVar;
        a aVar2 = new a("BASIC", 1);
        a aVar3 = new a("HEADERS", 2);
        y = aVar3;
        a aVar4 = new a("BODY", 3);
        z = aVar4;
        A = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) A.clone();
    }
}
