package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final i e;
    public static final i y;
    public static final /* synthetic */ i[] z;

    /* JADX INFO: Fake field, exist only in values array */
    i EF0;

    static {
        i iVar = new i("SYNCHRONIZED", 0);
        i iVar2 = new i("PUBLICATION", 1);
        e = iVar2;
        i iVar3 = new i("NONE", 2);
        y = iVar3;
        z = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) z.clone();
    }
}
