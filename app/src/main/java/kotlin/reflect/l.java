package kotlin.reflect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final /* synthetic */ l[] e = {new l("PUBLIC", 0), new l("PROTECTED", 1), new l("INTERNAL", 2), new l("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    l EF5;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) e.clone();
    }
}
