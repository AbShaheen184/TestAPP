package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ o[] A;
    public static final o e;
    public static final o y;
    public static final o z;

    static {
        o oVar = new o("Yes", 0);
        e = oVar;
        o oVar2 = new o("No", 1);
        y = oVar2;
        o oVar3 = new o("NotInitialized", 2);
        z = oVar3;
        A = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) A.clone();
    }
}
