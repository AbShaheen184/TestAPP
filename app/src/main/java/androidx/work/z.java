package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z A;
    public static final z B;
    public static final z C;
    public static final /* synthetic */ z[] D;
    public static final z e;
    public static final z y;
    public static final z z;

    static {
        z zVar = new z("NOT_REQUIRED", 0);
        e = zVar;
        z zVar2 = new z("CONNECTED", 1);
        y = zVar2;
        z zVar3 = new z("UNMETERED", 2);
        z = zVar3;
        z zVar4 = new z("NOT_ROAMING", 3);
        A = zVar4;
        z zVar5 = new z("METERED", 4);
        B = zVar5;
        z zVar6 = new z("TEMPORARILY_UNMETERED", 5);
        C = zVar6;
        D = new z[]{zVar, zVar2, zVar3, zVar4, zVar5, zVar6};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) D.clone();
    }
}
