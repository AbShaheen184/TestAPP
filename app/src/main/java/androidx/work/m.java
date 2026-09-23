package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m A;
    public static final /* synthetic */ m[] B;
    public static final m e;
    public static final m y;
    public static final m z;

    static {
        m mVar = new m("REPLACE", 0);
        e = mVar;
        m mVar2 = new m("KEEP", 1);
        y = mVar2;
        m mVar3 = new m("APPEND", 2);
        z = mVar3;
        m mVar4 = new m("APPEND_OR_REPLACE", 3);
        A = mVar4;
        B = new m[]{mVar, mVar2, mVar3, mVar4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) B.clone();
    }
}
