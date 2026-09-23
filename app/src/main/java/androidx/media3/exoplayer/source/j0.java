package androidx.media3.exoplayer.source;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final /* synthetic */ j0[] A;
    public static final j0 e;
    public static final j0 y;
    public static final j0 z;

    static {
        j0 j0Var = new j0("PASS_THROUGH", 0);
        e = j0Var;
        j0 j0Var2 = new j0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        y = j0Var2;
        j0 j0Var3 = new j0("DISCARDING", 2);
        z = j0Var3;
        A = new j0[]{j0Var, j0Var2, j0Var3};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) A.clone();
    }
}
