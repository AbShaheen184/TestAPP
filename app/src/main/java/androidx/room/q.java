package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final /* synthetic */ q[] A;
    public static final q e;
    public static final q y;
    public static final q z;

    static {
        q qVar = new q("AUTOMATIC", 0);
        e = qVar;
        q qVar2 = new q("TRUNCATE", 1);
        y = qVar2;
        q qVar3 = new q("WRITE_AHEAD_LOGGING", 2);
        z = qVar3;
        A = new q[]{qVar, qVar2, qVar3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) A.clone();
    }
}
